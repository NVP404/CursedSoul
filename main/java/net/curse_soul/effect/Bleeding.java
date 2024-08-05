package net.curse_soul.effect;


import net.curse_soul.CursedSoul;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageSources;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.world.World;

public class Bleeding extends StatusEffect {
    public Bleeding() {
        super(StatusEffectCategory.HARMFUL, 0xe82423);
    }
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (!entity.getWorld().isClient) {
            DamageSource damageSource = new DamageSource(entity.getWorld().getRegistryManager()
                    .get(RegistryKeys.DAMAGE_TYPE)
                    .entryOf(ModDamageType.BLEEDING_DAMAGE_TYPE));
            entity.damage(damageSource, 1.0F + amplifier);
        }
        return super.applyUpdateEffect(entity, amplifier);
    }
}

