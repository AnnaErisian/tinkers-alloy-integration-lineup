package blue.thejester.tail.core;

import blue.thejester.tail.Tail;
import blue.thejester.tail.block.BlockStorage;
import blue.thejester.tail.item.ItemMaterial;
import blue.thejester.tail.item.MetalMaterial;
import blue.thejester.tail.item.ModItems;
import blue.thejester.tail.modules.*;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import scala.tools.cmd.Meta;
import slimeknights.mantle.client.CreativeTab;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.shared.TinkerCommons;
import slimeknights.tconstruct.shared.TinkerFluids;

import java.util.Arrays;

public class CommonProxy {

    public static CreativeTab tailCreativeTab = new CreativeTab("TailTab", new ItemStack(Items.IRON_HOE));

    /**
     * Run before anything else. Read your config, create blocks, items, etc, and register them with the GameRegistry
     */
    public void preInit() {

        ModItems.init();
        IModule.modules.addAll(Arrays.asList(new BotaniaArmor(), new Betweenlands(), new Fluids(), new Netherstar(), new NewMaterials()));
        IModule.modules.forEach(IModule::init);

        ModItems.init();
        MetalMaterial.makeItems();
        MetalMaterial.sendSmelteryIMC();

        tailCreativeTab.setDisplayIcon(MetalMaterial.adamantite.ingotStack);

    }

    /**
     * Do your mod setup. Build whatever data structures you care about. Register recipes,
     * send FMLInterModComms messages to other mods.
     */
    public void init() {
        MetalMaterial.registerOreDict();
        MetalMaterial.makeRecipes();
    }

    /**
     * Handle interaction with other mods, complete your setup based on this.
     */
    public void postInit() {
        IModule.modules.forEach(IModule::initLate);

    }

    /**
     * is this a dedicated server?
     *
     * @return true if this is a dedicated server, false otherwise
     */
    public boolean isDedicatedServer() {
        return true;
    }

    public void registerFluidModels(Fluid fluid) {

    }
}
