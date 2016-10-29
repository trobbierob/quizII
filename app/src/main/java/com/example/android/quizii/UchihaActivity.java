package com.example.android.quizii;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.example.android.quizii.R.id.q1_radioGroup;

public class UchihaActivity extends AppCompatActivity {

    int q1 = 0;
    int q2 = 0;
    int q3 = 0;
    int q4 = 0;
    int score = 0;

    boolean q3_a = false;
    boolean q3_b = false;
    boolean q3_c = false;
    boolean q3_d = false;

    boolean q4_a = false;
    boolean q4_b = false;
    boolean q4_c = false;
    boolean q4_d = false;

    RadioGroup q1radioGroup;
    RadioGroup q2radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uchiha);

        /* Radio Group for the first Question */
        q1radioGroup = (RadioGroup) findViewById(q1_radioGroup);

        /* Attach CheckedChangeListener to radio group */
        q1radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {;
                if(checkedId == R.id.q1_true){
                    q1 = 0;
                } else {
                    q1 = 1;
                }

            }

        });

        /* Radio Group for the second Question */
        q2radioGroup = (RadioGroup) findViewById(R.id.q2_radioGroup);

        /* Attach CheckedChangeListener to radio group */
        q2radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.q2_itachi){
                    q2 = 1;
                } else {
                    q2 = 0;
                }

            }

        });

    }

    public void Question3(View view) {

        boolean checked = ((CheckBox) view).isChecked();

        // Check CheckBox when Tobi is selected
        switch(view.getId()) {
            case R.id.q3_a:
                if (checked) {
                    q3_a = true;
                } else {
                    q3_a = false;
                } break;
        }

        // Check CheckBox when Madara is selected
        switch(view.getId()) {
            case R.id.q3_b:
                if (checked) {
                    q3_b = true;
                } else {
                    q3_b = false;
                } break;
        }

        // Check CheckBox when Obito is selected
        switch(view.getId()) {
            case R.id.q3_c:
                if (checked) {
                    q3_c = true;
                } else {
                    q3_c = false;
                } break;
        }

        // ChecK CheckBox when Pain is selected
        switch(view.getId()) {
            case R.id.q3_d:
                if (checked) {
                    q3_d = true;
                } else {
                    q3_d = false;
                } break;
        }

        /* Obito Uchiha went by several names. Although he wasn't the
        * real Madara, he became a symbol for it.
        * http://naruto.wikia.com/wiki/Obito_Uchiha */
        if (q3_a && q3_b && q3_c && !q3_d) {
            q3 = 1;
        } else {
            q3 = 0;
        }

    }

    public void Question4(View view) {

        boolean checked = ((CheckBox) view).isChecked();

        // Check CheckBox when Sasuke is selected
        switch(view.getId()) {
            case R.id.q4_a:
                if (checked) {
                    q4_a = true;
                } else {
                    q4_a = false;
                } break;
        }

        // Check CheckBox when Fugaku is selected
        switch(view.getId()) {
            case R.id.q4_b:
                if (checked) {
                    q4_b = true;
                } else {
                    q4_b = false;
                } break;
        }

        // Check CheckBox when Indra is selected
        switch(view.getId()) {
            case R.id.q4_c:
                if (checked) {
                    q4_c = true;
                } else {
                    q4_c = false;
                } break;
        }

        // Check CheckBox when Kagami is selected
        switch(view.getId()) {
            case R.id.q4_d:
                if (checked) {
                    q4_d = true;
                } else {
                    q4_d = false;
                } break;
        }

        /* This one is sort of a trick question. Here's a note from wikia:
         * During his debut, Indra's Mangekyō was depicted with a swirl
         * pattern. Later in the anime, Indra's Mangekyō Sharingan pattern
         * was changed to be the same as Sasuke's.
         * http://naruto.wikia.com/wiki/Indra_Ōtsutsuki */
        if (q4_a && q4_c && !q4_b && !q4_d) {
            q4 = 1;
        } else {
            q4 = 0;
        }

    }

    public void Submit(View view) {
        Context context = getApplicationContext();

        score = q1 + q2 + q3 + q4;

        if (score == 4) {

            Toast.makeText(context, "100%!", Toast.LENGTH_SHORT).show();

        } else if (score == 3) {

            Toast.makeText(context, "75%", Toast.LENGTH_SHORT).show();

        } else if (score == 2) {

            Toast.makeText(context, "50%", Toast.LENGTH_SHORT).show();

        } else if (score == 1) {

            Toast.makeText(context, "25%", Toast.LENGTH_SHORT).show();

        } else {

            Toast.makeText(context, "0%", Toast.LENGTH_SHORT).show();

        }

    }

}
