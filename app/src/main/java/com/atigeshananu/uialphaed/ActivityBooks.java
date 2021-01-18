package com.atigeshananu.uialphaed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityBooks extends AppCompatActivity {
    Button btn_book1,btn_book2,btn_book3,btn_book4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);



        btn_book1 = (Button) findViewById(R.id.book1);
        btn_book2 = (Button) findViewById((R.id.book2));
        btn_book3 = (Button) findViewById(R.id.book3);
        btn_book4 = (Button) findViewById((R.id.book4));


        btn_book1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActivityBooks.this,Book1.class);
                startActivity(i);

            }
        });

        btn_book2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i2 = new Intent(ActivityBooks.this,Book2.class);
                startActivity(i2);

            }
        });

        btn_book3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3 = new Intent(ActivityBooks.this,Book3.class);
                startActivity(i3);

            }
        });

        btn_book4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i4 = new Intent(ActivityBooks.this,Book4.class);
                startActivity(i4);

            }
        });



    }
}