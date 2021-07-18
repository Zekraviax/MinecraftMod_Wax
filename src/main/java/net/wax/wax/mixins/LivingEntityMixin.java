package net.wax.wax.mixins;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.wax.wax.item.WaxWings;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.function.Consumer;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {
    @Redirect(method = "tickFallFlying()V", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z"))
    private boolean tickFallFlying(ItemStack stack, Item isOfItem) {
        return stack.getItem().getClass() == ElytraItem.class ||
                stack.getItem().getClass() == WaxWings.class;
    }

    @Redirect(method = "tickFallFlying()V", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;damage(ILnet/minecraft/entity/LivingEntity;Ljava/util/function/Consumer;)V"))
    private void tickFallFlying(ItemStack itemStack, int amount, LivingEntity entity, Consumer<Object> breakCallback) {
        if (itemStack.getItem().getClass() == WaxWings.class) {
            if (entity.getPos().y >= 100)
                itemStack.damage(100, entity, (player) -> player.sendEquipmentBreakStatus(EquipmentSlot.CHEST));
            else
                itemStack.damage(1, entity, (player) -> player.sendEquipmentBreakStatus(EquipmentSlot.CHEST));
        }
    }
}
