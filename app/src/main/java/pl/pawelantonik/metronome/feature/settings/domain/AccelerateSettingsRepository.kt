package pl.pawelantonik.metronome.feature.settings.domain

import kotlinx.coroutines.flow.Flow

interface AccelerateSettingsRepository {
  fun get(): AccelerateSettings?
  fun observe(): Flow<AccelerateSettings?>
  fun save(accelerateSettings: AccelerateSettings?)
}

data class AccelerateSettings(
  val bpmAcceleration: Int,
  val barsCount: Int,
) {
  override fun toString(): String {
    return "$bpmAcceleration -> $barsCount"
  }
}
