package com.Taro_DVE.geopolresources.item.chair.officechair1;

import com.Taro_DVE.geopolresources.item.ModContent;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class OfficeChair1TileEntity extends TileEntity {

    public OfficeChair1TileEntity(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }

    // Constructor for your registered tile entity type
    public OfficeChair1TileEntity() {
        super(ModContent.OFFICE_CHAIR_1_TILE_ENTITY.get());
    }
}

