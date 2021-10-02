package com.android.the_hungry_human;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;

public class MainCoursesActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);

        ListView mainCoursesList = findViewById(R.id.list_view_main_courses);

        Dish[]  mainCourses = {
                new Dish("Veg Pulao With Raita", "A pulao is a one pot dish of rice and vegetables or a protein cooked together with aromatics (onions, garlic, ginger etc), spices and herbs", 200),
                new Dish("Butter Naan", "The most common bread of Indian cuisine which can be served with many main course dishes.", 29),
                new Dish("Chicken Pulao With Raita", "Chicken pulao is also a great gateway dish if you want a quick meal. It is not much spicy, made from the high grade rice with fresh chicken. you will love it’s aroma and our special Raita.", 199),
                new Dish("Mutton Curry", "Mutton curry (also referred to as kosha mangsho, lamb curry, or goat curry) is a dish that is prepared from Goat Meat (or sometimes Lamb meat) and vegetables.", 299),
                new Dish("Chicken Briyani", "Long-grained rice (like basmati) flavored with exotic spices, such as saffron, is layered with lamb, chicken, fish, or vegetables, and a thick gravy.", 199),
                new Dish("Chicken Tikka Masala", "Chicken tikka masala is composed of chicken tikka, boneless chunks of chicken marinated in spices and yogurt that are roasted in an oven, served in a creamy curry sauce. ", 199),
                new Dish("Jeera Rice", "an Indian dish consisting of rice and cumin seeds. It is a popular dish in North India and Pakistan as an everyday rice dish. ", 199),
                new Dish("Tandoor Roti", " made with whole-wheat flour and traditionally cooked in a clay oven or tandoor.", 19)
        };
        ArrayAdapter<Dish> dishesAdapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mainCourses);
   mainCoursesList.setAdapter(dishesAdapter);
    }
}
