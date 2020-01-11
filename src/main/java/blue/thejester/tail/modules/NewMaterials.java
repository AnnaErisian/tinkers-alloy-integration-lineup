package blue.thejester.tail.modules;

import blue.thejester.tail.helper.fluid.Create;
import blue.thejester.tail.traits.*;
import c4.conarm.lib.materials.*;
import landmaster.plustic.traits.Apocalypse;
import slimeknights.tconstruct.library.MaterialIntegration;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.materials.*;
import slimeknights.tconstruct.tools.TinkerTraits;

public class NewMaterials implements IModule {
    @Override
    public void init() {
        {
            Material sageslime = new Material("Sageslime", 0xb6772b);
            TinkerRegistry.addMaterialStats(sageslime,
                    new CoreMaterialStats(12f, 15.5f),
                    new PlatesMaterialStats(0.6f, 13.2f, 1f),
                    new TrimMaterialStats(6f),
                    new HeadMaterialStats(450, 6.2f, 3.2f, 2),
                    new HandleMaterialStats(1.03f, 400),
                    new ExtraMaterialStats(110),
                    new BowMaterialStats(1.6f, 2.8f, 0.6f),
                    new FletchingMaterialStats(1f, 1.1f),
                    new BowStringMaterialStats(1.2f)
            );
            sageslime.setRenderInfo(0xb6772b);

            MaterialIntegration sageslimeMi = new MaterialIntegration(sageslime, Create.plain("sageslime", 0xb6772b)).setRepresentativeItem("ingotSageslime");
            TinkerRegistry.integrate(sageslimeMi).preInit();
        }
        {
            Material chaoite = new Material("Chaoite", 0x988597);
            TinkerRegistry.addMaterialStats(chaoite,
                    new CoreMaterialStats(15f, 18f),
                    new PlatesMaterialStats(1.2f, 8.4f, 1.8f),
                    new TrimMaterialStats(14f),
                    new HeadMaterialStats(660, 8f, 10.4f, 4),
                    new HandleMaterialStats(0.64f, 90),
                    new ExtraMaterialStats(150),
                    new BowMaterialStats(1.1f, 0.8f, 3f)
            );
            chaoite.setRenderInfo(0x988597);
            chaoite.addTrait(StatusInflictor.antigravity, MaterialTypes.HEAD);
            ArmorMaterials.addArmorTrait(chaoite, Floaty.floaty);

            MaterialIntegration chaoiteMi = new MaterialIntegration(chaoite, Create.plain("chaoite", 0x988597)).setRepresentativeItem("ingotChaoite");
            TinkerRegistry.integrate(chaoiteMi).preInit();
        }
        {
            Material tritanium = new Material("Tritanium", 0xffe6a1);
            TinkerRegistry.addMaterialStats(tritanium,
                    new CoreMaterialStats(30f, 22f),
                    new PlatesMaterialStats(1.1f, 20f, 4.5f),
                    new TrimMaterialStats(5.5f),
                    new HeadMaterialStats(2000, 9f, 9f, 2),
                    new HandleMaterialStats(0.7f, 200),
                    new ExtraMaterialStats(75)
            );
            tritanium.addTrait(Melty.melty);
            tritanium.setRenderInfo(0xffe6a1);

            MaterialIntegration tritaniumMi = new MaterialIntegration(tritanium, Create.plain("tritanium", 0xffe6a1)).setRepresentativeItem("ingotTritanium");
            TinkerRegistry.integrate(tritaniumMi).preInit();
        }
        {
            Material white_steel = new Material("White Steel", 0xFFFFFF);
            TinkerRegistry.addMaterialStats(white_steel,
                    new CoreMaterialStats(13.8f, 15.5f),
                    new PlatesMaterialStats(1.06f, 11f, 2.5f),
                    new TrimMaterialStats(3.2f),
                    new HeadMaterialStats(750, 8.1f, 7.24f, 3),
                    new HandleMaterialStats(0.85f, 150),
                    new ExtraMaterialStats(75),
                    new BowMaterialStats(0.95f, 3f, 2.2f)
            );
            white_steel.setRenderInfo(0xFFFFFF);

            MaterialIntegration white_steelMi = new MaterialIntegration(white_steel, Create.plain("white_steel", 0xFFFFFF)).setRepresentativeItem("ingotWhiteSteel");
            TinkerRegistry.integrate(white_steelMi).preInit();
        }
        {
            Material oil_steel = new Material("Oil Steel", 0xaaa38f);
            TinkerRegistry.addMaterialStats(oil_steel,
                    new CoreMaterialStats(12f, 15f),
                    new PlatesMaterialStats(0.85f, 5f, 5f),
                    new TrimMaterialStats(3.5f),
                    new HeadMaterialStats(600, 5f, 5f, 3),
                    new HandleMaterialStats(1.08f, 70),
                    new ExtraMaterialStats(60),
                    new BowMaterialStats(0.3f, 1.2f, 12f)
            );
            oil_steel.setRenderInfo(0xaaa38f);
            ArmorMaterials.addArmorTrait(oil_steel, Slippery_Armor.slippery);
            oil_steel.addTrait(Slippery.slippery);

            MaterialIntegration oil_steelMi = new MaterialIntegration(oil_steel, Create.plain("oil_steel", 0xaaa38f)).setRepresentativeItem("ingotOilSteel");
            TinkerRegistry.integrate(oil_steelMi).preInit();
        }
        {
            Material lordslime = new Material("Lordslime", 0xd78e4c);
            TinkerRegistry.addMaterialStats(lordslime,
                    new CoreMaterialStats(20f, 18f),
                    new PlatesMaterialStats(0.7f, 18.2f, 2f),
                    new TrimMaterialStats(12f),
                    new HeadMaterialStats(1700, 7.7f, 7.7f, 5),
                    new HandleMaterialStats(1.1f, 500),
                    new ExtraMaterialStats(125),
                    new BowMaterialStats(1.7f, 2.6f, 2.5f),
                    new FletchingMaterialStats(1f, 1.2f),
                    new BowStringMaterialStats(1.25f)
            );
            lordslime.setRenderInfo(0xd78e4c);

            MaterialIntegration lordslimeMi = new MaterialIntegration(lordslime, Create.plain("lordslime", 0xd78e4c)).setRepresentativeItem("ingotLordslime");
            TinkerRegistry.integrate(lordslimeMi).preInit();
        }
        {
            Material faerite = new Material("Faerite", 0xff00f2);
            TinkerRegistry.addMaterialStats(faerite,
                    new CoreMaterialStats(13f, 19f),
                    new PlatesMaterialStats(1f, 10f, 2f),
                    new TrimMaterialStats(2.8f),
                    new HeadMaterialStats(770, 8f, 8f, 4),
                    new HandleMaterialStats(1.05f, 180),
                    new ExtraMaterialStats(30),
                    new BowMaterialStats(1.3f, 1.8f, 7f)
            );
            faerite.setRenderInfo(0xff00f2);
            faerite.addTrait(FaeFlight.faeFlight);
            ArmorMaterials.addArmorTrait(faerite, PermanentStatus_Armor.jump_boost, ArmorMaterialType.CORE);

            MaterialIntegration faeriteMi = new MaterialIntegration(faerite, Create.plain("faerite", 0xff00f2)).setRepresentativeItem("ingotFaerite");
            TinkerRegistry.integrate(faeriteMi).preInit();
        }
        {
            Material alubronze = new Material("Alubronze", 0xf7d99d);
            TinkerRegistry.addMaterialStats(alubronze,
                    new CoreMaterialStats(16f, 14f),
                    new PlatesMaterialStats(1.1f, 5.2f, 1.5f),
                    new TrimMaterialStats(6.5f),
                    new HeadMaterialStats(480, 7.2f, 3.5f, 2),
                    new HandleMaterialStats(1.05f, 60),
                    new ExtraMaterialStats(70),
                    new BowMaterialStats(0.6f, 1.5f, 5f)
            );
            alubronze.setRenderInfo(0xf7d99d);

            MaterialIntegration alubronzeMi = new MaterialIntegration(alubronze, Create.plain("alubronze", 0xf7d99d)).setRepresentativeItem("ingotAlubronze");
            TinkerRegistry.integrate(alubronzeMi).preInit();
        }
        {
            Material caelite = new Material("Caelite", 0x65755b);
            TinkerRegistry.addMaterialStats(caelite,
                    new CoreMaterialStats(18f, 20f),
                    new PlatesMaterialStats(0.9f, 11f, 2.5f),
                    new TrimMaterialStats(3.5f),
                    new HeadMaterialStats(680, 7.5f, 7.5f, 3),
                    new HandleMaterialStats(0.58f, 150),
                    new ExtraMaterialStats(50),
                    new BowMaterialStats(0.65f, 1.2f, 4.5f)
            );
            caelite.setRenderInfo(0x65755b);

            MaterialIntegration caeliteMi = new MaterialIntegration(caelite, Create.plain("caelite", 0x65755b)).setRepresentativeItem("ingotCaelite");
            TinkerRegistry.integrate(caeliteMi).preInit();
        }
        {
            Material atmium = new Material("Atmium", 0xd5d56a);
            TinkerRegistry.addMaterialStats(atmium,
                    new HeadMaterialStats(600, 7.5f, 8.2f, 4),
                    new HandleMaterialStats(0.8f, 180),
                    new ExtraMaterialStats(60),
                    new BowMaterialStats(1.2f, 1.1f, 3f)
            );
            atmium.setRenderInfo(0xd5d56a);
            atmium.addTrait(Annihilator.annihilator, MaterialTypes.HEAD);
            atmium.addTrait(TinkerTraits.poisonous);
            atmium.addTrait(Apocalypse.apocalypse);

            MaterialIntegration atmiumMi = new MaterialIntegration(atmium, Create.plain("atmium", 0xd5d56a)).setRepresentativeItem("ingotAtmium");
            TinkerRegistry.integrate(atmiumMi).preInit();
        }
        {
            Material pelagium = new Material("Pelagium", 0x89705b);
            TinkerRegistry.addMaterialStats(pelagium,
                    new CoreMaterialStats(9.2f, 6f),
                    new PlatesMaterialStats(0.6f, -1.5f, 0.5f),
                    new TrimMaterialStats(1.5f),
                    new HeadMaterialStats(80, 3f, 2f, 1),
                    new HandleMaterialStats(1.55f, 50),
                    new ExtraMaterialStats(15),
                    new BowMaterialStats(0.25f, 0.45f, -0.5f)
            );
            pelagium.setRenderInfo(0x89705b);

            MaterialIntegration pelagiumMi = new MaterialIntegration(pelagium, Create.plain("pelagium", 0x89705b)).setRepresentativeItem("ingotPelagium");
            TinkerRegistry.integrate(pelagiumMi).preInit();
        }
        {
            Material sonium = new Material("Sonium", 0xc7e1cb);
            TinkerRegistry.addMaterialStats(sonium,
                    new CoreMaterialStats(14f, 16f),
                    new PlatesMaterialStats(0.92f, 4f, 1f),
                    new TrimMaterialStats(4f),
                    new HeadMaterialStats(440, 7f, 5f, 3),
                    new HandleMaterialStats(0.9f, 100),
                    new ExtraMaterialStats(80),
                    new BowMaterialStats(0.5f, 1.5f, 4f)
            );
            ArmorMaterials.addArmorTrait(sonium, PermanentStatus_Armor.hasty, ArmorMaterialType.CORE);
            sonium.setRenderInfo(0xc7e1cb);

            MaterialIntegration soniumMi = new MaterialIntegration(sonium, Create.plain("sonium", 0xc7e1cb)).setRepresentativeItem("ingotSonium");
            TinkerRegistry.integrate(soniumMi).preInit();
        }
        {
            Material unseelium = new Material("Unseelium", 0x7b1687);
            TinkerRegistry.addMaterialStats(unseelium,
                    new CoreMaterialStats(17f, 21f),
                    new PlatesMaterialStats(1.3f, 16f, 4f),
                    new TrimMaterialStats(8f),
                    new HeadMaterialStats(1400, 8f, 11f, 5),
                    new HandleMaterialStats(1.05f, 200),
                    new ExtraMaterialStats(80),
                    new BowMaterialStats(1.1f, 1.7f, 12f)
            );
            unseelium.addTrait(FaeFlight.faeFlight);
            unseelium.addTrait(RampingStatusInflictor.toxic, MaterialTypes.HEAD);
            ArmorMaterials.addArmorTrait(unseelium, PermanentStatus_Armor.jump_boost, ArmorMaterialType.CORE);
            unseelium.setRenderInfo(0x7b1687);

            MaterialIntegration unseeliumMi = new MaterialIntegration(unseelium, Create.plain("unseelium", 0x7b1687)).setRepresentativeItem("ingotUnseelium");
            TinkerRegistry.integrate(unseeliumMi).preInit();
        }
        {
            Material peractium = new Material("Peractium", 0x325c48);
            TinkerRegistry.addMaterialStats(peractium,
                    new HeadMaterialStats(1000, 6f, 9f, 3),
                    new HandleMaterialStats(1f, 60),
                    new ExtraMaterialStats(150),
                    new BowMaterialStats(1.05f, 1.1f, 9f)
            );
            peractium.addTrait(SoulDrain.soulDrain);
            peractium.setRenderInfo(0x325c48);

            MaterialIntegration peractiumMi = new MaterialIntegration(peractium, Create.plain("peractium", 0x325c48)).setRepresentativeItem("ingotPeractium");
            TinkerRegistry.integrate(peractiumMi).preInit();
        }
        {
            Material caeputescite = new Material("Caeputescite", 0x93af9c);
            TinkerRegistry.addMaterialStats(caeputescite,
                    new CoreMaterialStats(19f, 20f),
                    new PlatesMaterialStats(1.1f, 12.5f, 4f),
                    new TrimMaterialStats(13f),
                    new HeadMaterialStats(1919, 9f, 9f, 5),
                    new HandleMaterialStats(1.1f, 40),
                    new ExtraMaterialStats(90),
                    new BowMaterialStats(1.35f, 1.5f, 5.5f)
            );
            caeputescite.setRenderInfo(0x93af9c);

            MaterialIntegration caeputesciteMi = new MaterialIntegration(caeputescite, Create.plain("caeputescite", 0x93af9c)).setRepresentativeItem("ingotCaeputescite");
            TinkerRegistry.integrate(caeputesciteMi).preInit();
        }
        {
            Material superlumium = new Material("Superlumium", 0xfbf6cb);
            TinkerRegistry.addMaterialStats(superlumium,
                    new CoreMaterialStats(8f, 6f),
                    new PlatesMaterialStats(0.35f, -2f, 0f),
                    new TrimMaterialStats(0.25f),
                    new HeadMaterialStats(200, 18f, 3f, 5),
                    new HandleMaterialStats(0.6f, -50),
                    new ExtraMaterialStats(-80)
            );
            superlumium.setRenderInfo(0xfbf6cb);
            superlumium.addTrait(Hyperspeed.hyperspeed, MaterialTypes.HEAD);
            ArmorMaterials.addArmorTrait(superlumium, GlowingAllArmor.glowing);

            MaterialIntegration superlumiumMi = new MaterialIntegration(superlumium, Create.plain("superlumium", 0xfbf6cb)).setRepresentativeItem("ingotSuperlumium");
            TinkerRegistry.integrate(superlumiumMi).preInit();
        }
        {
            Material starsteel = new Material("Starsteel", 0x2f3d4f);
            TinkerRegistry.addMaterialStats(starsteel,
                    new HeadMaterialStats(204, 6f, 4f, 2),
                    new HandleMaterialStats(1f, 60),
                    new ExtraMaterialStats(100),
                    new BowMaterialStats(0.5f, 1.5f, 7f)
            );
            starsteel.setRenderInfo(0x2f3d4f);

            MaterialIntegration starsteelMi = new MaterialIntegration(starsteel, Create.plain("starsteel", 0x2f3d4f)).setRepresentativeItem("ingotStarsteel");
            TinkerRegistry.integrate(starsteelMi).preInit();
        }
        {
            Material yellow_cobalt = new Material("Yellow Cobalt", 0xded623);
            TinkerRegistry.addMaterialStats(yellow_cobalt,
                    new CoreMaterialStats(22f, 20f),
                    new PlatesMaterialStats(0.9f, 8f, 3f),
                    new TrimMaterialStats(14f),
                    new HeadMaterialStats(1200, 12f, 6f, 4),
                    new HandleMaterialStats(0.9f, 120),
                    new ExtraMaterialStats(270),
                    new BowMaterialStats(1f, 1.8f, 11f)
            );
            yellow_cobalt.setRenderInfo(0xded623);

            MaterialIntegration yellow_cobaltMi = new MaterialIntegration(yellow_cobalt, Create.plain("yellow_cobalt", 0xded623)).setRepresentativeItem("ingotYellowCobalt");
            TinkerRegistry.integrate(yellow_cobaltMi).preInit();
        }
        {
            Material aureclase = new Material("Aureclase", 0x0eedee);
            TinkerRegistry.addMaterialStats(aureclase,
                    new HeadMaterialStats(1600, 8f, 9f, 4),
                    new HandleMaterialStats(1.2f, 110),
                    new ExtraMaterialStats(90),
                    new BowMaterialStats(1.1f, 1.6f, 6f)
            );
            aureclase.setRenderInfo(0x0eedee);
            aureclase.addTrait(AphroditeBlessing.aphroditeBlessing, MaterialTypes.HEAD);
            aureclase.addTrait(Mossy.mossy1, MaterialTypes.HEAD);
            aureclase.addTrait(Mossy.mossy1);

            MaterialIntegration aureclaseMi = new MaterialIntegration(aureclase, Create.plain("aureclase", 0x0eedee)).setRepresentativeItem("ingotAureclase");
            TinkerRegistry.integrate(aureclaseMi).preInit();
        }
        {
            Material cobalt_thorium_g = new Material("Cobalt Thorium G", 0x95c0cb);
            TinkerRegistry.addMaterialStats(cobalt_thorium_g,
                    new CoreMaterialStats(13.5f, 21f),
                    new PlatesMaterialStats(2f, 3.6f, 2f),
                    new TrimMaterialStats(4.7f),
                    new HeadMaterialStats(550, 2f, 11f, 4),
                    new HandleMaterialStats(1.05f, 90),
                    new ExtraMaterialStats(27),
                    new BowMaterialStats(0.38f, 1.5f, 4.5f)
            );
            cobalt_thorium_g.addTrait(RampingStatusInflictor.nuclear_winter, MaterialTypes.HEAD);
            cobalt_thorium_g.setRenderInfo(0x95c0cb);

            MaterialIntegration cobalt_thorium_gMi = new MaterialIntegration(cobalt_thorium_g, Create.plain("cobalt_thorium_g", 0x95c0cb)).setRepresentativeItem("ingotCobaltThoriumG");
            TinkerRegistry.integrate(cobalt_thorium_gMi).preInit();
        }
        {
            Material florium = new Material("Florium", 0x21bb21);
            TinkerRegistry.addMaterialStats(florium,
                    new CoreMaterialStats(18.5f, 20f),
                    new PlatesMaterialStats(1.1f, 12.5f, 4f),
                    new TrimMaterialStats(13f),
                    new HeadMaterialStats(1800, 9.5f, 8f, 5),
                    new HandleMaterialStats(1.1f, 40),
                    new ExtraMaterialStats(90),
                    new BowMaterialStats(1.35f, 1.5f, 5.5f)
            );
            florium.setRenderInfo(0x21bb21);
            ArmorMaterials.addArmorTrait(florium, FlowerPower_Armor.flowerpower, ArmorMaterialType.CORE);
            florium.addTrait(FlowerPower.flowerpower, MaterialTypes.HEAD);

            MaterialIntegration floriumMi = new MaterialIntegration(florium, Create.plain("florium", 0x21bb21)).setRepresentativeItem("ingotFlorium");
            TinkerRegistry.integrate(floriumMi).preInit();
        }
        {
            Material gourmium = new Material("Gourmium", 0x5e220d);
            TinkerRegistry.addMaterialStats(gourmium,
                    new CoreMaterialStats(14.5f, 16.7f),
                    new PlatesMaterialStats(1.15f, 0f, 1f),
                    new TrimMaterialStats(10f),
                    new HeadMaterialStats(380, 7f, 7f, 2),
                    new HandleMaterialStats(1f, -20),
                    new ExtraMaterialStats(150),
                    new BowMaterialStats(0.6f, 1.4f, 7f)
            );
            ArmorMaterials.addArmorTrait(gourmium, Delicious_Armor.delicious, ArmorMaterialType.CORE);
            gourmium.addTrait(Delicious.delicious, MaterialTypes.HEAD);
            gourmium.setRenderInfo(0x5e220d);

            MaterialIntegration gourmiumMi = new MaterialIntegration(gourmium, Create.plain("gourmium", 0x5e220d)).setRepresentativeItem("ingotGourmium");
            TinkerRegistry.integrate(gourmiumMi).preInit();
        }
        {
            Material escalite = new Material("Escalite", 0x25a8c0);
            TinkerRegistry.addMaterialStats(escalite,
                    new HeadMaterialStats(220, 11f, 8f, 3),
                    new HandleMaterialStats(1.1f, 80),
                    new ExtraMaterialStats(110),
                    new BowMaterialStats(1.3f, 1.5f, 2f)
            );
            escalite.setRenderInfo(0x25a8c0);
            escalite.addTrait(MasterChef.master_chef, MaterialTypes.HEAD);
            escalite.addTrait(Delicious.delicious);

            MaterialIntegration escaliteMi = new MaterialIntegration(escalite, Create.plain("escalite", 0x25a8c0)).setRepresentativeItem("ingotEscalite");
            TinkerRegistry.integrate(escaliteMi).preInit();
        }
        {
            Material alcite = new Material("Alcite", 0xf2faff);
            TinkerRegistry.addMaterialStats(alcite,
                    new HeadMaterialStats(1800, 7.5f, 11f, 4),
                    new HandleMaterialStats(1.02f, 60),
                    new ExtraMaterialStats(190),
                    new BowMaterialStats(0.4f, 1.2f, 7f)
            );
            alcite.addTrait(StatusInflictor.frosty);
            alcite.setRenderInfo(0xf2faff);

            MaterialIntegration alciteMi = new MaterialIntegration(alcite, Create.plain("alcite", 0xf2faff)).setRepresentativeItem("ingotAlcite");
            TinkerRegistry.integrate(alciteMi).preInit();
        }
        {
            Material urielium = new Material("Urielium", 0xe4f5ff);
            TinkerRegistry.addMaterialStats(urielium,
                    new CoreMaterialStats(22f, 21f),
                    new PlatesMaterialStats(1f, 12f, 2f),
                    new TrimMaterialStats(4f),
                    new HeadMaterialStats(2200, 7.5f, 12f, 5),
                    new HandleMaterialStats(1.15f, 60),
                    new ExtraMaterialStats(110),
                    new BowMaterialStats(0.2f, 1.2f, 10f)
            );
            ArmorMaterials.addArmorTrait(urielium, BlazingGrace.blazing_grace);
            urielium.addTrait(GardenOfEden.garden_of_eden, MaterialTypes.HEAD);
            ArmorMaterials.addArmorTrait(urielium, GardenOfEden.garden_of_eden, ArmorMaterialType.CORE);
            urielium.setRenderInfo(0xe4f5ff);

            MaterialIntegration urieliumMi = new MaterialIntegration(urielium, Create.plain("urielium", 0xe4f5ff)).setRepresentativeItem("ingotUrielium");
            TinkerRegistry.integrate(urieliumMi).preInit();
        }
        {
            Material aggrite = new Material("Aggrite", 0x362c38);
            TinkerRegistry.addMaterialStats(aggrite,
                    new CoreMaterialStats(19.7f, 20f),
                    new PlatesMaterialStats(1f, 13f, 3f),
                    new TrimMaterialStats(3.5f),
                    new HeadMaterialStats(900, 8f, 8.25f, 4),
                    new HandleMaterialStats(0.4f, 200),
                    new ExtraMaterialStats(50),
                    new BowMaterialStats(0.65f, 1.1f, 5f)
            );
            aggrite.setRenderInfo(0x362c38);

            MaterialIntegration aggriteMi = new MaterialIntegration(aggrite, Create.plain("aggrite", 0x362c38)).setRepresentativeItem("ingotAggrite");
            TinkerRegistry.integrate(aggriteMi).preInit();
        }
        {
            Material cloud_iron = new Material("Cloud Iron", 0xbefffd);
            TinkerRegistry.addMaterialStats(cloud_iron,
                    new CoreMaterialStats(19f, 21f),
                    new PlatesMaterialStats(2.1f, 13f, 5f),
                    new TrimMaterialStats(14f),
                    new HeadMaterialStats(1750, 9.5f, 10f, 5),
                    new HandleMaterialStats(1.2f, 250),
                    new ExtraMaterialStats(250),
                    new BowMaterialStats(1.2f, 2.4f, 8f)
            );
            cloud_iron.setRenderInfo(0xbefffd);
            cloud_iron.addTrait(RampingStatusInflictor.ice_age, MaterialTypes.HEAD);

            MaterialIntegration cloud_ironMi = new MaterialIntegration(cloud_iron, Create.plain("cloud_iron", 0xbefffd)).setRepresentativeItem("ingotCloudiron");
            TinkerRegistry.integrate(cloud_ironMi).preInit();
        }
        {
            Material astralium = new Material("Astralium", 0x141a22);
            TinkerRegistry.addMaterialStats(astralium,
                    new CoreMaterialStats(8f, 6f),
                    new PlatesMaterialStats(0.35f, -2f, 0f),
                    new TrimMaterialStats(0.25f),
                    new HeadMaterialStats(1900, 11f, 11f, 5),
                    new HandleMaterialStats(1.1f, 190),
                    new ExtraMaterialStats(195),
                    new BowMaterialStats(1.8f, 2.8f, 7f)
            );
            astralium.setRenderInfo(0x141a22);
            astralium.addTrait(RampingStatusInflictor.ice_age, MaterialTypes.HEAD);

            MaterialIntegration astraliumMi = new MaterialIntegration(astralium, Create.plain("astralium", 0x141a22)).setRepresentativeItem("ingotAstralium");
            TinkerRegistry.integrate(astraliumMi).preInit();
        }
        {
            Material bavarium = new Material("Bavarium", 0x65755b);
            TinkerRegistry.addMaterialStats(bavarium,
                    new HeadMaterialStats(1700, 7f, 12.5f, 5),
                    new HandleMaterialStats(0.9f, 110),
                    new ExtraMaterialStats(280),
                    new BowMaterialStats(0.2f, 1.2f, 10f),
                    new ArrowShaftMaterialStats(1.6f, 15)
            );
            bavarium.addTrait(Detonator.detonator, MaterialTypes.HEAD);
            bavarium.setRenderInfo(0x65755b);

            MaterialIntegration bavariumMi = new MaterialIntegration(bavarium, Create.plain("bavarium", 0x65755b)).setRepresentativeItem("ingotBavarium");
            TinkerRegistry.integrate(bavariumMi).preInit();
        }
        {
            Material assarion = new Material("Assarion", 0xfbad24);
            TinkerRegistry.addMaterialStats(assarion,
                    new CoreMaterialStats(22f, 20f),
                    new PlatesMaterialStats(1.1f, 11f, 3f),
                    new TrimMaterialStats(12f),
                    new HeadMaterialStats(1400, 8.8f, 7.7f, 4),
                    new HandleMaterialStats(1.1f, 400),
                    new ExtraMaterialStats(200),
                    new BowMaterialStats(1f, 0.9f, 4f),
                    new ArrowShaftMaterialStats(0.8f, 0)
            );
            assarion.setRenderInfo(0xfbad24);

            MaterialIntegration assarionMi = new MaterialIntegration(assarion, Create.plain("assarion", 0xfbad24)).setRepresentativeItem("ingotAssarion");
            TinkerRegistry.integrate(assarionMi).preInit();
        }
        {
            Material dyrnwynite = new Material("Dyrnwynite", 0xf9f5fd);
            TinkerRegistry.addMaterialStats(dyrnwynite,
                    new CoreMaterialStats(23f, 20f),
                    new PlatesMaterialStats(1f, 12f, 2f),
                    new TrimMaterialStats(4f),
                    new HeadMaterialStats(2200, 7.5f, 9f, 3),
                    new HandleMaterialStats(1f, 60),
                    new ExtraMaterialStats(110),
                    new BowMaterialStats(0.2f, 1.2f, 10f)
            );
            dyrnwynite.setRenderInfo(0xf9f5fd);

            MaterialIntegration dyrnwyniteMi = new MaterialIntegration(dyrnwynite, Create.plain("dyrnwynite", 0xf9f5fd)).setRepresentativeItem("ingotDyrnwynite");
            TinkerRegistry.integrate(dyrnwyniteMi).preInit();
        }
        {
            Material infernite = new Material("Infernite", 0xff6b00);
            TinkerRegistry.addMaterialStats(infernite,
                    new CoreMaterialStats(9.5f, 16.2f),
                    new PlatesMaterialStats(0.9f, -8f, 3.5f),
                    new TrimMaterialStats(7f),
                    new HeadMaterialStats(800, 7.6f, 6.8f, 3),
                    new HandleMaterialStats(1.1f, 150),
                    new ExtraMaterialStats(180),
                    new BowMaterialStats(0.8f, 1.1f, 6f),
                    new ArrowShaftMaterialStats(0.8f, 0)
            );
            infernite.setRenderInfo(0xff6b00);

            MaterialIntegration inferniteMi = new MaterialIntegration(infernite, Create.plain("infernite", 0xff6b00)).setRepresentativeItem("ingotInfernite");
            TinkerRegistry.integrate(inferniteMi).preInit();
        }
        {
            Material tetramentium = new Material("Tetramentium", 0xbacac6);
            TinkerRegistry.addMaterialStats(tetramentium,
                    new CoreMaterialStats(14f, 19f),
                    new PlatesMaterialStats(1.2f, 9.5f, 4f),
                    new TrimMaterialStats(9f),
                    new HeadMaterialStats(444, 8f, 8f, 4),
                    new HandleMaterialStats(1.04f, 444),
                    new ExtraMaterialStats(444),
                    new BowMaterialStats(1.1f, 1.2f, 5.5f)
            );
            tetramentium.addTrait(Tetraboost.tetraboost2, MaterialTypes.HEAD);
            tetramentium.addTrait(Tetraboost.tetraboost);
            ArmorMaterials.addArmorTrait(tetramentium, Tetraboost_Armor.tetraboost2, ArmorMaterialType.CORE);
            ArmorMaterials.addArmorTrait(tetramentium, Tetraboost_Armor.tetraboost, ArmorMaterialType.PLATES);
            ArmorMaterials.addArmorTrait(tetramentium, Tetraboost_Armor.tetraboost, ArmorMaterialType.TRIM);
            tetramentium.setRenderInfo(0xbacac6);

            MaterialIntegration tetramentiumMi = new MaterialIntegration(tetramentium, Create.plain("tetramentium", 0xbacac6)).setRepresentativeItem("ingotTetramentium");
            TinkerRegistry.integrate(tetramentiumMi).preInit();
        }
        {
            Material cyrium = new Material("Cyrium", 0x5767ca);
            TinkerRegistry.addMaterialStats(cyrium,
                    new CoreMaterialStats(15f, 21f),
                    new PlatesMaterialStats(1.3f, 8f, 4f),
                    new TrimMaterialStats(8f),
                    new HeadMaterialStats(1400, 5f, 9f, 4),
                    new HandleMaterialStats(0.4f, 330),
                    new ExtraMaterialStats(330),
                    new BowMaterialStats(1.4f, 1f, 7f)
            );
            cyrium.addTrait(RampingStatusInflictor.ice_age);
            ArmorMaterials.addArmorTrait(cyrium, StatusInflictor_Armor.frozen_aura, ArmorMaterialType.CORE);
            ArmorMaterials.addArmorTrait(cyrium, PermanentStatus_Armor.water_breathing);
            cyrium.setRenderInfo(0x5767ca);

            MaterialIntegration cyriumMi = new MaterialIntegration(cyrium, Create.plain("cyrium", 0x5767ca)).setRepresentativeItem("ingotCyrium");
            TinkerRegistry.integrate(cyriumMi).preInit();
        }
        {
            Material terium = new Material("Terium", 0x65705e);
            TinkerRegistry.addMaterialStats(terium,
                    new CoreMaterialStats(16f, 22f),
                    new PlatesMaterialStats(1.1f, 9f, 5f),
                    new TrimMaterialStats(9f),
                    new HeadMaterialStats(1800, 10f, 7f, 4),
                    new HandleMaterialStats(0.2f, 450),
                    new ExtraMaterialStats(450),
                    new BowMaterialStats(0.4f, 0.6f, 14f)
            );
            terium.addTrait(RampingStatusInflictor.toxic, MaterialTypes.HEAD);
            ArmorMaterials.addArmorTrait(terium, Stoneborn.stoneborn);
            terium.setRenderInfo(0x65705e);

            MaterialIntegration teriumMi = new MaterialIntegration(terium, Create.plain("terium", 0x65705e)).setRepresentativeItem("ingotTerium");
            TinkerRegistry.integrate(teriumMi).preInit();
        }
        {
            Material dupondium = new Material("Dupondium", 0xff0000);
            TinkerRegistry.addMaterialStats(dupondium,
                    new CoreMaterialStats(19f, 21f),
                    new PlatesMaterialStats(1.4f, 8f, 4f),
                    new TrimMaterialStats(11f),
                    new HeadMaterialStats(2000, 9f, 9f, 5),
                    new HandleMaterialStats(1.2f, 450),
                    new ExtraMaterialStats(450),
                    new BowMaterialStats(0.8f, 1.2f, 12f)
            );
            dupondium.addTrait(StatusInflictor.antigravity);
            ArmorMaterials.addArmorTrait(dupondium, MasterOfTheUniverse.master_of_the_universe, ArmorMaterialType.CORE);
            ArmorMaterials.addArmorTrait(dupondium, SnakeEater.snakeEater);
            dupondium.addTrait(Hyperspeed.hyperspeed, MaterialTypes.HEAD);
            dupondium.setRenderInfo(0xff0000);

            MaterialIntegration dupondiumMi = new MaterialIntegration(dupondium, Create.plain("dupondium", 0xff0000)).setRepresentativeItem("ingotDupondium");
            TinkerRegistry.integrate(dupondiumMi).preInit();
        }
        {
            Material aerium = new Material("Aerium", 0xd6edf0);
            TinkerRegistry.addMaterialStats(aerium,
                    new CoreMaterialStats(13f, 20f),
                    new PlatesMaterialStats(1.4f, 6f, 3f),
                    new TrimMaterialStats(6f),
                    new HeadMaterialStats(1000, 12f, 6f, 5),
                    new HandleMaterialStats(1.2f, 190),
                    new ExtraMaterialStats(190),
                    new BowMaterialStats(1.4f, 1f, 6f)
            );
            aerium.addTrait(StatusInflictor.ascendant);
            ArmorMaterials.addArmorTrait(aerium, FlightMastery.flightmastery, ArmorMaterialType.CORE);
            ArmorMaterials.addArmorTrait(aerium, AirMastery.airmastery);
            aerium.setRenderInfo(0xd6edf0);

            MaterialIntegration aeriumMi = new MaterialIntegration(aerium, Create.plain("aerium", 0xd6edf0)).setRepresentativeItem("ingotAerium");
            TinkerRegistry.integrate(aeriumMi).preInit();
        }
        {
            Material pyrium = new Material("Pyrium", 0xfab149);
            TinkerRegistry.addMaterialStats(pyrium,
                    new CoreMaterialStats(14f, 21f),
                    new PlatesMaterialStats(1.4f, 7f, 4f),
                    new TrimMaterialStats(7f),
                    new HeadMaterialStats(1200, 8f, 11f, 5),
                    new HandleMaterialStats(0.8f, 240),
                    new ExtraMaterialStats(240),
                    new BowMaterialStats(1.2f, 1f, 8f)
            );
            ArmorMaterials.addArmorTrait(pyrium, BlazingGrace.blazing_grace);
            pyrium.setRenderInfo(0xfab149);

            MaterialIntegration pyriumMi = new MaterialIntegration(pyrium, Create.plain("pyrium", 0xfab149)).setRepresentativeItem("ingotPyrium");
            TinkerRegistry.integrate(pyriumMi).preInit();
        }
        {
            Material sestertium = new Material("Sestertium", 0xeaeaea);
            TinkerRegistry.addMaterialStats(sestertium,
                    new CoreMaterialStats(22f, 22f),
                    new PlatesMaterialStats(1.6f, 8f, 6f),
                    new TrimMaterialStats(13f),
                    new HeadMaterialStats(2500, 12f, 12f, 5),
                    new HandleMaterialStats(1.2f, 500),
                    new ExtraMaterialStats(500),
                    new BowMaterialStats(2.2f, 2.5f, 8f)
            );
            sestertium.addTrait(Tetraboost.tetraboost2, MaterialTypes.HEAD);
            ArmorMaterials.addArmorTrait(sestertium, Tetraboost_Armor.tetraboost2, ArmorMaterialType.CORE);
            sestertium.setRenderInfo(0xeaeaea);

            MaterialIntegration sestertiumMi = new MaterialIntegration(sestertium, Create.plain("sestertium", 0xeaeaea)).setRepresentativeItem("ingotSestertium");
            TinkerRegistry.integrate(sestertiumMi).preInit();
        }
        {
            Material orichalcum = new Material("Orichalcum", 0x85c0c2);
            TinkerRegistry.addMaterialStats(orichalcum,
                    new CoreMaterialStats(30f, 24f),
                    new PlatesMaterialStats(2f, 20f, 7f),
                    new TrimMaterialStats(17f),
                    new HeadMaterialStats(4000, 50f, 18f, 5),
                    new HandleMaterialStats(2.5f, 1000),
                    new ExtraMaterialStats(1000),
                    new BowMaterialStats(3f, 3f, 12f),
                    new ArrowShaftMaterialStats(1.8f, 25)
            );
            orichalcum.addTrait(Outrageous.outrageous);
            orichalcum.setRenderInfo(0x85c0c2);

            MaterialIntegration orichalcumMi = new MaterialIntegration(orichalcum, Create.plain("orichalcum", 0x85c0c2)).setRepresentativeItem("ingotOrichalcum");
            TinkerRegistry.integrate(orichalcumMi).preInit();
        }
        {
            Material adamantite = new Material("Adamantite", 0xc283b5);
            TinkerRegistry.addMaterialStats(adamantite,
                    new CoreMaterialStats(25f, 24f),
                    new PlatesMaterialStats(2f, 20f, 6f),
                    new TrimMaterialStats(14f),
                    new HeadMaterialStats(3000, 14f, 14f, 5),
                    new HandleMaterialStats(2f, 777),
                    new ExtraMaterialStats(666),
                    new BowMaterialStats(0.8f, 4f, 14f)
            );
            adamantite.addTrait(AbsoluteDominion.absoluteDominion, MaterialTypes.HEAD);
            ArmorMaterials.addArmorTrait(adamantite, ImmortalCenturion.immortalCenturion1, ArmorMaterialType.TRIM);
            ArmorMaterials.addArmorTrait(adamantite, ImmortalCenturion.immortalCenturion1, ArmorMaterialType.PLATES);
            ArmorMaterials.addArmorTrait(adamantite, ImmortalCenturion.immortalCenturion2, ArmorMaterialType.CORE);
            adamantite.setRenderInfo(0xc283b5);

            MaterialIntegration adamantiteMi = new MaterialIntegration(adamantite, Create.plain("adamantite", 0xc283b5)).setRepresentativeItem("ingotAdamantite");
            TinkerRegistry.integrate(adamantiteMi).preInit();
        }

    }
}
