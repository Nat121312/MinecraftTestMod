package net.nat.testmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nat.testmod.TestMod;

public class ModItem {
    // Create a register of type ITEM
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);

    // Adding Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Test_Tab)));
    public static final RegistryObject<Item> UNPOLISHED_RUBY = ITEMS.register("unpolished_ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Test_Tab2)));

    // Function to register a item
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
