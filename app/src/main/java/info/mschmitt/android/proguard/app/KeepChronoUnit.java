package info.mschmitt.android.proguard.app;

import java.time.temporal.ChronoUnit;

/**
 * @author Matthias Schmitt
 */
public class KeepChronoUnit {
    public static void referenceBrokenExcludes() {
        ChronoUnit.NANOS.ordinal();
        ChronoUnit.MICROS.ordinal();
        ChronoUnit.MILLIS.ordinal();
        ChronoUnit.SECONDS.ordinal();
        ChronoUnit.MINUTES.ordinal();
        ChronoUnit.HOURS.ordinal();
        ChronoUnit.HALF_DAYS.ordinal();
        ChronoUnit.DAYS.ordinal();
        ChronoUnit.WEEKS.ordinal();
        ChronoUnit.MONTHS.ordinal();
        ChronoUnit.YEARS.ordinal();
        ChronoUnit.DECADES.ordinal();
        ChronoUnit.CENTURIES.ordinal();
        ChronoUnit.MILLENNIA.ordinal();
        ChronoUnit.ERAS.ordinal();
        ChronoUnit.FOREVER.ordinal();
    }
}
