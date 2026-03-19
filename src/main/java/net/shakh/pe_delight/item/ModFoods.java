package net.shakh.pe_delight.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraftforge.event.entity.living.MobEffectEvent;

public class ModFoods {
    public static final FoodProperties PASSION_FRUIT = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 200), 0.5f).build();
    public static final FoodProperties PASSION_FRUIT_CUTS = new FoodProperties.Builder().nutrition(1).fast()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 400), 0.8f).build();
    public static final FoodProperties PASSION_FRUIT_JUICE = new FoodProperties.Builder().nutrition(4).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 1400), 1f).alwaysEat().build();

}
