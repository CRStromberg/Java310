package com.example.tlinefinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Double spkWidth, spkHeight, spkLength, spkDiameter, spkFs, spkSd;

    EditText spkDiameterInput;
    EditText spkFsInput;
    EditText spkSdInput;
    EditText spkPortLen;
    EditText spkPortWdth;
    EditText spkPortHght;



    Button calculateButton;
    Button clearButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spkDiameterInput = (EditText)findViewById(R.id.SpeakerDiameter);
        spkFsInput = (EditText)findViewById(R.id.SpeakerFs);
        spkSdInput = (EditText)findViewById(R.id.SpeakerSd);
        spkPortLen = (EditText)findViewById(R.id.SpeakerPortLength);
        spkPortWdth = (EditText)findViewById(R.id.SpeakerPortWidth);
        spkPortHght = (EditText)findViewById(R.id.SpeakerPortHeight);

        calculateButton = (Button) findViewById(R.id.Calculatebutton);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(spkDiameterInput.getText().length() > 0) {
                    spkDiameter = Double.valueOf(spkDiameterInput.getText().toString());
                }
                if(spkFsInput.getText().length() > 0) {
                    spkFs = Double.valueOf(spkFsInput.getText().toString());
                }
                if(spkSdInput.getText().length() > 0) {
                    spkSd = Double.valueOf(spkSdInput.getText().toString());
                }

                if(spkDiameter != null && spkFs != null && spkSd != null) {
                    getPortSize(spkDiameter, spkFs, spkSd);
                    spkPortLen.setText(String.valueOf(spkLength));
                    spkPortWdth.setText(String.valueOf(spkWidth));
                    spkPortHght.setText(String.valueOf(spkHeight));
                }
                else {
                    spkDiameterInput.setText("");
                    spkFsInput.setText("");
                    spkSdInput.setText("");
                    spkPortLen.setText("");
                    spkPortHght.setText("");
                    spkPortWdth.setText("");
                    spkDiameter = null;
                    spkFs = null;
                    spkSd = null;
                }
            }
        });

        clearButton = (Button) findViewById(R.id.Clearbuttton);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spkDiameterInput.setText("");
                spkFsInput.setText("");
                spkSdInput.setText("");
                spkPortLen.setText("");
                spkPortHght.setText("");
                spkPortWdth.setText("");
                spkDiameter = null;
                spkFs = null;
                spkSd = null;
            }
        });
    }

    private void getPortSize(double spkDiameter, double spkFs, double spkSd) {
        double spdofsnd, waveLen;
        spdofsnd = 1130;
        spkHeight = spkDiameter * 1.2;
        waveLen = spdofsnd/spkFs;
        spkLength = 12 * (waveLen / 4);
        spkWidth = spkSd / spkHeight;
    }



    /*
    Hide Keyboard from https://stackoverflow.com/questions/4165414/how-to-hide-soft-keyboard-on-android-after-clicking-outside-edittext/40408252#40408252
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        View view = getCurrentFocus();
        if (view != null && (ev.getAction() == MotionEvent.ACTION_UP || ev.getAction() == MotionEvent.ACTION_MOVE) && view instanceof EditText && !view.getClass().getName().startsWith("android.webkit.")) {
            int scrcoords[] = new int[2];
            view.getLocationOnScreen(scrcoords);
            float x = ev.getRawX() + view.getLeft() - scrcoords[0];
            float y = ev.getRawY() + view.getTop() - scrcoords[1];
            if (x < view.getLeft() || x > view.getRight() || y < view.getTop() || y > view.getBottom())
                hideKeyboard(this);
        }
        return super.dispatchTouchEvent(ev);
    }

    public static void hideKeyboard(MainActivity act) {
        if(act!=null)
            ((InputMethodManager)act.getSystemService(Context.INPUT_METHOD_SERVICE)).hideSoftInputFromWindow((act.getWindow().getDecorView().getApplicationWindowToken()), 0);
    }
}