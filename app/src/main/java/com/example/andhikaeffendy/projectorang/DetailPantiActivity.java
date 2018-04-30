package com.example.andhikaeffendy.projectorang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailPantiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_panti);

        Button btnDonasi = (Button) findViewById(R.id.btn_donasi_awal);
        btnDonasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailPantiActivity.this, DonasiActivity.class);
                startActivity(intent);
            }
        });
    }
}
