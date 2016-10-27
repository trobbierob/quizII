package com.example.android.quizii;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class UchihaActivity extends AppCompatActivity {

    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uchiha);
    }
/*
    public void Question1(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.u_q_radio1a:
                if (checked)
                    score++;
                break;
            case R.id.u_q_radio1b:
                if (checked)
                    score = score + 0;
                break;

        }

    }
*/
    public void Question2() {



    }
/*
    public void Question3(View view) {

        boolean checked = ((CheckBox) view).isChecked();

        boolean q3_a = false;
        boolean q3_b = false;
        boolean q3_c = false;
        boolean q3_d = false;

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkbox_q3_a:
                if (checked) {
                    q3_a = true;
                } else {
                    q3_a = false;
                } break;
        }

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkbox_q3_b:
                if (checked) {
                    q3_b = true;
                } else {
                    q3_b = false;
                } break;
        }

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkbox_q3_c:
                if (checked) {
                    q3_c = true;
                } else {
                    q3_c = false;
                } break;
        }

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkbox_q3_d:
                if (checked) {
                    q3_d = true;
                } else {
                    q3_d = false;
                } break;
        }

        if (q3_a == true && q3_b == true && q3_d == true) {
            score++;
        } else {
            return;
        } break;

    }
*/

    public void Question4() {



    }




}
