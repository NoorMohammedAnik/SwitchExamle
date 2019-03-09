package com.anik.switchexamle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSubmit;
    Switch btnSwitch;
    TextView txtStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit=findViewById(R.id.btn_submit);
        btnSwitch=findViewById(R.id.btn_switch);
        txtStatus=findViewById(R.id.txt_status);


       btnSubmit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (btnSwitch.isChecked())
               {
                   Toast.makeText(MainActivity.this, "Switch ON", Toast.LENGTH_SHORT).show();

                   txtStatus.setText("ON");
               }

               else
               {
                   Toast.makeText(MainActivity.this, "Switch OFF", Toast.LENGTH_SHORT).show();

                   txtStatus.setText("OFF");
               }
           }
       });

    }
}
