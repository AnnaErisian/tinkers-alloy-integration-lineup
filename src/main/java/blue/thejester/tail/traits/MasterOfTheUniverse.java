package blue.thejester.tail.traits;

import java.util.*;
import java.util.function.*;

import c4.conarm.common.armor.utils.ArmorHelper;
import c4.conarm.lib.armor.*;
import c4.conarm.lib.capabilities.*;
import c4.conarm.lib.traits.*;
import landmaster.plustic.api.*;
import landmaster.plustic.traits.DeathSaveTrait;
import landmaster.plustic.util.*;
import net.minecraft.entity.*;
import net.minecraft.entity.item.*;
import net.minecraft.entity.player.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.potion.*;
import net.minecraft.util.*;
import net.minecraft.util.text.*;
import net.minecraft.world.*;
import net.minecraftforge.common.*;
import net.minecraftforge.common.capabilities.*;
import net.minecraftforge.event.entity.living.*;
import net.minecraftforge.event.entity.player.*;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraftforge.items.*;
import net.minecraftforge.oredict.OreDictionary;
import org.apache.commons.lang3.ArrayUtils;
import slimeknights.tconstruct.library.modifiers.ModifierNBT;
import slimeknights.tconstruct.library.traits.*;
import slimeknights.tconstruct.library.utils.*;

    public class MasterOfTheUniverse extends DeathSaveTrait {
        public static final MasterOfTheUniverse master_of_the_universe = new MasterOfTheUniverse();

        public MasterOfTheUniverse() {
            super("master_of_the_universe", 0xffffff, 1, (stack) -> {
                return !stack.isEmpty() && ArrayUtils.contains(OreDictionary.getOreIDs(stack), OreDictionary.getOreID("dustAstralStarmetal"));},
                    "msg.tail.mastermodifier.use");
        }
    }