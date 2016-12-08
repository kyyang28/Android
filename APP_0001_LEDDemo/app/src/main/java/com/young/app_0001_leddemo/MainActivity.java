package com.young.app_0001_leddemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private boolean ledStatus = false;
    private Button button = null;
    private CheckBox checkBoxLed1 = null;
    private CheckBox checkBoxLed2 = null;
    private CheckBox checkBoxLed3 = null;
    private CheckBox checkBoxLed4 = null;

    /*
    class MyButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            // Perform action on click
            ledStatus = !ledStatus;

            if (ledStatus)
                button.setText("ALL OFF");
            else
                button.setText("ALL ON");
        }
    }
    */

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        Context context = getApplicationContext();
        CharSequence text = null;
        int duration = Toast.LENGTH_SHORT;


        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.LED1:
                if (checked) {
                    // LED1 on
                    text = "LED1 ON";
                    Toast.makeText(context, text, duration).show();
                } else {
                    // LED1 off
                    text = "LED1 OFF";
                    Toast.makeText(context, text, duration).show();
                }
                break;

            case R.id.LED2:
                if (checked) {
                    // LED2 on
                    text = "LED2 ON";
                    Toast.makeText(context, text, duration).show();
                } else {
                    // LED2 off
                    text = "LED2 OFF";
                    Toast.makeText(context, text, duration).show();
                }
                break;

            case R.id.LED3:
                if (checked) {
                    // LED3 on
                    text = "LED3 ON";
                    Toast.makeText(context, text, duration).show();
                } else {
                    // LED3 off
                    text = "LED3 OFF";
                    Toast.makeText(context, text, duration).show();
                }
                break;

            case R.id.LED4:
                if (checked) {
                    // LED4 on
                    text = "LED4 ON";
                    Toast.makeText(context, text, duration).show();
                } else {
                    // LED4 off
                    text = "LED4 OFF";
                    Toast.makeText(context, text, duration).show();
                }
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.BUTTON);
        checkBoxLed1 = (CheckBox) findViewById(R.id.LED1);
        checkBoxLed2 = (CheckBox) findViewById(R.id.LED2);
        checkBoxLed3 = (CheckBox) findViewById(R.id.LED3);
        checkBoxLed4 = (CheckBox) findViewById(R.id.LED4);
        //button.setOnClickListener(new MyButtonListener());

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                ledStatus = !ledStatus;

                if (ledStatus) {
                    button.setText("ALL OFF");
                    checkBoxLed1.setChecked(true);
                    checkBoxLed2.setChecked(true);
                    checkBoxLed3.setChecked(true);
                    checkBoxLed4.setChecked(true);
                    Toast.makeText(getApplicationContext(), "LED ALL ON", Toast.LENGTH_SHORT).show();
                } else {
                    button.setText("ALL ON");
                    checkBoxLed1.setChecked(false);
                    checkBoxLed2.setChecked(false);
                    checkBoxLed3.setChecked(false);
                    checkBoxLed4.setChecked(false);
                    Toast.makeText(getApplicationContext(), "LED ALL OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
