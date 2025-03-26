package com.Taro_DVE.geopolresources.item.desk.corneralt1;

import com.Taro_DVE.geopolresources.item.BlockBase;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class DeskCornerAlt1Block extends BlockBase {

    public DeskCornerAlt1Block() {}

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new DeskCornerAlt1TileEntity();
    }
}



