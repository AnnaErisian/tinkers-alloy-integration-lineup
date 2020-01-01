package blue.thejester.tail.item;

import blue.thejester.tail.Tail;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Tail.MODID)
public class ModItems {

    static TraitProfiler traitProfiler;

    public static void init() {
        traitProfiler = new TraitProfiler("trait_profiler");
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(traitProfiler);
    }

}
