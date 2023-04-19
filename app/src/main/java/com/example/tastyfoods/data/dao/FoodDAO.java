package com.example.tastyfoods.data.dao;

import android.util.Log;

import androidx.annotation.NonNull;

import com.example.tastyfoods.data.model.Food;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FoodDAO implements DAO<Food>{
    private final FirebaseFirestore FIRESTORE = FirebaseFirestore.getInstance();

    @Override
    public List<Food> getAll() {
        return null;
    }

    @Override
    public void save(Food food) {
        Map<String, Object> temp = new HashMap<>();
        temp.put("name", food.getName());
        temp.put("image", food.getImage());
        temp.put("description", food.getDescription());
        temp.put("price", food.getPrice());
        temp.put("ratePoint", food.getRatePoint());
        temp.put("categoryId", food.getCategoryId());

        // Add a new document with a generated ID
        FIRESTORE.collection("food")
                .add(temp)
                .addOnSuccessListener(documentReference -> Log.d("Debug", "DocumentSnapshot added with ID: " + documentReference.getId()))
                .addOnFailureListener(e -> Log.w("Debug", "Error adding document", e));
    }

    @Override
    public Food findById(int id) {
        return null;
    }

    @Override
    public List<Food> findByName(String name) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void updateById(int id, Food food) {

    }
}
