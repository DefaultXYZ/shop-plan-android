import com.github.benmanes.gradle.versions.updates.resolutionstrategy.ComponentSelectionWithCurrent
import java.util.Locale

fun ComponentSelectionWithCurrent.isLibraryVersionStable(): Boolean {
    val version = candidate.version
    val candidateVersion = version.toUpperCase(Locale.getDefault())
    val stableKeyword = listOf("RELEASE", "FINAL", "GA").any { candidateVersion.contains(it) }
    val regex = "^[0-9,.v-]+(-r)?$".toRegex()
    return stableKeyword || regex.matches(version)
}
