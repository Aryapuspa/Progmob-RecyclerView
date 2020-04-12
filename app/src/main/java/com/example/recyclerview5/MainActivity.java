package com.example.recyclerview5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    
    RecyclerView recyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;
    
    List<kumpulanData> data;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recview);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        data = new ArrayList<kumpulanData>();

        data.add(new kumpulanData("Nama: I Putu Arya Puspa Wibawa", "NIM: 1805551046 || Kelas: Pemrograman Mobile B"));
        data.add(new kumpulanData("--------------------------------------------------", " "));
        data.add(new kumpulanData("           Jadwal Perkuliahan               ", " "));
        data.add(new kumpulanData("--------------------------------------------------", " "));
        data.add(new kumpulanData("1. Analisis dan Desain Sistem", " Hari Senin || Jam: 11.00-13.30                                     3 Sks"));
        data.add(new kumpulanData("2. Integrasi dan Migrasi Sistem", "Hari Senin || Jam: 13.30-16.00                                      3 Sks"));
        data.add(new kumpulanData("3. Internet of Things", "Hari Selasa || Jam: 11.00-13.30                                    3 Sks"));
        data.add(new kumpulanData("4. Kecerdasan Tiruan", "Hari Selasa || Jam: 13.30-16.00                                    3 Sks"));
        data.add(new kumpulanData("5. Pemrograman Mobile", "Hari Rabu || Jam: 11.00-13.30                                       3 Sks"));
        data.add(new kumpulanData("6. Desain dan Perilaku Organisasi", "Hari Kamis || Jam: 11.00-13.30                                     3 Sks"));
        data.add(new kumpulanData("7. Jaringan Komputer dan Komunikasi", "Hari Jumat || 08.30-11.00                                               3 Sks"));
        data.add(new kumpulanData("8. Praktikum Pemrograman Internet", "-                                                                                             1 Sks"));
        data.add(new kumpulanData("9. Praktikum Integrasi dan Migrasi Sistem", "-                                                                                             1 Sks"));

        mAdapter = new myAdapter(this,data);
        recyclerView.setAdapter(mAdapter);

        
        
    }
}
