package com.breakinblocks.simplyshields;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SimplyShields.MODID);

    public static final DeferredItem<Item> DIAMOND_SHIELD = ITEMS.register("diamond_shield",
            () -> new ShieldBase(new Item.Properties()
                    .stacksTo(1)
                    .durability(500)
            ));

    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}
