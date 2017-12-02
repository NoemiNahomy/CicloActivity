package tekhne.com.ciclodevida;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by desarrollo on 30-11-17.
 */

public class ItemAdapter extends ArrayAdapter<String> {
    public Context  context;
    public List<String> arrayUsuarios = new ArrayList<>();

    public ItemAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<String> objects) {
        super(context, resource, objects);
        Log.d("Item","creando los items");
        this.context = context;
        this.arrayUsuarios = objects;
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public int getPosition(@Nullable String item) {
        return super.getPosition(item);
    }
}
