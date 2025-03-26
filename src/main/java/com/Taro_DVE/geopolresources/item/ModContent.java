package com.Taro_DVE.geopolresources.item;

import com.Taro_DVE.geopolresources.GeoPolResources;
import com.Taro_DVE.geopolresources.item.barrier.BarrierBlock;
import com.Taro_DVE.geopolresources.item.barrier.BarrierTileEntity;
import com.Taro_DVE.geopolresources.item.desk.corner.DeskCornerBlock;
import com.Taro_DVE.geopolresources.item.desk.corner.DeskCornerTileEntity;
import com.Taro_DVE.geopolresources.item.desk.corneralt1.DeskCornerAlt1Block;
import com.Taro_DVE.geopolresources.item.desk.corneralt1.DeskCornerAlt1TileEntity;
import com.Taro_DVE.geopolresources.item.desk.left.DeskLeftBlock;
import com.Taro_DVE.geopolresources.item.desk.left.DeskLeftTileEntity;
import com.Taro_DVE.geopolresources.item.desk.leftalt1.DeskLeftAlt1Block;
import com.Taro_DVE.geopolresources.item.desk.leftalt1.DeskLeftAlt1TileEntity;
import com.Taro_DVE.geopolresources.item.desk.middle.DeskMiddleBlock;
import com.Taro_DVE.geopolresources.item.desk.middle.DeskMiddleTileEntity;
import com.Taro_DVE.geopolresources.item.desk.right.DeskRightBlock;
import com.Taro_DVE.geopolresources.item.desk.right.DeskRightTileEntity;
import com.Taro_DVE.geopolresources.item.desk.rightalt1.DeskRightAlt1Block;
import com.Taro_DVE.geopolresources.item.desk.rightalt1.DeskRightAlt1TileEntity;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModContent {

    // Block, Item, and TileEntity Deferred Registers
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GeoPolResources.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GeoPolResources.MOD_ID);
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, GeoPolResources.MOD_ID);

    // Blocks with Items
    public static final RegistryObject<Block> BARRIER_BLOCK = registerBlockWithItem("barrier_block", BarrierBlock::new);
    public static final RegistryObject<Block> DESK_LEFT = registerBlockWithItem("desk_left_block", DeskLeftBlock::new);
    public static final RegistryObject<Block> DESK_LEFTALT1 = registerBlockWithItem("desk_leftalt1_block", DeskLeftAlt1Block::new);
    public static final RegistryObject<Block> DESK_RIGHT = registerBlockWithItem("desk_right_block", DeskRightBlock::new);
    public static final RegistryObject<Block> DESK_RIGHTALT1 = registerBlockWithItem("desk_rightalt1_block", DeskRightAlt1Block::new);
    public static final RegistryObject<Block> DESK_MIDDLE = registerBlockWithItem("desk_middle_block", DeskMiddleBlock::new);
    public static final RegistryObject<Block> DESK_CORNER = registerBlockWithItem("desk_corner_block", DeskCornerBlock::new);
    public static final RegistryObject<Block> DESK_CORNERALT1 = registerBlockWithItem("desk_corneralt1_block", DeskCornerAlt1Block::new);

    // Tile Entities
    public static final RegistryObject<TileEntityType<BarrierTileEntity>> BARRIER_TILE_ENTITY = registerTileEntity("barrier_tile_entity", BarrierTileEntity::new, BARRIER_BLOCK);
    public static final RegistryObject<TileEntityType<DeskLeftTileEntity>> DESK_LEFT_TILE_ENTITY = registerTileEntity("desk_left_tile_entity", DeskLeftTileEntity::new, DESK_LEFT);
    public static final RegistryObject<TileEntityType<DeskRightTileEntity>> DESK_RIGHT_TILE_ENTITY = registerTileEntity("desk_right_tile_entity", DeskRightTileEntity::new, DESK_RIGHT);
    public static final RegistryObject<TileEntityType<DeskRightAlt1TileEntity>> DESK_RIGHTALT1_TILE_ENTITY = registerTileEntity("desk_rightalt1_tile_entity", DeskRightAlt1TileEntity::new, DESK_RIGHTALT1);
    public static final RegistryObject<TileEntityType<DeskMiddleTileEntity>> DESK_MIDDLE_TILE_ENTITY = registerTileEntity("desk_middle_tile_entity", DeskMiddleTileEntity::new, DESK_MIDDLE);
    public static final RegistryObject<TileEntityType<DeskCornerTileEntity>> DESK_CORNER_TILE_ENTITY = registerTileEntity("desk_corner_tile_entity", DeskCornerTileEntity::new, DESK_CORNER);
    public static final RegistryObject<TileEntityType<DeskCornerAlt1TileEntity>> DESK_CORNERALT1_TILE_ENTITY = registerTileEntity("desk_corneralt1_tile_entity", DeskCornerAlt1TileEntity::new, DESK_CORNERALT1);
    public static final  RegistryObject<TileEntityType<DeskLeftAlt1TileEntity>> DESK_LEFTALT1_TILE_ENTITY = registerTileEntity("desk_leftalt1_tile_entity",  DeskLeftAlt1TileEntity::new, DESK_LEFTALT1);


    private static RegistryObject<Block> registerBlockWithItem(String name, Supplier<Block> blockSupplier) {
        RegistryObject<Block> block = BLOCKS.register(name, blockSupplier);
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(ModItemGroup.GEOPOLRESOURCES_GROUP)));
        return block;
    }

    private static <T extends net.minecraft.tileentity.TileEntity> RegistryObject<TileEntityType<T>> registerTileEntity(
            String name, Supplier<T> tileSupplier, RegistryObject<Block> block) {
        return TILE_ENTITY_TYPES.register(name,
                () -> TileEntityType.Builder.create(tileSupplier, block.get()).build(null));
    }
}