package net.nat.testmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab Test_Tab = new CreativeModeTab("test_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItem.RUBY.get());
        }
    };

    public static final CreativeModeTab Test_Tab2 = new CreativeModeTab("test_tab2") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItem.UNPOLISHED_RUBY.get());
        }
    };
}
