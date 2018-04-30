package com.example.andhikaeffendy.projectorang;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class DaftarPantiActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listView = (ListView) findViewById(R.id.list_daftar_panti);
        DaftarPantiAdapter adapter = new DaftarPantiAdapter(this, DummyData());
        setListAdapter(adapter);
        //getActionBar().show();
    }

    private List<DaftarPanti> DummyData() {
        ArrayList<DaftarPanti> data = new ArrayList<>();
        data.add(new DaftarPanti("Panti Asuhan Anak Nugraha","Jl.Padasuka No.88, Pasirlayung",R.drawable.icon_zakat));
        data.add(new DaftarPanti("Panti Sakinah","Cilengkrang 2 3 no 286 rt 06/03 kelurahan",R.drawable.icon_panti));
        data.add(new DaftarPanti("Panti Asuhan Multazam","Jl.Padasuka No.88, Pasirlayung",R.drawable.icon_donatur));
        data.add(new DaftarPanti("Panti Asuhan Anak Al-Hayat","Jl.Cibatu Raua no.23, Antapani Tengah",R.drawable.icon_infaq));
        data.add(new DaftarPanti("Panti Yatim Piatu Al-Fien","Gg. Sarimanah XIII No.2, Sarijadi, Sukasari",R.drawable.icon_wakaf));

        return data;
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Toast.makeText(this, " selected", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(DaftarPantiActivity.this, DetailPantiActivity.class);
        startActivity(intent);
    }
}
