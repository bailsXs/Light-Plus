package com.lightplus.block;

import com.lightplus.LightPlus;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(LightPlus.MOD_ID);

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(LightPlus.MOD_ID);

    // Blocks
    public static final DeferredBlock<Block> WHITE_LIGHT_CONCRETE =
            registerLightConcrete("white_light_concrete", Blocks.WHITE_CONCRETE);

    public static final DeferredBlock<Block> LIGHT_GRAY_LIGHT_CONCRETE =
            registerLightConcrete("light_gray_light_concrete", Blocks.LIGHT_GRAY_CONCRETE);

    public static final DeferredBlock<Block> GRAY_LIGHT_CONCRETE =
            registerLightConcrete("gray_light_concrete", Blocks.GRAY_CONCRETE);

    public static final DeferredBlock<Block> BLACK_LIGHT_CONCRETE =
            registerLightConcrete("black_light_concrete", Blocks.BLACK_CONCRETE);

    public static final DeferredBlock<Block> BROWN_LIGHT_CONCRETE =
            registerLightConcrete("brown_light_concrete", Blocks.BROWN_CONCRETE);

    public static final DeferredBlock<Block> RED_LIGHT_CONCRETE =
            registerLightConcrete("red_light_concrete", Blocks.RED_CONCRETE);

    public static final DeferredBlock<Block> ORANGE_LIGHT_CONCRETE =
            registerLightConcrete("orange_light_concrete", Blocks.ORANGE_CONCRETE);

    public static final DeferredBlock<Block> YELLOW_LIGHT_CONCRETE =
            registerLightConcrete("yellow_light_concrete", Blocks.YELLOW_CONCRETE);

    public static final DeferredBlock<Block> LIME_LIGHT_CONCRETE =
            registerLightConcrete("lime_light_concrete", Blocks.LIME_CONCRETE);

    public static final DeferredBlock<Block> GREEN_LIGHT_CONCRETE =
            registerLightConcrete("green_light_concrete", Blocks.GREEN_CONCRETE);

    public static final DeferredBlock<Block> CYAN_LIGHT_CONCRETE =
            registerLightConcrete("cyan_light_concrete", Blocks.CYAN_CONCRETE);

    public static final DeferredBlock<Block> LIGHT_BLUE_LIGHT_CONCRETE =
            registerLightConcrete("light_blue_light_concrete", Blocks.LIGHT_BLUE_CONCRETE);

    public static final DeferredBlock<Block> BLUE_LIGHT_CONCRETE =
            registerLightConcrete("blue_light_concrete", Blocks.BLUE_CONCRETE);

    public static final DeferredBlock<Block> PURPLE_LIGHT_CONCRETE =
            registerLightConcrete("purple_light_concrete", Blocks.PURPLE_CONCRETE);

    public static final DeferredBlock<Block> MAGENTA_LIGHT_CONCRETE =
            registerLightConcrete("magenta_light_concrete", Blocks.MAGENTA_CONCRETE);

    public static final DeferredBlock<Block> PINK_LIGHT_CONCRETE =
            registerLightConcrete("pink_light_concrete", Blocks.PINK_CONCRETE);

    // Block items
    public static final DeferredItem<BlockItem> WHITE_LIGHT_CONCRETE_ITEM =
            ITEMS.registerSimpleBlockItem("white_light_concrete", WHITE_LIGHT_CONCRETE);

    public static final DeferredItem<BlockItem> LIGHT_GRAY_LIGHT_CONCRETE_ITEM =
            ITEMS.registerSimpleBlockItem("light_gray_light_concrete", LIGHT_GRAY_LIGHT_CONCRETE);

    public static final DeferredItem<BlockItem> GRAY_LIGHT_CONCRETE_ITEM =
            ITEMS.registerSimpleBlockItem("gray_light_concrete", GRAY_LIGHT_CONCRETE);

    public static final DeferredItem<BlockItem> BLACK_LIGHT_CONCRETE_ITEM =
            ITEMS.registerSimpleBlockItem("black_light_concrete", BLACK_LIGHT_CONCRETE);

    public static final DeferredItem<BlockItem> BROWN_LIGHT_CONCRETE_ITEM =
            ITEMS.registerSimpleBlockItem("brown_light_concrete", BROWN_LIGHT_CONCRETE);

    public static final DeferredItem<BlockItem> RED_LIGHT_CONCRETE_ITEM =
            ITEMS.registerSimpleBlockItem("red_light_concrete", RED_LIGHT_CONCRETE);

    public static final DeferredItem<BlockItem> ORANGE_LIGHT_CONCRETE_ITEM =
            ITEMS.registerSimpleBlockItem("orange_light_concrete", ORANGE_LIGHT_CONCRETE);

    public static final DeferredItem<BlockItem> YELLOW_LIGHT_CONCRETE_ITEM =
            ITEMS.registerSimpleBlockItem("yellow_light_concrete", YELLOW_LIGHT_CONCRETE);

    public static final DeferredItem<BlockItem> LIME_LIGHT_CONCRETE_ITEM =
            ITEMS.registerSimpleBlockItem("lime_light_concrete", LIME_LIGHT_CONCRETE);

    public static final DeferredItem<BlockItem> GREEN_LIGHT_CONCRETE_ITEM =
            ITEMS.registerSimpleBlockItem("green_light_concrete", GREEN_LIGHT_CONCRETE);

    public static final DeferredItem<BlockItem> CYAN_LIGHT_CONCRETE_ITEM =
            ITEMS.registerSimpleBlockItem("cyan_light_concrete", CYAN_LIGHT_CONCRETE);

    public static final DeferredItem<BlockItem> LIGHT_BLUE_LIGHT_CONCRETE_ITEM =
            ITEMS.registerSimpleBlockItem("light_blue_light_concrete", LIGHT_BLUE_LIGHT_CONCRETE);

    public static final DeferredItem<BlockItem> BLUE_LIGHT_CONCRETE_ITEM =
            ITEMS.registerSimpleBlockItem("blue_light_concrete", BLUE_LIGHT_CONCRETE);

    public static final DeferredItem<BlockItem> PURPLE_LIGHT_CONCRETE_ITEM =
            ITEMS.registerSimpleBlockItem("purple_light_concrete", PURPLE_LIGHT_CONCRETE);

    public static final DeferredItem<BlockItem> MAGENTA_LIGHT_CONCRETE_ITEM =
            ITEMS.registerSimpleBlockItem("magenta_light_concrete", MAGENTA_LIGHT_CONCRETE);

    public static final DeferredItem<BlockItem> PINK_LIGHT_CONCRETE_ITEM =
            ITEMS.registerSimpleBlockItem("pink_light_concrete", PINK_LIGHT_CONCRETE);

    private static DeferredBlock<Block> registerLightConcrete(
            String name,
            Block vanillaConcrete
    ) {
        return BLOCKS.registerSimpleBlock(
                name,
                properties -> properties
                        .mapColor(vanillaConcrete.defaultMapColor())
                        .strength(0.5f)
                        .lightLevel(state -> 15)
        );
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}