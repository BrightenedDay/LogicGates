package com.sabastians.logicgates.registers;

import com.sabastians.logicgates.LogicGateMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModdedCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LogicGateMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> LOGIC_GATES_TAB = CREATIVE_TABS.register("logicgates_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SPACE_MIRROR.get())).title(Component.translatable("creativetab.logicgates_tab")).displayItems((pParameters, pOutput) -> {
        pOutput.accept(ModItems.SPACE_MIRROR.get());
        pOutput.accept(ModBlocks.RUBY_BLOCK.get());
    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_TABS.register(eventBus);
    }
}