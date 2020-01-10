package blue.thejester.tail.traits;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;
import slimeknights.tconstruct.library.traits.AbstractTrait;

public class Detonator extends AbstractTrait {
	public static final Detonator detonator = new Detonator();

	public Detonator() {
		super("detonator",0xffffff);
	}
	
	@Override
	public void afterHit(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damageDealt, boolean wasCritical, boolean wasHit) {
		if (wasHit && !player.world.isRemote) {
			player.world.createExplosion(player, target.posX, target.posY+0.2, target.posZ, 0.6f, false);
		}
	}

	@Override
	public void afterBlockBreak(ItemStack tool, World world, IBlockState state, BlockPos pos, EntityLivingBase player, boolean wasEffective) {
		super.afterBlockBreak(tool, world, state, pos, player, wasEffective);
		if(!world.isRemote) {
			world.createExplosion(player, pos.getX()+0.5f, pos.getY()+0.5f, pos.getZ()+0.5f, 2.5f, true);
		}
	}

	@Override
	public void beforeBlockBreak(ItemStack tool, BlockEvent.BreakEvent event) {
		super.beforeBlockBreak(tool, event);
		if(!event.getWorld().isRemote) {
			event.getWorld().createExplosion(event.getPlayer(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), 4, true);
		}
	}
}