package tekhne.com.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Actividad 2 ON PAUSE", Toast.LENGTH_SHORT).show();
    }


}
