package com.example.a1894219.class_activity_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static String tag = "Info";
    EditText txtName, txtEmail, txtPassword;
    Button btnSubmit, btnClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = findViewById(R.id.txtName);
        txtEmail = findViewById(R.id.txtEmail);
        txtPassword = findViewById(R.id.txtPassword);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnClose = findViewById(R.id.btnClose);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d(tag,txtName.getText().toString());
                Log.d(tag,txtEmail.getText().toString());
                Log.d(tag,txtPassword.getText().toString());

                final Toast toast = Toast.makeText(getApplicationContext(),"Khushal Kakadiya Thank You!!",Toast.LENGTH_SHORT);

            }
        });

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
