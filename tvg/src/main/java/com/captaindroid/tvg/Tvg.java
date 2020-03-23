package com.captaindroid.tvg;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.TextView;

public class Tvg {
    public static void changeTv(TextView tv, Color startColor, Color endColor){
        Shader textShader = new LinearGradient(0, 0, tv.getPaint().measureText(tv.getText().toString()), tv.getTextSize(),
                new int[]{startColor.hashCode(), endColor.hashCode()},
                new float[]{0, 1}, Shader.TileMode.CLAMP);
        tv.getPaint().setShader(textShader);
    }
}
