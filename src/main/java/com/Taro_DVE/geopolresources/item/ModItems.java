package com.Taro_DVE.geopolresources.item;

import com.Taro_DVE.geopolresources.GeoPolResources;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GeoPolResources.MOD_ID);

    public static final RegistryObject<Item> BARRIER_BLOCK_ITEM = ITEMS.register("barrier_block",
            () -> new BlockItem(ModBlocks.BARRIER_BLOCK.get(), new Item.Properties().group( ItemGroup.BUILDING_BLOCKS)));
}

