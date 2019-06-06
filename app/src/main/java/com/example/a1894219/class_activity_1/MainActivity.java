package com.example.a1894219.class_activity_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.support.design.widget.Snackbar;

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

                final Toast toast = Toast.makeText(getApplicationContext(),"Thank You!! Khushal Kakadiya",Toast.LENGTH_SHORT);


                Snackbar snb = Snackbar.make(findViewById(R.id.myview),"Clear all the data",Snackbar.LENGTH_INDEFINITE).setAction("Clear", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txtName.setText("");
                        txtEmail.setText("");
                        txtPassword.setText("");

                        toast.show();
                    }
                });
                snb.show();

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
