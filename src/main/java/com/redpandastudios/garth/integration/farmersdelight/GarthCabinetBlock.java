package com.redpandastudios.garth.integration.farmersdelight;

import com.teamabnormals.blueprint.core.util.item.filling.TargetedItemCategoryFiller;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import vectorwing.farmersdelight.common.block.CabinetBlock;
import vectorwing.farmersdelight.common.registry.ModItems;

public class GarthCabinetBlock extends CabinetBlock {
    private static final TargetedItemCategoryFiller FILLER = new TargetedItemCategoryFiller(ModItems.WARPED_CABINET);

    public GarthCabinetBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void fillItemCategory(CreativeModeTab tab, NonNullList<ItemStack> item) {
        FILLER.fillItem(this.asItem(), tab, item);
    }
}
