Kotlin Multiplatform Clean Architecture App
A cross-platform Kotlin Multiplatform project built with a single codebase for Android and iOS. It leverages shared UI using Jetpack Compose Multiplatform and follows the MVVM pattern with Clean Architecture principles.

Features
Shared UI with Jetpack Compose Multiplatform

MVVM architecture with a clear separation of concerns

Dependency Injection using Koin

Networking powered by Ktor

Shared domain, data, and presentation logic between platforms

SwiftUI interoperability on iOS

Architecture Overview
This project uses a modular Clean Architecture structure:

UI Layer: Built with Compose Multiplatform and hosted in the shared module.

Presentation Layer: Contains ViewModels and UI-related logic, shared across platforms.

Domain Layer: Holds use cases and business rules.

Data Layer: Responsible for fetching data via repositories and remote sources.

DI Layer: Manages dependency injection setup using Koin.

Project Modules
shared: Contains all multiplatform logic including UI, domain, presentation, data, and DI.

androidApp: Android-specific entry point and platform code.

iosApp: iOS-specific SwiftUI app integrated with shared logic.

Requirements
Android Studio Giraffe or newer

Xcode 15 or newer

Kotlin Multiplatform Plugin enabled

Running the App
Android: Open the project in Android Studio and run the androidApp module.

iOS: Open the iOS app workspace in Xcode, build, and run on a simulator or device.

Shared UI
All UI components are written once using Compose Multiplatform and reused across Android and iOS, reducing duplication and ensuring design consistency.

Contribution
Issues, feature requests, and pull requests are welcome. If you’d like to contribute, feel free to fork the repository and open a PR.

License
This project is licensed under the MIT License.
