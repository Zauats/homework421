package com.example.homework421;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView myList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myList = findViewById(R.id.myList);

        Phone phone1 =  new Phone("проверка части суток", "программа1",
                R.drawable.programm1);
        Phone phone2 =  new Phone("Диплом", "программа2",
                R.drawable.programm2);



        PhoneAdapter phoneAdapter = new PhoneAdapter(this);
        phoneAdapter.addContact(phone1);
        phoneAdapter.addContact(phone2);

        myList.setAdapter(phoneAdapter);
    }


}
