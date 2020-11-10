package info.mschmitt.android.proguard.app;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Field;
import java.time.temporal.ChronoUnit;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView errorsView = findViewById(R.id.errorsView);
        Class<RegularEnum> regularEnumClass = RegularEnum.class;
        Class<ChronoUnit> chronoUnitClass = ChronoUnit.class;
        if (BuildConfig.EXCLUDE_ENUMS_WORK_AROUND) {
            KeepChronoUnit.referenceBrokenExcludes();
        }
        try {
            Field constant = regularEnumClass.getField("CONSTANT");
            Field nanos = chronoUnitClass.getField("NANOS");
        } catch (NoSuchFieldException e) {
            errorsView.setText(e.getMessage());
        }
    }
}