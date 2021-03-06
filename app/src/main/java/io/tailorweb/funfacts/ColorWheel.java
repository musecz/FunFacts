package io.tailorweb.funfacts;

import android.graphics.Color;

import java.util.Random;

public class ColorWheel {

    private String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7",  // light gray,
            "#8b4513" // bronze
            "#ddca8b"  // gold
    };

    //    Let's add the method
    public int getColor() {
        // Randomly select a Fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);
        int color = Color.parseColor(mColors[randomNumber]);
        return color;

    }
}
