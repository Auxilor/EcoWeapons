package com.willfp.ecoweapons.effects;

import com.willfp.ecoweapons.EcoWeaponsPlugin;
import lombok.AccessLevel;
import lombok.Getter;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.jetbrains.annotations.NotNull;

public abstract class Effect {
    /**
     * Instance of EcoWeapons.
     */
    @Getter(AccessLevel.PROTECTED)
    private final EcoWeaponsPlugin plugin = EcoWeaponsPlugin.getInstance();

    /**
     * The name of the effect.
     */
    @Getter
    private final String name;

    /**
     * Create a new effect.
     *
     * @param name The effect name.
     */
    protected Effect(@NotNull final String name) {
        this.name = name;

        Effects.addNewEffect(this);
    }

    /**
     * Handle {@link TriggerType#MELEE_ATTACK}.
     *
     * @param player The player.
     * @param victim The victim.
     * @param event  The event.
     * @param args   The effect args.
     */
    public void handleMeleeAttack(@NotNull final Player player,
                                  @NotNull final LivingEntity victim,
                                  @NotNull final EntityDamageByEntityEvent event,
                                  @NotNull final Object args) {
        // Override when needed.
    }

    /**
     * Handle {@link TriggerType#PROJECTILE_HIT_ENTITY}.
     *
     * @param player     The player.
     * @param victim     The victim.
     * @param projectile The projectile.
     * @param event      The event.
     * @param args       The effect args.
     */
    public void handleProjectileHitEntity(@NotNull final Player player,
                                          @NotNull final LivingEntity victim,
                                          @NotNull final Projectile projectile,
                                          @NotNull final ProjectileHitEvent event,
                                          @NotNull final Object args) {
        // Override when needed.
    }

    /**
     * Handle {@link TriggerType#PROJECTILE_HIT}.
     *
     * @param player     The player.
     * @param projectile The projectile.
     * @param event      The event.
     * @param args       The effect args.
     */
    public void handleProjectileHit(@NotNull final Player player,
                                    @NotNull final Projectile projectile,
                                    @NotNull final ProjectileHitEvent event,
                                    @NotNull final Object args) {
        // Override when needed.
    }

    /**
     * Handle {@link TriggerType#ALT_CLICK} and {@link TriggerType#SHIFT_ALT_CLICK}.
     *
     * @param player The player.
     * @param event  The event.
     * @param args   The effect args.
     */
    public void handleAltClick(@NotNull final Player player,
                               @NotNull final PlayerInteractEvent event,
                               @NotNull final Object args) {
        // Override when needed.
    }
}
