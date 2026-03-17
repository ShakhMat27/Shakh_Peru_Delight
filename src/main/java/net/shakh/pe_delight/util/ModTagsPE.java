package net.shakh.pe_delight.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.shakh.pe_delight.ShakhMod;

public class ModTagsPE {
    public static class Blocks {
        public static final TagKey<Block> PAVO_TAG = tag("pavo");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(ShakhMod.MOD_ID, name));


        }
    }
    public static class Items {
        public static final TagKey<Item> PASSION_FRUIT = tag("passion_fruits");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(ShakhMod.MOD_ID, name));
    }
}