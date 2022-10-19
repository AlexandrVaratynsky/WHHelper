package com.android.heightweightindex.whhelper;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.android.heightweightindex.whhelper.data.*;

public class MainActivity extends AppCompatActivity {
    Gender gender;
    String category;
    AgeCategoryLimits heightMaleLimits = new AgeMaleCategoryHeightLimits();
    AgeCategoryLimits weightMaleLimits = new AgeMaleCategoryWeightLimits();
    AgeCategoryLimits heightFemaleLimits = new AgeFemaleCategoryHeightLimits();
    AgeCategoryLimits weightFemaleLimits = new AgeFemaleCategoryWeightLimits();

    ResultCategory resultCategory = new ResultCategory();


    protected void setFieldActive() {
        EditText editHeight = findViewById(R.id.editTextHeight);
        EditText editWeight = findViewById(R.id.editTextWeight);
        Spinner editAge = findViewById(R.id.spinnerAges);
        editAge.setEnabled(true);
        editHeight.setEnabled(true);
        editWeight.setEnabled(true);
    }

    private void setCategory() {
        Spinner editAge = findViewById(R.id.spinnerAges);
        EditText editHeight = findViewById(R.id.editTextHeight);
        EditText editWeight = findViewById(R.id.editTextWeight);

        if (editAge.getSelectedItem().toString().isEmpty() || editHeight.getText().toString().isEmpty() || editWeight.getText().toString().isEmpty()) {
            return;
        }

        if (editHeight.getText().toString().equals("Infinity") || editWeight.getText().toString().equals("Infinity")) {
            category = "Error!!! Such BIG people do not exist";
            return;
        }

        int weightCategory = 4;
        int heightCategory = 4;

        AgeCategoryLimits heightLimits = null;
        AgeCategoryLimits weightLimits = null;


        if (gender == Gender.MALE) {
            heightLimits = heightMaleLimits;
            weightLimits = weightMaleLimits;
        }

        if (gender == Gender.FEMALE) {
            heightLimits = heightFemaleLimits;
            weightLimits = weightFemaleLimits;
        }
//============================================================================================

        heightCategory = heightLimits.getCategory(editAge.getSelectedItem().toString(), Float.valueOf(editHeight.getText().toString()));
        weightCategory = weightLimits.getCategory(editAge.getSelectedItem().toString(), Float.valueOf(editWeight.getText().toString()));

        System.out.println(heightCategory + " - " + weightCategory);

        category = resultCategory.getCategoryName(heightCategory, weightCategory);
    }

    //============================================================================================
    TextWatcher textWatcher = new TextWatcher() {

        public void afterTextChanged(Editable s) {
            recount();
        }

        public void beforeTextChanged(CharSequence s, int start,
                                      int count, int after) {
        }

        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button maleRadioButton = findViewById(R.id.radioButtonMale);
//        Button femaleRadioButton = findViewById(R.id.radioButtonFemale);
        EditText editHeight = findViewById(R.id.editTextHeight);
        EditText editWeight = findViewById(R.id.editTextWeight);
        Spinner editAge = findViewById(R.id.spinnerAges);
        editHeight.addTextChangedListener(textWatcher);
        editWeight.addTextChangedListener(textWatcher);
        editAge.setEnabled(false);
        editHeight.setEnabled(false);
        editWeight.setEnabled(false);

//        maleRadioButton.setBackgroundResource(R.drawable.ic_boy);
//
//        femaleRadioButton.setBackgroundResource(R.drawable.ic_girl);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.selected_item, heightFemaleLimits.getAges());
        adapter.setDropDownViewResource(R.layout.dropdown_item);
        editAge.setAdapter(adapter);
        editAge.setSelection(32);

        editAge.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                setCategory();
                TextView textView = findViewById(R.id.text);
                textView.setText(category);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }

        });

    }


    public void onRadioButtonClicked(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which RadioButton was clicked
        switch (view.getId()) {
            case R.id.radioButtonMale:
                if (checked) {
                    setFieldActive();
                    gender = Gender.MALE;
                    recount();
                }
                break;

            case R.id.radioButtonFemale:
                if (checked) {
                    setFieldActive();
                    gender = Gender.FEMALE;
                    recount();
                }
                break;

        }
    }
    void recount(){
        setCategory();
        TextView textView = findViewById(R.id.text);
        textView.setText(category);
    }
    enum Gender {MALE, FEMALE}
}