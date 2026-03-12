package net.shakh.pe_delight.item;

import net.minecraft.world.item.Item;
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

    public static final RegistryObject<Item> MARACUYA = ITEMS.register("passion_fruit",
            () -> new Item(new Item.Properties().food(ModFoods.MARACUYA)));

    public static final RegistryObject<Item> PINE_CONE = ITEMS.register("pine_cone",
            () -> new FuelItem(new Item.Properties(), 400));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
