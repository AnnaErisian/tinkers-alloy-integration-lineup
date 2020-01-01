package blue.thejester.tail.traits;

import net.minecraft.entity.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.potion.*;
import slimeknights.tconstruct.library.traits.*;

public class Ignitive extends AbstractTrait {
	public static final Ignitive ignitive = new Ignitive();
	
	public Ignitive() {
		super("ignitive",0xd15e17);
	}
	
	@Override
	public void afterHit(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damageDealt, boolean wasCritical, boolean wasHit) {
		if (wasHit && target.isEntityAlive() && !target.isImmuneToFire()) {
			target.setFire(5);
		}
	}
}