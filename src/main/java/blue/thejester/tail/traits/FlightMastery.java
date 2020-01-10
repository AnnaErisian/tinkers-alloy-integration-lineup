package blue.thejester.tail.traits;

import c4.conarm.lib.traits.AbstractArmorTrait;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import vazkii.botania.api.state.BotaniaStateProps;
import vazkii.botania.common.block.ModBlocks;

public class FlightMastery extends AbstractArmorTrait {

    public static final FlightMastery flightmastery = new FlightMastery("flightmastery", 0xffffff);

    public FlightMastery(String identifier, int color) {
        super(identifier, color);
    }

    @Override
    public float onDamaged(ItemStack armor, EntityPlayer player, DamageSource source, float damage, float newDamage, LivingDamageEvent evt) {
        if(source.damageType.equals("flyIntoWall")) {
            evt.setCanceled(true);
            return 0;
        }
        return newDamage;
    }
}
