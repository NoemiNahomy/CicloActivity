package tekhne.com.ciclodevida;

import android.content.Intent;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 private LinearLayout fondo;
    private Button siguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fondo = (LinearLayout)findViewById(R.id.fondo);
        siguiente = (Button)findViewById(R.id.btn_siguiente);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =  new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra("name", "carlos");
                startActivity(i);
            }
        });


        int colorFondo = ContextCompat.getColor(this, R.color.colorPrimaryDark);
        fondo.setBackgroundColor(colorFondo);

        Toast.makeText(this,"ON CREATE", Toast.LENGTH_LONG).show();

        SystemClock.sleep(7000);
          if(savedInstanceState!=null){
                savedInstanceState = new Bundle();
              savedInstanceState.putString("nombre", "pepito");
              Log.d("BUNDLE","estamos escribiendo");
          }  else{
              Log.d("BUNDLE","null");
          }

      //  super.onSaveInstanceState(outState, outPersis
    }

    @Override
    protected void onPause() {
        super.onPause();
        int colorFondo = ContextCompat.getColor(this, R.color.colorLime);
        fondo.setBackgroundColor(colorFondo);
        Toast.makeText(this,"ON PAUSE", Toast.LENGTH_LONG).show();
        SystemClock.sleep(1000);
    }

    @Override
    protected void onResume() {
        super.onResume();
        int colorFondo = ContextCompat.getColor(this, R.color.colorBlue);
        fondo.setBackgroundColor(colorFondo);
        Toast.makeText(this,"ON RESUME", Toast.LENGTH_LONG).show();
        SystemClock.sleep(1000);
    }

    @Override
    protected void onStop() {
        super.onStop();
        int colorFondo = ContextCompat.getColor(this, R.color.colorAccent);
        fondo.setBackgroundColor(colorFondo);
        Toast.makeText(this,"ON STOP", Toast.LENGTH_LONG).show();
        SystemClock.sleep(1000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        int colorFondo = ContextCompat.getColor(this, R.color.colorAmber);
        fondo.setBackgroundColor(colorFondo);
        Toast.makeText(this,"ON DESTROY", Toast.LENGTH_LONG).show();
        SystemClock.sleep(1000);
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("SAVE", "guardamos datos");
        outState.putString("name","pepito");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        int colorFondo = ContextCompat.getColor(this, R.color.colorBlue);
        fondo.setBackgroundColor(colorFondo);
        Toast.makeText(this,"ON RESTORE INSTANCE", Toast.LENGTH_LONG).show();
    //    SystemClock.sleep(1000);
        if(savedInstanceState!=null){
            Log.d("BUNDLE",savedInstanceState.get("nombre").toString());
        }else{
            Log.d("BUNDLE","No hay datos");
        }

    }
}
