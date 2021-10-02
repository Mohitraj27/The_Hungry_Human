package com.android.the_hungry_human;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);
        ListView startersList = findViewById(R.id.list_view_starters);

               Dish[] dishes = {
                       new Dish("Finger Chips", "a long rectangular piece of deep-fried potato; ",160 ),
        new Dish("Chilli Chana", "Chana chilli is a spicy delicious Indian snack or side dish recipe prepared with Chickpeas, ",180 ),
        new Dish("Chilli Baby Corn", "chilli baby corn is a common Indo Chinese fusion side and snack. It features sweet and tender pieces of baby corn, battered and fried to crispy perfection.", 199),
        new Dish("Chicken Lollipop 4 Pcs.", "Chicken lollipop is, essentially a frenched chicken winglet, wherein the meat is cut loose from the bone", 120),
        new Dish("Chicken Lollipop 8 Pcs", "Chicken lollipop is, essentially a frenched chicken winglet, wherein the meat is cut loose from the bone", 220),
        new Dish("Chicken Tikka", "It is traditionally small pieces of boneless chicken baked using skewers on a brazier called angeethi after marinating in Indian spices and dahi (yogurt)—essentially a boneless version of tandoori chicken.", 210),
        new Dish("Chicken Shanghai", " The meat-stuffed lumpia is rolled into a thin cylindrical shape, cut into bite-size lengths and deep-fried to golden perfection.", 210),
        new Dish("Manchow Soup", "It is a dark brown soup prepared with various vegetables, scallions, and chicken, thickened with broth and corn flour, and flavored with generous doses of soy sauce, salt, garlic, chili peppers and, predominantly, ginger.", 100),
        new Dish("Sweet Corn Chat", " Corn chat made with Sweet corn, chaat masala, onions, tomatoes and few other pantry staples. ", 100),
        new Dish("Cheese Balls", "Cheese balls are a delicious crispy snack made with potato, cheese, herbs and spices. Potato cheese balls make for a great party snack.", 159)
        };


        ArrayAdapter<Dish> dishesAdapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,dishes);
      startersList.setAdapter(dishesAdapter);
    }

}