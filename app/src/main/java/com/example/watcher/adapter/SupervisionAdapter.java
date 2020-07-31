package com.example.watcher.adapter;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.watcher.ItemClickListener;
import com.example.watcher.R;
import com.example.watcher.Supervision;
import com.example.watcher.entity.SupervisionEntity;

import java.util.ArrayList;

public class SupervisionAdapter extends RecyclerView.Adapter<SupervisionHolder> {

    Context c;
    ArrayList<SupervisionEntity> models;
    private Context mContext;

    public SupervisionAdapter(Context c, ArrayList<SupervisionEntity> models, Context context) {
        this.c = c;
        this.models = models;
        this.mContext = context;
    }


    @NonNull
    @Override
    public SupervisionHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from( viewGroup.getContext() ).inflate( R.layout.row, null );
        return new SupervisionHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull SupervisionHolder myHolder, int i) {

        myHolder.tv_abonado.setText( models.get(i).getAbonado() );
        myHolder.tv_estado.setText( models.get(i).getEstado() );
        myHolder.tv_hora.setText( models.get(i).getHora() );

        myHolder.setItemClickListener( new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {

                Intent intent = new Intent( c, Supervision.class );
                c.startActivity( intent );

            }
        } );

    }

    @Override
    public int getItemCount() {
        return models.size();
    }


}
