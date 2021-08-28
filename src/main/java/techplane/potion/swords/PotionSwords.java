package techplane.potion.swords;

import net.fabricmc.api.ModInitializer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class PotionSwords implements ModInitializer {

	private static Enchantment FROST = Registry.register(
            Registry.ENCHANTMENT,
            new Identifier("potionswords", "frost"),
            new FrostEnchantment()
		);

		private static Enchantment POISONTIP = Registry.register(
            Registry.ENCHANTMENT,
            new Identifier("potionswords", "poisontip"),
            new PoisonTipEnchantment()
		);

		private static Enchantment BLINDNESSTOUCH = Registry.register(
            Registry.ENCHANTMENT,
            new Identifier("potionswords", "blindnesstouch"),
            new BlindnessTouchEnchantment()
		);

		private static Enchantment HELIUM = Registry.register(
            Registry.ENCHANTMENT,
            new Identifier("potionswords", "helium"),
            new HeliumEnchantment()
		);

		private static Enchantment WITHERTOUCH = Registry.register(
            Registry.ENCHANTMENT,
            new Identifier("potionswords", "withertouch"),
            new WitherTouchEnchantment()
		);

		private static Enchantment SICKNESS = Registry.register(
            Registry.ENCHANTMENT,
            new Identifier("potionswords", "sickness"),
            new SicknessEnchantment()
		);

		private static Enchantment WEAKNESSTOUCH = Registry.register(
            Registry.ENCHANTMENT,
            new Identifier("potionswords", "weaknesstouch"),
            new WeaknessTouchEnchantment()
		);

		private static Enchantment DULLINGTOUCH = Registry.register(
            Registry.ENCHANTMENT,
            new Identifier("potionswords", "dullingtouch"),
            new DullingTouchEnchantment()
		);

	@Override
	public void onInitialize() {
		System.out.println("Never Fear, the Potion Swords mod is here!");
	}
}
