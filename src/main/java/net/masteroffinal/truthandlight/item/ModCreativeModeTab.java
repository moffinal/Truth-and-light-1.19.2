package net.masteroffinal.truthandlight.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public  static final CreativeModeTab TRUTHANDLIGHT = new CreativeModeTab("tal_items") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CHROMIUM.get());
        }
    };
}
