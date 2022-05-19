package com.redpandastudios.garth.core.registry;

import com.redpandastudios.garth.core.Garth;
import com.teamabnormals.blueprint.core.util.registry.BlockSubRegistryHelper;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Garth.MOD_ID)
public class GarthBlocks {
    public static final BlockSubRegistryHelper HELPER = Garth.REGISTRY_HELPER.getBlockSubHelper();
}
