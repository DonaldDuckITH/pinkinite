package net.donaldduckith.setup;

import net.donaldduckith.items.Items;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import static net.donaldduckith.pinkinite.PinkiniteMod.MODID;

public class Registration {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static void init() {
        ITEMS.register();
    }

    public static final RegistryObject<Item> Items = ITEMS.register("pinkinite_crystal", () -> new Items(new Item.Properties()));
}
