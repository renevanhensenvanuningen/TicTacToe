package com.example.rene.tictactoe;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buClick(View view) {
        Button buSelected = (Button) view;
        buSelected.setBackgroundColor(Color.RED);
        int AId = 0;
        switch ( buSelected.getId())
        {
            case R.id.bu1: AId =1;
            break;
            case R.id.bu2: AId =2;
            break;
            case R.id.bu3: AId =3;
                break;
            case R.id.bu4: AId =4;
                break;
            case R.id.bu5: AId =5;
                break;
            case R.id.bu6: AId =6;
                break;
            case R.id.bu7: AId =7;
                break;
            case R.id.button8: AId =8;
                break;


        }
        PlayGame(buSelected, AId);
    }
    public void PlayGame(Button b , int id)
    {
        Log.d("Tag Player", String.valueOf(id));
        Log.d("Button", b.getText().toString());
    }
}
