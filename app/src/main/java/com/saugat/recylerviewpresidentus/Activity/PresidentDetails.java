package com.saugat.recylerviewpresidentus.Activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.saugat.recylerviewpresidentus.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class PresidentDetails extends AppCompatActivity {

    CircleImageView img;
    TextView tvName, tvDesc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_president_details);


        img = findViewById(R.id.img);
        tvName = findViewById(R.id.txtName);
        tvDesc = findViewById(R.id.txtDesc);

        Bundle bundle= getIntent().getExtras();

        if(bundle!=null)
        {
            int image=bundle.getInt("image");
            String name = bundle.getString("name");
            String detail = bundle.getString("detail");

            img.setImageResource(image);
            tvName.setText(name);
            tvDesc.setText(detail);

            ActionBar actionBar = getSupportActionBar();
            actionBar.setTitle(bundle.getString("name"));
        }
      }
}
