package com.vladas.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Typeface font = Typeface.createFromAsset(getAssets(), "ostrich-black.ttf");

        Button b1P = (Button) findViewById(R.id.button1SP);
        b1P.setTypeface(font);
        Button b2P = (Button) findViewById(R.id.button2SP);
        b2P.setTypeface(font);
    }

    public void startGame(View v) {
        Intent game = new Intent(MainActivity.this, Game.class);
        String player = "";
        switch (v.getId()) {
            case R.id.button1SP:
                player = "1";
                game.putExtra("player", player);
                MainActivity.this.startActivity(game);
                player = "";
                break;
            case R.id.button2SP:
                player = "2";
                game.putExtra("player", player);
                MainActivity.this.startActivity(game);
                player = "";
                break;
            default:
                break;
        }
    }
}
