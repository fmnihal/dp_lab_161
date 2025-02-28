//SettingsWidgets   //Update
Location
TimeZone
PrayerTimeSettings

//ViewWidgets
CurrentTime
WaqtTimeTable
PrayerTimeTable
CurrentWaqt
NextPrayer

//Dependency
CurrentTime depends on Location
WaqtTimeTable depends on Location, TimeZone
PrayerTimeTable depends on PrayerTimeSettings
CurrentWaqt depends on CurrentTime, WaqtTimeTable
NextPrayer depends on CurrentTime, PrayerTimeTable

//Mediator -> Designed to decouple closely coupled objects
    Notify();

