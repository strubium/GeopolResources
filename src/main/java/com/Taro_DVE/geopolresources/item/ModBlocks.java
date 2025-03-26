package com.Taro_DVE.geopolresources.item;


import com.Taro_DVE.geopolresources.GeoPolResources;
import com.Taro_DVE.geopolresources.item.barrier.BarrierBlock;
import com.Taro_DVE.geopolresources.item.desk.corner.DeskCornerBlock;
import com.Taro_DVE.geopolresources.item.desk.left.DeskLeftBlock;
import com.Taro_DVE.geopolresources.item.desk.middle.DeskMiddleBlock;
import com.Taro_DVE.geopolresources.item.desk.right.DeskRightBlock;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    // Create the DeferredRegister for blocks
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, GeoPolResources.MOD_ID);

    // Register your BarrierBlock here
    public static final RegistryObject<Block> BARRIER_BLOCK = BLOCKS.register("barrier_block",
            () -> new BarrierBlock());

    public static final RegistryObject<Block> DESK_LEFT = BLOCKS.register("desk_left_block",
            () -> new DeskLeftBlock());

    public static final RegistryObject<Block> DESK_RIGHT = BLOCKS.register("desk_right_block",
            () -> new DeskRightBlock());

    public static final RegistryObject<Block> DESK_MIDDLE = BLOCKS.register("desk_middle_block",
            () -> new DeskMiddleBlock());

    public static final RegistryObject<Block> DESK_CORNER = BLOCKS.register("desk_corner_block",
            () -> new DeskCornerBlock());


}

