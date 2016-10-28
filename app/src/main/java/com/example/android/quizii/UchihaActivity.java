package com.example.android.quizii;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.example.android.quizii.R.id.q1_radioGroup;

public class UchihaActivity extends AppCompatActivity {

    int score = 0;

    boolean q3_a = false;
    boolean q3_b = false;
    boolean q3_c = false;
    boolean q3_d = false;

    //private RadioGroup q1_radioGroup;
    //private RadioGroup q2_radioGroup;
    private RadioGroup q1radioGroup;
    private RadioGroup q2radioGroup;

    private static final String TAG = "Tag";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uchiha);

        /* Initialize Radio Group and attach click handler */
        q1radioGroup = (RadioGroup) findViewById(q1_radioGroup);
        q1radioGroup.clearCheck();

        /* Attach CheckedChangeListener to radio group */
        q1radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                if(checkedId == 2131427424){
                    Log.v(TAG, "checkedID is true" + checkedId);
                    Toast.makeText(UchihaActivity.this, rb.getText(), Toast.LENGTH_SHORT).show();
                    score++;
                } else {

                    Toast.makeText(UchihaActivity.this, "salad", Toast.LENGTH_SHORT).show();

                }

            }

        });

        /* Initialize Radio Group and attach click handler */
        q2radioGroup = (RadioGroup) findViewById(R.id.q2_radioGroup);
        q2radioGroup.clearCheck();

        /* Attach CheckedChangeListener to radio group */
        q2radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                if(null!=rb && checkedId > -1){
                    Toast.makeText(UchihaActivity.this, rb.getText(), Toast.LENGTH_SHORT).show();
                }

            }

        });

    }

    public void onClear(View view) {

        q1radioGroup.clearCheck();
        q2radioGroup.clearCheck();

    }

    public void Question1(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.q1_true:
                if (checked)
                    return;
                break;
            case R.id.q1_false:
                if (checked)
                    score = score + 1;
                break;

        }

    }

    public void Question2() {



    }

    public void Question3(View view) {

        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.q3_a:
                if (checked) {
                    q3_a = true;
                } else {
                    q3_a = false;
                } break;
        }

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.q3_b:
                if (checked) {
                    q3_b = true;
                } else {
                    q3_b = false;
                } break;
        }

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.q3_c:
                if (checked) {
                    q3_c = true;
                } else {
                    q3_c = false;
                } break;
        }

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.q3_d:
                if (checked) {
                    q3_d = true;
                } else {
                    q3_d = false;
                } break;
        }

        // If a, b, and c
        if (q3_a == true && q3_b == true && q3_c == true) {
            score++;
        } else {
            return;
        }

    }

    public void Question4() {



    }

    public void Submit(View view) {
        Context context = getApplicationContext();

        if (score == 4) {

            Toast.makeText(context, "100% " + score, Toast.LENGTH_SHORT).show();

        } else if (score == 3) {

            Toast.makeText(context, "75% " + score, Toast.LENGTH_SHORT).show();

        } else if (score == 2) {

            Toast.makeText(context, "50% " + score, Toast.LENGTH_SHORT).show();

        } else if (score == 1) {

            Toast.makeText(context, "25% " + score, Toast.LENGTH_SHORT).show();

        } else {

            Toast.makeText(context, "0% " + score, Toast.LENGTH_SHORT).show();

        }

    }

}
