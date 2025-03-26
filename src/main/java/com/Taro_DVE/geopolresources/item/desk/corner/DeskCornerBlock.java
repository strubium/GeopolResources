package com.Taro_DVE.geopolresources.item.desk.corner;

import com.Taro_DVE.geopolresources.item.BlockBase;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class DeskCornerBlock extends BlockBase {

    public DeskCornerBlock() {}

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new DeskCornerTileEntity();
    }
}


