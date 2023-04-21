package com.example.tastyfoods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.tastyfoods.data.dao.FoodDAO;
import com.example.tastyfoods.data.model.Food;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FoodDAO f = FoodDAO.getInstance();
        while (true){
            Log.e("Syyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy", f.getFoods().size() + "");
        }

    }
}