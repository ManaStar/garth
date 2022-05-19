package com.redpandastudios.garth.integration.farmersdelight;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public class GarthCabinetSuppliers {
    public static final Supplier<Block> CABINET = () -> new GarthCabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL));
}
