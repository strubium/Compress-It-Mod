package dev.everrynn.compressit.item;

import com.google.gson.GsonBuilder;
import dev.everrynn.compressit.CompressIt;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Forge 1.12.2 port of your Fabric ModItems.
 * - All items declared (no omissions).
 * - Items registered in RegistryEvent.Register<Item>.
 * - Recipe JSON generation preserved (disabled by default).
 */
@Mod.EventBusSubscriber(modid = CompressIt.MOD_ID)
public class ModItems {

    // All items (declared as public static so other classes can reference them)
    public static Item TIED_STICKS;
    public static Item TIED_BONES;
    public static Item TIED_BLAZE_RODS;
    public static Item TIED_KELP;
    public static Item TIED_NAME_TAGS;
    public static Item TIED_ROTTEN_FLESH;
    public static Item TIED_SUGAR_CANE;
    public static Item TIED_LEATHER;
    public static Item STACK_OF_PAPERS;
    public static Item BALL_OF_STRINGS;
    public static Item BAG_OF_FEATHERS;
    public static Item PACKED_EGGS;
    public static Item PACKED_GOLDEN_CARROTS;
    public static Item PACKED_CARROTS;
    public static Item PACKED_POTATOES;
    public static Item PACKED_ENDER_PEARLS;
    public static Item BAG_OF_GUNPOWDER;
    public static Item BAG_OF_FLINT;
    public static Item BAG_OF_NETHER_WARTS;
    public static Item BAG_OF_OAK_SAPLINGS;
    public static Item BAG_OF_MANGROVE_PROPAGULES;
    public static Item BAG_OF_SPRUCE_SAPLINGS;
    public static Item BAG_OF_JUNGLE_SAPLINGS;
    public static Item BAG_OF_DARK_OAK_SAPLINGS;
    public static Item BAG_OF_BIRCH_SAPLINGS;
    public static Item BAG_OF_CHERRY_SAPLINGS;
    public static Item BAG_OF_ACACIA_SAPLINGS;
    public static Item TIED_CANDLES;
    public static Item TIED_BLACK_CANDLES;
    public static Item TIED_BLUE_CANDLES;
    public static Item TIED_BROWN_CANDLES;
    public static Item TIED_CYAN_CANDLES;
    public static Item TIED_GRAY_CANDLES;
    public static Item TIED_GREEN_CANDLES;
    public static Item TIED_LIGHT_BLUE_CANDLES;
    public static Item TIED_LIGHT_GRAY_CANDLES;
    public static Item TIED_LIME_CANDLES;
    public static Item TIED_MAGENTA_CANDLES;
    public static Item TIED_ORANGE_CANDLES;
    public static Item TIED_PINK_CANDLES;
    public static Item TIED_PURPLE_CANDLES;
    public static Item TIED_RED_CANDLES;
    public static Item TIED_WHITE_CANDLES;
    public static Item TIED_YELLOW_CANDLES;
    public static Item ALLIUM_BOUQUET;
    public static Item AZURE_BLUET_BOUQUET;
    public static Item BLUE_ORCHID_BOUQUET;
    public static Item CORNFLOWER_BOUQUET;
    public static Item DANDELION_BOUQUET;
    public static Item LILAC_BOUQUET;
    public static Item LILY_OF_THE_VALLEY_BOUQUET;
    public static Item OXEYE_DAISY_BOUQUET;
    public static Item PEONY_BOUQUET;
    public static Item POPPY_BOUQUET;
    public static Item ROSE_BUSH_BOUQUET;
    public static Item SUNFLOWER_BOUQUET;
    public static Item WITHER_ROSE_BOUQUET;
    public static Item ORANGE_TULIP_BOUQUET;
    public static Item PINK_TULIP_BOUQUET;
    public static Item RED_TULIP_BOUQUET;
    public static Item WHITE_TULIP_BOUQUET;

    // Toggle JSON generation for recipes (false by default)
    private static final boolean doGenRecipes = false;

    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event) {
        // Register every item with its registry name (same names as your Fabric file)
        TIED_STICKS = registerItem(event, "tied_sticks", "minecraft:stick", 9);
        TIED_BONES = registerItem(event, "tied_bones", "minecraft:bone", 9);
        TIED_BLAZE_RODS = registerItem(event, "tied_blaze_rods", "minecraft:blaze_rod", 9);
        TIED_KELP = registerItem(event, "tied_kelp", "minecraft:kelp", 9);
        TIED_NAME_TAGS = registerItem(event, "tied_name_tags", "minecraft:name_tag", 9);
        TIED_ROTTEN_FLESH = registerItem(event, "tied_rotten_flesh", "minecraft:rotten_flesh", 9);
        TIED_SUGAR_CANE = registerItem(event, "tied_sugar_cane", "minecraft:sugar_cane", 9);
        TIED_LEATHER = registerItem(event, "tied_leather", "minecraft:leather", 9);
        STACK_OF_PAPERS = registerItem(event, "stack_of_papers", "minecraft:paper", 9);
        BALL_OF_STRINGS = registerItem(event, "ball_of_strings", "minecraft:string", 9);
        BAG_OF_FEATHERS = registerItem(event, "bag_of_feathers", "minecraft:feather", 9);
        PACKED_EGGS = registerItem(event, "packed_eggs", "minecraft:egg", 9);
        PACKED_GOLDEN_CARROTS = registerItem(event, "packed_golden_carrots", "minecraft:golden_carrot", 9);
        PACKED_CARROTS = registerItem(event, "packed_carrots", "minecraft:carrot", 9);
        PACKED_POTATOES = registerItem(event, "packed_potatoes", "minecraft:potato", 9);
        PACKED_ENDER_PEARLS = registerItem(event, "packed_ender_pearls", "minecraft:ender_pearl", 9);
        BAG_OF_GUNPOWDER = registerItem(event, "bag_of_gunpowder", "minecraft:gunpowder", 9);
        BAG_OF_FLINT = registerItem(event, "bag_of_flint", "minecraft:flint", 9);
        BAG_OF_NETHER_WARTS = registerItem(event, "bag_of_nether_warts", "minecraft:nether_wart", 9);
        BAG_OF_OAK_SAPLINGS = registerItem(event, "bag_of_oak_saplings", "minecraft:oak_sapling", 9);
        BAG_OF_MANGROVE_PROPAGULES = registerItem(event, "bag_of_mangrove_propagules", "minecraft:mangrove_propagule", 9);
        BAG_OF_SPRUCE_SAPLINGS = registerItem(event, "bag_of_spruce_saplings", "minecraft:spruce_sapling", 9);
        BAG_OF_JUNGLE_SAPLINGS = registerItem(event, "bag_of_jungle_saplings", "minecraft:jungle_sapling", 9);
        BAG_OF_DARK_OAK_SAPLINGS = registerItem(event, "bag_of_dark_oak_saplings", "minecraft:dark_oak_sapling", 9);
        BAG_OF_BIRCH_SAPLINGS = registerItem(event, "bag_of_birch_saplings", "minecraft:birch_sapling", 9);
        BAG_OF_CHERRY_SAPLINGS = registerItem(event, "bag_of_cherry_saplings", "minecraft:cherry_sapling", 9);
        BAG_OF_ACACIA_SAPLINGS = registerItem(event, "bag_of_acacia_saplings", "minecraft:acacia_sapling", 9);

        TIED_CANDLES = registerItem(event, "tied_candles", "minecraft:candle", 9);
        TIED_BLACK_CANDLES = registerItem(event, "tied_black_candles", "minecraft:black_candle", 9);
        TIED_BLUE_CANDLES = registerItem(event, "tied_blue_candles", "minecraft:blue_candle", 9);
        TIED_BROWN_CANDLES = registerItem(event, "tied_brown_candles", "minecraft:brown_candle", 9);
        TIED_CYAN_CANDLES = registerItem(event, "tied_cyan_candles", "minecraft:cyan_candle", 9);
        TIED_GRAY_CANDLES = registerItem(event, "tied_gray_candles", "minecraft:gray_candle", 9);
        TIED_GREEN_CANDLES = registerItem(event, "tied_green_candles", "minecraft:green_candle", 9);
        TIED_LIGHT_BLUE_CANDLES = registerItem(event, "tied_light_blue_candles", "minecraft:light_blue_candle", 9);
        TIED_LIGHT_GRAY_CANDLES = registerItem(event, "tied_light_gray_candles", "minecraft:light_gray_candle", 9);
        TIED_LIME_CANDLES = registerItem(event, "tied_lime_candles", "minecraft:lime_candle", 9);
        TIED_MAGENTA_CANDLES = registerItem(event, "tied_magenta_candles", "minecraft:magenta_candle", 9);
        TIED_ORANGE_CANDLES = registerItem(event, "tied_orange_candles", "minecraft:orange_candle", 9);
        TIED_PINK_CANDLES = registerItem(event, "tied_pink_candles", "minecraft:pink_candle", 9);
        TIED_PURPLE_CANDLES = registerItem(event, "tied_purple_candles", "minecraft:purple_candle", 9);
        TIED_RED_CANDLES = registerItem(event, "tied_red_candles", "minecraft:red_candle", 9);
        TIED_WHITE_CANDLES = registerItem(event, "tied_white_candles", "minecraft:white_candle", 9);
        TIED_YELLOW_CANDLES = registerItem(event, "tied_yellow_candles", "minecraft:yellow_candle", 9);

        ALLIUM_BOUQUET = registerItem(event, "allium_bouquet", "minecraft:allium", 9);
        AZURE_BLUET_BOUQUET = registerItem(event, "azure_bluet_bouquet", "minecraft:azure_bluet", 9);
        BLUE_ORCHID_BOUQUET = registerItem(event, "blue_orchid_bouquet", "minecraft:blue_orchid", 9);
        CORNFLOWER_BOUQUET = registerItem(event, "cornflower_bouquet", "minecraft:cornflower", 9);
        DANDELION_BOUQUET = registerItem(event, "dandelion_bouquet", "minecraft:dandelion", 9);
        LILAC_BOUQUET = registerItem(event, "lilac_bouquet", "minecraft:lilac", 9);
        LILY_OF_THE_VALLEY_BOUQUET = registerItem(event, "lily_of_the_valley_bouquet", "minecraft:lily_of_the_valley", 9);
        OXEYE_DAISY_BOUQUET = registerItem(event, "oxeye_daisy_bouquet", "minecraft:daisy", 9);
        PEONY_BOUQUET = registerItem(event, "peony_bouquet", "minecraft:peony", 9);
        POPPY_BOUQUET = registerItem(event, "poppy_bouquet", "minecraft:poppy", 9);
        ROSE_BUSH_BOUQUET = registerItem(event, "rose_bush_bouquet", "minecraft:rose_bush", 9);
        SUNFLOWER_BOUQUET = registerItem(event, "sunflower_bouquet", "minecraft:sunflower", 9);
        WITHER_ROSE_BOUQUET = registerItem(event, "wither_rose_bouquet", "minecraft:wither_rose", 9);
        ORANGE_TULIP_BOUQUET = registerItem(event, "orange_tulip_bouquet", "minecraft:orange_tulip", 9);
        PINK_TULIP_BOUQUET = registerItem(event, "pink_tulip_bouquet", "minecraft:pink_tulip", 9);
        RED_TULIP_BOUQUET = registerItem(event, "red_tulip_bouquet", "minecraft:red_tulip", 9);
        WHITE_TULIP_BOUQUET = registerItem(event, "white_tulip_bouquet", "minecraft:tulip", 9);

        CompressIt.info("Registering items!");
    }

    /**
     * Helper - registers an Item and optionally generates recipe JSON.
     * This mirrors your Fabric helper that took name, Item instance, material, count.
     */
    private static Item registerItem(RegistryEvent.Register<Item> event, String name, String material, int count) {
        Item item = new Item()
                .setRegistryName(new ResourceLocation(CompressIt.MOD_ID, name))
                .setTranslationKey(CompressIt.MOD_ID + "." + name)
                .setCreativeTab(ModItemGroups.COMPRESSIT_TAB);

        event.getRegistry().register(item);

        if (doGenRecipes) {
            try {
                CompressIt.info("Generating Recipe JSON files for " + name + "!");
                generateShapedRecipe(name, material);
                generateUnpackingRecipe(name, material, count);
            } catch (IOException e) {
                CompressIt.LOGGER.error("Error generating recipe for item: " + name, e);
            }
        }

        return item;
    }

    /**
     * Simpler overload kept for parity with your Fabric class (not used right now).
     */
    private static Item registerItem(RegistryEvent.Register<Item> event, String name) {
        Item item = new Item()
                .setRegistryName(new ResourceLocation(CompressIt.MOD_ID, name))
                .setTranslationKey(CompressIt.MOD_ID + "." + name)
                .setCreativeTab(ModItemGroups.COMPRESSIT_TAB);

        event.getRegistry().register(item);
        return item;
    }

    // Recipe JSON generation (Java 8 safe implementation)
    private static void generateShapedRecipe(String itemName, String material) throws IOException {
        Map<String, Object> recipe = new HashMap<>();
        recipe.put("type", "minecraft:crafting_shaped");

        // pattern array
        String[] pattern = new String[]{"MMM", "MMM", "MMM"};
        recipe.put("pattern", pattern);

        // key mapping
        Map<String, Object> key = new HashMap<>();
        Map<String, Object> mEntry = new HashMap<>();
        mEntry.put("item", material);
        key.put("M", mEntry);
        recipe.put("key", key);

        // result
        Map<String, Object> result = new HashMap<>();
        result.put("item", CompressIt.MOD_ID + ":" + itemName);
        result.put("count", 1);
        recipe.put("result", result);

        writeJsonToFile(recipe, itemName + ".json");
    }

    private static void generateUnpackingRecipe(String itemName, String material, int count) throws IOException {
        Map<String, Object> recipe = new HashMap<>();
        recipe.put("type", "minecraft:crafting_shapeless");

        // ingredients array of single item (the packed item)
        Map<String, Object> ingredient = new HashMap<>();
        ingredient.put("item", CompressIt.MOD_ID + ":" + itemName);
        Object[] ingredients = new Object[]{ingredient};
        recipe.put("ingredients", ingredients);

        // result
        Map<String, Object> result = new HashMap<>();
        result.put("item", material);
        result.put("count", count);
        recipe.put("result", result);

        writeJsonToFile(recipe, "unpack_" + itemName + ".json");
    }

    private static void writeJsonToFile(Map<String, Object> jsonData, String fileName) throws IOException {
        String outputDir = "./generated_recipes/";
        java.io.File directory = new java.io.File(outputDir);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        try (FileWriter file = new FileWriter(outputDir + fileName)) {
            file.write(new GsonBuilder().setPrettyPrinting().create().toJson(jsonData));
        }
    }

}
