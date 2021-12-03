package techplane.potion.swords;

    import net.minecraft.enchantment.Enchantment;
    import net.minecraft.enchantment.EnchantmentTarget;
    import net.minecraft.enchantment.Enchantments;
    import net.minecraft.entity.Entity;
    import net.minecraft.entity.EquipmentSlot;
    import net.minecraft.entity.LivingEntity;
    import net.minecraft.entity.effect.StatusEffectInstance;
    import net.minecraft.entity.effect.StatusEffects;

public class WitherTouchEnchantment extends Enchantment {

    @Override
    public int getMinPower(int level) {
    return 1;
    }

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
        ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 9 * 22 * level, level - 1));
    }
 
    super.onTargetDamaged(user, target, level);
    }

    public WitherTouchEnchantment() {
        super(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    }

}

