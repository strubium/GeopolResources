package com.Taro_DVE.geopolresources.item.desk.rightalt1;


import com.Taro_DVE.geopolresources.item.BlockBase;
import com.Taro_DVE.geopolresources.item.desk.right.DeskRightTileEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.state.DirectionProperty;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class DeskRightAlt1Block extends BlockBase {
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    public DeskRightAlt1Block() {}

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new DeskRightAlt1TileEntity();
    }
}




