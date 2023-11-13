package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.InputDevice;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.KeyEvent;

import java.security.Key;

public class MainActivity extends AppCompatActivity  {

    private int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = 10;
        TextView counterTextView = findViewById(R.id.textview_counter);
        counterTextView.setText(""+counter);
    }

    public void knock(View view) {
        if (counter > 0)
        {
            counter--;
            TextView counterTextView = findViewById((R.id.textview_counter));
            counterTextView.setText(""+counter);
            if (counter == 0){
                ImageView eggImageView = findViewById(R.id.imageview_egg);
                eggImageView.setImageResource(R.drawable.tsar_bomba);
            }
        }
    }

    public void reset(View view) {
        counter = 10;
        TextView counterTextView = findViewById(R.id.textview_counter);
        counterTextView.setText(""+counter);
        ImageView eggImageView = findViewById(R.id.imageview_egg);
        eggImageView.setImageResource(R.drawable.egg);
    }

    public InputDevice getController()
    {
        int[] deviceIds = InputDevice.getDeviceIds();
        InputDevice dev = InputDevice.getDevice(deviceIds[0]);
        return dev;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        boolean handled = false;
        if ((event.getSource() & InputDevice.SOURCE_GAMEPAD)
                == InputDevice.SOURCE_GAMEPAD) {
            if (event.getRepeatCount() == 0) {
                if (keyCode == KeyEvent.KEYCODE_BUTTON_A){
                    ImageView eggImageView = findViewById(R.id.imageview_egg);
                    eggImageView.callOnClick();
                    handled = true;
                }
            }
            if (handled) {
                return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }


}
