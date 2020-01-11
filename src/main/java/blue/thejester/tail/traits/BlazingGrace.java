package blue.thejester.tail.traits;

import blue.thejester.tail.traits.potioneffects.SlipperyPotion;
import c4.conarm.lib.traits.AbstractArmorTrait;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.living.LivingKnockBackEvent;

public class BlazingGrace extends AbstractArmorTrait {

    public static final BlazingGrace blazing_grace = new BlazingGrace("blazing_grace", 0xffffff);

    public BlazingGrace(String identifier, int color) {
        super(identifier, color);
    }

    @Override
    public float onHurt(ItemStack armor, EntityPlayer player, DamageSource source, float damage, float newDamage, LivingHurtEvent evt) {
        if(source.damageType.equals("inFire") || source.damageType.equals("onFire") || source.damageType.equals("lava")) {
            player.heal(damage * 0.33f);
            evt.setCanceled(true);
            return 0;
        }
        return newDamage;
    }
}
