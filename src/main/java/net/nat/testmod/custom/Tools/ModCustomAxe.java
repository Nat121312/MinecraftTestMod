package net.nat.testmod.custom.Tools;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

public class ModCustomAxe extends AxeItem {
    public ModCustomAxe(Tier tier, int attackDamage, float attackSpeed, Properties properties) {
        super(tier, attackDamage, attackSpeed, properties);
    }
}
