package com.example.genshinlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Utama extends AppCompatActivity {
    ImageView profile;
    LinearLayout b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14;
    private TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);
        profile = (ImageView) findViewById(R.id.profileuser);
        b1 = (LinearLayout) findViewById(R.id.buku1);
        b2 = (LinearLayout) findViewById(R.id.buku2);
        b3 = (LinearLayout) findViewById(R.id.buku3);
        b4 = (LinearLayout) findViewById(R.id.buku4);
        b5 = (LinearLayout) findViewById(R.id.buku5);
        b6 = (LinearLayout) findViewById(R.id.buku6);
        b7 = (LinearLayout) findViewById(R.id.buku7);
        b8 = (LinearLayout) findViewById(R.id.buku8);
        b9 = (LinearLayout) findViewById(R.id.buku9);
        b10 = (LinearLayout) findViewById(R.id.buku10);
        b11 = (LinearLayout) findViewById(R.id.buku11);
        b12 = (LinearLayout) findViewById(R.id.buku12);
        b13 = (LinearLayout) findViewById(R.id.buku13);
        b14 = (LinearLayout) findViewById(R.id.buku14);

        name = findViewById(R.id.text_name);
        String username = getIntent().getStringExtra("keyname");

        name.setText(username);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profile = new Intent(Utama.this, About.class);
                startActivity(profile);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b1 = new Intent(Utama.this, Book1.class);
                startActivity(b1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b2 = new Intent(Utama.this, Book2.class);
                startActivity(b2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b3 = new Intent(Utama.this, Book3.class);
                startActivity(b3);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b4 = new Intent(Utama.this, Book4.class);
                startActivity(b4);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b5 = new Intent(Utama.this, Book5.class);
                startActivity(b5);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b6 = new Intent(Utama.this, Book6.class);
                startActivity(b6);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b7 = new Intent(Utama.this, Book7.class);
                startActivity(b7);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b8 = new Intent(Utama.this, Book8.class);
                startActivity(b8);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b9 = new Intent(Utama.this, Book9.class);
                startActivity(b9);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b10 = new Intent(Utama.this, Book10.class);
                startActivity(b10);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b11 = new Intent(Utama.this, Book11.class);
                startActivity(b11);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b12 = new Intent(Utama.this, Book12.class);
                startActivity(b12);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b13 = new Intent(Utama.this, Book13.class);
                startActivity(b13);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b14 = new Intent(Utama.this, Book14.class);
                startActivity(b14);
            }
        });
    }
}