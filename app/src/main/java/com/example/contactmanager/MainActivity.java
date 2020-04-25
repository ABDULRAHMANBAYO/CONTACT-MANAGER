package com.example.contactmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.contactmanager.data.DatabaseHandler;
import com.example.contactmanager.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView contactListView;
    private ArrayList<String>contactArrayList;
    private ArrayAdapter<String>arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactListView= findViewById(R.id.listview);
        contactArrayList= new ArrayList<>();
        DatabaseHandler db = new DatabaseHandler(MainActivity.this);

//        Log.d("Count", "onCreate" + db.getCount());
        //Create contact object
//        db.addContact(new Contact("James","213986"));
//        db.addContact(new Contact("Greg","098765"));
//        db.addContact(new Contact("Helena","40678765"));
//        db.addContact(new Contact("Carimo","768345"));
//
//        db.addContact(new Contact("Silo","3445"));
//        db.addContact(new Contact("Santos","6665"));
//        db.addContact(new Contact("Litos","5344"));
//        db.addContact(new Contact("Karate","96534"));
//        db.addContact(new Contact("Guerra","158285"));
//        db.addContact(new Contact("Gema","78130"));

//        Contact jeremy = new Contact();
//        jeremy.setName("Jeremy");
//        jeremy.setPhoneNumber("08099229834");
////        db.addContact(jeremy);
//
//        Contact debola = new Contact();
//        jeremy.setName("Adebola");
//        jeremy.setPhoneNumber("07055772018");


        //Get a contact
//        Contact c = db.getContact(2);
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

        for (Contact contact : contactList) {
            Log.d("MainActivity", "onCreate:" + contact.getName());
            contactArrayList.add(contact.getName());
        }
        //create array adapter
        arrayAdapter= new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                contactArrayList
        );
        //add to our list view
       contactListView.setAdapter(arrayAdapter);

       //Attach event to list item
        contactListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("Onclick","onItemClick:"+contactArrayList.get(position));
            }
        });

    }
}
