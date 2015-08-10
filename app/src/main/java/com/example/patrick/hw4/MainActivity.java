package com.example.patrick.hw4;

import android.app.ProgressDialog;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.io.IOException;


public class MainActivity extends ActionBarActivity {

    AssetFileDescriptor afd;
    ProgressDialog progress;
    Button war;
    Button fight;
    Button victory;
    Button gold;
    Button cheer;
    Button fanfare;
    Button uprising;
    Button stop;
    Button pause_play;
    final MediaPlayer mp = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        war =(Button) findViewById(R.id.war_chant);
        fight = (Button) findViewById(R.id.fight_song);
        victory = (Button) findViewById(R.id.victory_song);
        gold = (Button) findViewById(R.id.gold_garnet);
        cheer =(Button) findViewById(R.id.cheer);
        fanfare = (Button) findViewById(R.id.fanfare);
        uprising = (Button) findViewById(R.id.uprising);
        stop = (Button) findViewById(R.id.stop);
        pause_play = (Button) findViewById(R.id.pause_play);


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
    public void onWarClick(View view){



        mp.reset();
        try {
            afd = getAssets().openFd("war_chant.mp3");
            mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
            mp.prepare();
            mp.start();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public void onFightClick(View view){
        mp.reset();
        try {
            afd = getAssets().openFd("fsu_fight_song.mp3");
            mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
            mp.prepare();
            mp.start();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public void onVictoryClick(View view){
        mp.reset();
        try {
            afd = getAssets().openFd("victory_song.mp3");
            mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
            mp.prepare();
            mp.start();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public void onGoldClick(View view){
        mp.reset();
        try {
            afd = getAssets().openFd("gold_and_garnett.mp3");
            mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
            mp.prepare();
            mp.start();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public void onCheerClick(View view){
        mp.reset();
        try {
            afd = getAssets().openFd("fsu_cheer.mp3");
            mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
            mp.prepare();
            mp.start();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public void onFanfareClick(View view){
        mp.reset();
        try {
            afd = getAssets().openFd("4th_quarter_fanfare.mp3");
            mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
            mp.prepare();
            mp.start();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public void onUprisingClick(View view){
        mp.reset();
        try {
            afd = getAssets().openFd("seminole_uprising.mp3");
            mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
            mp.prepare();
            mp.start();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public void onStopClick(View view){
        mp.reset();

    }
    public void onPlayClick(View view){
        if(mp.isPlaying()){
            mp.pause();
            pause_play.setText("Play");
        } else {
            mp.start();
            pause_play.setText("Pause");
        }

    }
}
