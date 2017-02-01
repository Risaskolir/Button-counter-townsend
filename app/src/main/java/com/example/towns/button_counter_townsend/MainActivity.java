package com.example.towns.button_counter_townsend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button ascButton;
    private Button descButton;
    private Button clearButton;
    private TextView countText;
    private Integer count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count = 0;
        ascButton = (Button)findViewById(R.id.ascend_button);
        descButton = (Button)findViewById(R.id.descend_button);
        clearButton = (Button)findViewById(R.id.clear_button);
        countText = (TextView)findViewById(R.id.countTextView);
        countText.setText(count.toString());

        ascButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                addOne();
                countText.setText(count.toString());
            }
        });

        descButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                removeOne();
                countText.setText(count.toString());
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                clearCount();
                countText.setText(count.toString());
            }
        });

        
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("countSave",count);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        count = savedInstanceState.getInt("countSave");
        countText.setText(count.toString());
    }

    public void addOne(){
        count++;
    }

    public void removeOne(){
        count--;
    }

    public void clearCount(){
        count = 0;
    }
}
