package com.example.contactmanager;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    private TextView detailNameView;
    private TextView detailPhoneView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        detailNameView = findViewById(R.id.dets_name);
        detailPhoneView = findViewById(R.id.dets_phone);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)
        {
            String name= bundle.getString("name");
            String phoneNumber= bundle.getString("number");
            detailNameView.setText(name);
            detailPhoneView.setText(phoneNumber);


        }

    }
}
