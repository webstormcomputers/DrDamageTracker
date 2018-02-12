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

        TextView orcHpInit = (TextView) findViewById(R.id.Orc_hp);
        orcHpInit.setText(String.valueOf(orcHp));
        TextView plyrHpInit = (TextView) findViewById(R.id.player_hp);
        plyrHpInit.setText(String.valueOf(playerHp));
    }
    /**
     * Displays the given score for the player
     */
    public void displayForPlayer(int hp) {
        TextView hpView = (TextView) findViewById(R.id.player_hp);
        hpView.setText(String.valueOf(hp));
        if (hp <= 0) {
        TextView playerdeath = (TextView) findViewById(R.id.player_dead);
        playerdeath.setText("Player Dead");
        }
    }
    /**
     * Displays the given score for the Orc.
     */
    public void displayForOrc(int hp) {
        TextView hpView = (TextView) findViewById(R.id.Orc_hp);
        hpView.setText(String.valueOf(hp));
        if (hp <= 0) {
            TextView orcdeath = (TextView) findViewById(R.id.orc_dead);
            orcdeath.setText("Orc Dead");
        }
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
    public void potion(View view)
    {
        playerHp = playerHp + 5;
        displayForPlayer(playerHp);
    }
    public void Reset(View view){
        orcHp = 35;
        playerHp = 35;
        displayForOrc(orcHp);
        displayForPlayer(playerHp);
        TextView playerdeath = (TextView) findViewById(R.id.player_dead);
        playerdeath.setText("");
        TextView orcdeath = (TextView) findViewById(R.id.orc_dead);
        orcdeath.setText("");
    }
}
