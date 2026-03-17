package net.shakh.pe_delight.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shakh.pe_delight.ShakhMod;
import net.shakh.pe_delight.item.custom.FuelItem;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ShakhMod.MOD_ID);

    public static final RegistryObject<Item> PAVO = ITEMS.register("pavo",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PAVO = ITEMS.register("raw_pavo",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PASSION_FRUIT = ITEMS.register("passion_fruit",
            () -> new Item(new Item.Properties().food(ModFoods.PASSION_FRUIT)));
    public static final RegistryObject<Item> PASSION_FRUIT_CUTS = ITEMS.register("passion_fruit_cuts",
            () -> new Item(new Item.Properties().food(ModFoods.PASSION_FRUIT_CUTS)));
    public static final RegistryObject<Item> PASSION_FRUIT_JUICE = ITEMS.register("passion_fruit_juice",
            () -> new Item(new Item.Properties().food(ModFoods.PASSION_FRUIT_JUICE).stacksTo(16)) {

                @Override
                public UseAnim getUseAnimation(ItemStack stack) {
                    return UseAnim.DRINK; // <--- Esto quita el sonido de "masticar"
                }

                @Override
                public ItemStack finishUsingItem(ItemStack stack, net.minecraft.world.level.Level level, net.minecraft.world.entity.LivingEntity entity) {
                    ItemStack result = super.finishUsingItem(stack, level, entity);
                    if (entity instanceof net.minecraft.world.entity.player.Player player && !player.getAbilities().instabuild) {
                        if (result.isEmpty()) {
                            return new ItemStack(net.minecraft.world.item.Items.GLASS_BOTTLE);
                        }
                        player.getInventory().add(new ItemStack(net.minecraft.world.item.Items.GLASS_BOTTLE));
                    }
                    return result;
                }
            });

    public static final RegistryObject<Item> PINE_CONE = ITEMS.register("pine_cone",
            () -> new FuelItem(new Item.Properties(), 400));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
