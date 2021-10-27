package com.example.codingchallenge;

import android.os.Bundle;
import android.widget.TextView;
import static com.example.codingchallenge.Passages.p1;
import static com.example.codingchallenge.Passages.p2;
import static com.example.codingchallenge.Passages.p3;

import androidx.appcompat.app.AppCompatActivity;

public class PassageActivity extends AppCompatActivity {

    private TextView textView;
    private int choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passage);

        // get choice from extras of intent
        choice = getIntent().getExtras().getInt("pnumber", 1);

        textView = findViewById(R.id.textpassage);

        // set text accordingly
        switch (choice) {
            case 1:
                textView.setText(p1);
                break;
            case 2:
                textView.setText(p2);
                break;
            case 3:
                textView.setText(p3);
        }
    }
}
