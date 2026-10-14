# Covid-19 Daily Report

Заготовка Android-приложения для просмотра ежедневной статистики по Covid-19.
Сейчас реализован каркас: сплэш-экран с анимацией, главная активити с навигацией
через Cicerone и экран статистики (вёрстка без загрузки данных), всё связано
через Dagger 2 и Moxy.

## Возможности

- Сплэш-экран с анимированной иконкой и переходом на главный экран
- Навигация между экранами через Cicerone
- Экран статистики: вёрстка с индикатором обновления и кнопками меню
  (загрузка данных пока не реализована)
- DI-каркас на dagger-android: внедрение роутера и планировщиков Rx в активити и фрагменты

## Стек

| Область        | Технологии                                        |
|----------------|---------------------------------------------------|
| Язык           | Kotlin                                            |
| Архитектура    | MVP (Moxy)                                        |
| Навигация      | Cicerone                                          |
| DI             | Dagger 2 (dagger-android, assisted inject)        |
| Асинхронность  | RxJava 2, RxKotlin, RxAndroid                     |
| UI             | ViewBinding (viewbindingpropertydelegate), Material Components |

В зависимостях также подключены Retrofit, OkHttp и Room — под будущую загрузку
и кеширование данных.

## Структура

```
app/src/main/java/com/tlenparty/covid19dailyreport/
├── App.kt              # DaggerApplication, сборка компонента
├── base_logic/
│   ├── splash/         # сплэш-экран
│   ├── main/           # MainActivity с навигатором Cicerone
│   ├── covid_fragment/ # экран статистики (MVP)
│   └── listeners/
├── di/                 # Dagger-компонент, модули, базовая активити
└── helpers/            # планировщики Rx, экраны Cicerone
```

## Сборка

Требуется JDK 11–17 и Android SDK 31.

```bash
./gradlew assembleDebug
```

APK: `app/build/outputs/apk/debug/app-debug.apk`.
