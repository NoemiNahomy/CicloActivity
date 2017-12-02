package tekhne.com.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    private ListView listaUsuarios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle datos = getIntent().getExtras();
        if(datos!=null){
            Log.d("da" +
                    "tos", datos.getString("name"));
        }
        listaUsuarios = (ListView)findViewById(R.id.lista_usuarios);
        ArrayList<String> arrayUsuarios = new ArrayList<>();
        arrayUsuarios.add("Pepito");
        arrayUsuarios.add("Carlitos");

        ItemAdapter adapter = new ItemAdapter(this,android.R.layout.simple_list_item_1,arrayUsuarios);

        listaUsuarios.setAdapter(adapter);


        listaUsuarios.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Main2Activity.this, "Item" + position, Toast.LENGTH_SHORT ).show();
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Actividad 2 ON PAUSE", Toast.LENGTH_SHORT).show();
    }


}
