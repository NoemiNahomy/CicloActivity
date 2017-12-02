package tekhne.com.ciclodevida;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

import modelo.Producto;

/**
 * Created by desarrollo on 02-12-17.
 */

public class ProductoItemAdapter extends BaseAdapter {

    private Context contexto;
    private List<Producto> listaProductos = new ArrayList<>();


    private ProductoItemAdapter(Context context, List<Producto> listaProductos){
        this.contexto = context;
        this.listaProductos = listaProductos;
    }


    @Override
    public int getCount() {
        return listaProductos.size();
    }

    @Override
    public Object getItem(int position) {
        return listaProductos(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
