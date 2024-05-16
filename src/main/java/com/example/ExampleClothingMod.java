package com.example;

import com.example.init.ItemInit;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.lightglow.cosmlib.common.item.ClothingItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleClothingMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "examplemod";
    public static final Logger LOGGER = LoggerFactory.getLogger("examplemod");

	@Override
	public void onInitialize() {
		ItemInit.register();
	}
}