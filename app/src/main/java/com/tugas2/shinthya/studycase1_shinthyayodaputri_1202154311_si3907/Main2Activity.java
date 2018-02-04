package com.tugas2.shinthya.studycase1_shinthyayodaputri_1202154311_si3907;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        String LihatMenuMakanan = intent.getStringExtra("Menu");
        String LihatPorsiMakanan = intent.getStringExtra("Porsi");
        String NamaTempatMakan = intent.getStringExtra("Restaurant");
        String HargaMakanan = intent.getStringExtra("Harga");

        int harga_total = Integer.valueOf(LihatPorsiMakanan) * Integer.valueOf(HargaMakanan);

        TextView Menu = (TextView) findViewById(R.id.tampilkan_makanan);
        TextView Porsi = (TextView) findViewById(R.id.tampilkan_jumlah);
        TextView Tempat = (TextView) findViewById(R.id.tampilkan_restaurant);
        TextView Harga = (TextView) findViewById(R.id.tampilkan_harga);

        Menu.setText(LihatMenuMakanan);
        Porsi.setText(LihatPorsiMakanan);
        Tempat.setText(NamaTempatMakan);
        Harga.setText(String.valueOf(harga_total));

        if (harga_total > 65500) {
            Toast toast = Toast.makeText(this, "Change your restaurant, your money not enough", Toast.LENGTH_LONG);
            toast.show();
        } else {
            Toast toast = Toast.makeText(this, "your choise is right, your money is enough", Toast.LENGTH_LONG);
            toast.show();
        }
    }
}