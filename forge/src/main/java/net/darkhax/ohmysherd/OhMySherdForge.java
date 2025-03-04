package net.darkhax.ohmysherd;

import net.minecraft.core.registries.Registries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegisterEvent;

@Mod(OhMySherd.MOD_ID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OhMySherdForge {

    @SubscribeEvent
    public static void registerItems(RegisterEvent event) {

        event.register(Registries.ITEM, helper -> OhMySherd.registerItems((id, item) -> helper.register(id, item)));
    }
}