package com.vladas.tictactoe;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Game extends Activity {

    String player = "";
    int turn = 1;
    int countTurn = 0;
    int delay1 = 1000;
    int delay2 = 500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Intent game = getIntent();
        player = game.getStringExtra("player");

        TextView text = (TextView)findViewById(R.id.playerText);
        text.setText("Los gehts!");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                TextView text = (TextView)findViewById(R.id.playerText);
                if(player.equals("1"))
                    text.setText("Spieler startet");
                else
                    text.setText("Spieler 1 startet");
            }
        }, delay1);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Typeface font = Typeface.createFromAsset(getAssets(), "ostrich-black.ttf");

        Button b1 = (Button) findViewById(R.id.feld1);
        b1.setTypeface(font);
        Button b2 = (Button) findViewById(R.id.feld2);
        b2.setTypeface(font);
        Button b3 = (Button) findViewById(R.id.feld3);
        b3.setTypeface(font);
        Button b4 = (Button) findViewById(R.id.feld4);
        b4.setTypeface(font);
        Button b5 = (Button) findViewById(R.id.feld5);
        b5.setTypeface(font);
        Button b6 = (Button) findViewById(R.id.feld6);
        b6.setTypeface(font);
        Button b7 = (Button) findViewById(R.id.feld7);
        b7.setTypeface(font);
        Button b8 = (Button) findViewById(R.id.feld8);
        b8.setTypeface(font);
        Button b9 = (Button) findViewById(R.id.feld9);
        b9.setTypeface(font);

        TextView tv = (TextView) findViewById(R.id.playerText);
        tv.setTypeface(font);
    }

    public int checkWin() {
        Button feld1 = (Button)findViewById(R.id.feld1);
        Button feld2 = (Button)findViewById(R.id.feld2);
        Button feld3 = (Button)findViewById(R.id.feld3);
        Button feld4 = (Button)findViewById(R.id.feld4);
        Button feld5 = (Button)findViewById(R.id.feld5);
        Button feld6 = (Button)findViewById(R.id.feld6);
        Button feld7 = (Button)findViewById(R.id.feld7);
        Button feld8 = (Button)findViewById(R.id.feld8);
        Button feld9 = (Button)findViewById(R.id.feld9);

        String s1 = (String)feld1.getText();
        String s2 = (String)feld2.getText();
        String s3 = (String)feld3.getText();
        String s4 = (String)feld4.getText();
        String s5 = (String)feld5.getText();
        String s6 = (String)feld6.getText();
        String s7 = (String)feld7.getText();
        String s8 = (String)feld8.getText();
        String s9 = (String)feld9.getText();

        String p1 = "X";
        String p2 = "O";

        int result = -1;

        if(s1 == p1 && s2 == p1 && s3 == p1) {
            result = 1;
            feld1.setBackgroundColor(Color.GREEN);
            feld2.setBackgroundColor(Color.GREEN);
            feld3.setBackgroundColor(Color.GREEN);
        }
        else if(s4 == p1 && s5 == p1 && s6 == p1) {
            result = 1;
            feld4.setBackgroundColor(Color.GREEN);
            feld5.setBackgroundColor(Color.GREEN);
            feld6.setBackgroundColor(Color.GREEN);
        }
        else if(s7 == p1 && s8 == p1 && s9 == p1) {
            result = 1;
            feld7.setBackgroundColor(Color.GREEN);
            feld8.setBackgroundColor(Color.GREEN);
            feld9.setBackgroundColor(Color.GREEN);
        }
        else if (s1 == p1 && s4 == p1 && s7 == p1) {
            result = 1;
            feld1.setBackgroundColor(Color.GREEN);
            feld4.setBackgroundColor(Color.GREEN);
            feld7.setBackgroundColor(Color.GREEN);
        }
        else if(s2 == p1 && s5 == p1 && s8 == p1) {
            result = 1;
            feld2.setBackgroundColor(Color.GREEN);
            feld5.setBackgroundColor(Color.GREEN);
            feld8.setBackgroundColor(Color.GREEN);
        }
        else if(s3 == p1 && s6 == p1 && s9 == p1) {
            result = 1;
            feld3.setBackgroundColor(Color.GREEN);
            feld6.setBackgroundColor(Color.GREEN);
            feld9.setBackgroundColor(Color.GREEN);
        }
        else if(s1 == p1 && s5 == p1 && s9 == p1) {
            result = 1;
            feld1.setBackgroundColor(Color.GREEN);
            feld5.setBackgroundColor(Color.GREEN);
            feld9.setBackgroundColor(Color.GREEN);
        }
        else if(s3 == p1 && s5 == p1 && s7 == p1) {
            result = 1;
            feld3.setBackgroundColor(Color.GREEN);
            feld5.setBackgroundColor(Color.GREEN);
            feld7.setBackgroundColor(Color.GREEN);
        }
        else if(s1 == p2 && s2 == p2 && s3 == p2) {
            result = 2;
            feld1.setBackgroundColor(Color.GREEN);
            feld2.setBackgroundColor(Color.GREEN);
            feld3.setBackgroundColor(Color.GREEN);
        }
        else if(s4 == p2 && s5 == p2 && s6 == p2) {
            result = 2;
            feld4.setBackgroundColor(Color.GREEN);
            feld5.setBackgroundColor(Color.GREEN);
            feld6.setBackgroundColor(Color.GREEN);
        }
        else if(s7 == p2 && s8 == p2 && s9 == p2) {
            result = 2;
            feld7.setBackgroundColor(Color.GREEN);
            feld8.setBackgroundColor(Color.GREEN);
            feld9.setBackgroundColor(Color.GREEN);
        }
        else if(s1 == p2 && s4 == p2 && s7 == p2) {
            result = 2;
            feld1.setBackgroundColor(Color.GREEN);
            feld4.setBackgroundColor(Color.GREEN);
            feld7.setBackgroundColor(Color.GREEN);
        }
        else if(s2 == p2 && s5 == p2 && s8 == p2) {
            result = 2;
            feld2.setBackgroundColor(Color.GREEN);
            feld5.setBackgroundColor(Color.GREEN);
            feld8.setBackgroundColor(Color.GREEN);
        }
        else if(s3 == p2 && s6 == p2 && s9 == p2) {
            result = 2;
            feld3.setBackgroundColor(Color.GREEN);
            feld6.setBackgroundColor(Color.GREEN);
            feld9.setBackgroundColor(Color.GREEN);
        }
        else if(s1 == p2 && s5 == p2 && s9 == p2) {
            result = 2;
            feld1.setBackgroundColor(Color.GREEN);
            feld5.setBackgroundColor(Color.GREEN);
            feld9.setBackgroundColor(Color.GREEN);
        }
        else if(s3 == p2 && s5 == p2 && s7 == p2) {
            result = 2;
            feld3.setBackgroundColor(Color.GREEN);
            feld5.setBackgroundColor(Color.GREEN);
            feld7.setBackgroundColor(Color.GREEN);
        } else {
            if(countTurn == 9) {
                result = 0;
            }
        }
        return result;
    }

    public void createDialog() {
        int result = checkWin();
        String winner = "";
        if(result == 1) {
            if(player.equals("1"))
                winner = "Spieler hat das Spiel gewonnen!";
            else
                winner = "Spieler 1 hat das Spiel gewonnen!";
        } else if(result == 2) {
            if(player.equals("1"))
                winner = "Bot hat das Spiel gewonnen!";
            else
                winner = "Spieler 2 hat das Spiel gewonnen!";
        } else if(result == 0)
            winner = "Unentschieden!";

        if(result != -1) {
            AlertDialog dlg = new AlertDialog.Builder(this, android.R.style.Theme_Holo_Dialog)
                    .setTitle("Spielende")
                    .setMessage(winner)
                    .setPositiveButton("Noch einmal", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = getIntent();
                            overridePendingTransition(0, 0);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                            finish();

                            overridePendingTransition(0, 0);
                            startActivity(intent);
                        }
                    })
                    .setNegativeButton("Ende", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    })
                    .show();
        }
    }

    public int randomID() {
        Button feld1 = (Button)findViewById(R.id.feld1);
        Button feld2 = (Button)findViewById(R.id.feld2);
        Button feld3 = (Button)findViewById(R.id.feld3);
        Button feld4 = (Button)findViewById(R.id.feld4);
        Button feld5 = (Button)findViewById(R.id.feld5);
        Button feld6 = (Button)findViewById(R.id.feld6);
        Button feld7 = (Button)findViewById(R.id.feld7);
        Button feld8 = (Button)findViewById(R.id.feld8);
        Button feld9 = (Button)findViewById(R.id.feld9);

        String s1 = (String)feld1.getText();
        String s2 = (String)feld2.getText();
        String s3 = (String)feld3.getText();
        String s4 = (String)feld4.getText();
        String s5 = (String)feld5.getText();
        String s6 = (String)feld6.getText();
        String s7 = (String)feld7.getText();
        String s8 = (String)feld8.getText();
        String s9 = (String)feld9.getText();

        String p = "X";
        String b = "O";

        int id = 0;

        if((s2 == b && s3 == b && s1 == "") || (s4 == b && s7 == b && s1 == "") || (s5 == b && s9 == b && s1 == "") ||
           (s2 == p && s3 == p && s1 != b) || (s4 == p && s7 == p && s1 != b) || (s5 == p && s9 == p && s1 != b))
            id = R.id.feld1;
        else if((s1 == b && s3 == b && s2 == "") || (s5 == b && s8 == b && s2 == "") ||
                (s1 == p && s3 == p && s2 != b) || (s5 == p && s8 == p && s2 != b))
            id = R.id.feld2;
        else if((s1 == b && s2 == b && s3 == "") || (s6 == b && s9 == b && s3 == "") || (s5 == b && s7 == b && s3 == "") ||
                (s1 == p && s2 == p && s3 != b) || (s6 == p && s9 == p && s3 != b) || (s5 == p && s7 == p && s3 != b))
            id = R.id.feld3;
        else if((s5 == b && s6 == b && s4 == "") || (s1 == b && s7 == b && s4 == "") ||
                (s5 == p && s6 == p && s4 != b) || (s1 == p && s7 == p && s4 != b))
            id = R.id.feld4;
        else if((s1 == b && s9 == b && s5 == "") || (s3 == b && s7 == b && s5 == "") || (s4 == b && s6 == b && s5 == "") || (s2 == b && s8 == b && s5 == "") ||
                (s1 == p && s9 == p && s5 != b) || (s3 == p && s7 == p && s5 != b) || (s4 == p && s6 == p && s5 != b) || (s2 == p && s8 == p && s5 != b))
            id = R.id.feld5;
        else if((s4 == b && s5 == b && s6 == "") || (s3 == b && s9 == b && s6 == "") ||
                (s4 == p && s5 == p && s6 != b) || (s3 == p && s9 == p && s6 != b))
            id = R.id.feld6;
        else if((s8 == b && s9 == b && s7 == "") || (s1 == b && s4 == b && s7 == "") || (s3 == b && s5 == b && s7 == "") ||
                (s8 == p && s9 == p && s7 != b) || (s1 == p && s4 == p && s7 != b) || (s3 == p && s5 == p && s7 != b))
            id = R.id.feld7;
        else if((s2 == b && s5 == b && s8 == "") || (s7 == b && s9 == b && s8 == "") ||
                (s2 == p && s5 == p && s8 != b) || (s7 == p && s9 == p && s8 != b))
            id = R.id.feld8;
        else if((s7 == b && s8 == b && s9 == "") || (s3 == b && s6 == b && s9 == "") || (s1 == b && s5 == b && s9 == "") ||
                (s7 == p && s8 == p && s9 != b) || (s3 == p && s6 == p && s9 != b) || (s1 == p && s5 == p && s9 != b))
            id = R.id.feld9;
        else {
            int random = (int)(1 + (Math.random() * 9));
            switch(random) {
                case 1: id = R.id.feld1; break;
                case 2: id = R.id.feld2; break;
                case 3: id = R.id.feld3; break;
                case 4: id = R.id.feld4; break;
                case 5: id = R.id.feld5; break;
                case 6: id = R.id.feld6; break;
                case 7: id = R.id.feld7; break;
                case 8: id = R.id.feld8; break;
                case 9: id = R.id.feld9; break;
                default: break;
            }
        }
        return id;
    }

    public void game(View v) {
        if(player.equals("1")) {
            TextView text = (TextView)findViewById(R.id.playerText);
            Button feld = (Button)findViewById(v.getId());
            if(feld.getText().equals("")) {
                feld.setText("X");
                if(checkWin() == 1) {
                    createDialog();
                } else {
                    text.setText("Bot dran");

                    countTurn++;
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            int id = randomID();
                            TextView text = (TextView)findViewById(R.id.playerText);
                            Button feld = (Button)findViewById(id);
                            if(feld.getText().equals("")) {
                                feld.setText("O");
                                createDialog();
                                text.setText("Spieler dran");
                                countTurn++;
                            } else {
                                boolean turn = true;
                                while(turn && countTurn < 9) {
                                    id = randomID();
                                    feld = (Button)findViewById(id);
                                    if(feld.getText().equals("")) {
                                        feld.setText("O");
                                        createDialog();
                                        text.setText("Spieler dran");
                                        countTurn++;
                                        turn = false;
                                    }
                                }
                            }
                        }
                    }, delay2);
                }
            } else
                text.setText("Versuche es nochmal");
        } createDialog();

        if(player.equals("2")) {
            TextView text = (TextView)findViewById(R.id.playerText);
            if(turn == 1) {
                Button feld = (Button)findViewById(v.getId());
                if(feld.getText().equals("")) {
                    feld.setText("X");
                    createDialog();
                    turn = 2;
                    text.setText("Spieler 2 dran");
                    countTurn++;
                } else
                    text.setText("Versuche es nochmal");
            } else {
                Button feld = (Button)findViewById(v.getId());
                if(feld.getText().equals("")) {
                    feld.setText("O");
                    createDialog();
                    turn = 1;
                    text.setText("Spieler 1 dran");
                    countTurn++;
                } else
                    text.setText("Versuche es nochmal");
            }
        } createDialog();
    }
}
