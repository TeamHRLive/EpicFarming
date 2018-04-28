package com.songoda.epicfarming.player;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.bukkit.entity.Player;

public class PlayerActionManager {

    private final Map<UUID, PlayerData> registeredPlayers = new HashMap<>();

    public PlayerData getPlayerAction(Player player) {
        return (player != null) ? registeredPlayers.computeIfAbsent(player.getUniqueId(), p -> new PlayerData(player.getUniqueId())) : null;
    }

    public Collection<PlayerData> getRegisteredPlayers() {
        return Collections.unmodifiableCollection(registeredPlayers.values());
    }
}