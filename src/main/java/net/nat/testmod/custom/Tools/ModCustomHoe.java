package net.nat.testmod.custom.Tools;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Tier;

public class ModCustomHoe extends HoeItem {
    public ModCustomHoe(Tier tier, int attackDamage, float attackSpeed, Properties properties) {
        super(tier, attackDamage, attackSpeed, properties);
    }
}
