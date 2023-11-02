package com.lsb.client;

import com.gempire.client.entity.model.ModelLapis;
import com.gempire.client.entity.model.ModelNephrite;
import com.lsb.client.entity.model.*;
import com.lsb.client.entity.render.*;
import com.lsb.lsb;
import com.lsb.init.AddonEntities;
import com.lsb.init.AddonItemProperties;
import com.lsb.init.AddonItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientProxy {

    @Mod.EventBusSubscriber(modid = lsb.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModBusEvents {


        @SubscribeEvent
        public static void onClientSetup(EntityRenderersEvent.RegisterRenderers event) {
            event.registerEntityRenderer(AddonEntities.SBJADE.get(), m -> new RenderSbJade(m, new ModelSbJade<>(m.bakeLayer(ModelSbJade.LAYER_LOCATION))));
            event.registerEntityRenderer(AddonEntities.SBPENTAGONITE.get(), m -> new RenderSbPentagonite(m, new ModelSbPentagonite<>(m.bakeLayer(ModelSbPentagonite.LAYER_LOCATION))));
        }

        @SubscribeEvent
        public static void doSetup(FMLClientSetupEvent event) {
            AddonItemProperties.addCustomItemProperties();
        }

        @SubscribeEvent
        public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
            //register layers here
            event.registerLayerDefinition(ModelSbJade.LAYER_LOCATION, ModelSbJade::createBodyLayer);
            event.registerLayerDefinition(ModelSbPentagonite.LAYER_LOCATION, ModelSbPentagonite::createBodyLayer);
        }

    }
}
