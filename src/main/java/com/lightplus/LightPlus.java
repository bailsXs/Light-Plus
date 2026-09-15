package com.lightplus;

import com.lightplus.block.ModBlocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(LightPlus.MOD_ID)
public class LightPlus {

    public static final String MOD_ID = "light";

    public LightPlus(IEventBus modEventBus) {
        ModBlocks.register(modEventBus);
        ModCreativeTabs.register(modEventBus);
    }
}