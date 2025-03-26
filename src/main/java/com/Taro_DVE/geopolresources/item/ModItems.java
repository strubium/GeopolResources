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
            () -> new BlockItem(ModBlocks.BARRIER_BLOCK.get(), new Item.Properties().group(ModItemGroup.GEOPOLRESOURCES_GROUP)));

    public static final RegistryObject<Item> DESK_LEFT_ITEM = ITEMS.register("desk_left_block",
            () -> new BlockItem(ModBlocks.DESK_LEFT.get(), new Item.Properties().group(ModItemGroup.GEOPOLRESOURCES_GROUP)));

    public static final RegistryObject<Item> DESK_RIGHT_ITEM = ITEMS.register("desk_right_block",
            () -> new BlockItem(ModBlocks.DESK_RIGHT.get(), new Item.Properties().group(ModItemGroup.GEOPOLRESOURCES_GROUP)));

    public static final RegistryObject<Item> DESK_MIDDLE_ITEM = ITEMS.register("desk_middle_block",
            () -> new BlockItem(ModBlocks.DESK_MIDDLE.get(), new Item.Properties().group(ModItemGroup.GEOPOLRESOURCES_GROUP)));

    public static final RegistryObject<Item> DESK_CORNER_ITEM = ITEMS.register("desk_corner_block",
            () -> new BlockItem(ModBlocks.DESK_CORNER.get(), new Item.Properties().group(ModItemGroup.GEOPOLRESOURCES_GROUP)));

    public static final RegistryObject<Item> DESK_CORNERALT1_ITEM = ITEMS.register("desk_corneralt1_block",
            () -> new BlockItem(ModBlocks.DESK_CORNERALT1.get(), new Item.Properties().group(ModItemGroup.GEOPOLRESOURCES_GROUP)));
}
