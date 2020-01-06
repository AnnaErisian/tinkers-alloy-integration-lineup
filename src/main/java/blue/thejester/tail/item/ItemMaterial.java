package blue.thejester.tail.item;

import blue.thejester.tail.block.BlockStorage;
import blue.thejester.tail.core.CommonProxy;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import static cofh.core.util.helpers.RecipeHelper.addTwoWayStorageRecipe;

public class ItemMaterial extends Item{

    public ItemMaterial(String name) {
        setTranslationKey(name);
        setRegistryName(name);
        this.setCreativeTab(CommonProxy.tailCreativeTab);
    }

}
