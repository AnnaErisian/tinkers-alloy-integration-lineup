package blue.thejester.tail.core;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public abstract class CommonProxy {

    public static Block blockInventoryBasic;  // this holds the unique instance of your block
    public static ItemBlock itemBlockInventoryBasic; // and the corresponding item form that block
    public static Block blockInventoryBasicM;  // this holds the unique instance of your block
    public static ItemBlock itemBlockInventoryBasicM; // and the corresponding item form that block
    public static Block blockInventoryBasicL;  // this holds the unique instance of your block
    public static ItemBlock itemBlockInventoryBasicL; // and the corresponding item form that block

    /**
     * Run before anything else. Read your config, create blocks, items, etc, and register them with the GameRegistry
     */
    public void preInit() {
        //read config first


    }

    /**
     * Do your mod setup. Build whatever data structures you care about. Register recipes,
     * send FMLInterModComms messages to other mods.
     */
    public void init() {

        ResourceLocation crateRecipeGroup = new ResourceLocation("tail");

    }

    /**
     * Handle interaction with other mods, complete your setup based on this.
     */
    public void postInit() {
    }

    /**
     * is this a dedicated server?
     *
     * @return true if this is a dedicated server, false otherwise
     */
    abstract public boolean isDedicatedServer();

    public void registerFluidModels(Fluid fluid) {

    }
}
