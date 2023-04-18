package com.example.tastyfoods.delivery;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.tastyfoods.R;
import com.example.tastyfoods.navDetails;

public class billViewModel extends AppCompatActivity {
    navDetails navDetails = new navDetails();
    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragment_nav_delivery();
    }
    public void fragment_nav_delivery()
    {
        fragmentTransaction.replace(R.id.fragment_nav_delivery, navDetails);
        fragmentTransaction.commit();
    }
}
