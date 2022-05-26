package com.nthbyte.velocityplayground;

import com.velocitypowered.api.event.PostOrder;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.player.PlayerChatEvent;
import net.kyori.adventure.text.Component;

public class PluginListener {

    // normal is the default value.
    @Subscribe(order = PostOrder.NORMAL)
    public void onPlayerChat(PlayerChatEvent event){
        event.getPlayer().sendMessage(Component.text("I am sending a message to you!"));
    }

}
