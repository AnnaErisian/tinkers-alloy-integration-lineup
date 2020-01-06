package blue.thejester.tail.core;

import blue.thejester.tail.Tail;
import blue.thejester.tail.block.BlockStorage;
import blue.thejester.tail.item.ItemMaterial;
import blue.thejester.tail.item.MetalMaterial;
import blue.thejester.tail.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import slimeknights.mantle.client.CreativeTab;

public abstract class CommonProxy {

    public static CreativeTab tailCreativeTab = new CreativeTab("TailTab", new ItemStack(Items.IRON_HOE));

    /**
     * Run before anything else. Read your config, create blocks, items, etc, and register them with the GameRegistry
     */
    public void preInit() {
        //read config first

        ModItems.init();
        MetalMaterial.makeItems();

        tailCreativeTab.setDisplayIcon(MetalMaterial.adamantite.ingotStack);

    }

    /**
     * Do your mod setup. Build whatever data structures you care about. Register recipes,
     * send FMLInterModComms messages to other mods.
     */
    public void init() {
        MetalMaterial.makeRecipes();
    }

    /**
     * Handle interaction with other mods, complete your setup based on this.
     */
    public void postInit() {
        MetalMaterial.registerOreDict();
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
