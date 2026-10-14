# Covid-19 Daily Report

A skeleton of an Android app for viewing daily Covid-19 statistics.
Currently only the scaffolding is implemented: a splash screen with animation, a main activity with navigation
via Cicerone and a statistics screen (layout only, no data loading), all wired together
with Dagger 2 and Moxy.

## Features

- Splash screen with an animated icon and a transition to the main screen
- Navigation between screens via Cicerone
- Statistics screen: layout with a refresh indicator and menu buttons
  (data loading is not implemented yet)
- DI scaffolding on dagger-android: injection of the router and Rx schedulers into activities and fragments

## Tech stack

| Area           | Technologies                                      |
|----------------|---------------------------------------------------|
| Language       | Kotlin                                            |
| Architecture   | MVP (Moxy)                                        |
| Navigation     | Cicerone                                          |
| DI             | Dagger 2 (dagger-android, assisted inject)        |
| Concurrency    | RxJava 2, RxKotlin, RxAndroid                     |
| UI             | ViewBinding (viewbindingpropertydelegate), Material Components |

Retrofit, OkHttp and Room are also included in the dependencies, in preparation for future data loading
and caching.

## Project structure

```
app/src/main/java/com/tlenparty/covid19dailyreport/
├── App.kt              # DaggerApplication, component setup
├── base_logic/
│   ├── splash/         # splash screen
│   ├── main/           # MainActivity with the Cicerone navigator
│   ├── covid_fragment/ # statistics screen (MVP)
│   └── listeners/
├── di/                 # Dagger component, modules, base activity
└── helpers/            # Rx schedulers, Cicerone screens
```

## Build

Requires JDK 11–17 and Android SDK 31.

```bash
./gradlew assembleDebug
```

APK: `app/build/outputs/apk/debug/app-debug.apk`.
