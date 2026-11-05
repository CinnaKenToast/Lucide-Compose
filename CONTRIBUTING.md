# Contributing

Thanks for your interest in improving Lucide Compose.

Participation in this project is covered by the [Code of Conduct](CODE_OF_CONDUCT.md).

## Report a problem or suggest a change

Open a GitHub issue with the affected platform, the steps to reproduce the problem,
and the result you expected. For icon rendering problems, include the icon name and
the Compose target where it occurs.

## Make a change

1. Fork the repository and create a topic branch from `main`.
2. Keep changes focused and follow the existing Kotlin formatting.
3. Do not hand-edit generated icon files. Changes to icon generation belong in the
   update workflow or its scripts.
4. Run the checks relevant to your change before opening a pull request.
5. Open a pull request describing the change and the checks you ran.

## Build and checks

Build the icon library for its configured targets:

```sh
./gradlew :icons:build
```

When changing shared application integration, also run the relevant shared tests
and build the Android app:

```sh
./gradlew :shared:testAndroidHostTest
./gradlew :shared:jvmTest
./gradlew :shared:jsTest
./gradlew :shared:wasmJsTest
./gradlew :shared:iosSimulatorArm64Test
./gradlew :androidApp:assembleDebug
```

## Pull request guidance

- Explain what changed and why.
- Link related issues.
- Include test or build results.
- Mention platform behavior that needs a manual check.
