package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView user = findViewById(R.id.user);
        TextView pass = findViewById(R.id.Pass);;
        MaterialButton btnlogin = findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(user.getText().toString().equals("thang") && pass.getText().toString().equals("thang123")){
                    Toast.makeText(MainActivity.this,"Login Succesful", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(MainActivity.this,"Login Failed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}