package com.example.phycas.rockyboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView leText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        leText = (TextView)findViewById(R.id.testView);
    }

    public void testPress(View view){
        conector paAlla = new conector("192.168.1.105", 4222);
        try {
            paAlla.testConsole();
        }catch(Exception ex){
            leText.setText("algo no funciona: " + ex);
        }
    }
}
