package net.nat.testmod.custom.Tools;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;

public class ModCustomShovel extends ShovelItem {
    public ModCustomShovel(Tier tier, int attackDamage, float attackSpeed, Properties properties) {
        super(tier, attackDamage, attackSpeed, properties);
    }
}
