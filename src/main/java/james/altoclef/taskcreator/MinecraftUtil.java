package james.altoclef.taskcreator;

public class MinecraftUtil {
    //list of items
    private static String[] items = new String[]{
            "acacia_boat",
            "acacia_button",
            "acacia_door",
            "acacia_fence",
            "acacia_fence_gate",
            "acacia_leaves",
            "acacia_log",
            "acacia_planks",
            "acacia_pressure_plate",
            "acacia_sapling",
            "acacia_sign",
            "acacia_slab",
            "acacia_stairs",
            "acacia_trapdoor",
            "acacia_wall_sign",
            "acacia_wood",
            "activator_rail",
            "air",
            "allium",
            "amethyst_block",
            "amethyst_cluster",
            "amethyst_shard",
            "ancient_debris",
            "andesite",
            "andesite_slab",
            "andesite_stairs",
            "andesite_wall",
            "anvil",
            "apple",
            "armor_stand",
            "arrow",
            "attached_melon_stem",
            "attached_pumpkin_stem",
            "axolotl_bucket",
            "axolotl_spawn_egg",
            "azalea",
            "azalea_leaves",
            "azure_bluet",
            "baked_potato",
            "bamboo",
            "bamboo_sapling",
            "barrel",
            "barrier",
            "basalt",
            "bat_spawn_egg",
            "beacon",
            "bedrock",
            "bee_nest",
            "bee_spawn_egg",
            "beef",
            "beehive",
            "beetroot",
            "beetroot_seeds",
            "beetroot_soup",
            "beetroots",
            "bell",
            "big_dripleaf",
            "big_dripleaf_stem",
            "birch_boat",
            "birch_button",
            "birch_door",
            "birch_fence",
            "birch_fence_gate",
            "birch_leaves",
            "birch_log",
            "birch_planks",
            "birch_pressure_plate",
            "birch_sapling",
            "birch_sign",
            "birch_slab",
            "birch_stairs",
            "birch_trapdoor",
            "birch_wall_sign",
            "birch_wood",
            "black_banner",
            "black_bed",
            "black_candle",
            "black_candle_cake",
            "black_carpet",
            "black_concrete",
            "black_concrete_powder",
            "black_dye",
            "black_glazed_terracotta",
            "black_shulker_box",
            "black_stained_glass",
            "black_stained_glass_pane",
            "black_terracotta",
            "black_wall_banner",
            "black_wool",
            "blackstone",
            "blackstone_slab",
            "blackstone_stairs",
            "blackstone_wall",
            "blast_furnace",
            "blaze_powder",
            "blaze_rod",
            "blaze_spawn_egg",
            "blue_banner",
            "blue_bed",
            "blue_candle",
            "blue_candle_cake",
            "blue_carpet",
            "blue_concrete",
            "blue_concrete_powder",
            "blue_dye",
            "blue_glazed_terracotta",
            "blue_ice",
            "blue_orchid",
            "blue_shulker_box",
            "blue_stained_glass",
            "blue_stained_glass_pane",
            "blue_terracotta",
            "blue_wall_banner",
            "blue_wool",
            "bone",
            "bone_block",
            "bone_meal",
            "book",
            "bookshelf",
            "bow",
            "bowl",
            "brain_coral",
            "brain_coral_block",
            "brain_coral_fan",
            "brain_coral_wall_fan",
            "bread",
            "brewing_stand",
            "brick",
            "brick_slab",
            "brick_stairs",
            "brick_wall",
            "bricks",
            "brown_banner",
            "brown_bed",
            "brown_candle",
            "brown_candle_cake",
            "brown_carpet",
            "brown_concrete",
            "brown_concrete_powder",
            "brown_dye",
            "brown_glazed_terracotta",
            "brown_mushroom",
            "brown_mushroom_block",
            "brown_shulker_box",
            "brown_stained_glass",
            "brown_stained_glass_pane",
            "brown_terracotta",
            "brown_wall_banner",
            "brown_wool",
            "bubble_column",
            "bubble_coral",
            "bubble_coral_block",
            "bubble_coral_fan",
            "bubble_coral_wall_fan",
            "bucket",
            "budding_amethyst",
            "bundle",
            "cactus",
            "cake",
            "calcite",
            "campfire",
            "candle",
            "candle_cake",
            "carrot",
            "carrot_on_a_stick",
            "carrots",
            "cartography_table",
            "carved_pumpkin",
            "cat_spawn_egg",
            "cauldron",
            "cave_air",
            "cave_spider_spawn_egg",
            "cave_vines",
            "cave_vines_plant",
            "chain",
            "chain_command_block",
            "chainmail_boots",
            "chainmail_chestplate",
            "chainmail_helmet",
            "chainmail_leggings",
            "charcoal",
            "chest",
            "chest_minecart",
            "chicken",
            "chicken_spawn_egg",
            "chipped_anvil",
            "chiseled_deepslate",
            "chiseled_nether_bricks",
            "chiseled_polished_blackstone",
            "chiseled_quartz_block",
            "chiseled_red_sandstone",
            "chiseled_sandstone",
            "chiseled_stone_bricks",
            "chorus_flower",
            "chorus_fruit",
            "chorus_plant",
            "clay",
            "clay_ball",
            "clock",
            "coal",
            "coal_block",
            "coal_ore",
            "coarse_dirt",
            "cobbled_deepslate",
            "cobbled_deepslate_slab",
            "cobbled_deepslate_stairs",
            "cobbled_deepslate_wall",
            "cobblestone",
            "cobblestone_slab",
            "cobblestone_stairs",
            "cobblestone_wall",
            "cobweb",
            "cocoa",
            "cocoa_beans",
            "cod",
            "cod_bucket",
            "cod_spawn_egg",
            "command_block",
            "command_block_minecart",
            "comparator",
            "compass",
            "composter",
            "conduit",
            "cooked_beef",
            "cooked_chicken",
            "cooked_cod",
            "cooked_mutton",
            "cooked_porkchop",
            "cooked_rabbit",
            "cooked_salmon",
            "cookie",
            "copper_block",
            "copper_ingot",
            "copper_ore",
            "cornflower",
            "cow_spawn_egg",
            "cracked_deepslate_bricks",
            "cracked_deepslate_tiles",
            "cracked_nether_bricks",
            "cracked_polished_blackstone_bricks",
            "cracked_stone_bricks",
            "crafting_table",
            "creeper_banner_pattern",
            "creeper_head",
            "creeper_spawn_egg",
            "creeper_wall_head",
            "crimson_button",
            "crimson_door",
            "crimson_fence",
            "crimson_fence_gate",
            "crimson_fungus",
            "crimson_hyphae",
            "crimson_nylium",
            "crimson_planks",
            "crimson_pressure_plate",
            "crimson_roots",
            "crimson_sign",
            "crimson_slab",
            "crimson_stairs",
            "crimson_stem",
            "crimson_trapdoor",
            "crimson_wall_sign",
            "crossbow",
            "crying_obsidian",
            "cut_copper",
            "cut_copper_slab",
            "cut_copper_stairs",
            "cut_red_sandstone",
            "cut_red_sandstone_slab",
            "cut_sandstone",
            "cut_sandstone_slab",
            "cyan_banner",
            "cyan_bed",
            "cyan_candle",
            "cyan_candle_cake",
            "cyan_carpet",
            "cyan_concrete",
            "cyan_concrete_powder",
            "cyan_dye",
            "cyan_glazed_terracotta",
            "cyan_shulker_box",
            "cyan_stained_glass",
            "cyan_stained_glass_pane",
            "cyan_terracotta",
            "cyan_wall_banner",
            "cyan_wool",
            "damaged_anvil",
            "dandelion",
            "dark_oak_boat",
            "dark_oak_button",
            "dark_oak_door",
            "dark_oak_fence",
            "dark_oak_fence_gate",
            "dark_oak_leaves",
            "dark_oak_log",
            "dark_oak_planks",
            "dark_oak_pressure_plate",
            "dark_oak_sapling",
            "dark_oak_sign",
            "dark_oak_slab",
            "dark_oak_stairs",
            "dark_oak_trapdoor",
            "dark_oak_wall_sign",
            "dark_oak_wood",
            "dark_prismarine",
            "dark_prismarine_slab",
            "dark_prismarine_stairs",
            "daylight_detector",
            "dead_brain_coral",
            "dead_brain_coral_block",
            "dead_brain_coral_fan",
            "dead_brain_coral_wall_fan",
            "dead_bubble_coral",
            "dead_bubble_coral_block",
            "dead_bubble_coral_fan",
            "dead_bubble_coral_wall_fan",
            "dead_bush",
            "dead_fire_coral",
            "dead_fire_coral_block",
            "dead_fire_coral_fan",
            "dead_fire_coral_wall_fan",
            "dead_horn_coral",
            "dead_horn_coral_block",
            "dead_horn_coral_fan",
            "dead_horn_coral_wall_fan",
            "dead_tube_coral",
            "dead_tube_coral_block",
            "dead_tube_coral_fan",
            "dead_tube_coral_wall_fan",
            "debug_stick",
            "deepslate",
            "deepslate_brick_slab",
            "deepslate_brick_stairs",
            "deepslate_brick_wall",
            "deepslate_bricks",
            "deepslate_coal_ore",
            "deepslate_copper_ore",
            "deepslate_diamond_ore",
            "deepslate_emerald_ore",
            "deepslate_gold_ore",
            "deepslate_iron_ore",
            "deepslate_lapis_ore",
            "deepslate_redstone_ore",
            "deepslate_tile_slab",
            "deepslate_tile_stairs",
            "deepslate_tile_wall",
            "deepslate_tiles",
            "detector_rail",
            "diamond",
            "diamond_axe",
            "diamond_block",
            "diamond_boots",
            "diamond_chestplate",
            "diamond_helmet",
            "diamond_hoe",
            "diamond_horse_armor",
            "diamond_leggings",
            "diamond_ore",
            "diamond_pickaxe",
            "diamond_shovel",
            "diamond_sword",
            "diorite",
            "diorite_slab",
            "diorite_stairs",
            "diorite_wall",
            "dirt",
            "dirt_path",
            "dispenser",
            "dolphin_spawn_egg",
            "donkey_spawn_egg",
            "dragon_breath",
            "dragon_egg",
            "dragon_head",
            "dragon_wall_head",
            "dried_kelp",
            "dried_kelp_block",
            "dripstone_block",
            "dropper",
            "drowned_spawn_egg",
            "egg",
            "elder_guardian_spawn_egg",
            "elytra",
            "emerald",
            "emerald_block",
            "emerald_ore",
            "enchanted_book",
            "enchanted_golden_apple",
            "enchanting_table",
            "end_crystal",
            "end_gateway",
            "end_portal",
            "end_portal_frame",
            "end_rod",
            "end_stone",
            "end_stone_brick_slab",
            "end_stone_brick_stairs",
            "end_stone_brick_wall",
            "end_stone_bricks",
            "ender_chest",
            "ender_eye",
            "ender_pearl",
            "enderman_spawn_egg",
            "endermite_spawn_egg",
            "evoker_spawn_egg",
            "experience_bottle",
            "exposed_copper",
            "exposed_cut_copper",
            "exposed_cut_copper_slab",
            "exposed_cut_copper_stairs",
            "farmland",
            "feather",
            "fermented_spider_eye",
            "fern",
            "filled_map",
            "fire",
            "fire_charge",
            "fire_coral",
            "fire_coral_block",
            "fire_coral_fan",
            "fire_coral_wall_fan",
            "firework_rocket",
            "firework_star",
            "fishing_rod",
            "fletching_table",
            "flint",
            "flint_and_steel",
            "flower_banner_pattern",
            "flower_pot",
            "flowering_azalea",
            "flowering_azalea_leaves",
            "fox_spawn_egg",
            "frosted_ice",
            "furnace",
            "furnace_minecart",
            "ghast_spawn_egg",
            "ghast_tear",
            "gilded_blackstone",
            "glass",
            "glass_bottle",
            "glass_pane",
            "glistering_melon_slice",
            "globe_banner_pattern",
            "glow_berries",
            "glow_ink_sac",
            "glow_item_frame",
            "glow_lichen",
            "glow_squid_spawn_egg",
            "glowstone",
            "glowstone_dust",
            "goat_spawn_egg",
            "gold_block",
            "gold_ingot",
            "gold_nugget",
            "gold_ore",
            "golden_apple",
            "golden_axe",
            "golden_boots",
            "golden_carrot",
            "golden_chestplate",
            "golden_helmet",
            "golden_hoe",
            "golden_horse_armor",
            "golden_leggings",
            "golden_pickaxe",
            "golden_shovel",
            "golden_sword",
            "granite",
            "granite_slab",
            "granite_stairs",
            "granite_wall",
            "grass",
            "grass_block",
            "gravel",
            "gray_banner",
            "gray_bed",
            "gray_candle",
            "gray_candle_cake",
            "gray_carpet",
            "gray_concrete",
            "gray_concrete_powder",
            "gray_dye",
            "gray_glazed_terracotta",
            "gray_shulker_box",
            "gray_stained_glass",
            "gray_stained_glass_pane",
            "gray_terracotta",
            "gray_wall_banner",
            "gray_wool",
            "green_banner",
            "green_bed",
            "green_candle",
            "green_candle_cake",
            "green_carpet",
            "green_concrete",
            "green_concrete_powder",
            "green_dye",
            "green_glazed_terracotta",
            "green_shulker_box",
            "green_stained_glass",
            "green_stained_glass_pane",
            "green_terracotta",
            "green_wall_banner",
            "green_wool",
            "grindstone",
            "guardian_spawn_egg",
            "gunpowder",
            "hanging_roots",
            "hay_block",
            "heart_of_the_sea",
            "heavy_weighted_pressure_plate",
            "hoglin_spawn_egg",
            "honey_block",
            "honey_bottle",
            "honeycomb",
            "honeycomb_block",
            "hopper",
            "hopper_minecart",
            "horn_coral",
            "horn_coral_block",
            "horn_coral_fan",
            "horn_coral_wall_fan",
            "horse_spawn_egg",
            "husk_spawn_egg",
            "ice",
            "infested_chiseled_stone_bricks",
            "infested_cobblestone",
            "infested_cracked_stone_bricks",
            "infested_deepslate",
            "infested_mossy_stone_bricks",
            "infested_stone",
            "infested_stone_bricks",
            "ink_sac",
            "iron_axe",
            "iron_bars",
            "iron_block",
            "iron_boots",
            "iron_chestplate",
            "iron_door",
            "iron_helmet",
            "iron_hoe",
            "iron_horse_armor",
            "iron_ingot",
            "iron_leggings",
            "iron_nugget",
            "iron_ore",
            "iron_pickaxe",
            "iron_shovel",
            "iron_sword",
            "iron_trapdoor",
            "item_frame",
            "jack_o_lantern",
            "jigsaw",
            "jukebox",
            "jungle_boat",
            "jungle_button",
            "jungle_door",
            "jungle_fence",
            "jungle_fence_gate",
            "jungle_leaves",
            "jungle_log",
            "jungle_planks",
            "jungle_pressure_plate",
            "jungle_sapling",
            "jungle_sign",
            "jungle_slab",
            "jungle_stairs",
            "jungle_trapdoor",
            "jungle_wall_sign",
            "jungle_wood",
            "kelp",
            "kelp_plant",
            "knowledge_book",
            "ladder",
            "lantern",
            "lapis_block",
            "lapis_lazuli",
            "lapis_ore",
            "large_amethyst_bud",
            "large_fern",
            "lava",
            "lava_bucket",
            "lava_cauldron",
            "lead",
            "leather",
            "leather_boots",
            "leather_chestplate",
            "leather_helmet",
            "leather_horse_armor",
            "leather_leggings",
            "lectern",
            "lever",
            "light",
            "light_blue_banner",
            "light_blue_bed",
            "light_blue_candle",
            "light_blue_candle_cake",
            "light_blue_carpet",
            "light_blue_concrete",
            "light_blue_concrete_powder",
            "light_blue_dye",
            "light_blue_glazed_terracotta",
            "light_blue_shulker_box",
            "light_blue_stained_glass",
            "light_blue_stained_glass_pane",
            "light_blue_terracotta",
            "light_blue_wall_banner",
            "light_blue_wool",
            "light_gray_banner",
            "light_gray_bed",
            "light_gray_candle",
            "light_gray_candle_cake",
            "light_gray_carpet",
            "light_gray_concrete",
            "light_gray_concrete_powder",
            "light_gray_dye",
            "light_gray_glazed_terracotta",
            "light_gray_shulker_box",
            "light_gray_stained_glass",
            "light_gray_stained_glass_pane",
            "light_gray_terracotta",
            "light_gray_wall_banner",
            "light_gray_wool",
            "light_weighted_pressure_plate",
            "lightning_rod",
            "lilac",
            "lily_of_the_valley",
            "lily_pad",
            "lime_banner",
            "lime_bed",
            "lime_candle",
            "lime_candle_cake",
            "lime_carpet",
            "lime_concrete",
            "lime_concrete_powder",
            "lime_dye",
            "lime_glazed_terracotta",
            "lime_shulker_box",
            "lime_stained_glass",
            "lime_stained_glass_pane",
            "lime_terracotta",
            "lime_wall_banner",
            "lime_wool",
            "lingering_potion",
            "llama_spawn_egg",
            "lodestone",
            "loom",
            "magenta_banner",
            "magenta_bed",
            "magenta_candle",
            "magenta_candle_cake",
            "magenta_carpet",
            "magenta_concrete",
            "magenta_concrete_powder",
            "magenta_dye",
            "magenta_glazed_terracotta",
            "magenta_shulker_box",
            "magenta_stained_glass",
            "magenta_stained_glass_pane",
            "magenta_terracotta",
            "magenta_wall_banner",
            "magenta_wool",
            "magma_block",
            "magma_cream",
            "magma_cube_spawn_egg",
            "map",
            "medium_amethyst_bud",
            "melon",
            "melon_seeds",
            "melon_slice",
            "melon_stem",
            "milk_bucket",
            "minecart",
            "mojang_banner_pattern",
            "mooshroom_spawn_egg",
            "moss_block",
            "moss_carpet",
            "mossy_cobblestone",
            "mossy_cobblestone_slab",
            "mossy_cobblestone_stairs",
            "mossy_cobblestone_wall",
            "mossy_stone_brick_slab",
            "mossy_stone_brick_stairs",
            "mossy_stone_brick_wall",
            "mossy_stone_bricks",
            "moving_piston",
            "mule_spawn_egg",
            "mushroom_stem",
            "mushroom_stew",
            "music_disc_11",
            "music_disc_13",
            "music_disc_blocks",
            "music_disc_cat",
            "music_disc_chirp",
            "music_disc_far",
            "music_disc_mall",
            "music_disc_mellohi",
            "music_disc_pigstep",
            "music_disc_stal",
            "music_disc_strad",
            "music_disc_wait",
            "music_disc_ward",
            "mutton",
            "mycelium",
            "name_tag",
            "nautilus_shell",
            "nether_brick",
            "nether_brick_fence",
            "nether_brick_slab",
            "nether_brick_stairs",
            "nether_brick_wall",
            "nether_bricks",
            "nether_gold_ore",
            "nether_portal",
            "nether_quartz_ore",
            "nether_sprouts",
            "nether_star",
            "nether_wart",
            "nether_wart_block",
            "netherite_axe",
            "netherite_block",
            "netherite_boots",
            "netherite_chestplate",
            "netherite_helmet",
            "netherite_hoe",
            "netherite_ingot",
            "netherite_leggings",
            "netherite_pickaxe",
            "netherite_scrap",
            "netherite_shovel",
            "netherite_sword",
            "netherrack",
            "note_block",
            "oak_boat",
            "oak_button",
            "oak_door",
            "oak_fence",
            "oak_fence_gate",
            "oak_leaves",
            "oak_log",
            "oak_planks",
            "oak_pressure_plate",
            "oak_sapling",
            "oak_sign",
            "oak_slab",
            "oak_stairs",
            "oak_trapdoor",
            "oak_wall_sign",
            "oak_wood",
            "observer",
            "obsidian",
            "ocelot_spawn_egg",
            "orange_banner",
            "orange_bed",
            "orange_candle",
            "orange_candle_cake",
            "orange_carpet",
            "orange_concrete",
            "orange_concrete_powder",
            "orange_dye",
            "orange_glazed_terracotta",
            "orange_shulker_box",
            "orange_stained_glass",
            "orange_stained_glass_pane",
            "orange_terracotta",
            "orange_tulip",
            "orange_wall_banner",
            "orange_wool",
            "oxeye_daisy",
            "oxidized_copper",
            "oxidized_cut_copper",
            "oxidized_cut_copper_slab",
            "oxidized_cut_copper_stairs",
            "packed_ice",
            "painting",
            "panda_spawn_egg",
            "paper",
            "parrot_spawn_egg",
            "peony",
            "petrified_oak_slab",
            "phantom_membrane",
            "phantom_spawn_egg",
            "pig_spawn_egg",
            "piglin_banner_pattern",
            "piglin_brute_spawn_egg",
            "piglin_spawn_egg",
            "pillager_spawn_egg",
            "pink_banner",
            "pink_bed",
            "pink_candle",
            "pink_candle_cake",
            "pink_carpet",
            "pink_concrete",
            "pink_concrete_powder",
            "pink_dye",
            "pink_glazed_terracotta",
            "pink_shulker_box",
            "pink_stained_glass",
            "pink_stained_glass_pane",
            "pink_terracotta",
            "pink_tulip",
            "pink_wall_banner",
            "pink_wool",
            "piston",
            "piston_head",
            "player_head",
            "player_wall_head",
            "podzol",
            "pointed_dripstone",
            "poisonous_potato",
            "polar_bear_spawn_egg",
            "polished_andesite",
            "polished_andesite_slab",
            "polished_andesite_stairs",
            "polished_basalt",
            "polished_blackstone",
            "polished_blackstone_brick_slab",
            "polished_blackstone_brick_stairs",
            "polished_blackstone_brick_wall",
            "polished_blackstone_bricks",
            "polished_blackstone_button",
            "polished_blackstone_pressure_plate",
            "polished_blackstone_slab",
            "polished_blackstone_stairs",
            "polished_blackstone_wall",
            "polished_deepslate",
            "polished_deepslate_slab",
            "polished_deepslate_stairs",
            "polished_deepslate_wall",
            "polished_diorite",
            "polished_diorite_slab",
            "polished_diorite_stairs",
            "polished_granite",
            "polished_granite_slab",
            "polished_granite_stairs",
            "popped_chorus_fruit",
            "poppy",
            "porkchop",
            "potato",
            "potatoes",
            "potion",
            "potted_acacia_sapling",
            "potted_allium",
            "potted_azalea_bush",
            "potted_azure_bluet",
            "potted_bamboo",
            "potted_birch_sapling",
            "potted_blue_orchid",
            "potted_brown_mushroom",
            "potted_cactus",
            "potted_cornflower",
            "potted_crimson_fungus",
            "potted_crimson_roots",
            "potted_dandelion",
            "potted_dark_oak_sapling",
            "potted_dead_bush",
            "potted_fern",
            "potted_flowering_azalea_bush",
            "potted_jungle_sapling",
            "potted_lily_of_the_valley",
            "potted_oak_sapling",
            "potted_orange_tulip",
            "potted_oxeye_daisy",
            "potted_pink_tulip",
            "potted_poppy",
            "potted_red_mushroom",
            "potted_red_tulip",
            "potted_spruce_sapling",
            "potted_warped_fungus",
            "potted_warped_roots",
            "potted_white_tulip",
            "potted_wither_rose",
            "powder_snow",
            "powder_snow_bucket",
            "powder_snow_cauldron",
            "powered_rail",
            "prismarine",
            "prismarine_brick_slab",
            "prismarine_brick_stairs",
            "prismarine_bricks",
            "prismarine_crystals",
            "prismarine_shard",
            "prismarine_slab",
            "prismarine_stairs",
            "prismarine_wall",
            "pufferfish",
            "pufferfish_bucket",
            "pufferfish_spawn_egg",
            "pumpkin",
            "pumpkin_pie",
            "pumpkin_seeds",
            "pumpkin_stem",
            "purple_banner",
            "purple_bed",
            "purple_candle",
            "purple_candle_cake",
            "purple_carpet",
            "purple_concrete",
            "purple_concrete_powder",
            "purple_dye",
            "purple_glazed_terracotta",
            "purple_shulker_box",
            "purple_stained_glass",
            "purple_stained_glass_pane",
            "purple_terracotta",
            "purple_wall_banner",
            "purple_wool",
            "purpur_block",
            "purpur_pillar",
            "purpur_slab",
            "purpur_stairs",
            "quartz",
            "quartz_block",
            "quartz_bricks",
            "quartz_pillar",
            "quartz_slab",
            "quartz_stairs",
            "rabbit",
            "rabbit_foot",
            "rabbit_hide",
            "rabbit_spawn_egg",
            "rabbit_stew",
            "rail",
            "ravager_spawn_egg",
            "raw_copper",
            "raw_copper_block",
            "raw_gold",
            "raw_gold_block",
            "raw_iron",
            "raw_iron_block",
            "red_banner",
            "red_bed",
            "red_candle",
            "red_candle_cake",
            "red_carpet",
            "red_concrete",
            "red_concrete_powder",
            "red_dye",
            "red_glazed_terracotta",
            "red_mushroom",
            "red_mushroom_block",
            "red_nether_brick_slab",
            "red_nether_brick_stairs",
            "red_nether_brick_wall",
            "red_nether_bricks",
            "red_sand",
            "red_sandstone",
            "red_sandstone_slab",
            "red_sandstone_stairs",
            "red_sandstone_wall",
            "red_shulker_box",
            "red_stained_glass",
            "red_stained_glass_pane",
            "red_terracotta",
            "red_tulip",
            "red_wall_banner",
            "red_wool",
            "redstone",
            "redstone_block",
            "redstone_lamp",
            "redstone_ore",
            "redstone_torch",
            "redstone_wall_torch",
            "redstone_wire",
            "repeater",
            "repeating_command_block",
            "respawn_anchor",
            "rooted_dirt",
            "rose_bush",
            "rotten_flesh",
            "saddle",
            "salmon",
            "salmon_bucket",
            "salmon_spawn_egg",
            "sand",
            "sandstone",
            "sandstone_slab",
            "sandstone_stairs",
            "sandstone_wall",
            "scaffolding",
            "sculk_sensor",
            "scute",
            "sea_lantern",
            "sea_pickle",
            "seagrass",
            "shears",
            "sheep_spawn_egg",
            "shield",
            "shroomlight",
            "shulker_box",
            "shulker_shell",
            "shulker_spawn_egg",
            "silverfish_spawn_egg",
            "skeleton_horse_spawn_egg",
            "skeleton_skull",
            "skeleton_spawn_egg",
            "skeleton_wall_skull",
            "skull_banner_pattern",
            "slime_ball",
            "slime_block",
            "slime_spawn_egg",
            "small_amethyst_bud",
            "small_dripleaf",
            "smithing_table",
            "smoker",
            "smooth_basalt",
            "smooth_quartz",
            "smooth_quartz_slab",
            "smooth_quartz_stairs",
            "smooth_red_sandstone",
            "smooth_red_sandstone_slab",
            "smooth_red_sandstone_stairs",
            "smooth_sandstone",
            "smooth_sandstone_slab",
            "smooth_sandstone_stairs",
            "smooth_stone",
            "smooth_stone_slab",
            "snow",
            "snow_block",
            "snowball",
            "soul_campfire",
            "soul_fire",
            "soul_lantern",
            "soul_sand",
            "soul_soil",
            "soul_torch",
            "soul_wall_torch",
            "spawner",
            "spectral_arrow",
            "spider_eye",
            "spider_spawn_egg",
            "splash_potion",
            "sponge",
            "spore_blossom",
            "spruce_boat",
            "spruce_button",
            "spruce_door",
            "spruce_fence",
            "spruce_fence_gate",
            "spruce_leaves",
            "spruce_log",
            "spruce_planks",
            "spruce_pressure_plate",
            "spruce_sapling",
            "spruce_sign",
            "spruce_slab",
            "spruce_stairs",
            "spruce_trapdoor",
            "spruce_wall_sign",
            "spruce_wood",
            "spyglass",
            "squid_spawn_egg",
            "stick",
            "sticky_piston",
            "stone",
            "stone_axe",
            "stone_brick_slab",
            "stone_brick_stairs",
            "stone_brick_wall",
            "stone_bricks",
            "stone_button",
            "stone_hoe",
            "stone_pickaxe",
            "stone_pressure_plate",
            "stone_shovel",
            "stone_slab",
            "stone_stairs",
            "stone_sword",
            "stonecutter",
            "stray_spawn_egg",
            "strider_spawn_egg",
            "string",
            "stripped_acacia_log",
            "stripped_acacia_wood",
            "stripped_birch_log",
            "stripped_birch_wood",
            "stripped_crimson_hyphae",
            "stripped_crimson_stem",
            "stripped_dark_oak_log",
            "stripped_dark_oak_wood",
            "stripped_jungle_log",
            "stripped_jungle_wood",
            "stripped_oak_log",
            "stripped_oak_wood",
            "stripped_spruce_log",
            "stripped_spruce_wood",
            "stripped_warped_hyphae",
            "stripped_warped_stem",
            "structure_block",
            "structure_void",
            "sugar",
            "sugar_cane",
            "sunflower",
            "suspicious_stew",
            "sweet_berries",
            "sweet_berry_bush",
            "tall_grass",
            "tall_seagrass",
            "target",
            "terracotta",
            "tinted_glass",
            "tipped_arrow",
            "tnt",
            "tnt_minecart",
            "torch",
            "totem_of_undying",
            "trader_llama_spawn_egg",
            "trapped_chest",
            "trident",
            "tripwire",
            "tripwire_hook",
            "tropical_fish",
            "tropical_fish_bucket",
            "tropical_fish_spawn_egg",
            "tube_coral",
            "tube_coral_block",
            "tube_coral_fan",
            "tube_coral_wall_fan",
            "tuff",
            "turtle_egg",
            "turtle_helmet",
            "turtle_spawn_egg",
            "twisting_vines",
            "twisting_vines_plant",
            "vex_spawn_egg",
            "villager_spawn_egg",
            "vindicator_spawn_egg",
            "vine",
            "void_air",
            "wall_torch",
            "wandering_trader_spawn_egg",
            "warped_button",
            "warped_door",
            "warped_fence",
            "warped_fence_gate",
            "warped_fungus",
            "warped_fungus_on_a_stick",
            "warped_hyphae",
            "warped_nylium",
            "warped_planks",
            "warped_pressure_plate",
            "warped_roots",
            "warped_sign",
            "warped_slab",
            "warped_stairs",
            "warped_stem",
            "warped_trapdoor",
            "warped_wall_sign",
            "warped_wart_block",
            "water",
            "water_bucket",
            "water_cauldron",
            "waxed_copper_block",
            "waxed_cut_copper",
            "waxed_cut_copper_slab",
            "waxed_cut_copper_stairs",
            "waxed_exposed_copper",
            "waxed_exposed_cut_copper",
            "waxed_exposed_cut_copper_slab",
            "waxed_exposed_cut_copper_stairs",
            "waxed_oxidized_copper",
            "waxed_oxidized_cut_copper",
            "waxed_oxidized_cut_copper_slab",
            "waxed_oxidized_cut_copper_stairs",
            "waxed_weathered_copper",
            "waxed_weathered_cut_copper",
            "waxed_weathered_cut_copper_slab",
            "waxed_weathered_cut_copper_stairs",
            "weathered_copper",
            "weathered_cut_copper",
            "weathered_cut_copper_slab",
            "weathered_cut_copper_stairs",
            "weeping_vines",
            "weeping_vines_plant",
            "wet_sponge",
            "wheat",
            "wheat_seeds",
            "white_banner",
            "white_bed",
            "white_candle",
            "white_candle_cake",
            "white_carpet",
            "white_concrete",
            "white_concrete_powder",
            "white_dye",
            "white_glazed_terracotta",
            "white_shulker_box",
            "white_stained_glass",
            "white_stained_glass_pane",
            "white_terracotta",
            "white_tulip",
            "white_wall_banner",
            "white_wool",
            "witch_spawn_egg",
            "wither_rose",
            "wither_skeleton_skull",
            "wither_skeleton_spawn_egg",
            "wither_skeleton_wall_skull",
            "wolf_spawn_egg",
            "wooden_axe",
            "wooden_hoe",
            "wooden_pickaxe",
            "wooden_shovel",
            "wooden_sword",
            "writable_book",
            "written_book",
            "yellow_banner",
            "yellow_bed",
            "yellow_candle",
            "yellow_candle_cake",
            "yellow_carpet",
            "yellow_concrete",
            "yellow_concrete_powder",
            "yellow_dye",
            "yellow_glazed_terracotta",
            "yellow_shulker_box",
            "yellow_stained_glass",
            "yellow_stained_glass_pane",
            "yellow_terracotta",
            "yellow_wall_banner",
            "yellow_wool",
            "zoglin_spawn_egg",
            "zombie_head",
            "zombie_horse_spawn_egg",
            "zombie_spawn_egg",
            "zombie_villager_spawn_egg",
            "zombie_wall_head",
            "zombified_piglin_spawn_egg"
    };
    private static String[] equippableItems = new String[]{
            "diamond_helmet",
            "diamond_chestplate",
            "diamond_leggings",
            "diamond_boots",
            "gold_helmet",
            "gold_chestplate",
            "gold_leggings",
            "gold_boots",
            "leather_helmet",
            "leather_helmet",
            "leather_chestplate",
            "leather_leggings",
            "netherite_helmet",
            "netherite_chestplate",
            "netherite_leggings",
            "netherite_boots",
            "iron_boots",
            "iron_chestplate",
            "iron_leggings",
            "iron_boots"
    };
    public static String[] getItems() {
        return items;
    }

    public static String[] getEquippableItems() {
        return equippableItems;
    }
}
