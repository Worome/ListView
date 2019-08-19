package com.trianacodes.script.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private ListView lv1;

    private String nombres[]={"Samuel", "Valentina", "Santiago", "Alejandro", "Valeria", "Benjamín",
            "Gerardo", "Carlos", "David", "Sofía"};
    private String edades [] = {"18", "25", "32", "17", "24", "20", "27", "15", "19", "23"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        lv1 = findViewById(R.id.lv1);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, R.layout.list_item_personalizado, nombres);
        lv1.setAdapter(adaptador);
        //Llamo al método setOnItemClickListener para saber qué item se ha seleccionado.
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv1.setText("La edad de " + lv1.getItemAtPosition(i)+ " es " + edades[i] + " años.");
            }
        });


    }
}
