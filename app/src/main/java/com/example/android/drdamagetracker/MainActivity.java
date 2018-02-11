package com.example.android.drdamagetracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int playerHp = 35;
int orcHp = 35;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for the player
     */
    public void displayForPlayer(int hp) {
        TextView hpView = (TextView) findViewById(R.id.player_hp);
        hpView.setText(String.valueOf(hp));
    }
    /**
     * Displays the given score for the Orc.
     */
    public void displayForOrc(int hp) {
        TextView hpView = (TextView) findViewById(R.id.Orc_hp);
        hpView.setText(String.valueOf(hp));
    }
    public void playerBigSwing(View view)
    {
        orcHp = orcHp -3;
        displayForOrc(orcHp);
    }
    public void playerMedSwing(View view) {
        orcHp = orcHp - 2;
        displayForOrc(orcHp);
    }
    public void playerJab(View view){
        orcHp = orcHp - 1;
        displayForOrc(orcHp);
    }
    public void orcBigSwing(View view)
    {
        playerHp = playerHp - 3;
        displayForPlayer(playerHp);
    }
    public void orcMedSwing(View view) {
        playerHp= playerHp - 2;
        displayForPlayer(playerHp);
    }
    public void orcJab(View view){
        playerHp = playerHp - 1;
        displayForPlayer(playerHp);
    }
    public void Reset(View view){
        orcHp = 35;
        playerHp = 35;
        displayForOrc(orcHp);
        displayForPlayer(playerHp);
    }
}
