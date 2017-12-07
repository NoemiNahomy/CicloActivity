package tekhne.com.ciclodevida;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import modelo.Producto;

/**
 * Created by desarrollo on 02-12-17.
 */

public class ProductoItemAdapter extends BaseAdapter {

    public Context contexto;
    public List<Producto> listaProductos = new ArrayList<>();


    public ProductoItemAdapter(Context context, List<Producto> listaProductos){
        this.contexto = context;
        this.listaProductos = listaProductos;
    }


    @Override
    public int getCount() {
        return listaProductos.size();
    }

    @Override
    public Object getItem(int position) {
        return listaProductos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
         if (convertView== null){
             convertView = LayoutInflater.from(contexto).inflate(R.layout.producto_item,parent,false);

         }

        Producto producto = listaProductos.get(position);
        TextView txtCodigo = (TextView) convertView.findViewById(R.id.txt_codigo);
        TextView txtProducto = (TextView)convertView.findViewById(R.id.txt_producto);
        TextView txtMarca = (TextView)convertView.findViewById(R.id.txt_marca);
        TextView txtCategoria = (TextView)convertView.findViewById(R.id.txt_categoria);
        Button   btnPrecio = (Button) convertView.findViewById(R.id.btn_precio);
        Button   btnStock = (Button) convertView.findViewById(R.id.btn_stock);

        txtCodigo.setText(String.valueOf(producto.getId()));
        txtProducto.setText(producto.getNombre());
        txtMarca.setText(producto.getMarca());
        txtCategoria.setText(producto.getCategoria());
        btnPrecio.setText(String.valueOf(producto.getPrecio()));
        btnStock.setText(String.valueOf(producto.getStock()));

        btnStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(contexto,"click",Toast.LENGTH_SHORT).show();
            }
        });
        return convertView;
    }
}
