
# 📱 KMM Cross-Platform App

A **Kotlin Multiplatform Mobile (KMM)** application with shared business logic and UI across **Android and iOS**. Built using modern tools and patterns like **MVVM**, **Clean Architecture**, **Ktor**, **Koin**, and **Jetpack Compose Multiplatform**, this app is scalable, testable, and production-ready.

---

## ✨ Highlights

- 🌐 Shared UI with **Compose Multiplatform**
- 📦 Shared business logic using **KMM**
- 🧱 Clean Architecture layered structure
- 🔄 API integration with **Ktor**
- ⚙️ Dependency Injection via **Koin**
- ⚡ Async programming using **Coroutines**
- 🧪 Ready for unit testing

---

## 🧰 Tech Stack

| Layer             | Tech Used                         |
|------------------|------------------------------------|
| Language          | Kotlin (Multiplatform)            |
| UI                | Jetpack Compose Multiplatform     |
| Architecture      | MVVM + Clean Architecture         |
| Networking        | Ktor                              |
| Dependency Injection | Koin                          |
| State Handling    | StateFlow / LiveData              |
| Async             | Kotlin Coroutines                 |
| iOS UI Bridge     | SwiftUI                           |

---

## 📂 Project Structure Overview

```
📁 shared/
├── data/           → API services, DTOs, Repository impl
├── domain/         → UseCases, Models, Interfaces
├── presentation/   → Shared Compose UI, ViewModels
├── di/             → Koin modules
└── utils/          → Common helpers & constants

📁 androidApp/       → Android-specific code
📁 iosApp/           → iOS-specific code (SwiftUI)
```

---

## 🔄 Data Flow

1. UI triggers ViewModel action  
2. ViewModel calls UseCase (from domain layer)  
3. UseCase interacts with Repository  
4. Repository fetches data from Ktor API  
5. Result flows back → ViewModel → UI  

---

## ⚙️ Requirements

- ✅ Android Studio Giraffe or newer  
- ✅ Xcode 14+ (for iOS build)  
- ✅ Kotlin 1.9+  
- ✅ Compose Multiplatform plugin  
- ✅ Cocoapods (installed for iOS support)  

---

## 🚀 Getting Started

1. **Clone the repo:**
   ```
   git clone https://github.com/your-username/KMM-CrossPlatform-App.git
   ```

2. **Open in Android Studio** for Android development  
3. **Navigate to iosApp/** and run `pod install`  
4. **Open in Xcode** for iOS simulator testing  

---

## ✅ TODO

- [x] Compose UI in shared module  
- [x] Ktor API integration  
- [x] Koin DI setup  
- [x] Shared ViewModel structure  
- [ ] Add local database (e.g., SQLDelight)  
- [ ] Add unit tests (Kotlin Test or MockK)  

---

## 📃 License

Licensed under the [MIT License](LICENSE).  
Feel free to use, modify, and contribute to the project.
