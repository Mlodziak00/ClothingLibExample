package com.example.init;

import com.example.ExampleClothingMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.lightglow.cosmlib.common.item.ClothingItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemInit {
    // namespace looks for your mods asset folder
    // texture takes both the "slim_example_clothing" and "example_clothing"
    public static Item EXAMPLE_ITEM = registerItem("example_clothing", new ClothingItem(new FabricItemSettings().maxCount(1),
            ExampleClothingMod.MOD_ID, "example_clothing"));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(ExampleClothingMod.MOD_ID, name), item);
    }
    public static void register(){}

}
