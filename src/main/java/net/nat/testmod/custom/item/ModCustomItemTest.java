package net.nat.testmod.custom.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;

public class ModCustomItemTest extends Item {
    public ModCustomItemTest(Properties properties) {
        super(properties);

        properties.rarity(Rarity.UNCOMMON);
        properties.fireResistant();
        properties.stacksTo(0);
        properties.durability(50);
    }


    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(!level.isClientSide() && InteractionHand.MAIN_HAND == hand) {
            OutputMessage(player, "Using the False Ruby Sword...");
            player.getCooldowns().addCooldown(this, 60);
        }


        return super.use(level, player, hand);
    }

    private void OutputMessage(Player player, String text) {
        player.sendSystemMessage(Component.literal(text));
    }
}
