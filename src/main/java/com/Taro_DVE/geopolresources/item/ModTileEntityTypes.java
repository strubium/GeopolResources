package com.Taro_DVE.geopolresources.item;

import com.Taro_DVE.geopolresources.GeoPolResources;
import com.Taro_DVE.geopolresources.item.barrier.BarrierTileEntity;
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

}
