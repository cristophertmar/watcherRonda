package com.example.watcher;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.watcher.adapter.SupervisionAdapter;
import com.example.watcher.entity.SupervisionEntity;

import java.util.ArrayList;

public class Supervisiones extends AppCompatActivity {

    RecyclerView mRecyclerView;
    SupervisionAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_supervisiones );

        mRecyclerView = findViewById( R.id.recyclerView );
        mRecyclerView.setLayoutManager( new LinearLayoutManager( this ) );

        myAdapter = new SupervisionAdapter(this, getListDenuncia(), Supervisiones.this);
        mRecyclerView.setAdapter( myAdapter );


    }

    private ArrayList<SupervisionEntity> getListDenuncia(){

        ArrayList<SupervisionEntity> listado = new ArrayList<>(  );

        SupervisionEntity s = new SupervisionEntity();
        s.setAbonado("ATM - Real Plaza");
        s.setEstado("Pendiente");
        s.setHora("30/07/2020 14:00 hrs.");
        listado.add(s);

        s = new SupervisionEntity();
        s.setAbonado("ATM - Real Plaza");
        s.setEstado("Pendiente");
        s.setHora("30/07/2020 14:00 hrs.");
        listado.add(s);

        s = new SupervisionEntity();
        s.setAbonado("ATM - Real Plaza");
        s.setEstado("Pendiente");
        s.setHora("30/07/2020 14:00 hrs.");
        listado.add(s);

        s = new SupervisionEntity();
        s.setAbonado("ATM - Real Plaza");
        s.setEstado("Pendiente");
        s.setHora("30/07/2020 14:00 hrs.");
        listado.add(s);

        s = new SupervisionEntity();
        s.setAbonado("ATM - Real Plaza");
        s.setEstado("Pendiente");
        s.setHora("30/07/2020 14:00 hrs.");
        listado.add(s);

        s = new SupervisionEntity();
        s.setAbonado("ATM - Real Plaza");
        s.setEstado("Pendiente");
        s.setHora("30/07/2020 14:00 hrs.");
        listado.add(s);

        s = new SupervisionEntity();
        s.setAbonado("ATM - Real Plaza");
        s.setEstado("Pendiente");
        s.setHora("30/07/2020 14:00 hrs.");
        listado.add(s);

        s = new SupervisionEntity();
        s.setAbonado("ATM - Real Plaza");
        s.setEstado("Pendiente");
        s.setHora("30/07/2020 14:00 hrs.");
        listado.add(s);

        s = new SupervisionEntity();
        s.setAbonado("ATM - Real Plaza");
        s.setEstado("Pendiente");
        s.setHora("30/07/2020 14:00 hrs.");
        listado.add(s);

        s = new SupervisionEntity();
        s.setAbonado("ATM - Real Plaza");
        s.setEstado("Pendiente");
        s.setHora("30/07/2020 14:00 hrs.");
        listado.add(s);

        s = new SupervisionEntity();
        s.setAbonado("ATM - Real Plaza");
        s.setEstado("Pendiente");
        s.setHora("30/07/2020 14:00 hrs.");
        listado.add(s);

        s = new SupervisionEntity();
        s.setAbonado("ATM - Real Plaza");
        s.setEstado("Pendiente");
        s.setHora("14:00 hrs.");
        listado.add(s);

        s = new SupervisionEntity();
        s.setAbonado("ATM - Real Plaza");
        s.setEstado("Pendiente");
        s.setHora("30/07/2020 14:00 hrs.");
        listado.add(s);

        s = new SupervisionEntity();
        s.setAbonado("ATM - Real Plaza");
        s.setEstado("Pendiente");
        s.setHora("30/07/2020 14:00 hrs.");
        listado.add(s);

        s = new SupervisionEntity();
        s.setAbonado("ATM - Real Plaza");
        s.setEstado("Pendiente");
        s.setHora("30/07/2020 14:00 hrs.");
        listado.add(s);

        s = new SupervisionEntity();
        s.setAbonado("ATM - Real Plaza");
        s.setEstado("Pendiente");
        s.setHora("30/07/2020 14:00 hrs.");
        listado.add(s);



        return listado;



    }
}