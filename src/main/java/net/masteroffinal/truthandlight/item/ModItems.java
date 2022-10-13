package net.masteroffinal.truthandlight.item;

import net.masteroffinal.truthandlight.Truthandlight;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Truthandlight.MOD_ID);


    public static final RegistryObject<Item> CHROMIUM = ITEMS.register("chromium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TRUTHANDLIGHT)));

    public static void register (IEventBus eventBus){ITEMS.register(eventBus);}
}
