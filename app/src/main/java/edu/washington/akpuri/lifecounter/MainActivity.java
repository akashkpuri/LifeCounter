package edu.washington.akpuri.lifecounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    int score1;
    int score2;
    int score3;
    int score4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        score1 = 20;
        score2 = 20;
        score3 = 20;
        score4 = 20;

        final TextView player1score = (TextView) findViewById(R.id.player1score);
        final TextView player2score = (TextView) findViewById(R.id.player2score);
        final TextView player3score = (TextView) findViewById(R.id.player3score);
        final TextView player4score = (TextView) findViewById(R.id.player4score);

        final TextView loss = (TextView) findViewById(R.id.loss);

        //Player 1 Buttons
        Button onePlus1 = (Button) findViewById(R.id.onePlus1);
        onePlus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score1++;
                player1score.setText("Score: " + score1);
            }
        });
        Button onePlus5 = (Button) findViewById(R.id.onePlus5);
        onePlus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score1 += 5;
                player1score.setText("Score: " + score1);
            }
        });
        Button oneMinus1 = (Button) findViewById(R.id.oneMinus1);
        oneMinus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score1--;
                player1score.setText("Score: " + score1);
                if (score1 <= 0) {
                    loss.setText("Player 1 has Lost!");
                }
            }
        });
        Button oneMinus5 = (Button) findViewById(R.id.oneMinus5);
        oneMinus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score1 -= 5;
                player1score.setText("Score: " + score1);
                if (score1 <= 0) {
                    loss.setText("Player 1 has Lost!");
                }
            }
        });

        //Player 2 Buttons
        Button twoPlus1 = (Button) findViewById(R.id.twoPlus1);
        twoPlus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score2++;
                player2score.setText("Score: " + score2);
            }
        });
        Button twoPlus5 = (Button) findViewById(R.id.twoPlus5);
        twoPlus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score2 += 5;
                player2score.setText("Score: " + score2);
            }
        });
        Button twoMinus1 = (Button) findViewById(R.id.twoMinus1);
        twoMinus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score2--;
                player2score.setText("Score: " + score2);
                if (score2 <= 0) {
                    loss.setText("Player 2 has Lost!");
                }
            }
        });
        Button twoMinus5 = (Button) findViewById(R.id.twoMinus5);
        twoMinus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score2 -= 5;
                player2score.setText("Score: " + score2);
                if (score2 <= 0) {
                    loss.setText("Player 2 has Lost!");
                }
            }
        });

        //Player 3 Buttons
        Button threePlus1 = (Button) findViewById(R.id.threePlus1);
        threePlus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score3++;
                player3score.setText("Score: " + score3);
            }
        });
        Button threePlus5 = (Button) findViewById(R.id.threePlus5);
        threePlus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score3 += 5;
                player3score.setText("Score: " + score3);
            }
        });
        Button threeMinus1 = (Button) findViewById(R.id.threeMinus1);
        threeMinus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score3--;
                player3score.setText("Score: " + score3);
                if (score3 <= 0) {
                    loss.setText("Player 3 has Lost!");
                }
            }
        });
        Button threeMinus5 = (Button) findViewById(R.id.threeMinus5);
        threeMinus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score3 -= 5;
                player3score.setText("Score: " + score3);
                if (score3 <= 0) {
                    loss.setText("Player 3 has Lost!");
                }
            }
        });

        //Player 4 Buttons
        Button fourPlus1 = (Button) findViewById(R.id.fourPlus1);
        fourPlus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score4++;
                player4score.setText("Score: " + score4);
            }
        });
        Button fourPlus5 = (Button) findViewById(R.id.fourPlus5);
        fourPlus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score4 += 5;
                player4score.setText("Score: " + score4);
            }
        });
        Button fourMinus1 = (Button) findViewById(R.id.fourMinus1);
        fourMinus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score4--;
                player4score.setText("Score: " + score4);
                if (score4 <= 0) {
                    loss.setText("Player 4 has Lost!");
                }
            }
        });
        Button fourMinus5 = (Button) findViewById(R.id.fourMinus5);
        fourMinus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score4 -= 5;
                player4score.setText("Score: " + score4);
                if (score4 <= 0) {
                    loss.setText("Player 4 has Lost!");
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
