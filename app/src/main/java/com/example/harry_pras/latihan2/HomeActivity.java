package com.example.harry_pras.latihan2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    CardView kartu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        kartu = (CardView) findViewById(R.id.cardx);
        kartu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, InputActivity.class));

            }
        });
    }

            public void about(View view) {
                new AlertDialog.Builder(HomeActivity.this)
                        .setIcon(R.drawable.truck)
                        .setTitle("About This App")
                        .setMessage("Ini adalah aplikasi buatan saya\n\nAbiyyu Daffa' Alam")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .create()
                        .show();
                Toast.makeText(HomeActivity.this, "Nama Paket Aplikasi ini adalah", Toast.LENGTH_SHORT).show();
            }


        }


