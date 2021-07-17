package net.wax.wax.mixins;

import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.wax.wax.item.WaxWings;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ClientPlayerEntity.class)
public class ClientPlayerEntityMixin {
    @Redirect(method = "tickMovement", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z"))
    private boolean tickMovement(ItemStack stack, Item isOfItem) {
        return stack.getItem().getClass() == ElytraItem.class ||
                stack.getItem().getClass() == WaxWings.class;
    }
}
