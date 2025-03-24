package com.Taro_DVE.geopolresources.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup GEOPOLRESOURCES_GROUP = new ItemGroup("GeoPol Resources") {
        @Override
        public ItemStack createIcon() {
            return ItemStack.EMPTY;
        }
    };
}
