package com.example.popactivityandtimepicker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction manager = getSupportFragmentManager().beginTransaction();
        pop_activity pop = new pop_activity();
        pop.show(manager,null);
    }
    void setData(String data){
        TextView txt = findViewById(R.id.txtTime);
        txt.setText(data);

    }
}