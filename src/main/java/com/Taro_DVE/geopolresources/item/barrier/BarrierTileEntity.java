package com.Taro_DVE.geopolresources.item.barrier;

import com.Taro_DVE.geopolresources.item.ModContent;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class BarrierTileEntity extends TileEntity {

    public BarrierTileEntity(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }

    // Constructor for your registered tile entity type
    public BarrierTileEntity() {
        super(ModContent.BARRIER_TILE_ENTITY.get());
    }
}
