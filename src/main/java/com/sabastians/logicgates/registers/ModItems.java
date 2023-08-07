package com.sabastians.logicgates.registers;

import com.sabastians.logicgates.LogicGateMod;
import com.sabastians.logicgates.customs.SpaceMirrorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LogicGateMod.MOD_ID);

    public static final RegistryObject<Item> SPACE_MIRROR = ITEMS.register("space_mirror",
            () -> new SpaceMirrorItem(new Item.Properties().stacksTo(1).durability(50)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}