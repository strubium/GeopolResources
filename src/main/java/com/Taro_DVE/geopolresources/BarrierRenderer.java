package com.Taro_DVE.geopolresources;

import com.Taro_DVE.geopolresources.item.barrier.BarrierModel;
import com.Taro_DVE.geopolresources.item.barrier.BarrierTileEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;

public class BarrierRenderer extends TileEntityRenderer<BarrierTileEntity> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(GeoPolResources.MOD_ID, "textures/block/barrier.png");
    private final BarrierModel model = new BarrierModel();

    public BarrierRenderer(TileEntityRendererDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn);
    }

    @Override
    public void render(BarrierTileEntity tileEntity, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {

        matrixStack.push();

        // Positioning
        matrixStack.translate(0.5D, 1.5D, 0.5D);
        matrixStack.scale(1.0F, -1.0F, -1.0F);

        IVertexBuilder vertexBuilder = bufferIn.getBuffer(RenderType.getEntityCutout(TEXTURE));

        model.render(matrixStack, vertexBuilder, combinedLightIn, combinedOverlayIn, 1.0F, 1.0F, 1.0F, 1.0F);

        matrixStack.pop();
    }

}

