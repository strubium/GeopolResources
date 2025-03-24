package com.Taro_DVE.geopolresources;

import com.Taro_DVE.geopolresources.item.ModBlocks;
import com.Taro_DVE.geopolresources.item.ModItems;
import com.Taro_DVE.geopolresources.item.ModTileEntityTypes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
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

        ModBlocks.BLOCKS.register(eventBus);
        ModItems.ITEMS.register(eventBus);

        ModTileEntityTypes.TILE_ENTITY_TYPES.register(eventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }


    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ClientRegistry.bindTileEntityRenderer(ModTileEntityTypes.BARRIER_TILE_ENTITY.get(), (dispatcher) -> new TileRenderer(dispatcher).setTexture("textures/block/barrier.png"));
        }
    }
}
