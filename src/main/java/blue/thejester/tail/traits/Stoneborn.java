package blue.thejester.tail.traits;

import c4.conarm.lib.traits.AbstractArmorTrait;
import c4.conarm.lib.traits.AbstractArmorTraitLeveled;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import slimeknights.tconstruct.library.utils.TinkerUtil;

public class Stoneborn extends AbstractArmorTrait {

    public static final Stoneborn stoneborn = new Stoneborn("stoneborn", 0xffffff);


    public Stoneborn(String identifier, int color) {
        super(identifier, color);
    }

    @Override
    public void onUpdate(ItemStack tool, World world, Entity entity, int itemSlot, boolean isSelected) {
        if(!world.isRemote && isSelected && entity instanceof EntityLivingBase) {
            ((EntityLivingBase) entity).removePotionEffect(MobEffects.POISON);
        }
    }

    @Override
    public void onAbilityTick(int level, World world, EntityPlayer player) {
        if(!world.isRemote) {
            player.removePotionEffect(MobEffects.POISON);
        }
    }
}
