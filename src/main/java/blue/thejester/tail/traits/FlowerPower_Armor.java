package blue.thejester.tail.traits;

import c4.conarm.lib.traits.AbstractArmorTrait;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingKnockBackEvent;
import vazkii.botania.api.item.IFlowerPlaceable;
import vazkii.botania.api.state.BotaniaStateProps;
import vazkii.botania.common.block.ModBlocks;

public class FlowerPower_Armor extends AbstractArmorTrait {

    public static final FlowerPower_Armor flowerpower = new FlowerPower_Armor("flowerpower", 0xffffff);

    public FlowerPower_Armor(String identifier, int color) {
        super(identifier, color);
    }

    @Override
    public void onAbilityTick(int level, World world, EntityPlayer player) {
        super.onAbilityTick(level, world, player);
        if(world.getWorldTime() % 4000 == 0) {
            int x = (int) (player.posX + random.nextInt(7) - 3);
            int y = (int) (player.posY + random.nextInt(4) - 2);
            int z = (int) (player.posZ + random.nextInt(7) - 3);
            BlockPos p = new BlockPos(x,y,z);
            BlockPos up = p.up();
            if(world.isAirBlock(up) && world.getBlockState(up).getMaterial() != Material.WATER && ModBlocks.flower.canPlaceBlockAt(world, up)) {
                world.setBlockState(up, ModBlocks.flower.getDefaultState().withProperty(BotaniaStateProps.COLOR, EnumDyeColor.byDyeDamage(random.nextInt(16))));
            }
        }
    }

}
