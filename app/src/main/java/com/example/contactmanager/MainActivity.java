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

        Log.d("Count","onCreate" +db.getCount());
      //Create contact object
        Contact jeremy = new Contact();
       jeremy.setName("Jeremy");
        jeremy.setPhoneNumber("08099229834");
//        db.addContact(jeremy);

        Contact debola = new Contact();
        jeremy.setName("Adebola");
        jeremy.setPhoneNumber("07055772018");


        //Get a contact
//        Contact c = db.getContact(1);
//        Log.d("Main","onCreate"+ c.getName()+ ", "+c.getPhoneNumber());
//        c.setName("Jk");
//        c.setPhoneNumber("0890999");
//Update contact
//       int updatedRow= db.updateContact(c);
//       Log.d("UpdatedRow","onCreate:"+updatedRow);
       //Delete  a contact
//        db.deleteContact(c);




//Get All contact
        List<Contact> contactList = db.getAllContacts();

        for(Contact contact: contactList){
            Log.d("MainActivity","onCreate:" + contact.getName());
        }

    }
}
