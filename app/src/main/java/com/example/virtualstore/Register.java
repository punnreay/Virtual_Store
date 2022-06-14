package com.example.virtualstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.virtualstore.databinding.ActivityRegisterBinding;

public class Register extends AppCompatActivity {
    ActivityRegisterBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.next.setOnClickListener(view -> {
            Intent intent = new Intent(this,SetupProfile.class);
            startActivity(intent);
        });
    }
}