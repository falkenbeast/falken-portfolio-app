package com.falkenbeast.falkenportfolioapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recyid);
      //  Projects pr = new Projects("Firstapp", "first project, the default", R.drawable.getting_started);  //either you make different object or create an array of objects

        Projects pr2[] = {
                new Projects("Firstapp", "first project, the default", R.drawable.getting_started),
                new Projects("falkenquotes", "shows quote", R.drawable.quote),
                new Projects("bmi calculator", "calculates bmi", R.drawable.tape),
                new Projects(" inch converter ", "converts inches to meters", R.drawable.calculator),
                new Projects("my mcdonalds", "mcd app basic", R.drawable.hungry_developer),
                new Projects("falkenbucketlist","this app shows my bucket list", R.drawable.simple_and_unique_bucket_list_logo_template_vector)


        };
        Projectadapter pra = new Projectadapter(pr2);
        list.setAdapter(pra);



    }


}
