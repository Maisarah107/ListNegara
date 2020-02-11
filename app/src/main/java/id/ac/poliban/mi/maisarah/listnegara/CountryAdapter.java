package id.ac.poliban.mi.maisarah.listnegara;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class CountryAdapter extends BaseAdapter {
    //data berupa object list dari kelas POJO Country
    private List<Country> data = new ArrayList<>();

    public CountryAdapter(List<Country>data){
        //parameter konstruktor berupa data object List dari kelas Country
        this.data = data;
    }
    @Override
    public int getCount() {
        //kembalikan jumlah item dalam data
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        //mengembalikan object data pada posisi
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView img_flag;
        TextView tvCountryName;
        TextView tvCountryDesc;

        convertView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_country,parent,false);

        //deklarasikan View
        img_flag = convertView.findViewById(R.id.img_flag);
        tvCountryName = convertView.findViewById(R.id.tv_country_name);
        tvCountryDesc = convertView.findViewById(R.id.tv_country_description);

        //isi data
        Glide.with(parent.getContext())
                .load(data.get(position).getFlag())
                .apply(new RequestOptions().override(60, 60))
                .into(img_flag);
        tvCountryName.setText(data.get(position).getCountryName());
        tvCountryDesc.setText(data.get(position).getCountryDesc());

        return convertView;
    }
}
