package dev.everrynn.compressit.item;

import dev.everrynn.compressit.CompressIt;
import dev.everrynn.compressit.item.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(modid = CompressIt.MOD_ID, value = Side.CLIENT)
public class ModItemModels {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        // Explicit model registration for every item declared in ModItems
        initModel(ModItems.TIED_STICKS);
        initModel(ModItems.TIED_BONES);
        initModel(ModItems.TIED_BLAZE_RODS);
        initModel(ModItems.TIED_KELP);
        initModel(ModItems.TIED_NAME_TAGS);
        initModel(ModItems.TIED_ROTTEN_FLESH);
        initModel(ModItems.TIED_SUGAR_CANE);
        initModel(ModItems.TIED_LEATHER);
        initModel(ModItems.STACK_OF_PAPERS);
        initModel(ModItems.BALL_OF_STRINGS);
        initModel(ModItems.BAG_OF_FEATHERS);
        initModel(ModItems.PACKED_EGGS);
        initModel(ModItems.PACKED_GOLDEN_CARROTS);
        initModel(ModItems.PACKED_CARROTS);
        initModel(ModItems.PACKED_POTATOES);
        initModel(ModItems.PACKED_ENDER_PEARLS);
        initModel(ModItems.BAG_OF_GUNPOWDER);
        initModel(ModItems.BAG_OF_FLINT);
        initModel(ModItems.BAG_OF_NETHER_WARTS);
        initModel(ModItems.BAG_OF_OAK_SAPLINGS);
        initModel(ModItems.BAG_OF_MANGROVE_PROPAGULES);
        initModel(ModItems.BAG_OF_SPRUCE_SAPLINGS);
        initModel(ModItems.BAG_OF_JUNGLE_SAPLINGS);
        initModel(ModItems.BAG_OF_DARK_OAK_SAPLINGS);
        initModel(ModItems.BAG_OF_BIRCH_SAPLINGS);
        initModel(ModItems.BAG_OF_CHERRY_SAPLINGS);
        initModel(ModItems.BAG_OF_ACACIA_SAPLINGS);

        initModel(ModItems.TIED_CANDLES);
        initModel(ModItems.TIED_BLACK_CANDLES);
        initModel(ModItems.TIED_BLUE_CANDLES);
        initModel(ModItems.TIED_BROWN_CANDLES);
        initModel(ModItems.TIED_CYAN_CANDLES);
        initModel(ModItems.TIED_GRAY_CANDLES);
        initModel(ModItems.TIED_GREEN_CANDLES);
        initModel(ModItems.TIED_LIGHT_BLUE_CANDLES);
        initModel(ModItems.TIED_LIGHT_GRAY_CANDLES);
        initModel(ModItems.TIED_LIME_CANDLES);
        initModel(ModItems.TIED_MAGENTA_CANDLES);
        initModel(ModItems.TIED_ORANGE_CANDLES);
        initModel(ModItems.TIED_PINK_CANDLES);
        initModel(ModItems.TIED_PURPLE_CANDLES);
        initModel(ModItems.TIED_RED_CANDLES);
        initModel(ModItems.TIED_WHITE_CANDLES);
        initModel(ModItems.TIED_YELLOW_CANDLES);

        initModel(ModItems.ALLIUM_BOUQUET);
        initModel(ModItems.AZURE_BLUET_BOUQUET);
        initModel(ModItems.BLUE_ORCHID_BOUQUET);
        initModel(ModItems.CORNFLOWER_BOUQUET);
        initModel(ModItems.DANDELION_BOUQUET);
        initModel(ModItems.LILAC_BOUQUET);
        initModel(ModItems.LILY_OF_THE_VALLEY_BOUQUET);
        initModel(ModItems.OXEYE_DAISY_BOUQUET);
        initModel(ModItems.PEONY_BOUQUET);
        initModel(ModItems.POPPY_BOUQUET);
        initModel(ModItems.ROSE_BUSH_BOUQUET);
        initModel(ModItems.SUNFLOWER_BOUQUET);
        initModel(ModItems.WITHER_ROSE_BOUQUET);
        initModel(ModItems.ORANGE_TULIP_BOUQUET);
        initModel(ModItems.PINK_TULIP_BOUQUET);
        initModel(ModItems.RED_TULIP_BOUQUET);
        initModel(ModItems.WHITE_TULIP_BOUQUET);
    }

    private static void initModel(Item item) {
        if (item == null) return;
        if (item.getRegistryName() == null) return;
        ModelLoader.setCustomModelResourceLocation(item, 0,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
