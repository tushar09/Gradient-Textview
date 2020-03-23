package com.captaindroid.tvg;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.Log;
import android.widget.TextView;

public class Tvg {
    /**
     * Changes the textview's color to gradient
     *
     * @param tv TextView to change the color
     * @param startColor first color of gradient
     * @param endColor end color of gradient
     */
    public static void change(TextView tv, int startColor, int endColor){
        tv.setTextColor(startColor);
        Shader textShader = new LinearGradient(0, 0, tv.getPaint().measureText(tv.getText().toString()), tv.getTextSize(),
                new int[]{startColor, endColor},
                new float[]{0, 1}, Shader.TileMode.CLAMP);
        tv.getPaint().setShader(textShader);
    }

    /**
     * Changes the textview's color to gradient
     *
     * @param tv TextView to change the color
     * @param colors arrays of multiple colors to create the gradient
     */
    public static void change(TextView tv, int [] colors){
        try {
            tv.setTextColor(colors[0]);
            Shader textShader = new LinearGradient(0, 0, tv.getPaint().measureText(tv.getText().toString()), tv.getTextSize(),
                    colors,
                    null, Shader.TileMode.CLAMP);
            tv.getPaint().setShader(textShader);
        }catch (Exception e){
            Log.e(Tvg.class.getSimpleName(), e.toString());
        }


    }
}
