package com.example.android.quizii;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class SenjuActivity extends AppCompatActivity {

    int q1 = 0;
    int q2 = 0;
    int q3 = 0;
    int q4 = 0;
    int score = 0;

    Spinner spinner;
    String q4_answer;

    EditText txtDescription;

    RadioGroup q2radioGroup;
    RadioButton q3_radio_tobirama;
    RadioButton q3_radio_hiruzen;
    RadioButton q3_radio_jiraiya;
    RadioButton q3_radio_nagato;

    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senju);

        spinner = (Spinner) findViewById(R.id.senju_spinner);
        adapter = ArrayAdapter.createFromResource(this, R.array.kekkei_genkai,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String itemSelected = parent.getItemAtPosition(position).toString();

                if (itemSelected.equals("Wood Release") || itemSelected.equals("木遁")) {
                    q1 = 1;
                } else {
                    q1 = 0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        /* Radio Group for the second Question */
        q2radioGroup = (RadioGroup) findViewById(R.id.q2_radioGroup);
        /* Attach CheckedChangeListener to radio group */
        q2radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.q2_itama) {
                    q2 = 1;
                } else {
                    q2 = 0;
                }
            }

        });

        q3_radio_tobirama = (RadioButton) findViewById(R.id.q3_tobirama);
        q3_radio_hiruzen = (RadioButton) findViewById(R.id.q3_hiruzen);
        q3_radio_jiraiya = (RadioButton) findViewById(R.id.q3_jiraiya);
        q3_radio_nagato = (RadioButton) findViewById(R.id.q3_nagato);

        q3_radio_tobirama.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                q3_radio_tobirama.setChecked(true);
                q3_radio_hiruzen.setChecked(false);
                q3_radio_jiraiya.setChecked(false);
                q3_radio_nagato.setChecked(false);

                q3 = 1;
            }
        });

        q3_radio_hiruzen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                q3_radio_tobirama.setChecked(false);
                q3_radio_hiruzen.setChecked(true);
                q3_radio_jiraiya.setChecked(false);
                q3_radio_nagato.setChecked(false);

                q3 = 0;
            }
        });

        q3_radio_jiraiya.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                q3_radio_tobirama.setChecked(false);
                q3_radio_hiruzen.setChecked(false);
                q3_radio_jiraiya.setChecked(true);
                q3_radio_nagato.setChecked(false);

                q3 = 0;
            }
        });

        q3_radio_nagato.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                q3_radio_tobirama.setChecked(false);
                q3_radio_hiruzen.setChecked(false);
                q3_radio_jiraiya.setChecked(false);
                q3_radio_nagato.setChecked(true);

                q3 = 0;
            }
        });
    }

    public void Submit(View view) {

        Context context = getApplicationContext();
        txtDescription = (EditText) findViewById(R.id.q4_input);
        q4_answer = txtDescription.getText().toString();

        if (q4_answer.equalsIgnoreCase("kakuzu") || q4_answer.equalsIgnoreCase("角都")) {
            q4 = 1;
        } else {
            q4 = 0;
        }

        score = q1 + q2 + q3 + q4;

        if (score == 4) {
            Toast.makeText(context, "100%", Toast.LENGTH_SHORT).show();
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