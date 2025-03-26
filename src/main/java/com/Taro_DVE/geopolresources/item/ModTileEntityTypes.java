package com.Taro_DVE.geopolresources.item;

import com.Taro_DVE.geopolresources.GeoPolResources;
import com.Taro_DVE.geopolresources.item.barrier.BarrierTileEntity;
import com.Taro_DVE.geopolresources.item.desk.left.DeskLeftTileEntity;
import com.Taro_DVE.geopolresources.item.desk.middle.DeskMiddleTileEntity;
import com.Taro_DVE.geopolresources.item.desk.right.DeskRightTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntityTypes {

    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, GeoPolResources.MOD_ID);

    public static final RegistryObject<TileEntityType<BarrierTileEntity>> BARRIER_TILE_ENTITY =
            TILE_ENTITY_TYPES.register("barrier_tile_entity",
                    () -> TileEntityType.Builder.create(BarrierTileEntity::new, ModBlocks.BARRIER_BLOCK.get()).build(null)
            );

    public static final RegistryObject<TileEntityType<DeskLeftTileEntity>> DESK_LEFT_TILE_ENTITY =
            TILE_ENTITY_TYPES.register("desk_left_tile_entity",
                    () -> TileEntityType.Builder.create(DeskLeftTileEntity::new, ModBlocks.DESK_LEFT.get()).build(null)
            );

    public static final RegistryObject<TileEntityType<DeskRightTileEntity>> DESK_RIGHT_TILE_ENTITY =
            TILE_ENTITY_TYPES.register("desk_right_tile_entity",
                    () -> TileEntityType.Builder.create(DeskRightTileEntity::new, ModBlocks.DESK_RIGHT.get()).build(null)
            );

    public static final RegistryObject<TileEntityType<DeskMiddleTileEntity>> DESK_MIDDLE_TILE_ENTITY =
            TILE_ENTITY_TYPES.register("desk_middle_tile_entity",
                    () -> TileEntityType.Builder.create(DeskMiddleTileEntity::new, ModBlocks.DESK_MIDDLE.get()).build(null)
            );

    public static final RegistryObject<TileEntityType<DeskMiddleTileEntity>> DESK_CORNER_TILE_ENTITY =
            TILE_ENTITY_TYPES.register("desk_corner_tile_entity",
                    () -> TileEntityType.Builder.create(DeskMiddleTileEntity::new, ModBlocks.DESK_CORNER.get()).build(null)
            );

    public static final RegistryObject<TileEntityType<DeskMiddleTileEntity>> DESK_CORNERALT1_TILE_ENTITY =
            TILE_ENTITY_TYPES.register("desk_corneralt1_tile_entity",
                    () -> TileEntityType.Builder.create(DeskMiddleTileEntity::new, ModBlocks.DESK_CORNERALT1.get()).build(null)
            );

}
