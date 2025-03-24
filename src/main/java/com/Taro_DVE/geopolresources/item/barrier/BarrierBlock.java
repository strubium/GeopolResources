package com.Taro_DVE.geopolresources.item.barrier;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class BarrierBlock extends Block {

    public BarrierBlock() {
        super(Properties
                .create(Material.IRON)
                .hardnessAndResistance(3.0F, 6.0F)
                .notSolid() // This helps with lighting!
                .setOpaque((state, reader, pos) -> false)
        );    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new BarrierTileEntity();
    }

    @Override
    public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos) {
        return false;
    }
    @Override
    public float getAmbientOcclusionLightValue(BlockState state, IBlockReader world, BlockPos pos) {
        return 1.0F;
    }





}
