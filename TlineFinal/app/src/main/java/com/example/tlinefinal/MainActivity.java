package com.example.tlinefinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    double spkWidth, spkHeight, spkLength, spkDiameter, spkFs, spkSd;

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
                spkDiameter = Double.valueOf(spkDiameterInput.getText().toString());
                spkFs = Double.valueOf(spkFsInput.getText().toString());
                spkSd = Double.valueOf(spkSdInput.getText().toString());

                if(spkDiameter > 0 || spkFs > 0 || spkSd > 0) {
                    getPortSize(spkDiameter, spkFs, spkSd);
                    spkPortLen.setText(String.valueOf(spkLength));
                    spkPortWdth.setText(String.valueOf(spkWidth));
                    spkPortHght.setText(String.valueOf(spkHeight));
                }
                else {
                    spkDiameterInput.setText("");
                    spkFsInput.setText("");
                    spkSdInput.setText("");
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
}