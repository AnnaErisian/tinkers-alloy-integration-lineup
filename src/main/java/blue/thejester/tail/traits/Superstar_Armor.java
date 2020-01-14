package blue.thejester.tail.traits;

import c4.conarm.common.armor.utils.ArmorHelper;
import c4.conarm.lib.traits.AbstractArmorTrait;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multimap;
import hellfirepvp.astralsorcery.common.constellation.IConstellation;
import hellfirepvp.astralsorcery.common.constellation.IMajorConstellation;
import hellfirepvp.astralsorcery.common.data.research.ResearchManager;
import hellfirepvp.astralsorcery.common.lib.Constellations;
import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import slimeknights.tconstruct.library.Util;
import slimeknights.tconstruct.library.utils.ToolHelper;
import slimeknights.tconstruct.shared.client.ParticleEffect;
import slimeknights.tconstruct.tools.TinkerTools;

import javax.annotation.Nonnull;
import java.util.List;

public class Superstar_Armor extends AbstractArmorTrait {

    public static final Superstar_Armor superstar = new Superstar_Armor("superstar", 0xffffff);

    private static final String TAG_STORED_CHARGE = "supstar_armara_charte";
    private static final String TAG_LAST_CHARGED = "supstar_armara_charge_last";

    private static final int BASE_DELAY = 200; // every 10s

    /*
        Discidia: Slaps enemies who hit us for the same damage
        Armara: It's fucking Immortal Centurion god dammit
        Vicio: Notable move speed, Fly and Fall damage immunity
        Aevitas: Terrafirma and random growth nearby
        Evorsio: When you kill an enemy others nearby get hurt
     */
    public Superstar_Armor(String identifier, int color) {
        super(identifier, color);
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onSomethingDied(LivingDeathEvent event) {
        if (event.getSource().getImmediateSource() instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) event.getSource().getImmediateSource();
            int level = (int) ArmorHelper.getArmorAbilityLevel(player, identifier);
            if (level != 0 && getAttuned(player) == Constellations.evorsio) {
                double x1 = event.getEntity().posX;
                double y1 = event.getEntity().posY;
                double z1 = event.getEntity().posZ;
                double x2 = x1 + 4;
                double y2 = y1 + 3;
                double z2 = z1 + 4;
                x1 -= 4;
                y1 -= 3;
                z1 -= 4;
                List<EntityMob> targets = event.getEntity().world.getEntitiesWithinAABB(EntityMob.class, new AxisAlignedBB(x1, y1, z1, x2, y2, z2));
                for (EntityMob e : targets) {
                    attackEntitySecondary(event.getSource(), 4, e, false, false);
                }
            }
        }
    }

    @Override
    public void onUpdate(ItemStack tool, World world, Entity entity, int itemSlot, boolean isSelected) {

        if (entity instanceof EntityPlayer) {
            IMajorConstellation attuned = getAttuned((EntityPlayer) entity);
            if (attuned == Constellations.aevitas) {
                if(random.nextFloat() < 0.05) {
                    ((EntityLivingBase) entity).heal(2 / 3.0f);
                }
                growNearbyPlantAevitas(world, entity);
            }
        }
    }

    private void growNearbyPlantAevitas(World world, Entity entity) {
        for(int i = -1; i <= 1; i++) {

            double x = entity.posX + random.nextInt(9) - 4;
            double y = entity.posY + i;
            double z = entity.posZ + random.nextInt(9) - 4;
            BlockPos pos = new BlockPos(x, y, z);
            IBlockState state = world.getBlockState(pos);
            Block plant = state.getBlock();
            if (plant instanceof IGrowable || plant instanceof IPlantable) {
                world.scheduleBlockUpdate(pos, plant, 0, 1);
                return;
            }
        }
    }

    @Override
    public void onAbilityTick(int level, World world, EntityPlayer player) {
        IMajorConstellation attuned = getAttuned(player);
        if (attuned == Constellations.vicio) {
            if (world.getWorldTime() % 20 == 0) {
                player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 400, 0, false, false));
            }
        }
    }

    @Override
    public void onArmorTick(ItemStack tool, World world, EntityPlayer player) {
        IMajorConstellation attuned = getAttuned(player);
        if (!world.isRemote && attuned == Constellations.armara) {
            if ((world.getTotalWorldTime() != getLastStoredCharge(tool)) && (world.getTotalWorldTime() % (BASE_DELAY) == 0)) {
                int storedDamage = getStoredCharge(tool);
                setLastStoredCharge(tool, world.getTotalWorldTime());
                if (canStoreDamage(tool, storedDamage)) {
                    setStoredCharge(tool, storedDamage + 1);
                }
            }
        }
    }

    @Override
    public float onDamaged(ItemStack armor, EntityPlayer player, DamageSource source, float damage, float newDamage, LivingDamageEvent evt) {
        IMajorConstellation attuned = getAttuned(player);
        if (attuned == Constellations.armara) {
            return useStoredDamageArmara(armor, newDamage, evt);
        }

        return super.onDamaged(armor, player, source, damage, newDamage, evt);
    }

    @Override
    public float onHurt(ItemStack armor, EntityPlayer player, DamageSource source, float damage, float newDamage, LivingHurtEvent evt) {
        IMajorConstellation attuned = getAttuned(player);
        if (attuned == Constellations.discidia && source.getImmediateSource() instanceof EntityLivingBase) {
            damageEntityBySpines(armor, player, (EntityLivingBase) source.getImmediateSource(), newDamage);
        } else if (attuned == Constellations.vicio) {
            if (source.damageType.equals("fall") || source.damageType.equals("flyIntoWall")) {
                evt.setCanceled(true);
                return 0;
            }
        }

        return super.onHurt(armor, player, source, damage, newDamage, evt);
    }

    // 4*level
    private int getMaxDamage() {
        return 8;
    }

    private boolean canStoreDamage(ItemStack armor, int storedDamage) {
        return storedDamage < getMaxDamage();
    }

    private int getStoredCharge(ItemStack tool) {
        return tool.getTagCompound().getInteger(TAG_STORED_CHARGE);
    }

    private void setStoredCharge(ItemStack tool, int newXp) {
        tool.getTagCompound().setInteger(TAG_STORED_CHARGE, newXp);
    }

    private long getLastStoredCharge(ItemStack tool) {
        return tool.getTagCompound().getLong(TAG_LAST_CHARGED);
    }

    private void setLastStoredCharge(ItemStack tool, long newTime) {
        tool.getTagCompound().setLong(TAG_LAST_CHARGED, newTime);
    }

    private IMajorConstellation getAttuned(EntityPlayer player) {
        return ResearchManager.getProgress(player, Side.SERVER).getAttunedConstellation();
    }

    private float useStoredDamageArmara(ItemStack armor, float newDamage, LivingDamageEvent evt) {
        int storedDamage = getStoredCharge(armor);
        if (storedDamage > newDamage) {
            setStoredCharge(armor, (int) (storedDamage - newDamage));
            evt.setCanceled(true);
            return 0;
        } else if (storedDamage > 6 && storedDamage >= getMaxDamage()) {
            setStoredCharge(armor, 0);
            evt.setCanceled(true);
            return 0;
        } else {
            setStoredCharge(armor, 0);
            return Math.max(0, newDamage - storedDamage);
        }
    }

    /*
            From ConArm's Spiny trait
     */
    private void damageEntityBySpines(ItemStack armor, EntityPlayer player, EntityLivingBase target, float attackDamage) {
        EntityDamageSource damageSource = new EntityDamageSource(DamageSource.CACTUS.damageType, player);
        damageSource.setDamageBypassesArmor();
        damageSource.setDamageIsAbsolute();
        damageSource.setIsThornsDamage();
        int oldHurtResistantTime = target.hurtResistantTime;
        int armorDamage = 1;
        if (attackEntitySecondary(damageSource, attackDamage, target, true, false, false)) {
            TinkerTools.proxy.spawnEffectParticle(ParticleEffect.Type.HEART_CACTUS, target, 1);
            armorDamage = 3;
        }
        ArmorHelper.damageArmor(armor, damageSource, armorDamage, player, EntityLiving.getSlotForItemStack(armor).getIndex());
        target.hurtResistantTime = oldHurtResistantTime;
    }

}
