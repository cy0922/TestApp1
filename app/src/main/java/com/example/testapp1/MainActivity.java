package com.example.testapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button btn;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView tv_one = findViewById(R.id.tv_one);
//        tv_one.setText("Charlie");
        editText = (EditText) findViewById(R.id.edit_text);

        btn = (Button) findViewById(R.id.btn);
        text = (TextView) findViewById(R.id.outputText);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputText = editText.getText().toString();
                text.setText(inputText);
            }
        });
    }
}