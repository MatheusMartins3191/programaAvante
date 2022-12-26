package com.example.programaavante;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static final String PREFS_NAME = "prefs";

    int numberOfButtons = 60;

    private final boolean[] online = new boolean[numberOfButtons];

    Button[] btn = new Button[numberOfButtons];
    ImageView[] img = new ImageView[numberOfButtons];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setStatusBarColor(Color.BLACK);

        final Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        img[0] = findViewById(R.id.img1);
        img[1] = findViewById(R.id.img2);
        img[2] = findViewById(R.id.img3);
        img[3] = findViewById(R.id.img4);
        img[4] = findViewById(R.id.img5);
        img[5] = findViewById(R.id.img6);
        img[6] = findViewById(R.id.img7);
        img[7] = findViewById(R.id.img8);
        img[8] = findViewById(R.id.img9);
        img[9] = findViewById(R.id.img10);
        img[10] = findViewById(R.id.img11);
        img[11] = findViewById(R.id.img12);
        img[12] = findViewById(R.id.img13);
        img[13] = findViewById(R.id.img14);
        img[14] = findViewById(R.id.img15);
        img[15] = findViewById(R.id.img16);
        img[16] = findViewById(R.id.img17);
        img[17] = findViewById(R.id.img18);
        img[18] = findViewById(R.id.img19);
        img[19] = findViewById(R.id.img20);
        img[20] = findViewById(R.id.img21);
        img[21] = findViewById(R.id.img22);
        img[22] = findViewById(R.id.img23);
        img[23] = findViewById(R.id.img24);
        img[24] = findViewById(R.id.img25);
        img[25] = findViewById(R.id.img26);
        img[26] = findViewById(R.id.img27);
        img[27] = findViewById(R.id.img28);
        img[28] = findViewById(R.id.img29);
        img[29] = findViewById(R.id.img30);
        img[30] = findViewById(R.id.img31);
        img[31] = findViewById(R.id.img32);
        img[32] = findViewById(R.id.img33);
        img[33] = findViewById(R.id.img34);
        img[34] = findViewById(R.id.img35);
        img[35] = findViewById(R.id.img36);
        img[36] = findViewById(R.id.img37);
        img[37] = findViewById(R.id.img38);
        img[38] = findViewById(R.id.img39);
        img[39] = findViewById(R.id.img40);
        img[40] = findViewById(R.id.img41);
        img[41] = findViewById(R.id.img42);
        img[42] = findViewById(R.id.img43);
        img[43] = findViewById(R.id.img44);
        img[44] = findViewById(R.id.img45);
        img[45] = findViewById(R.id.img46);
        img[46] = findViewById(R.id.img47);
        img[47] = findViewById(R.id.img48);
        img[48] = findViewById(R.id.img49);
        img[49] = findViewById(R.id.img50);
        img[50] = findViewById(R.id.img51);
        img[51] = findViewById(R.id.img52);
        img[52] = findViewById(R.id.img53);
        img[53] = findViewById(R.id.img54);
        img[54] = findViewById(R.id.img55);
        img[55] = findViewById(R.id.img56);
        img[56] = findViewById(R.id.img57);
        img[57] = findViewById(R.id.img58);
        img[58] = findViewById(R.id.img59);
        img[59] = findViewById(R.id.img60);

        btn[0] = findViewById(R.id.btn1);
        btn[1] = findViewById(R.id.btn2);
        btn[2] = findViewById(R.id.btn3);
        btn[3] = findViewById(R.id.btn4);
        btn[4] = findViewById(R.id.btn5);
        btn[5] = findViewById(R.id.btn6);
        btn[6] = findViewById(R.id.btn7);
        btn[7] = findViewById(R.id.btn8);
        btn[8] = findViewById(R.id.btn9);
        btn[9] = findViewById(R.id.btn10);
        btn[10] = findViewById(R.id.btn11);
        btn[11] = findViewById(R.id.btn12);
        btn[12] = findViewById(R.id.btn13);
        btn[13] = findViewById(R.id.btn14);
        btn[14] = findViewById(R.id.btn15);
        btn[15] = findViewById(R.id.btn16);
        btn[16] = findViewById(R.id.btn17);
        btn[17] = findViewById(R.id.btn18);
        btn[18] = findViewById(R.id.btn19);
        btn[19] = findViewById(R.id.btn20);
        btn[20] = findViewById(R.id.btn21);
        btn[21] = findViewById(R.id.btn22);
        btn[22] = findViewById(R.id.btn23);
        btn[23] = findViewById(R.id.btn24);
        btn[24] = findViewById(R.id.btn25);
        btn[25] = findViewById(R.id.btn26);
        btn[26] = findViewById(R.id.btn27);
        btn[27] = findViewById(R.id.btn28);
        btn[28] = findViewById(R.id.btn29);
        btn[29] = findViewById(R.id.btn30);
        btn[30] = findViewById(R.id.btn31);
        btn[31] = findViewById(R.id.btn32);
        btn[32] = findViewById(R.id.btn33);
        btn[33] = findViewById(R.id.btn34);
        btn[34] = findViewById(R.id.btn35);
        btn[35] = findViewById(R.id.btn36);
        btn[36] = findViewById(R.id.btn37);
        btn[37] = findViewById(R.id.btn38);
        btn[38] = findViewById(R.id.btn39);
        btn[39] = findViewById(R.id.btn40);
        btn[40] = findViewById(R.id.btn41);
        btn[41] = findViewById(R.id.btn42);
        btn[42] = findViewById(R.id.btn43);
        btn[43] = findViewById(R.id.btn44);
        btn[44] = findViewById(R.id.btn45);
        btn[45] = findViewById(R.id.btn46);
        btn[46] = findViewById(R.id.btn47);
        btn[47] = findViewById(R.id.btn48);
        btn[48] = findViewById(R.id.btn49);
        btn[49] = findViewById(R.id.btn50);
        btn[50] = findViewById(R.id.btn51);
        btn[51] = findViewById(R.id.btn52);
        btn[52] = findViewById(R.id.btn53);
        btn[53] = findViewById(R.id.btn54);
        btn[54] = findViewById(R.id.btn55);
        btn[55] = findViewById(R.id.btn56);
        btn[56] = findViewById(R.id.btn57);
        btn[57] = findViewById(R.id.btn58);
        btn[58] = findViewById(R.id.btn59);
        btn[59] = findViewById(R.id.btn60);

        for (int i = 0; i < numberOfButtons; i++) {
            int index = i;
            btn[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    final VibrationEffect vibrationEffect;

                    if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.Q) {
                        vibrationEffect = VibrationEffect.createOneShot(50, 50);
                        vibrator.cancel();
                        vibrator.vibrate(vibrationEffect);
                    }


                    onOff(index);
                }
            });
        }

        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);

        for (int i = 0; i < numberOfButtons; i++) {
            String dataLocation = "online" + i;
            online[i] = settings.getBoolean(dataLocation, online[i]);
            if (online[i]) {
                img[i].setVisibility(View.VISIBLE);
            } else {
                img[i].setVisibility(View.INVISIBLE);
            }
        }
    }

    public void onOff(int index) {
        online[index] = !online[index];
        if (online[index]) {
            img[index].setVisibility(View.VISIBLE);
        } else {
            img[index].setVisibility(View.INVISIBLE);
        }
        setOnline(online[index], index);
    }

    protected void setOnline(boolean online, int index) {
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        String prefsIndex = "online" + index;
        editor.putBoolean(prefsIndex, online);
        editor.apply();
    }

}

