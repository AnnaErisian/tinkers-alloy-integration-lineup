package blue.thejester.tail.asm.handler;

import blue.thejester.tail.traits.potioneffects.SlipperyPotion;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;

public class AsmHandler {

    public static float slipFix(float original, EntityLivingBase entity, Block b)
    {
        boolean wearsBoots = false;

        if(entity.getActivePotionEffect(SlipperyPotion.potion) != null) {
            return 0.95F;
        }

        return original;
    }
}
