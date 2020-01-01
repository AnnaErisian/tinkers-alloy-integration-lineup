package blue.thejester.tail.modules;

import blue.thejester.tail.helper.fluid.Create;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import slimeknights.mantle.util.RecipeMatch;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.smeltery.CastingRecipe;
import slimeknights.tconstruct.library.smeltery.MeltingRecipe;

public class Fluids implements IModule{

    @Override
    public void init() {
        Fluid netherstar = Create.plain("netherstar", 0xfffbed, 10000);
        TinkerRegistry.registerMelting(new MeltingRecipe(new RecipeMatch.Oredict("netherStar", 1, 250), netherstar, 2500));
        TinkerRegistry.registerTableCasting(new CastingRecipe(new ItemStack(Items.NETHER_STAR, 1), netherstar, 250, 2400));
    }
}
