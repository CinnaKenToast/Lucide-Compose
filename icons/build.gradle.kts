import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidMultiplatformLibrary)
    alias(libs.plugins.mavenPublish)
}

group = "io.github.cinnakentoast"
version = "0.1.0"

kotlin {
     listOf(
        iosArm64(),
        iosSimulatorArm64(),
    )

    jvm {
        compilerOptions {
            jvmTarget = JvmTarget.JVM_11
        }
    }

    js {
        browser()
    }

    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        browser()
    }

    android {
        namespace = "com.shipsco.lucide_compose.icons"
        compileSdk = libs.versions.android.compileSdk.get().toInt()
        minSdk = libs.versions.android.minSdk.get().toInt()
    }

    sourceSets {
        commonMain.dependencies {
            api(libs.compose.ui)
        }
    }
}

mavenPublishing {
    coordinates(group.toString(), "lucide-icons", version.toString())

    publishToMavenCentral()
    signAllPublications()

    pom {
        name.set("Lucide Compose")
        description.set("Lucide icons as Compose Multiplatform ImageVector values.")
        url.set("https://github.com/CinnaKenToast/Lucide-Compose")

        licenses {
            license {
                name.set("MIT License")
                url.set("https://opensource.org/license/mit")
                distribution.set("repo")
            }
            license {
                name.set("ISC License")
                url.set("https://opensource.org/license/isc")
                distribution.set("repo")
            }
        }

        developers {
            developer {
                id.set("cinnakentoast")
                name.set("CinnaKenToast")
                email.set("kennethashipley@gmail.com")
                organization.set("CinnaKenToast")
                organizationUrl.set("https://github.com/CinnaKenToast")
                url.set("https://github.com/CinnaKenToast")
            }
        }

        scm {
            url.set("https://github.com/CinnaKenToast/Lucide-Compose")
            connection.set("scm:git:git://github.com/CinnaKenToast/Lucide-Compose.git")
            developerConnection.set("scm:git:ssh://git@github.com/CinnaKenToast/Lucide-Compose.git")
        }
    }
}
