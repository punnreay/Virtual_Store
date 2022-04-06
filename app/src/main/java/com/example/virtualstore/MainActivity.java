package com.example.virtualstore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.virtualstore.fragment.AccountFragment;
import com.example.virtualstore.fragment.CartFragment;
import com.example.virtualstore.fragment.HomeFragment;
import com.example.virtualstore.fragment.ProductFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //reference to Bottom Navigation VIew
        BottomNavigationView bottomNavigationView = findViewById(R.id.buttonNavigationView);

        // Handle event when user select on each tab
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                handleBottomNavigation(item);
                return true;
            }
        });
        //showHome fragment as default
        showFragment(new HomeFragment());
    }

    private  void handleBottomNavigation(MenuItem item){
        if (item.getItemId() ==R.id.mnuHome){
            showFragment(new HomeFragment());
        }else if (item.getItemId() ==R.id.mnuProduct){
            showFragment(new ProductFragment());
        }else if (item.getItemId() ==R.id.mnuCart){
            showFragment(new CartFragment());
        }else if (item.getItemId() ==R.id.mnuProfile){
            showFragment(new AccountFragment());
        }
    }
    //showFragment
    private void showFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.lytFragmentContainer , fragment);
        fragmentTransaction.commit();
    }

}