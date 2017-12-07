package tekhne.com.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import modelo.Producto;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    public ListView listaProductos;
    private Button btnAgregar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle datos = getIntent().getExtras();
        if(datos!=null){
            Log.d("da" +
                    "tos", datos.getString("name"));
        }
        listaProductos = (ListView)findViewById(R.id.lista_usuarios);
        btnAgregar = (Button)findViewById(R.id.btn_agregar);



     //   ArrayList<String> arrayUsuarios = new ArrayList<>();
     //   arrayUsuarios.add("Pepito");
      //  arrayUsuarios.add("Carlitos");

      //  ItemAdapter adapter = new ItemAdapter(this,android.R.layout.simple_list_item_1,arrayUsuarios);

         final List<Producto> listProductos = new ArrayList<>();
         listProductos.add( new Producto(1,"Huari", "CBN","Cerveza",20.0,true,5));
         ProductoItemAdapter adapter = new ProductoItemAdapter(this,listProductos);
        this.listaProductos.setAdapter(adapter);

        this.listaProductos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Main2Activity.this, "Item" + position, Toast.LENGTH_SHORT ).show();
            }
        });

        btnAgregar.setOnClickListener(this);

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Actividad 2 ON PAUSE", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View v) {
      switch (v.getId()){
          case R.id.btn_agregar:
              //listProductos.add( new Producto(1,"Huari", "CBN","Cerveza",20.0,true,5));
              //adapter.notifyDataSetChanged();
              Log.d("click","botton");
              break;
      }
    }
}
