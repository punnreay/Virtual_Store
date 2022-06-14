package com.example.virtualstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.virtualstore.databinding.ActivityRegisterNameBinding;

public class RegisterName extends AppCompatActivity {
    ActivityRegisterNameBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityRegisterNameBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.next.setOnClickListener(view -> {
            Intent intent = new Intent(this,Register.class);
            startActivity(intent);
        });
    }
}