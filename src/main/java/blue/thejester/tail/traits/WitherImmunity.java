package blue.thejester.tail.traits;

import blue.thejester.tail.Tail;
import c4.conarm.lib.traits.AbstractArmorTrait;
import c4.conarm.lib.traits.AbstractArmorTraitLeveled;
import c4.conarm.lib.traits.IArmorTrait;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class WitherImmunity extends AbstractArmorTraitLeveled {

    final static int MAX_LEVEL = 2;
    public static final WitherImmunity witherImmunity = new WitherImmunity("witherimmunity", 0x000000, 1);
    public static final WitherImmunity witherImmunity2 = new WitherImmunity("witherimmunity", 0x000000, 2);

    public int level = 1;

    public WitherImmunity(String identifier, int color, int level) {
        super(identifier, color, MAX_LEVEL, level);
        this.level = level;
    }

    @Override
    public float onHurt(ItemStack armor, EntityPlayer player, DamageSource source, float damage, float newDamage, LivingHurtEvent evt) {
        Tail.logger.info("onHurt");
        if(!player.world.isRemote && source.damageType.equals("wither")) {
            Tail.logger.info("onHurt - remote, type is wither");
            if(random.nextFloat() < (level * 0.1f)) {
                evt.setCanceled(true);
                player.removePotionEffect(MobEffects.WITHER);
            }
        }

        return super.onHurt(armor, player, source, damage, newDamage, evt);
    }
}
