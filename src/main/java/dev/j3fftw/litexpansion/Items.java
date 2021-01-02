package dev.j3fftw.litexpansion;

import dev.j3fftw.litexpansion.machine.AdvancedSolarPanel;
import dev.j3fftw.litexpansion.machine.MassFabricator;
import dev.j3fftw.litexpansion.machine.Recycler;
import dev.j3fftw.litexpansion.machine.RubberSynthesizer;
import dev.j3fftw.litexpansion.utils.Constants;
import dev.j3fftw.litexpansion.utils.LoreBuilderDynamic;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;

public final class Items {

    // Category
    public static final Category LITEXPANSION = new Category(
        new NamespacedKey(LiteXpansion.getInstance(), "litexpansion"),
        new CustomItem(SkullItem.fromHash("3f87fc5cbb233743a82fb0fa51fe739487f29bcc01c9026621ecefad197f4fb1"),
            "&7粘液工业&a(LiteXpansion)")
    );
    public static final SlimefunItemStack ELECTRIC_CHESTPLATE = new SlimefunItemStack(
        "ELECTRIC_CHESTPLATE",
        Material.LEATHER_CHESTPLATE, Color.TEAL,
        "&9电动装甲",
        "",
        "&8\u21E8 &7抵消对玩家造成的所有伤害。",
        "",
        "&c&o&8\u21E8 &e\u26A1 &70 / 250 J"
    );

    // Armor
    public static final SlimefunItemStack NANO_BLADE = new SlimefunItemStack(
        "NANO_BLADE",
        Material.DIAMOND_SWORD,
        "&2纳米刀刃 &c(关)",
        "",
        "&f一项先进的技术可以",
        "&f轻松切开有机组织。(误",
        "",
        "&f切换: &a右键",
        "",
        "&8\u21E8 &7每次消耗 &e10J ",
        "",
        "&c&o&8\u21E8 &e\u26A1 &70 / 500 J"
    );

    // Weapon
    // Tools
    public static final SlimefunItemStack WRENCH = new SlimefunItemStack(
        "WRENCH",
        Material.GOLDEN_HOE,
        "&6扳手",
        "",
        "&7单击任何机器，发电机，电容器",
        "&7或货运节点以立即将其破坏！",
        ""
    );
    public static final SlimefunItemStack GLASS_CUTTER = new SlimefunItemStack(
        "GLASS_CUTTER",
        Material.GHAST_TEAR,
        "&bG玻璃刀",
        "",
        "&7> &eLeft Click &7- Cut glass quickly",
        "&7> &eRight Click &7- Cut glass slowly",
        "",
        "&c&o&8\u21E8 &e\u26A1 &70 / 300 J"
    );
    public static final SlimefunItemStack MINING_DRILL = new SlimefunItemStack(
        "MINING_DRILL",
        Material.IRON_SHOVEL,
        "&7Mining Drill",
        "",
        "&7Instantly breaks stone and stone variants",
        "&7Right click to break block slower",
        "",
        "&c&o&8\u21E8 &e\u26A1 &70 / 1000 J"
    );
    public static final SlimefunItemStack DIAMOND_DRILL = new SlimefunItemStack(
        "DIAMOND_DRILL",
        Material.DIAMOND_SHOVEL,
        "&bDiamond Drill",
        "",
        "&7Instantly breaks obsidian, stone, and stone variants",
        "&7Right click to break block slower",
        "",
        "&c&o&8\u21E8 &e\u26A1 &70 / 1000 J"
    );
    public static final SlimefunItemStack TREETAP = new SlimefunItemStack(
        "TREETAP",
        Material.WOODEN_HOE,
        "&7树攻"
    );
    public static final SlimefunItemStack CARGO_CONFIGURATOR = new SlimefunItemStack(
        "CARGO_CONFIGURATOR",
        Material.COMPASS,
        "&7货物配置器",
        "",
        "&7> &e右键 &7- 复制节点配置",
        "&7> &e左键  &7- 应用节点配置",
        "&7> &eShift+右键 &7- 清除节点配置"
    );
    // Items

    public static final SlimefunItemStack TIN_PLATE = new SlimefunItemStack(
        "TIN_PLATE",
        Material.WHITE_CARPET,
        "&7锡板"
    );

    public static final SlimefunItemStack TIN_ITEM_CASING = new SlimefunItemStack(
        "TIN_ITEM_CASING",
        Material.WHITE_CARPET,
        "&7锡物品套管"
    );

    public static final SlimefunItemStack UNINSULATED_TIN_CABLE = new SlimefunItemStack(
        "UNINSULATED_TIN_CABLE",
        Material.STRING,
        "&7非绝缘锡电缆"
    );

    public static final SlimefunItemStack TIN_CABLE = new SlimefunItemStack(
        "TIN_CABLE",
        Material.STRING,
        "&7锡线"
    );

    public static final SlimefunItemStack COPPER_PLATE = new SlimefunItemStack(
        "COPPER_PLATE",
        Material.ORANGE_CARPET,
        "&7铜板"
    );

    public static final SlimefunItemStack COPPER_ITEM_CASING = new SlimefunItemStack(
        "COPPER_ITEM_CASING",
        Material.ORANGE_CARPET,
        "&7铜物品套管"
    );

    public static final SlimefunItemStack FOOD_SYNTHESIZER = new SlimefunItemStack(
        "FOOD_SYNTHESIZER",
        new CustomItem(SkullItem.fromHash("a967efe969d264f635f2c201c34381ef59c72e16ec50af7692033121e22fba9c"),
            "Food Synthesizer"),
        "&d食品合成器",
        "",
        "&f您吃饱食物",
        "&f(误)",
        "",
        "&c&o&8\u21E8 &e\u26A1 &70 / 100 J"
    );
    public static final SlimefunItemStack MAG_THOR = new SlimefunItemStack(
        "MAG_THOR",
        Material.IRON_INGOT,
        "&b&l雷-神",
        "",
        "&7&o极耐用的合金",
        "&7&o仅用在最先进的机器中"
    );
    public static final SlimefunItemStack THORIUM = new SlimefunItemStack(
        "THORIUM",
        new CustomItem(SkullItem.fromHash("b87403257c0eaa518cf186deccde137d476556ccff146d503fb2e73956582f37"),
            "Thorium"),
        "&8钍",
        "",
        LoreBuilder.radioactive(Radioactivity.HIGH),
        LoreBuilder.HAZMAT_SUIT_REQUIRED
    );
    public static final SlimefunItemStack SCRAP = new SlimefunItemStack(
        "SCRAP",
        Material.DEAD_BUSH,
        "&8碎片",
        "",
        "&7可以用来制作 &5UU-物质"
    );
    public static final SlimefunItemStack UU_MATTER = new SlimefunItemStack(
        "UU_MATTER",
        Material.PURPLE_DYE,
        "&5UU-物质",
        "",
        "&7可以用来制造物品和资源"
    );
    public static final SlimefunItemStack IRIDIUM = new SlimefunItemStack(
        "IRIDIUM",
        Material.WHITE_DYE,
        "&f铱"
    );
    public static final SlimefunItemStack IRIDIUM_PLATE = new SlimefunItemStack(
        "IRIDIUM_PLATE",
        Material.PAPER,
        "&f铱板",
        "",
        "&7用来制造铱甲"
    );
    public static final SlimefunItemStack THORIUM_DUST = new SlimefunItemStack(
        "THORIUM_DUST",
        Material.BLACK_DYE,
        "&8钍尘"
    );
    public static final SlimefunItemStack REFINED_IRON = new SlimefunItemStack(
        "REFINED_IRON",
        Material.IRON_INGOT,
        "&7精炼铁"
    );
    public static final SlimefunItemStack MACHINE_BLOCK = new SlimefunItemStack(
        "MACHINE_BLOCK",
        Material.IRON_BLOCK,
        "&7机械方块"
    );
    public static final SlimefunItemStack UNINSULATED_COPPER_CABLE = new SlimefunItemStack(
        "UNINSULATED_COPPER_CABLE",
        Material.STRING,
        "&7非绝缘铜电缆"
    );
    public static final SlimefunItemStack COPPER_CABLE = new SlimefunItemStack(
        "COPPER_CABLE",
        Material.STRING,
        "&7铜缆"
    );
    public static final SlimefunItemStack RUBBER = new SlimefunItemStack(
        "RUBBER",
        Material.INK_SAC,
        "&7橡胶"
    );
    public static final SlimefunItemStack ELECTRONIC_CIRCUIT = new SlimefunItemStack(
        "ELECTRONIC_CIRCUIT",
        Material.COBWEB,
        "&7电子电路"
    );
    public static final SlimefunItemStack ADVANCED_CIRCUIT = new SlimefunItemStack(
        "ADVANCED_CIRCUIT",
        Material.COBWEB,
        "&7高级电路"
    );
    ////////////////
    // CARBON CRAP
    public static final SlimefunItemStack COAL_DUST = new SlimefunItemStack(
        "COAL_DUST",
        Material.BLACK_DYE,
        "&7煤尘"
    );
    public static final SlimefunItemStack RAW_CARBON_FIBRE = new SlimefunItemStack(
        "RAW_CARBON_FIBRE",
        Material.BLACK_DYE,
        "&7原料碳纤维"
    );
    public static final SlimefunItemStack RAW_CARBON_MESH = new SlimefunItemStack(
        "RAW_CARBON_MESH",
        Material.BLACK_DYE,
        "&7生碳网"
    );
    public static final SlimefunItemStack CARBON_PLATE = new SlimefunItemStack(
        "CARBON_PLATE",
        Material.BLACK_CARPET,
        "&7碳板"
    );
    public static final SlimefunItemStack ADVANCED_ALLOY = new SlimefunItemStack(
        "ADVANCED_ALLOY",
        Material.PAPER,
        "&7高级合金"
    );
    /////////
    public static final SlimefunItemStack ADVANCED_MACHINE_BLOCK = new SlimefunItemStack(
        "ADVANCED_MACHINE_BLOCK",
        Material.DIAMOND_BLOCK,
        "&7高级机械方块"
    );

    public static final SlimefunItemStack LAPOTRON_CRYSTAL = new SlimefunItemStack(
        "LAPOTRON_CRYSTAL",
        Material.DIAMOND,
        "&7Lapotron水晶"
    );
    public static final SlimefunItemStack REINFORCED_STONE = new SlimefunItemStack(
        "REINFORCED_STONE",
        Material.STONE,
        "&7钢筋石"
    );
    public static final SlimefunItemStack REINFORCED_DOOR = new SlimefunItemStack(
        "REINFORCED_DOOR",
        Material.IRON_DOOR,
        "&7强化门"
    );
    public static final SlimefunItemStack REINFORCED_GLASS = new SlimefunItemStack(
        "REINFORCED_GLASS",
        Material.GRAY_STAINED_GLASS,
        "&7钢化玻璃"
    );
    public static final SlimefunItemStack MIXED_METAL_INGOT = new SlimefunItemStack(
        "MIXED_METAL_INGOT",
        Material.IRON_INGOT,
        "&7合金锭"
    );
    // Machines
    public static final SlimefunItemStack RECYCLER = new SlimefunItemStack(
        "SCRAP_MACHINE",
        Material.BLACK_CONCRETE,
        "&8回收机",
        "",
        "&f从任何东西中产生 &8碎片",
        "",
        LoreBuilderDynamic.powerBuffer(Recycler.CAPACITY),
        LoreBuilderDynamic.powerPerTick(Recycler.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack MASS_FABRICATOR_MACHINE = new SlimefunItemStack(
        "MASS_FABRICATOR_MACHINE",
        Material.PURPLE_CONCRETE,
        "&5批量(UU物质)制造机",
        "",
        "&f将&8碎片&f转换为&5UU-物品",
        "",
        LoreBuilderDynamic.powerBuffer(MassFabricator.CAPACITY),
        LoreBuilderDynamic.powerPerTick(MassFabricator.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack RUBBER_SYNTHESIZER_MACHINE = new SlimefunItemStack(
        "RUBBER_SYNTHESIZER",
        Material.ORANGE_CONCRETE,
        "&6橡胶合成器",
        "",
        "&f将一桶油转换为&7橡胶",
        "",
        LoreBuilderDynamic.powerBuffer(RubberSynthesizer.CAPACITY),
        LoreBuilderDynamic.powerPerTick(RubberSynthesizer.ENERGY_CONSUMPTION)
    );
    //// Solar panels
    public static final SlimefunItemStack ADVANCED_SOLAR_PANEL = new SlimefunItemStack(
        "ADVANCED_SOLAR_PANEL",
        Material.BLACK_GLAZED_TERRACOTTA,
        "&7&l高级太阳能电池板",
        "&9可以在夜间运作",
        "",
        LoreBuilderDynamic.powerBuffer(AdvancedSolarPanel.ADVANCED_STORAGE),
        LoreBuilderDynamic.powerPerTick(AdvancedSolarPanel.ADVANCED_DAY_RATE) + " (日间)",
        LoreBuilderDynamic.powerPerTick(AdvancedSolarPanel.ADVANCED_NIGHT_RATE) + " (夜间)"
    );
    public static final SlimefunItemStack HYBRID_SOLAR_PANEL = new SlimefunItemStack(
        "HYBRID_SOLAR_PANEL",
        Material.GRAY_GLAZED_TERRACOTTA,
        "&b&l混合太阳能板",
        "&9可以在夜间运作",
        "",
        LoreBuilderDynamic.powerBuffer(AdvancedSolarPanel.HYBRID_STORAGE),
        LoreBuilderDynamic.powerPerTick(AdvancedSolarPanel.HYBRID_DAY_RATE) + " (日间 + 下界)",
        LoreBuilderDynamic.powerPerTick(AdvancedSolarPanel.HYBRID_NIGHT_RATE) + " (夜间 + 末地)"
    );
    public static final SlimefunItemStack ULTIMATE_SOLAR_PANEL = new SlimefunItemStack(
        "ULTIMATE_SOLAR_PANEL",
        Material.PURPLE_GLAZED_TERRACOTTA,
        "&5&l终极太阳能电池板",
        "&9可以在夜间运作",
        "",
        LoreBuilderDynamic.powerBuffer(AdvancedSolarPanel.ULTIMATE_STORAGE),
        LoreBuilderDynamic.powerPerTick(AdvancedSolarPanel.ULTIMATE_DAY_RATE) + " (日间)",
        LoreBuilderDynamic.powerPerTick(AdvancedSolarPanel.ULTIMATE_NIGHT_RATE) + " (夜间)"
    );
    public static final SlimefunItemStack MULTI_FUNCTIONAL_ELECTRIC_STORAGE_UNIT = new SlimefunItemStack(
        "MULTI_FUNCTIONAL_ELECTRIC_STORAGE_UNIT",
        Material.IRON_BLOCK,
        "&7MFE"
    );
    public static final SlimefunItemStack MULTI_FUNCTIONAL_STORAGE_UNIT = new SlimefunItemStack(
        "MULTI_FUNCTIONAL_STORAGE_UNIT",
        Material.DIAMOND_BLOCK,
        "&7MFSU"
    );
    public static final SlimefunItemStack GOLD_PLATE = new SlimefunItemStack(
        "GOLD_PLATE",
        Material.YELLOW_CARPET,
        "&7金板"
    );
    public static final SlimefunItemStack GOLD_ITEM_CASING = new SlimefunItemStack(
        "GOLD_ITEM_CASING",
        Material.YELLOW_CARPET,
        "&7金物品套管"
    );
    public static final SlimefunItemStack UNINSULATED_GOLD_CABLE = new SlimefunItemStack(
        "UNINSULATED_GOLD_CABLE",
        Material.STRING,
        "&7非绝缘金线"
    );
    public static final SlimefunItemStack GOLD_CABLE = new SlimefunItemStack(
        "GOLD_CABLE",
        Material.STRING,
        "&7金线"
    );
    //Basic Machines
    public static final SlimefunItemStack REFINED_SMELTERY = new SlimefunItemStack(
        "REFINED_SMELTERY",
        Material.BLAST_FURNACE,
        "&7精炼冶炼"
    );

    public static final SlimefunItemStack METAL_FORGE = new SlimefunItemStack(
        "METAL_FORGE",
        Material.DISPENSER,
        "&7金属锻造器"
    );

    public static final SlimefunItemStack MANUAL_MILL = new SlimefunItemStack(
        "MANUAL_MILL",
        Material.DISPENSER,
        "&7Mill手册(?)(手动磨?)"
    );

    public static final SlimefunItemStack GENERATOR = new SlimefunItemStack(
        "GENERATOR",
        Material.IRON_BLOCK,
        "&7发电机"
    );

    public static final SlimefunItemStack RE_BATTERY = new SlimefunItemStack(
        "RE_BATTERY",
        Material.GLASS_BOTTLE,
        "&7稀土电池"
    );

    public static final SlimefunItemStack ADVANCED_SOLAR_HELMET = new SlimefunItemStack(
        "ADVANCED_SOLAR_HELMET",
        Material.IRON_HELMET,
        "&7高级太阳能头盔"
    );

    public static final SlimefunItemStack CARBONADO_SOLAR_HELMET = new SlimefunItemStack(
        "CARBONADO_SOLAR_HELMET",
        Material.GOLDEN_HELMET,
        "&7卡波纳多(黑金刚石)太阳能头盔"
    );

    public static final SlimefunItemStack ENERGIZED_SOLAR_HELMET = new SlimefunItemStack(
        "ENERGIZED_SOLAR_HELMET",
        Material.GOLDEN_HELMET,
        "&7太阳能头盔"
    );

    public static final SlimefunItemStack ADVANCEDLX_SOLAR_HELMET = new SlimefunItemStack(
        "ADVANCEDLX_SOLAR_HELMET",
        Material.DIAMOND_HELMET,
        "&7超高级太阳能头盔"
    );

    public static final SlimefunItemStack HYBRID_SOLAR_HELMET = new SlimefunItemStack(
        "HYBRID_SOLAR_HELMET",
        Material.DIAMOND_HELMET,
        "&7混合太阳能头盔"
    );

    public static final SlimefunItemStack ULTIMATE_SOLAR_HELMET = new SlimefunItemStack(
        "ULTIMATE_SOLAR_HELMET",
        Material.DIAMOND_HELMET,
        "&7终极太阳能头盔"
    );

    public static final SlimefunItemStack IRON_PLATE = new SlimefunItemStack(
        "IRON_PLATE",
        Material.WHITE_CARPET,
        "&7铁板"
    );

    public static final SlimefunItemStack DIAMOND_PLATE = new SlimefunItemStack(
        "DIAMOND_PLATE",
        Material.CYAN_CARPET,
        "&7钻石板"
    );
    public static final SlimefunItemStack THORIUM_PLATE = new SlimefunItemStack(
        "THORIUM_PLATE",
        Material.GRAY_CARPET,
        "&7钍板"
    );

    public static final SlimefunItemStack POWER_UNIT = new SlimefunItemStack(
        "POWER_UNIT",
        Material.GOLDEN_HOE,
        "&Power Unit"
    );

    public static final SlimefunItemStack IRON_ITEM_CASING = new SlimefunItemStack(
        "IRON_ITEM_CASING",
        Material.GRAY_CARPET,
        "&7Iron Item Casing"
    );

    private static final Enchantment glowEnchant = Enchantment.getByKey(Constants.GLOW_ENCHANT);

    static {
        ADVANCED_SOLAR_HELMET.addEnchantment(Enchantment.DURABILITY, 1);
        CARBONADO_SOLAR_HELMET.addEnchantment(Enchantment.DURABILITY, 2);
        ENERGIZED_SOLAR_HELMET.addEnchantment(Enchantment.DURABILITY, 3);
        ADVANCEDLX_SOLAR_HELMET.addUnsafeEnchantment(Enchantment.DURABILITY, 4);
        HYBRID_SOLAR_HELMET.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        ULTIMATE_SOLAR_HELMET.addUnsafeEnchantment(Enchantment.DURABILITY, 6);
        ADVANCED_CIRCUIT.addEnchantment(glowEnchant, 1);
        GLASS_CUTTER.addEnchantment(glowEnchant, 1);

        DIAMOND_DRILL.addEnchantment(glowEnchant, 1);
        LAPOTRON_CRYSTAL.addEnchantment(glowEnchant, 1);
        ADVANCEDLX_SOLAR_HELMET.addEnchantment(glowEnchant, 1);
        HYBRID_SOLAR_HELMET.addEnchantment(glowEnchant, 1);
        ULTIMATE_SOLAR_HELMET.addEnchantment(glowEnchant, 1);
    }

    private Items() {}
}
