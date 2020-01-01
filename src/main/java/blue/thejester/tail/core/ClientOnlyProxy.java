package blue.thejester.tail.core;

import blue.thejester.tail.Tail;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.Fluid;

import javax.annotation.Nonnull;

public class ClientOnlyProxy extends CommonProxy {

    @Override
    public void preInit() {

        super.preInit();
    }

    @Override
    public boolean isDedicatedServer() {
        return false;
    }

    /**
     * From Tinker's Aether
     */
    @Override
    public void registerFluidModels(Fluid fluid) {
        if (fluid != null) {
            Block block = fluid.getBlock();
            if (block != null) {
                Item item = Item.getItemFromBlock(block);
                ClientOnlyProxy.FluidStateMapper mapper = new ClientOnlyProxy.FluidStateMapper(fluid);
                ModelBakery.registerItemVariants(item);
                ModelLoader.setCustomMeshDefinition(item, mapper);

                ModelLoader.setCustomStateMapper(block, mapper);
            }

        }
    }


    /**
     * From Tinker's Aether
     */
    public static class FluidStateMapper extends StateMapperBase implements ItemMeshDefinition {
        public final Fluid fluid;
        public final ModelResourceLocation location;

        public FluidStateMapper(Fluid fluid) {
            this.fluid = fluid;
            this.location = new ModelResourceLocation(new ResourceLocation(Tail.MODID, "fluid_block"), fluid.getName());
        }

        @Override
        public ModelResourceLocation getModelLocation(ItemStack stack) {
            return location;
        }

        @Override
        protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
            return location;
        }
    }
}
