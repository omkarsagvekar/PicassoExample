package com.os.picassoexample;

import android.database.DatabaseUtils;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.os.picassoexample.databinding.ActivityMainBinding;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Picasso.get().load("https://fastly.picsum.photos/id/966/200/300.jpg?hmac=vBALR2x0cV-keVNLecwjd8ZluSHv17AHDvpiYjBqar0").error(R.drawable.error_outline).into(binding.ivDisplayImage);

    }
}