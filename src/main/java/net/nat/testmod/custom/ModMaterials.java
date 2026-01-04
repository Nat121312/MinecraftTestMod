package net.nat.testmod.custom;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class ModMaterials {
    public static final Tier RUBY = new Tier() {
        @Override
        public int getUses() {
            return 2500;
        }

        @Override
        public float getSpeed() {
            return 0;
        }

        @Override
        public float getAttackDamageBonus() {
            return 2;
        }

        @Override
        public int getLevel() {
            return 2;
        }

        @Override
        public int getEnchantmentValue() {
            return 40;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return null;
        }
    };
}
