package blue.thejester.tail.traits;

import landmaster.plustic.api.Sounds;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import slimeknights.tconstruct.library.traits.AbstractTrait;
import slimeknights.tconstruct.library.utils.TagUtil;
import slimeknights.tconstruct.library.utils.TinkerUtil;
import slimeknights.tconstruct.library.utils.ToolHelper;

public class Annihilator extends AbstractTrait {
	public static final Annihilator annihilator = new Annihilator();

	public Annihilator() {
		super("annihilator",0xffffff);
	}

	@Override
	public void afterHit(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damageDealt, boolean wasCritical, boolean wasHit) {
		if (wasHit && !(target instanceof EntityPlayer)) {
			if(target.getHealth() * 10 <= target.getMaxHealth()) {
				//We have a target, give them a colossal slap
				if(player != null) {
					target.attackEntityFrom(new EntityDamageSource("annihilator", player), 1000);
				} else {
					target.setHealth(0);
				}
				//And make them poof on the next tick
				target.deathTime = 19;
			}
		}
	}

}