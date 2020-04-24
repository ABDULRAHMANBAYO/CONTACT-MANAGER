package com.example.contactmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.contactmanager.data.DatabaseHandler;
import com.example.contactmanager.model.Contact;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db = new DatabaseHandler(MainActivity.this);
      //Create contact object

        Contact jeremy = new Contact();
       jeremy.setName("Jeremy");
        jeremy.setPhoneNumber("08099229834");

        Contact debola = new Contact();
        jeremy.setName("Adebola");
        jeremy.setPhoneNumber("07055772018");



//         db.addContact(jeremy);

        List<Contact> contactList = db.getAllContacts();

        for(Contact contact: contactList){
            Log.d("MainActivity","onCreate:" + contact.getId());
        }

    }
}
