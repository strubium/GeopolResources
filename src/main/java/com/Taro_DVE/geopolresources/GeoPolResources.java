package com.Taro_DVE.geopolresources;

import com.Taro_DVE.geopolresources.item.ModContent;
import com.Taro_DVE.geopolresources.entity.SitEntity;
import com.Taro_DVE.geopolresources.item.barrier.BarrierModel;
import com.Taro_DVE.geopolresources.item.chair.homechair.HomeChairModel;
import com.Taro_DVE.geopolresources.item.chair.officechair1.OfficeChair1Model;
import com.Taro_DVE.geopolresources.item.chair.officechair2.OfficeChair2Model;
import com.Taro_DVE.geopolresources.item.desk.corner.DeskCornerModel;
import com.Taro_DVE.geopolresources.item.desk.corneralt1.DeskCornerAlt1Model;
import com.Taro_DVE.geopolresources.item.desk.left.DeskLeftModel;
import com.Taro_DVE.geopolresources.item.desk.leftalt1.DeskLeftAlt1Model;
import com.Taro_DVE.geopolresources.item.desk.middle.DeskMiddleModel;
import com.Taro_DVE.geopolresources.item.desk.right.DeskRightModel;
import com.Taro_DVE.geopolresources.item.desk.rightalt1.DeskRightAlt1Model;
import com.Taro_DVE.geopolresources.entity.SitEntityRenderer;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ObjectHolder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(GeoPolResources.MOD_ID)
public class GeoPolResources
{
    public static final String MOD_ID = "geopolresources";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public GeoPolResources() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModContent.BLOCKS.register(eventBus);
        ModContent.ITEMS.register(eventBus);

        ModContent.TILE_ENTITY_TYPES.register(eventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }


    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {

        @ObjectHolder("geopolresources:sit_entity")
        public static final EntityType<SitEntity> SIT_ENTITY = null;

        @SubscribeEvent
        public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) {
            event.getRegistry().register(
                    EntityType.Builder.<SitEntity>create(SitEntity::new, EntityClassification.MISC)
                            .size(0.0F, 0.0F) // Invisible entity (no collision box)
                            .setShouldReceiveVelocityUpdates(false)
                            .setTrackingRange(10)
                            .setUpdateInterval(1)
                            .build(new ResourceLocation(MOD_ID, "sit_entity").toString())
                            .setRegistryName(new ResourceLocation(MOD_ID, "sit_entity"))
            );
        }

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            RenderingRegistry.registerEntityRenderingHandler(RegistryEvents.SIT_ENTITY, SitEntityRenderer::new);

            ClientRegistry.bindTileEntityRenderer(ModContent.DESK_CORNERALT1_TILE_ENTITY.get(), (dispatcher) -> new TileRenderer(dispatcher).setTexture("textures/block/desk.png").setModel(new DeskCornerAlt1Model()));

            ClientRegistry.bindTileEntityRenderer(ModContent.DESK_LEFTALT1_TILE_ENTITY.get(), (dispatcher) -> new TileRenderer(dispatcher).setTexture("textures/block/desk.png").setModel(new DeskLeftAlt1Model()));

            ClientRegistry.bindTileEntityRenderer(ModContent.DESK_RIGHTALT1_TILE_ENTITY.get(), (dispatcher) -> new TileRenderer(dispatcher).setTexture("textures/block/desk.png").setModel(new DeskRightAlt1Model()));


            ClientRegistry.bindTileEntityRenderer(ModContent.DESK_CORNER_TILE_ENTITY.get(), (dispatcher) -> new TileRenderer(dispatcher).setTexture("textures/block/desk.png").setModel(new DeskCornerModel()));

            ClientRegistry.bindTileEntityRenderer(ModContent.DESK_MIDDLE_TILE_ENTITY.get(), (dispatcher) -> new TileRenderer(dispatcher).setTexture("textures/block/desk.png").setModel(new DeskMiddleModel()));

            ClientRegistry.bindTileEntityRenderer(ModContent.DESK_RIGHT_TILE_ENTITY.get(), (dispatcher) -> new TileRenderer(dispatcher).setTexture("textures/block/desk.png").setModel(new DeskRightModel()));

            ClientRegistry.bindTileEntityRenderer(ModContent.DESK_LEFT_TILE_ENTITY.get(), (dispatcher) -> new TileRenderer(dispatcher).setTexture("textures/block/desk.png").setModel(new DeskLeftModel()));

            ClientRegistry.bindTileEntityRenderer(ModContent.BARRIER_TILE_ENTITY.get(), (dispatcher) -> new TileRenderer(dispatcher).setTexture("textures/block/barrier.png").setModel(new BarrierModel()));

            ClientRegistry.bindTileEntityRenderer(ModContent.HOME_CHAIR_TILE_ENTITY.get(), (dispatcher) -> new TileRenderer(dispatcher).setTexture("textures/block/homechair.png").setModel(new HomeChairModel()));

            ClientRegistry.bindTileEntityRenderer(ModContent.OFFICE_CHAIR_1_TILE_ENTITY.get(), (dispatcher) -> new TileRenderer(dispatcher).setTexture("textures/block/officechair.png").setModel(new OfficeChair1Model()));

            ClientRegistry.bindTileEntityRenderer(ModContent.OFFICE_CHAIR_2_TILE_ENTITY.get(), (dispatcher) -> new TileRenderer(dispatcher).setTexture("textures/block/officechair.png").setModel(new OfficeChair2Model()));
        }
    }
}
