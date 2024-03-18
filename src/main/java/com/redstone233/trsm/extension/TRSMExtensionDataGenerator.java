package com.redstone233.trsm.extension;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

import com.redstone233.trsm.extension.datagen.ExtendModModlesProvider;

public class TRSMExtensionDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
    FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
    
    pack.addProvider(ExtendModModlesProvider::new);
    
	}
}
