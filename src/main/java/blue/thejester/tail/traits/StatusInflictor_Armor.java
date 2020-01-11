package blue.thejester.tail.traits;

import c4.conarm.lib.traits.AbstractArmorTrait;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class StatusInflictor_Armor extends AbstractArmorTrait {

    public static final StatusInflictor_Armor frozen_aura = new StatusInflictor_Armor("frozen_aura", 0xffffff, MobEffects.SLOWNESS, 50, 3);

    private Potion effect;
    private int duration;
    private int amplifier;

    public StatusInflictor_Armor(String identifier, int color) {
        super(identifier, color);
    }

    public StatusInflictor_Armor(String identifier, int color, Potion eff, int dur)
    {
        this(identifier, color);
        effect = eff;
        duration = dur;
    }

    public StatusInflictor_Armor(String identifier, int color, Potion eff, int dur, int amp) {
        this(identifier, color, eff, dur);
        amplifier = amp;
    }



    @Override
    public float onHurt(ItemStack armor, EntityPlayer player, DamageSource source, float damage, float newDamage, LivingHurtEvent evt) {
        Entity damager = source.getImmediateSource();
        if(damager instanceof EntityLivingBase) {
            ((EntityLivingBase)damager).addPotionEffect(new PotionEffect(this.effect, this.duration, this.amplifier));
        }
        return super.onHurt(armor, player, source, damage, newDamage, evt);
    }
}
