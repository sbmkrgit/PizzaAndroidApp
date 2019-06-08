package com.example.pizza_android_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView list;
    Spinner spinner;

    String data[]={"Margherita","Marinara","Family Pack","Combo","Cold Drinks"};
    String data2[]={"Thumbs Up","Coca Cola","Maza","Mrinda"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=(ListView)findViewById(R.id.listview);
        spinner=(Spinner)findViewById(R.id.spinner);

        ArrayAdapter adapter=new ArrayAdapter(MainActivity.this, android.R.layout.simple_expandable_list_item_1,data);
        list.setAdapter(adapter);

        ArrayAdapter adapter2=new ArrayAdapter(MainActivity.this, android.R.layout.simple_expandable_list_item_1,data2);
        spinner.setAdapter(adapter2);



        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {

                switch (position)
                {
                    case 0:
                        Toast.makeText(MainActivity.this, "Veg Rs 100", Toast.LENGTH_SHORT).show();
                        break;

                    case 1:
                        Toast.makeText(MainActivity.this, "Non Veg Rs 120", Toast.LENGTH_SHORT).show();
                        break;

                    case 2:
                        Toast.makeText(MainActivity.this, "Veg Rs 500", Toast.LENGTH_SHORT).show();
                        break;

                    case 3:
                        Toast.makeText(MainActivity.this, "NonVeg Rs 300 ", Toast.LENGTH_SHORT).show();
                        break;

                    case 4:
                        Toast.makeText(MainActivity.this, "Rs 50", Toast.LENGTH_SHORT).show();
                        break;
                }


            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Selected", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }
}
