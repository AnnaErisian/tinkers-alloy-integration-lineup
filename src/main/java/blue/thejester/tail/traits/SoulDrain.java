package blue.thejester.tail.traits;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import slimeknights.tconstruct.library.traits.AbstractTrait;
import slimeknights.tconstruct.library.traits.AbstractTraitLeveled;
import slimeknights.tconstruct.library.utils.TinkerUtil;

public class SoulDrain extends AbstractTrait {
	public static final SoulDrain soulDrain = new SoulDrain();

	public SoulDrain(String identifier, int color) {
		super(identifier, color);
	}

	public SoulDrain() {
		this("soulDrain", 0xffffff);
	}

	@Override
	public float damage(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damage, float newDamage, boolean isCritical) {
		return target.getMaxHealth() * newDamage / 75f;
	}

}