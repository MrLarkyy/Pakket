package gg.aquatic.pakket.api

import org.bukkit.Bukkit

enum class NMSVersion {

    V_1_21_1,
    V_1_21_4,
    V_1_21_5,
    V_1_21_7,
    V_1_21_9,
    V_26_1_1;

    companion object {
        fun ofAquatic(): NMSVersion? {
            val version = Bukkit.getServer().bukkitVersion.substringBefore("-")
            val semver = version.split(".")
            val major = semver[0].toInt()
            val minor = semver[1].toInt()
            val patch = semver.getOrNull(2)?.toIntOrNull()

            val versionToParse = "$major.$minor" + (patch?.let { ".$patch" } ?: "")

            return when(versionToParse) {
                "1.21.1" -> V_1_21_1
                "1.21.4" -> V_1_21_4
                "1.21.5" -> V_1_21_5
                "1.21.6", "1.21.7", "1.21.8" -> V_1_21_7
                "1.21.9", "1.21.10", "1.21.11" -> V_1_21_9
                "26.1", "26.1.0", "26.1.1", "26.1.2" -> V_26_1_1
                else -> null
            }
        }
    }
}
