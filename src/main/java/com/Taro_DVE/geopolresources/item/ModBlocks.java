package com.Taro_DVE.geopolresources.item;


import com.Taro_DVE.geopolresources.GeoPolResources;
import com.Taro_DVE.geopolresources.item.barrier.BarrierBlock;
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


}

