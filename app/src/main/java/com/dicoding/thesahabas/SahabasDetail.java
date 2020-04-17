package com.dicoding.thesahabas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class SahabasDetail extends AppCompatActivity {

    // public static final String NAME = "Sahabas Name";
    // public static final String DETAIL = "Sahabas Detail";
    // public static final String PHOTO = "Sahabas Photo";

    public static final String SAHABAS = "Sahabas";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sahabas_detail);

        ImageView sahabasPhoto = findViewById(R.id.sahaba_photo);
        TextView sahabasName = findViewById(R.id.sahaba_name);
        TextView sahabasDetail = findViewById(R.id.sahaba_detail);

        Sahabas sahabas = getIntent().getParcelableExtra(SAHABAS);

        if (sahabas != null) {
            Glide.with(this)
                    .load(sahabas.getPhoto())
                    .fitCenter()
                    .into(sahabasPhoto);
                sahabasName.setText(sahabas.getName());
                sahabasDetail.setText(sahabas.getDetail());
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail Sahabat");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
