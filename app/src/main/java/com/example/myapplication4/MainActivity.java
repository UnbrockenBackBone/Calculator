package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int x;
    int y;
    int count;
    boolean znak = true;
    TextView tex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tex = (TextView) findViewById(R.id.textView2);
    }

    public void number_click(View view) {
        Button n = (Button) findViewById(view.getId());
        TextView text = (TextView) findViewById(R.id.textView2);
        text.setText(text.getText() + "" + n.getText());
    }

    public void dil_click(View view) {
        x = Integer.parseInt((String) tex.getText());
        clear(view);
        count = 4;
    }

    public void mno_click(View view) {
        x = Integer.parseInt((String) tex.getText());
        clear(view);
        count = 3;
    }

    public void vid_click(View view) {
        x = Integer.parseInt((String) tex.getText());
        clear(view);
        count = 2;
    }

    public void plus_click(View view) {
        x = Integer.parseInt((String) tex.getText());
        clear(view);
        count = 1;
    }

    public void doriv(View view) {
        Calculate();
    }
    public void Calculate()
    {
        switch(count)
        {
            case 1:
                y = x + Integer.parseInt((String) tex.getText());
                tex.setText(Integer.toString(y));
                break;
            case 2:
                y = x - Integer.parseInt((String) tex.getText());
                tex.setText(Integer.toString(y));
                break;
            case 3:
                y = x * Integer.parseInt((String) tex.getText());
                tex.setText(Integer.toString(y));
                break;
            case 4:
                y = x / Integer.parseInt((String) tex.getText());
                tex.setText(Integer.toString(y));
                break;
        }
    }
    public void clear(View view) {
        TextView text = (TextView) findViewById(R.id.textView2);
        text.setText("");
    }
}