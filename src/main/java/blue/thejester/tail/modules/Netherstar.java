package blue.thejester.tail.modules;

import blue.thejester.tail.helper.fluid.Create;
import blue.thejester.tail.traits.Ignitive;
import blue.thejester.tail.traits.WitherImmunity;
import c4.conarm.common.armor.traits.ArmorTraits;
import c4.conarm.lib.ArmoryRegistry;
import c4.conarm.lib.materials.*;
import landmaster.plustic.traits.Apocalypse;
import landmaster.plustic.traits.Terrafirma;
import nc.integration.tconstruct.conarm.trait.NCArmorTraits;
import slimeknights.tconstruct.library.MaterialIntegration;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.materials.*;
import slimeknights.tconstruct.tools.TinkerTraits;

public class Netherstar implements IModule {
    @Override
    public void init() {
        {
            Material netherstar = new Material("netherstar", 0x000000);
            netherstar.addTrait(Apocalypse.apocalypse);
            netherstar.addTrait(TinkerTraits.lightweight);
            netherstar.addTrait(TinkerTraits.unnatural, MaterialTypes.HEAD);
            netherstar.setCraftable(true).setCastable(false);
            netherstar.addItem("netherStar", 1, Material.VALUE_Gem);
            ArmorMaterials.addArmorTrait(netherstar, WitherImmunity.witherImmunity2, ArmorMaterialType.CORE);
            ArmorMaterials.addArmorTrait(netherstar, WitherImmunity.witherImmunity, ArmorMaterialType.TRIM);
            ArmorMaterials.addArmorTrait(netherstar, WitherImmunity.witherImmunity, ArmorMaterialType.PLATES);
            ArmorMaterials.addArmorTrait(netherstar, NCArmorTraits.WITHERING);
            TinkerRegistry.addMaterialStats(netherstar,
                    new CoreMaterialStats(17f, 7f),
                    new PlatesMaterialStats(1.4f, 3.5f, 2),
                    new TrimMaterialStats(66.6f),
                    new HeadMaterialStats(880, 5, 8.5f, 4),
                    new HandleMaterialStats(0.9f, 180),
                    new ExtraMaterialStats(350));
            netherstar.setRenderInfo(0x000000);

            MaterialIntegration netherstarMi = new MaterialIntegration(netherstar).setRepresentativeItem("netherStar");
            TinkerRegistry.integrate(netherstarMi).preInit();
        }

    }
}
