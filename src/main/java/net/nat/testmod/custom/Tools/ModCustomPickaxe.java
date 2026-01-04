package net.nat.testmod.custom.Tools;

import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

public class ModCustomPickaxe extends PickaxeItem {
    public ModCustomPickaxe(Tier tier, int attackDamage, float attackSpeed, Properties properties) {
        super(tier, attackDamage, attackSpeed, properties);
    }
}
