package com.example.harry_pras.latihan2;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.util.Patterns;

public class InputActivity extends AppCompatActivity {

    EditText enama, euser, eemail, epassword, ephone, ealamat;
    String snama, suser, semail, spassword, sphone, salamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        enama = findViewById(R.id.nama);
        euser = findViewById(R.id.user);
        eemail = findViewById(R.id.email);
        epassword = findViewById(R.id.password);
        ephone = findViewById(R.id.phone);
        ealamat = findViewById(R.id.alamat);

    }

    public void validasi(View view) {
        boolean nama = enama.getText().toString().isEmpty();
        boolean user = euser.getText().toString().isEmpty();
        boolean email = eemail.getText().toString().isEmpty();
        boolean password = epassword.getText().toString().isEmpty();
        boolean phone = ephone.getText().toString().isEmpty();
        boolean alamat = ealamat.getText().toString().isEmpty();
        if (nama) {
            enama.setError("Nama Harus diisi");
            enama.requestFocus();
        } else if (user) {
            euser.setError("Username Harus Diisi");
            euser.requestFocus();
        } else if (email) {
            eemail.setError("Email harus diisi");
            eemail.requestFocus();

        } else if (!Patterns.EMAIL_ADDRESS.matcher(eemail.getText().toString()).matches()) {
            eemail.setText("");
            eemail.setError("Email tidak valid");
            eemail.requestFocus();
        } else if (password) {
            epassword.setError("Password Harus Diisi");
            epassword.requestFocus();
        }    else if (!Patterns.PHONE.matcher(ephone.getText().toString()).matches()) {
            ephone.setText("");
            ephone.setError("Nomor Telephone tidak valid");
            ephone.requestFocus();
        }
            else if (phone) {
            ephone.setError("No Phone Harus Diisi");
            ephone.requestFocus();
        } else if (alamat) {
            ealamat.setError("Alamat Harus Diisi");
            ealamat.requestFocus();
        } else {

            snama = enama.getText().toString();
            suser = euser.getText().toString();
            semail = eemail.getText().toString();
            spassword = epassword.getText().toString();
            sphone = ephone.getText().toString();
            salamat = ealamat.getText().toString();

            new AlertDialog.Builder(this)
                    .setIcon(R.drawable.car)
                    .setTitle("Data Anda")
                    .setMessage("Nama: " + snama + "\nUsername: " + suser + "\nEmail: " + eemail)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    }).create().show();


            Toast.makeText(this, "OKAY", Toast.LENGTH_SHORT).show();
        }
    }
}

