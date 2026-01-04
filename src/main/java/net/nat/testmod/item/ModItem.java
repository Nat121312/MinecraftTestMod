package net.nat.testmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nat.testmod.TestMod;
import net.nat.testmod.custom.ModMaterials;
import net.nat.testmod.custom.Tools.ModCustomAxe;
import net.nat.testmod.custom.Tools.ModCustomHoe;
import net.nat.testmod.custom.Tools.ModCustomPickaxe;
import net.nat.testmod.custom.Tools.ModCustomShovel;
import net.nat.testmod.custom.Weapons.ModCustomSword;
import net.nat.testmod.custom.item.ModCustomItemTest;

public class ModItem {
    // Create a register of type ITEM
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);

    // Adding Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Test_Tab)));
    public static final RegistryObject<Item> UNPOLISHED_RUBY = ITEMS.register("unpolished_ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Test_Tab2)));

    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item",
            () -> new ModCustomItemTest(new Item.Properties().tab(ModCreativeModeTab.Test_Tab2)));

    // Ruby Weapons / Tools
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new ModCustomSword(ModMaterials.RUBY, 3, -2.2f,
                    new Item.Properties().tab(ModCreativeModeTab.Test_Tab2)
                            .fireResistant()));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new ModCustomPickaxe(ModMaterials.RUBY, 0, -1f,
                    new Item.Properties().tab(ModCreativeModeTab.Test_Tab2)
                            .fireResistant()));
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new ModCustomAxe(ModMaterials.RUBY, 6, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.Test_Tab2)
                            .fireResistant()));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ModCustomShovel(ModMaterials.RUBY, 0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.Test_Tab2)
                            .fireResistant()));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new ModCustomHoe(ModMaterials.RUBY, -1, -1f,
                    new Item.Properties().tab(ModCreativeModeTab.Test_Tab2)
                            .fireResistant()));


    // Function to register an item
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
