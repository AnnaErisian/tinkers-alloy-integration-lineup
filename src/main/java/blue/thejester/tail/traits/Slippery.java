package blue.thejester.tail.traits;

import blue.thejester.tail.Tail;
import c4.conarm.lib.traits.AbstractArmorTrait;
import c4.conarm.lib.traits.AbstractArmorTraitLeveled;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class Slippery extends AbstractArmorTrait {

    final static int MAX_LEVEL = 2;
    public static final Slippery slippery = new Slippery("slippery", 0xffffff, 1);

    public int level = 1;

    public Slippery(String identifier, int color, int level) {
        super(identifier, color);
        this.level = level;
    }

    @Override
    public void onAbilityTick(int level, World world, EntityPlayer player) {
        super.onAbilityTick(level, world, player);
        if(!world.isRemote) {
//            player.sendMessage(new TextComponentTranslation(String.format("DX: %f | DZ: %f", player.posX - player.prevPosX, player.posZ - player.prevPosZ)));
//            double addX = 5000 * player.motionX;
//            double addZ = 5000 * player.motionZ;
//            if(player.motionX != 0) {
//                //addX += player.motionX > 0 ? 0.1 : -0.1;
//                player.sendMessage(new TextComponentTranslation(String.format("N0X %f", player.motionX > 0 ? 0.1 : -0.1)));
//            }
//            if(player.motionZ != 0) {
//                //addZ += player.motionZ > 0 ? 0.1 : -0.1;
//                player.sendMessage(new TextComponentTranslation(String.format("N0Z %f", player.motionZ > 0 ? 0.1 : -0.1)));
//            }
//            player.sendMessage(new TextComponentTranslation(String.format("Motion: %f, %f | Change: %f, %f", player.motionX, player.motionZ, addX, addZ)));
//            //player.addVelocity(addX, 0, addZ);
//            //player.velocityChanged = true;
        }
    }

    @Override
    public void onUpdate(ItemStack tool, World world, Entity entity, int itemSlot, boolean isSelected) {
        super.onUpdate(tool, world, entity, itemSlot, isSelected);

        if(!world.isRemote && entity instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) entity;
            player.sendMessage(new TextComponentTranslation(String.format("DX: %f | DZ: %f", player.posX - player.prevPosX, player.posZ - player.prevPosZ)));
        }
    }
}
