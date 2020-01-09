package blue.thejester.tail.traits.potioneffects;

import blue.thejester.tail.Tail;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = Tail.MODID)
public class SlipperyPotion extends Potion {

    public static final SlipperyPotion potion = new SlipperyPotion("tail_slippery", true, 0x333333);

    protected SlipperyPotion(String name, boolean isBadEffectIn, int liquidColorIn) {
        super(isBadEffectIn, liquidColorIn);
        this.setRegistryName(name);
    }

    @SubscribeEvent
    public static void registerPotions(RegistryEvent.Register<Potion> evt)
    {
        evt.getRegistry().register(potion);
    }

    @Override
    public List<ItemStack> getCurativeItems() {
        return new ArrayList<ItemStack>();
    }
}
