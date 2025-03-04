package net.darkhax.ohmysherd.lib;

import net.darkhax.ohmysherd.OhMySherd;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

import java.util.HashMap;
import java.util.Map;

public class SherdEntry {

    public static final Map<String, SherdEntry> SHERDS = new HashMap<>();

    public final String type;
    public final ResourceKey sherdPattern;
    public final ResourceLocation itemId;
    public final Lazy<CustomSherdItem> item;

    public SherdEntry(String type) {

        this.type = type;
        this.sherdPattern = ResourceKey.create(Registries.DECORATED_POT_PATTERNS, OhMySherd.location(type + "_pottery_pattern"));
        this.itemId = OhMySherd.location(type + "_pottery_sherd");
        this.item = new Lazy(() -> new CustomSherdItem(this));
    }

    public static SherdEntry of (String type) {

        SherdEntry entry = new SherdEntry(type);
        SHERDS.put(type, entry);
        return entry;
    }
}
