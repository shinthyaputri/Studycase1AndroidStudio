package com.tugas2.shinthya.studycase1_shinthyayodaputri_1202154311_si3907;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    private EditText Inputmenu;
    private EditText Inputjumlah;


    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Inputmenu = (EditText) findViewById(R.id.masukan_menu);
        Inputjumlah = (EditText) findViewById(R.id.masukan_jumlah);
    }

    public void LaunchEatbus (View view){
        Intent intent = new Intent(this,Main2Activity.class);

        String MasukanMenu = Inputmenu.getText().toString();
        String MasukanJumlah = Inputjumlah.getText().toString();

        intent.putExtra("Menu",MasukanMenu);
        intent.putExtra("Harga","50000");
        intent.putExtra("Porsi",MasukanJumlah);
        intent.putExtra("Restaurant", "Eatbus");

        startActivity(intent);

    }
    public void LaunchAbnormal (View view){
        Intent intent = new Intent(this,Main2Activity.class);

        String MasukanMenu = Inputmenu.getText().toString();
        String MasukanJumlah = Inputjumlah.getText().toString();

        intent.putExtra("Menu",MasukanMenu);
        intent.putExtra("Porsi",MasukanJumlah);
        intent.putExtra("Harga", "30000");
        intent.putExtra("Tempat","Abnormal");

        startActivity(intent);


    }
}
