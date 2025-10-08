package dev.everrynn.compressit.item;

import dev.everrynn.compressit.CompressIt;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

/**
 * Custom creative tab replacement for Fabric's ItemGroup.
 */
public class ModItemGroups {

    public static final CreativeTabs COMPRESSIT_TAB = new CreativeTabs(CompressIt.MOD_ID) {
        /**
         * Newer mappings (or newer MC versions) require createIcon().
         * Marked @Override so the compiler sees the abstract method implemented.
         */
        @Override
        public ItemStack createIcon() {
            // Use your item if it's already initialized; otherwise fall back to a vanilla stick
            if (ModItems.TIED_STICKS != null) {
                return new ItemStack(ModItems.TIED_STICKS);
            } else {
                return new ItemStack(Items.STICK);
            }
        }

        /**
         * Older mappings expect getTabIconItem(). Provide it for compatibility.
         * Don't annotate with @Override here to avoid an accidental compile error
         * in mappings where this method does not exist.
         */
        public ItemStack getTabIconItem() {
            return createIcon();
        }
    };
}
