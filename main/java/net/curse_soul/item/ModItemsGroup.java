package net.curse_soul.item;

import net.curse_soul.CursedSoul;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemsGroup {
    public static final ItemGroup ITEM_GROUP= Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(CursedSoul.MOD_ID, "test"),
            FabricItemGroup.builder()
                    .displayName(Text.literal("Cursed Soul")) //Cho cais ten thoi
                    .icon(() -> new ItemStack(Items.WITHER_SKELETON_SKULL)) //Icon :vvv
                    .entries((displayContext, entries) -> {
                        entries.add(Items.WITHER_SKELETON_SKULL);
                    })
                    .build()
    );

    public static void registerItemGroup() {

    }
}

