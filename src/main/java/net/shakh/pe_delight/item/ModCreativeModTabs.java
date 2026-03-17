package net.shakh.pe_delight.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.shakh.pe_delight.ShakhMod;
import net.shakh.pe_delight.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ShakhMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PAVO.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.PAVO.get());
                        pOutput.accept(ModItems.RAW_PAVO.get());

                        pOutput.accept(Items.DIAMOND);

                        pOutput.accept(ModBlocks.PAVO_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_PAVO_BLOCK.get());

                        pOutput.accept(ModBlocks.PAVO_ORE.get());

                        pOutput.accept(ModItems.PASSION_FRUIT.get());
                        pOutput.accept(ModItems.PASSION_FRUIT_CUTS.get());
                        pOutput.accept(ModItems.PASSION_FRUIT_JUICE.get());

                        pOutput.accept(ModItems.PINE_CONE.get());

                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
