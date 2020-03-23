package com.captaindroid.tvg;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.TextView;

public class Tvg {
    public static void change(TextView tv, int startColor, int endColor){
        Shader textShader = new LinearGradient(0, 0, tv.getPaint().measureText(tv.getText().toString()), tv.getTextSize(),
                new int[]{startColor, endColor},
                new float[]{0, 1}, Shader.TileMode.CLAMP);
        tv.getPaint().setShader(textShader);
    }
    public static void change(TextView tv, int [] colors){
        Shader textShader = new LinearGradient(0, 0, tv.getPaint().measureText(tv.getText().toString()), tv.getTextSize(),
                colors,
                null, Shader.TileMode.CLAMP);
        tv.getPaint().setShader(textShader);
    }
}
