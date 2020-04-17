package com.dicoding.thesahabas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import com.dicoding.thesahabas.OnItemClickCallback;

public class MainActivity extends AppCompatActivity {

    private RecyclerView lvSahabas;
    private ArrayList<Sahabas> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvSahabas = findViewById(R.id.lv_sahabas);
        lvSahabas.setHasFixedSize(true);

        list.addAll(SahabasData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        lvSahabas.setLayoutManager(new LinearLayoutManager(this));
        ListSahabasAdapter listSahabasAdapter = new ListSahabasAdapter(list);
        lvSahabas.setAdapter(listSahabasAdapter);

        listSahabasAdapter.setOnItemClickCallback(new OnItemClickCallback() {
            @Override
            public void onItemClicked(Sahabas sahabas) {
                showSelectedSahabas(sahabas);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.menu_about:
                Intent toAbout = new Intent(this, About.class);
                startActivity(toAbout);
                break;

            case R.id.menu_call_me:
                String phoneNumber = "087887056115";
                Intent callMe = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
                startActivity(callMe);
                break;

            case R.id.menu_share:
                Intent shareApp = new Intent(Intent.ACTION_SEND);
                shareApp.setType("text/plain");
                String shareSubject = "Ten Sahabas";
                String shareBody = "This application is made by Daniel Saputra";
                shareApp.putExtra(Intent.EXTRA_SUBJECT, shareSubject);
                shareApp.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(shareApp);
                break;
        }
    }

    private void showSelectedSahabas(Sahabas sahabas) {

        Intent toSahabasDetail = new Intent(this, SahabasDetail.class);
        toSahabasDetail.putExtra(SahabasDetail.SAHABAS, sahabas);
        startActivity(toSahabasDetail);


    }
}
