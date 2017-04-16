package com.example.juanherrera.appmartesnoche;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    RadioGroup container;
    Button botonVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        container = (RadioGroup) findViewById(R.id.radioGroup);
        botonVolver = (Button) findViewById(R.id.buttonVolver);
        botonVolver.setOnClickListener(this);

        container.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener (){
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if( checkedId == R.id.radioButton){
                    Toast.makeText(getApplicationContext(),"usted oprimio el boton 1", Toast.LENGTH_SHORT).show();
                }else if(checkedId == R.id.radioButton2){
                    Toast.makeText(getApplicationContext(),"usted oprimio el boton 2", Toast.LENGTH_SHORT).show();
                }else if(checkedId == R.id.radioButton3){
                    Toast.makeText(getApplicationContext(),"usted oprimio el boton 3", Toast.LENGTH_SHORT).show();
                }else if(checkedId == R.id.radioButton4){
                    Toast.makeText(getApplicationContext(),"usted oprimio el boton 4", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }

    @Override
    public void onClick(View v) {
        super.onBackPressed();
    }
}
