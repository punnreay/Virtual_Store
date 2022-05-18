package com.example.virtualstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.example.virtualstore.databinding.ActivitySetupProfileBinding;

public class SetupProfile extends AppCompatActivity {
    ActivitySetupProfileBinding binding;
    String [] province = {"PhnomPenh","Banteymenchey"};
    AutoCompleteTextView autoCompleteTextView;
    ArrayAdapter<String>adapterProvince;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivitySetupProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        autoCompleteTextView=binding.location;
        adapterProvince=new ArrayAdapter<String>(this,R.layout.text_location);
        autoCompleteTextView.setAdapter(adapterProvince);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String province=adapterView.getItemAtPosition(i).toString();
            }
        });
        binding.finish.setOnClickListener(v->{
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        });

    }
}