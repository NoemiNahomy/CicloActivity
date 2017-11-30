package tekhne.com.ciclodevida;

import android.os.PersistableBundle;
import android.os.SystemClock;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 private LinearLayout fondo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fondo = (LinearLayout)findViewById(R.id.fondo);
        int colorFondo = ContextCompat.getColor(this, R.color.colorPrimaryDark);
        fondo.setBackgroundColor(colorFondo);
        Toast.makeText(this,"ON CREATE", Toast.LENGTH_LONG).show();
        SystemClock.sleep(7000);

    }

    @Override
    protected void onPause() {
        super.onPause();
        int colorFondo = ContextCompat.getColor(this, R.color.colorLime);
        fondo.setBackgroundColor(colorFondo);
        Toast.makeText(this,"ON PAUSE", Toast.LENGTH_LONG).show();
        SystemClock.sleep(7000);
    }

    @Override
    protected void onResume() {
        super.onResume();
        int colorFondo = ContextCompat.getColor(this, R.color.colorBlue);
        fondo.setBackgroundColor(colorFondo);
        Toast.makeText(this,"ON RESUME", Toast.LENGTH_LONG).show();
        SystemClock.sleep(7000);
    }

    @Override
    protected void onStop() {
        super.onStop();
        int colorFondo = ContextCompat.getColor(this, R.color.colorAccent);
        fondo.setBackgroundColor(colorFondo);
        Toast.makeText(this,"ON STOP", Toast.LENGTH_LONG).show();
        SystemClock.sleep(7000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        int colorFondo = ContextCompat.getColor(this, R.color.colorAmber);
        fondo.setBackgroundColor(colorFondo);
        Toast.makeText(this,"ON DESTROY", Toast.LENGTH_LONG).show();
        SystemClock.sleep(7000);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        int colorFondo = ContextCompat.getColor(this, R.color.colorBlue);
        fondo.setBackgroundColor(colorFondo);
        Toast.makeText(this,"ON RESTORE INSTANCE", Toast.LENGTH_LONG).show();
        SystemClock.sleep(7000);
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);

        int colorFondo = ContextCompat.getColor(this, R.color.colorBlue);
        fondo.setBackgroundColor(colorFondo);
        Toast.makeText(this,"ON SAVE INSTANCE", Toast.LENGTH_LONG).show();
        SystemClock.sleep(7000);
    }
}
