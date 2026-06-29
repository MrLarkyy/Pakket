package gg.aquatic.pakket.api.event.packet

import gg.aquatic.pakket.api.event.PacketEvent
import org.bukkit.entity.Player

data class PacketContainerCloseEvent(
    val player: Player,
    val containerId: Int = -1,
): PacketEvent()
