package net.nat.testmod.custom;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.nat.testmod.TestMod;
import net.nat.testmod.item.ModItem;

import java.util.List;

public class ModMaterials {
    public static Tier RUBY;

    static {
        RUBY = TierSortingRegistry.registerTier(
                new ForgeTier(2, 1000,9f,2,30,
                        null, ()-> Ingredient.of(ModItem.RUBY.get())),
                new ResourceLocation(TestMod.MODID, "ruby"), List.of(Tiers.IRON), List.of());
    }
}
