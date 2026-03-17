package net.shakh.pe_delight.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.shakh.pe_delight.ShakhMod;
import net.shakh.pe_delight.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ShakhMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.PAVO);
        simpleItem(ModItems.RAW_PAVO);

        simpleItem(ModItems.PASSION_FRUIT);
        simpleItem(ModItems.PASSION_FRUIT_CUTS);
        simpleItem(ModItems.PASSION_FRUIT_JUICE);

        simpleItem((ModItems.PINE_CONE));

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ShakhMod.MOD_ID, "item/" + item.getId().getPath()));
    }
}
