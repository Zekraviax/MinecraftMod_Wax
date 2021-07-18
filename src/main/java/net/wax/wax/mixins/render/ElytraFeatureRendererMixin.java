package net.wax.wax.mixins.render;

import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.ElytraFeatureRenderer;
import net.minecraft.client.render.entity.model.ElytraEntityModel;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.wax.wax.item.WaxWings;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ElytraFeatureRenderer.class)
public class ElytraFeatureRendererMixin {
    public final ElytraFeatureRenderer instance = (ElytraFeatureRenderer) (Object) this;

    @Shadow
    private ElytraEntityModel<LivingEntity> elytra;


    @Inject(method = "render", at = @At(value = "TAIL", target = "Lnet/minecraft/client/render/entity/feature/ElytraFeatureRenderer;render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/entity/LivingEntity;FFFFFF)V;"))
    private void InjectWaxWingsSkin(MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, LivingEntity livingEntity, float f, float g, float h, float j, float k, float l, CallbackInfo ci) {
        if (livingEntity.getEquippedStack(EquipmentSlot.CHEST).getItem().getClass() == WaxWings.class) {
            Identifier identifier4 = new Identifier("wax:textures/item/wax_wings.png");
            ItemStack itemStack = livingEntity.getEquippedStack(EquipmentSlot.CHEST);

            matrixStack.push();
            matrixStack.translate(0.0D, 0.0D, 0.125D);
            instance.getContextModel().copyStateTo(elytra);

            /*
            f = 0;
            g = 0;
            j = 90;
            k = -90;
            l = 1;
            */

            elytra.setAngles(livingEntity, f, g, j, k, l);
            VertexConsumer vertexConsumer = ItemRenderer.getArmorGlintConsumer(vertexConsumerProvider, RenderLayer.getArmorCutoutNoCull(identifier4), false, itemStack.hasGlint());
            elytra.render(matrixStack, vertexConsumer, i, OverlayTexture.DEFAULT_UV, 1.0F, 1.0F, 1.0F, 1.0F);
            matrixStack.pop();
        }
    }


    @Redirect(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z"))
    private boolean render(ItemStack stack, Item isOfItem) {
        return stack.getItem().getClass() == ElytraItem.class ||
                stack.getItem().getClass() == WaxWings.class;
    }
}