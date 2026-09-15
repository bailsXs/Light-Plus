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

    // white
    public static final DeferredBlock<Block> WHITE_LIGHT_CONCRETE =
            BLOCKS.registerSimpleBlock(
                    "white_light_concrete",
                    properties -> properties
                            .mapColor(Blocks.WHITE_CONCRETE.defaultMapColor())
                            .strength(0.5f)
                            .lightLevel(state -> 15)
            );

    public static final DeferredItem<BlockItem> WHITE_LIGHT_CONCRETE_ITEM =
            ITEMS.registerSimpleBlockItem(
                    "white_light_concrete",
                    WHITE_LIGHT_CONCRETE
            );

//red
    public static final DeferredBlock<Block> RED_LIGHT_CONCRETE =
            BLOCKS.registerSimpleBlock(
                    "red_light_concrete",
                    properties -> properties
                            .mapColor(Blocks.RED_CONCRETE.defaultMapColor())
                            .strength(0.5f)
                            .lightLevel(state -> 15)
            );

    public static final DeferredItem<BlockItem> RED_LIGHT_CONCRETE_ITEM =
            ITEMS.registerSimpleBlockItem(
                    "red_light_concrete",
                    RED_LIGHT_CONCRETE
            );

    //Blue
    public static final DeferredBlock<Block> BLUE_LIGHT_CONCRETE =
            BLOCKS.registerSimpleBlock(
                    "blue_light_concrete",
                    properties -> properties
                            .mapColor(Blocks.BLUE_CONCRETE.defaultMapColor())
                            .strength(0.5f)
                            .lightLevel(state -> 15)
            );

    public static final DeferredItem<BlockItem> BLUE_LIGHT_CONCRETE_ITEM =
            ITEMS.registerSimpleBlockItem(
                    "blue_light_concrete",
                    BLUE_LIGHT_CONCRETE
            );

    //Green
    public static final DeferredBlock<Block> GREEN_LIGHT_CONCRETE =
            BLOCKS.registerSimpleBlock(
                    "green_light_concrete",
                    properties -> properties
                            .mapColor(Blocks.GREEN_CONCRETE.defaultMapColor())
                            .strength(0.5f)
                            .lightLevel(state -> 15)
            );

    public static final DeferredItem<BlockItem> GREEN_LIGHT_CONCRETE_ITEM =
            ITEMS.registerSimpleBlockItem(
                    "green_light_concrete",
                    GREEN_LIGHT_CONCRETE
            );

    //Black
    public static final DeferredBlock<Block> BLACK_LIGHT_CONCRETE =
            BLOCKS.registerSimpleBlock(
                    "black_light_concrete",
                    properties -> properties
                            .mapColor(Blocks.BLACK_CONCRETE.defaultMapColor())
                            .strength(0.5f)
                            .lightLevel(state -> 15)
            );

    public static final DeferredItem<BlockItem> BLACK_LIGHT_CONCRETE_ITEM =
            ITEMS.registerSimpleBlockItem(
                    "black_light_concrete",
                    BLACK_LIGHT_CONCRETE
            );

    //Yellow
    public static final DeferredBlock<Block> YELLOW_LIGHT_CONCRETE =
            BLOCKS.registerSimpleBlock(
                    "yellow_light_concrete",
                    properties -> properties
                            .mapColor(Blocks.YELLOW_CONCRETE.defaultMapColor())
                            .strength(0.5f)
                            .lightLevel(state -> 15)
            );

    public static final DeferredItem<BlockItem> YELLOW_LIGHT_CONCRETE_ITEM =
            ITEMS.registerSimpleBlockItem(
                    "yellow_light_concrete",
                    YELLOW_LIGHT_CONCRETE
            );

    //Gray
    public static final DeferredBlock<Block> GRAY_LIGHT_CONCRETE =
            BLOCKS.registerSimpleBlock(
                    "gray_light_concrete",
                    properties -> properties
                            .mapColor(Blocks.GRAY_CONCRETE.defaultMapColor())
                            .strength(0.5f)
                            .lightLevel(state -> 15)
            );

    public static final DeferredItem<BlockItem> GRAY_LIGHT_CONCRETE_ITEM =
            ITEMS.registerSimpleBlockItem(
                    "gray_light_concrete",
                    GRAY_LIGHT_CONCRETE
            );

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}
