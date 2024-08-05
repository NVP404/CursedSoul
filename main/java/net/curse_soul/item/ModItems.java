package net.curse_soul.item;

import net.curse_soul.CursedSoul;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

//    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
//        entries.add(Ruby);
//        entries.add(Tuan);
//    } //add vao ingredients

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(CursedSoul.MOD_ID, name), item);
    }
    public static void registerModItems() {
//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.add(THINH_TRIDENT));
    }
}

