package net.curse_soul;

import net.curse_soul.effect.Bleeding;
import net.curse_soul.item.ModItemsGroup;
import net.fabricmc.api.ModInitializer;

import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CursedSoul implements ModInitializer {
	public static final String MOD_ID = "curse_soul";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemsGroup.registerItemGroup();
	}
	public static final StatusEffect BLEEDING_EFFECT;
	static {
		BLEEDING_EFFECT = Registry.register(Registries.STATUS_EFFECT, Identifier.of("cursed_soul", "bleeding"), new Bleeding());
	}
	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}