# ListViewBenni

ListViewBenni is a small historical Android learning exercise from 2021. It demonstrates how to populate a `ListView` with text values and respond to item clicks by opening another activity.

## What it demonstrates

- A hard-coded Java `String[]` supplies four values: Android, iPhone, Windows Mobile, and BlackBerry.
- A built-in `ArrayAdapter<String>` connects that array to the `ListView`.
- `activity_listview.xml` is the row layout: one full-width, wrapping `TextView` with padding and bold text.
- Tapping a row opens a corresponding detail activity.
- Each detail screen can return to the list and can replace its displayed text through a button click.

The opening **Login** button only navigates to the list; the project does not implement authentication.

## Technologies

- Java
- Android SDK (`minSdk 21`, `targetSdk 31`, `compileSdk 31`)
- AndroidX AppCompat and ConstraintLayout
- Gradle 7.0.2 with Android Gradle Plugin 7.0.1

The project also declares Firebase In-App Messaging, but the application code does not use it. The included unit and instrumentation tests are the default generated examples rather than tests of the ListView behavior.

## Build and run

This project uses its checked-in Gradle wrapper. Open it in a compatible Android Studio/JDK environment with Android SDK 31 installed, or run:

```bash
./gradlew assembleDebug
```

On Windows Command Prompt, use `gradlew.bat assembleDebug` instead. Validation on JDK 26 reached the Gradle 7.0.2 wrapper but failed while compiling `settings.gradle` with `Unsupported class file major version 70`. Use a JDK compatible with this legacy 2021 toolchain. The project has intentionally not been upgraded as part of this documentation audit.

## Status and learning outcome

This repository is a **historical learning exercise**, not a production application. Its useful outcome is a compact example of supplying static data to a standard Android `ListView`, defining a simple item layout, attaching an `OnItemClickListener`, and navigating between activities with intents.

The implementation is complete enough to illustrate that flow, but it retains exercise-level limitations: static data, repeated position-based click handling, detail classes named as models, no meaningful automated tests, and no real login behavior.

## License

All rights reserved. No license for reuse or redistribution has been granted.

The repository contains tutorial-style sample code without a documented provenance or relicensing permission record, so no open-source license is asserted here.