package techplane.potion.swords;

    import net.minecraft.enchantment.Enchantment;
    import net.minecraft.enchantment.EnchantmentTarget;
    import net.minecraft.entity.Entity;
    import net.minecraft.entity.EquipmentSlot;
    import net.minecraft.entity.LivingEntity;
    import net.minecraft.entity.effect.StatusEffectInstance;
    import net.minecraft.entity.effect.StatusEffects;

public class HeliumEnchantment extends Enchantment {

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
    if(target instanceof LivingEntity) {
        ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 20 * 2 * level, level - 1));
    }
 
    super.onTargetDamaged(user, target, level);
    }

    public HeliumEnchantment() {
        super(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    }
    
}
