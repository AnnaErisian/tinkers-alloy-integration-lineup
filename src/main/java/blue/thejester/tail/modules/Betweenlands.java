package blue.thejester.tail.modules;

import blue.thejester.tail.helper.fluid.Create;
import blue.thejester.tail.traits.Ignitive;
import c4.conarm.common.armor.traits.ArmorTraits;
import c4.conarm.lib.materials.*;
import landmaster.plustic.traits.Terrafirma;
import slimeknights.tconstruct.library.MaterialIntegration;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.materials.*;
import slimeknights.tconstruct.tools.TinkerTraits;

public class Betweenlands implements IModule {
    @Override
    public void init() {
        {
            Material valonite = new Material("valonite", 0xD8B7D9);
            valonite.addTrait(TinkerTraits.established);
            valonite.addTrait(TinkerTraits.enderference);
            valonite.setCraftable(true).setCastable(false);
            ArmorMaterials.addArmorTrait(valonite, ArmorTraits.indomitable, ArmorMaterialType.CORE);
            ArmorMaterials.addArmorTrait(valonite, ArmorTraits.shielding, ArmorMaterialType.CORE);
            ArmorMaterials.addArmorTrait(valonite, ArmorTraits.heavy, ArmorMaterialType.TRIM);
            ArmorMaterials.addArmorTrait(valonite, ArmorTraits.shielding, ArmorMaterialType.TRIM);
            ArmorMaterials.addArmorTrait(valonite, ArmorTraits.heavy, ArmorMaterialType.PLATES);
            ArmorMaterials.addArmorTrait(valonite, ArmorTraits.shielding, ArmorMaterialType.PLATES);
            valonite.addItem("gemValonite", 1, Material.VALUE_Gem);
            valonite.addItem("blockValonite", 1, Material.VALUE_Gem);
            TinkerRegistry.addMaterialStats(valonite,
                    new CoreMaterialStats(7, 10),
                    new PlatesMaterialStats(1.6f, 3.5f, 2),
                    new TrimMaterialStats(17),
                    new HeadMaterialStats(880, 7, 7, 4),
                    new HandleMaterialStats(1.25f, 50),
                    new ExtraMaterialStats(88));
            valonite.setRenderInfo(0xD8B7D9);

            MaterialIntegration valoniteMi = new MaterialIntegration(valonite).setRepresentativeItem("gemValonite");
            TinkerRegistry.integrate(valoniteMi).preInit();
        }
        {
            Material octine = new Material("octine", 0xffe634);
            octine.setCraftable(false).setCastable(true);
            octine.addTrait(TinkerTraits.superheat);
            octine.addTrait(TinkerTraits.superheat, MaterialTypes.HEAD);
            octine.addTrait(Ignitive.ignitive, MaterialTypes.HEAD);
            octine.addItem("ingotOctine", 1, Material.VALUE_Ingot);
            octine.addItem("blockOctine", 1, Material.VALUE_Block);
            TinkerRegistry.addMaterialStats(octine,
                    new HeadMaterialStats(660, 6.5f, 5.5f, 2),
                    new HandleMaterialStats(1.1f, 15),
                    new ExtraMaterialStats(66),
                    new BowMaterialStats(5, 0.5f, 1));
            octine.setRenderInfo(0xffe634);

            MaterialIntegration octineMi = new MaterialIntegration(octine, Create.plain("octine", 0xffe634)).setRepresentativeItem("ingotOctine");
            TinkerRegistry.integrate(octineMi).preInit();
        }
        {
            Material syrmorite = new Material("syrmorite", 0x4e58a7);
            syrmorite.setCraftable(false).setCastable(true);
            ArmorMaterials.addArmorTrait(syrmorite, ArmorTraits.steady, ArmorMaterialType.CORE);
            ArmorMaterials.addArmorTrait(syrmorite, ArmorTraits.lightweight, ArmorMaterialType.CORE);
            ArmorMaterials.addArmorTrait(syrmorite, ArmorTraits.lightweight, ArmorMaterialType.TRIM);
            ArmorMaterials.addArmorTrait(syrmorite, ArmorTraits.lightweight, ArmorMaterialType.PLATES);
            syrmorite.addItem("ingotSyrmorite", 1, Material.VALUE_Ingot);
            syrmorite.addItem("blockSyrmorite", 1, Material.VALUE_Block);
            TinkerRegistry.addMaterialStats(syrmorite,
                    new CoreMaterialStats(16, 16),
                    new PlatesMaterialStats(0.9f, 6, 1),
                    new TrimMaterialStats(6.3f));
            syrmorite.setRenderInfo(0x4e58a7);

            MaterialIntegration syrmoriteMi = new MaterialIntegration(syrmorite, Create.plain("syrmorite", 0x4e58a7)).setRepresentativeItem("ingotSyrmorite");
            TinkerRegistry.integrate(syrmoriteMi).preInit();
        }

        {
            Material scabyst = new Material("scabyst", 0x97bdb7);
            scabyst.setCraftable(true).setCastable(false);
            scabyst.addTrait(Terrafirma.terrafirma.get(0), ArmorMaterialType.CORE);
            ArmorMaterials.addArmorTrait(scabyst, ArmorTraits.shielding, ArmorMaterialType.CORE);
            ArmorMaterials.addArmorTrait(scabyst, ArmorTraits.aquaspeed, ArmorMaterialType.PLATES);
            ArmorMaterials.addArmorTrait(scabyst, ArmorTraits.shielding, ArmorMaterialType.PLATES);
            ArmorMaterials.addArmorTrait(scabyst, ArmorTraits.shielding, ArmorMaterialType.TRIM);
            scabyst.addItem("gemScabyst", 1, Material.VALUE_Gem);
            scabyst.addItem("blockScabyst", 1, Material.VALUE_Gem);
            TinkerRegistry.addMaterialStats(scabyst,
                    new CoreMaterialStats(15, 10),
                    new PlatesMaterialStats(1.6f, 6.5f, 0),
                    new TrimMaterialStats(17));
            scabyst.setRenderInfo(0x97bdb7);

            MaterialIntegration scabystMi = new MaterialIntegration(scabyst).setRepresentativeItem("gemScabyst");
            TinkerRegistry.integrate(scabystMi).preInit();
        }
    }
}
