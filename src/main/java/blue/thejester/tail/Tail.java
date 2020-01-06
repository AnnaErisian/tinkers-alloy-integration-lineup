package blue.thejester.tail;

import blue.thejester.tail.core.CommonProxy;
import blue.thejester.tail.item.ModItems;
import blue.thejester.tail.modules.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

@Mod(modid = Tail.MODID, name = Tail.NAME, version = Tail.VERSION, dependencies = Tail.DEPENDS)
public class Tail
{
    public static final String MODID = "tail";
    public static final String NAME = "Tinker's Alloying and Integration Lineup";
    public static final String VERSION = "1.0";
    public static final String DEPENDS = "required-after:mantle;"
            + "required-after:tconstruct@[1.12-2.7.2.15,);required-after:forge@[14.23.5.2768,);"
            + "required-after:botania;required-after:plustic;"
            + "required-after:thermalfoundation;after:draconicevolution;"
            + "required-after:twilightforest@[3.7,);required-after:crafttweaker;"
            + "required-after:conarm;required-after:astralsorcery;";

    public static Logger logger;



    // The instance of your mod that Forge uses.  Optional.
    @Mod.Instance(Tail.MODID)
    public static Tail instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="blue.thejester.tail.core.ClientOnlyProxy", serverSide="blue.thejester.tail.core.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        ModItems.init();
        IModule.modules.addAll(Arrays.asList(new BotaniaArmor(), new Betweenlands(), new Fluids(), new Netherstar(), new NewMaterials()));
        IModule.modules.forEach(IModule::init);

        proxy.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit();
    }
}
