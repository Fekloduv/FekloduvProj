package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView final_text; //вводим переменные для активностей
private EditText text_field;
private Button res_button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final_text=findViewById(R.id.text_view); //помещаем в переменные объекты
        text_field=findViewById(R.id.text_field);
        res_button=findViewById(R.id.res_button);


        res_button.setOnClickListener(new View.OnClickListener() { //создаём событие по клику мыши на кнопку
            @Override
            public void onClick(View view) {
               Random random = new Random(); //класс создающий случайние числа
                int color= Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256)); // создаём перемннную с рандомным цветом
                String txt = text_field.getText().toString(); //переменная с введённым пользователем текстом
                final_text.setTextColor(color); // присвоение тексту цвета
                final_text.setText(txt); //вывод введённого пользователем текста

            }
        });
    }
}