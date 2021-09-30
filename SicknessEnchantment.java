package techplane.potion.swords;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class SicknessEnchantment extends Enchantment{

    @Override
    public boolean canAccept(Enchantment other) {
        return super.canAccept(other) && other != Enchantments.SMITE && other != Enchantments.FIRE_ASPECT && other != Enchantments.SHARPNESS &&
        other !=Enchantments.KNOCKBACK && other != Enchantments.BANE_OF_ARTHROPODS;
    }
    
    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
    if(target instanceof LivingEntity) {
        ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 20 * 5 * level, level - 1));
        ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20 * 5 * level, level - 1));
    }
 
    super.onTargetDamaged(user, target, level);
    }

    public SicknessEnchantment() {
        super(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    }
    
}
