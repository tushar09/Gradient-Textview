package com.captaindroid.gradienttextview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import com.captaindroid.tvg.Tvg;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.tv);
        Tvg.change(tv, Color.parseColor("#800CDD"),  Color.parseColor("#3BA3F2"));
        Tvg.change((TextView) findViewById(R.id.tv2), new int[]{
                Color.parseColor("#F97C3C"),
                Color.parseColor("#FDB54E"),
                Color.parseColor("#64B678"),
                Color.parseColor("#478AEA"),
                Color.parseColor("#8446CC"),
        });
        Tvg.change((TextView) findViewById(R.id.tv3), new int[]{
                Color.parseColor("#F97C3C"),
                Color.parseColor("#FDB54E"),
                Color.parseColor("#64B678"),
                Color.parseColor("#478AEA"),
                Color.parseColor("#8446CC"),
        });
    }
}
