package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements
        CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    CheckBox cb;
    ToggleButton tb;
    private TextView textViewforToggleButton;
    RadioButton radioNewYear;
    RadioButton radioHalloween;
    ImageView image;

    ImageButton ShiskinImage;
    private TextView textViewforShishkinImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb=findViewById(R.id.checkbox);
        cb.setOnCheckedChangeListener(this);

        tb=findViewById(R.id.toggle_button);
        tb.setOnCheckedChangeListener(this);

        radioNewYear=findViewById(R.id.radioNewYear);
        radioHalloween=findViewById(R.id.radioHalloween);
        image=findViewById(R.id.image);

        radioNewYear.setOnClickListener(this);
        radioHalloween.setOnClickListener(this);

        ShiskinImage=findViewById(R.id.shiskin_image);
        ShiskinImage.setOnClickListener(this);
        textViewforShishkinImage=findViewById(R.id.shiskin_img_name);



    }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (buttonView == cb) {
            if (isChecked)
                cb.setText("Галочка установлена");
            else
                cb.setText("Галочка не установлена");
        }

        else
            if (!isChecked) {
                textViewforToggleButton = findViewById(R.id.textView);
                textViewforToggleButton.setVisibility(View.INVISIBLE);
            }
            else {
                textViewforToggleButton = findViewById(R.id.textView);
                textViewforToggleButton.setText("Текст виден");
                textViewforToggleButton.setVisibility(View.VISIBLE);
            }

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.radioNewYear)
            image.setImageResource(R.drawable.newy_year_);
        else if (v.getId() == R.id.radioHalloween)
            image.setImageResource(R.drawable.halloween);
        else if (v.getId() == R.id.shiskin_image)
            textViewforShishkinImage.setText("И.И.Шишкин \"На севере диком\"");

    }
}