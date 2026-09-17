package com.lightplus;

import com.lightplus.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(
                    Registries.CREATIVE_MODE_TAB,
                    LightPlus.MOD_ID
            );

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LIGHT_PLUS_TAB =
            CREATIVE_MODE_TABS.register(
                    "light_plus_tab",
                    () -> CreativeModeTab.builder()
                            .title(Component.translatable("itemGroup.light.light_plus"))
                            .icon(() -> ModBlocks.WHITE_LIGHT_CONCRETE_ITEM
                                    .get()
                                    .getDefaultInstance())
                            .displayItems((parameters, output) -> {
                                output.accept(ModBlocks.WHITE_LIGHT_CONCRETE_ITEM.get());
                                output.accept(ModBlocks.LIGHT_GRAY_LIGHT_CONCRETE_ITEM.get());
                                output.accept(ModBlocks.GRAY_LIGHT_CONCRETE_ITEM.get());
                                output.accept(ModBlocks.BLACK_LIGHT_CONCRETE_ITEM.get());
                                output.accept(ModBlocks.BROWN_LIGHT_CONCRETE_ITEM.get());
                                output.accept(ModBlocks.RED_LIGHT_CONCRETE_ITEM.get());
                                output.accept(ModBlocks.ORANGE_LIGHT_CONCRETE_ITEM.get());
                                output.accept(ModBlocks.YELLOW_LIGHT_CONCRETE_ITEM.get());
                                output.accept(ModBlocks.LIME_LIGHT_CONCRETE_ITEM.get());
                                output.accept(ModBlocks.GREEN_LIGHT_CONCRETE_ITEM.get());
                                output.accept(ModBlocks.CYAN_LIGHT_CONCRETE_ITEM.get());
                                output.accept(ModBlocks.LIGHT_BLUE_LIGHT_CONCRETE_ITEM.get());
                                output.accept(ModBlocks.BLUE_LIGHT_CONCRETE_ITEM.get());
                                output.accept(ModBlocks.PURPLE_LIGHT_CONCRETE_ITEM.get());
                                output.accept(ModBlocks.MAGENTA_LIGHT_CONCRETE_ITEM.get());
                                output.accept(ModBlocks.PINK_LIGHT_CONCRETE_ITEM.get());
                            })
                            .build()
            );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}