package com.example.towns.button_counter_townsend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button ascButton;
    private Button descButton;
    private Button clearButton;
    private TextView countText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ascButton = (Button)findViewById(R.id.ascend_button);
        descButton = (Button)findViewById(R.id.descend_button);
        clearButton = (Button)findViewById(R.id.clear_button);
        countText = (TextView)findViewById(R.id.countTextView);

        
    }
}
