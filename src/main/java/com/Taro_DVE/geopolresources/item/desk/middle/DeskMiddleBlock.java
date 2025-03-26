package com.Taro_DVE.geopolresources.item.desk.middle;

import com.Taro_DVE.geopolresources.item.BlockBase;
import com.Taro_DVE.geopolresources.item.desk.left.DeskLeftTileEntity;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class DeskMiddleBlock extends BlockBase {

    public DeskMiddleBlock() {}

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new DeskMiddleTileEntity();
    }
}
