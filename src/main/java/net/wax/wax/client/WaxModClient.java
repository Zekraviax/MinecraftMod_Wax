package net.wax.wax.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.resource.ResourceManager;
import net.minecraft.resource.ResourceType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockRenderView;
import net.wax.wax.fluid.ModFluids;

import java.util.function.Function;


public class WaxModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
       setupFluidRendering(ModFluids.LIQUID_WAX_BLACK, ModFluids.LIQUID_WAX_BLACK_FLOWING, new Identifier("wax", "liquid_wax"), 0x2b2b2b);
       setupFluidRendering(ModFluids.LIQUID_WAX_BLUE, ModFluids.LIQUID_WAX_BLUE_FLOWING, new Identifier("wax", "liquid_wax"), 0x4756ed);
       setupFluidRendering(ModFluids.LIQUID_WAX_BROWN, ModFluids.LIQUID_WAX_BROWN_FLOWING, new Identifier("wax", "liquid_wax"), 0x82603d);
       setupFluidRendering(ModFluids.LIQUID_WAX_CYAN, ModFluids.LIQUID_WAX_CYAN_FLOWING, new Identifier("wax", "liquid_wax"), 0x06d5a3);
       setupFluidRendering(ModFluids.LIQUID_WAX_GRAY, ModFluids.LIQUID_WAX_GRAY_FLOWING, new Identifier("wax", "liquid_wax"), 0x6d6d6d);
       setupFluidRendering(ModFluids.LIQUID_WAX_GREEN, ModFluids.LIQUID_WAX_GREEN_FLOWING, new Identifier("wax", "liquid_wax"), 0x1dd54e);
       setupFluidRendering(ModFluids.LIQUID_WAX_LIGHT_BLUE, ModFluids.LIQUID_WAX_LIGHT_BLUE_FLOWING, new Identifier("wax", "liquid_wax"), 0x17caed);
       setupFluidRendering(ModFluids.LIQUID_WAX_LIGHT_GRAY, ModFluids.LIQUID_WAX_LIGHT_GRAY_FLOWING, new Identifier("wax", "liquid_wax"), 0xc3c3c3);
       setupFluidRendering(ModFluids.LIQUID_WAX_LIME, ModFluids.LIQUID_WAX_LIME_FLOWING, new Identifier("wax", "liquid_wax"), 0xb0cc00);
       setupFluidRendering(ModFluids.LIQUID_WAX_MAGENTA, ModFluids.LIQUID_WAX_MAGENTA_FLOWING, new Identifier("wax", "liquid_wax"), 0xed47e9);
       setupFluidRendering(ModFluids.LIQUID_WAX_ORANGE, ModFluids.LIQUID_WAX_ORANGE_FLOWING, new Identifier("wax", "liquid_wax"), 0xed8414);
       setupFluidRendering(ModFluids.LIQUID_WAX_PINK, ModFluids.LIQUID_WAX_PINK_FLOWING, new Identifier("wax", "liquid_wax"), 0xf9bbf8);
       setupFluidRendering(ModFluids.LIQUID_WAX_PURPLE, ModFluids.LIQUID_WAX_PURPLE_FLOWING, new Identifier("wax", "liquid_wax"), 0xa12bed);
       setupFluidRendering(ModFluids.LIQUID_WAX_RED, ModFluids.LIQUID_WAX_RED_FLOWING, new Identifier("wax", "liquid_wax"), 0xd80718);
       setupFluidRendering(ModFluids.LIQUID_WAX_UNCOLOURED, ModFluids.LIQUID_WAX_UNCOLOURED_FLOWING, new Identifier("wax", "liquid_wax"), 0xf2eacf);
       setupFluidRendering(ModFluids.LIQUID_WAX_WHITE, ModFluids.LIQUID_WAX_WHITE_FLOWING, new Identifier("wax", "liquid_wax"), 0xf6f6f6);
       setupFluidRendering(ModFluids.LIQUID_WAX_YELLOW, ModFluids.LIQUID_WAX_YELLOW_FLOWING, new Identifier("wax", "liquid_wax"), 0xf6d728);

       BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getSolid(),
       ModFluids.LIQUID_WAX_BLACK, ModFluids.LIQUID_WAX_BLACK_FLOWING,
       ModFluids.LIQUID_WAX_BLUE, ModFluids.LIQUID_WAX_BLUE_FLOWING,
       ModFluids.LIQUID_WAX_BROWN, ModFluids.LIQUID_WAX_BROWN_FLOWING,
       ModFluids.LIQUID_WAX_CYAN, ModFluids.LIQUID_WAX_CYAN_FLOWING,
       ModFluids.LIQUID_WAX_GRAY, ModFluids.LIQUID_WAX_GRAY_FLOWING,
       ModFluids.LIQUID_WAX_GREEN, ModFluids.LIQUID_WAX_GREEN_FLOWING,
       ModFluids.LIQUID_WAX_LIGHT_BLUE, ModFluids.LIQUID_WAX_LIGHT_BLUE_FLOWING,
       ModFluids.LIQUID_WAX_LIGHT_GRAY, ModFluids.LIQUID_WAX_LIGHT_GRAY_FLOWING,
       ModFluids.LIQUID_WAX_LIME, ModFluids.LIQUID_WAX_LIME_FLOWING,
       ModFluids.LIQUID_WAX_MAGENTA, ModFluids.LIQUID_WAX_MAGENTA_FLOWING,
       ModFluids.LIQUID_WAX_ORANGE, ModFluids.LIQUID_WAX_ORANGE_FLOWING,
       ModFluids.LIQUID_WAX_PINK, ModFluids.LIQUID_WAX_PINK_FLOWING,
       ModFluids.LIQUID_WAX_PURPLE, ModFluids.LIQUID_WAX_PURPLE_FLOWING,
       ModFluids.LIQUID_WAX_RED, ModFluids.LIQUID_WAX_RED_FLOWING,
       ModFluids.LIQUID_WAX_UNCOLOURED, ModFluids.LIQUID_WAX_UNCOLOURED_FLOWING,
       ModFluids.LIQUID_WAX_WHITE, ModFluids.LIQUID_WAX_WHITE_FLOWING,
       ModFluids.LIQUID_WAX_YELLOW, ModFluids.LIQUID_WAX_YELLOW_FLOWING);
    }

    public static void setupFluidRendering(final Fluid still, final Fluid flowing, final Identifier textureFluidId, final int colour) {
        final Identifier stillSpriteId = new Identifier(textureFluidId.getNamespace(), "block/" + textureFluidId.getPath() + "_still");
        final Identifier flowingSpriteId = new Identifier(textureFluidId.getNamespace(), "block/" + textureFluidId.getPath() + "_flow");

        ClientSpriteRegistryCallback.event(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
            registry.register(stillSpriteId);
            registry.register(flowingSpriteId);
        });

        final Identifier fluidId = Registry.FLUID.getId(still);
        final Identifier listenerId = new Identifier(fluidId.getNamespace(), fluidId.getPath() + "_reload_listener");

        final Sprite[] fluidSprites = {null, null};

        ResourceManagerHelper.get(ResourceType.CLIENT_RESOURCES).registerReloadListener(new SimpleSynchronousResourceReloadListener() {
            @Override
            public Identifier getFabricId() {
                return listenerId;
            }

            @Override
            public void reload(ResourceManager resourceManager) {
                final Function<Identifier, Sprite> atlas = MinecraftClient.getInstance().getSpriteAtlas(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE);
                fluidSprites[0] = atlas.apply(stillSpriteId);
                fluidSprites[1] = atlas.apply(flowingSpriteId);
            }
        });

        final FluidRenderHandler renderHandler = new FluidRenderHandler() {
            @Override
            public Sprite[] getFluidSprites(BlockRenderView view, BlockPos pos, FluidState state) {
                return fluidSprites;
            }

            @Override
            public int getFluidColor(BlockRenderView view, BlockPos pos, FluidState state) {
                return colour;
            }
        };

        FluidRenderHandlerRegistry.INSTANCE.register(still, renderHandler);
        FluidRenderHandlerRegistry.INSTANCE.register(flowing, renderHandler);
    }
}
