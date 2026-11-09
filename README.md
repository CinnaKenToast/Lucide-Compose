# Lucide Compose

Lucide Compose provides the Lucide icon set as Compose Multiplatform `ImageVector`
values. Icons are exposed as extensions on `Lucide`, for example `Lucide.Mail`.

## Installation

Add Maven Central to the repositories in your project's `settings.gradle.kts`:

```kotlin
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}
```

Add the library to the source set or module that uses it. For a Kotlin Multiplatform
project:

```kotlin
commonMain.dependencies {
    implementation("io.github.cinnakentoast:lucide-icons:0.1.1")
}
```

For an Android Compose project:

```kotlin
dependencies {
    implementation("io.github.cinnakentoast:lucide-icons:0.1.1")
}
```

The Maven Central coordinate will be usable after the first release is published.

## Usage

```kotlin
import androidx.compose.material3.Icon
import com.shipsco.lucide_compose.Lucide
import com.shipsco.lucide_compose.Mail

Icon(
    imageVector = Lucide.Mail,
    contentDescription = "Mail"
)
```

The icons are `ImageVector` values, so they work with Compose's standard `Icon`
composable and its sizing, tint, and accessibility parameters.

## Supported targets

The library publishes Android, iOS, JVM, JavaScript, and WebAssembly variants. Use
Compose Multiplatform on each target. Native SwiftUI code cannot directly consume
Compose `ImageVector` values.

## Lucide icon updates

The generated icon sources are updated from upstream Lucide releases by the
repository's GitHub Actions workflow. They currently track upstream
[Lucide 1.70.0](https://github.com/lucide-icons/lucide/releases/tag/1.70.0).
Avoid editing generated icon files by hand.

## Contributing

See [CONTRIBUTING.md](CONTRIBUTING.md) for development and pull request guidance.
Contributors are expected to follow the [Code of Conduct](CODE_OF_CONDUCT.md).

## License

Original project code is available under the [MIT License](LICENSE). Generated
Lucide icons retain their upstream license terms; see
[THIRD_PARTY_NOTICES.md](THIRD_PARTY_NOTICES.md).
