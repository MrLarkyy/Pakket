plugins {
    id("org.gradle.toolchains.foojay-resolver") version "1.0.0"
}

toolchainManagement {
    jvm {
        javaRepositories {
            repository("foojay") {
                resolverClass = org.gradle.toolchains.foojay.FoojayToolchainResolver::class.java
            }
        }
    }
}

rootProject.name = "Pakket"
include("API")
include("NMS_1_21_4")
include("NMS_1_21_8")
include("NMS_1_21_9")
include("NMS_26_1_1")
