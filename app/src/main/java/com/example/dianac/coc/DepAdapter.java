package com.example.dianac.coc;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dianac.coc.models.Deportista;

import java.util.List;

/**
 * Created by Diana C on 29/11/2017.
 */

public class DepAdapter extends RecyclerView.Adapter <DepAdapter.AdapterViewHolder> {
    private List<Deportista> items;

    public static class AdapterViewHolder extends RecyclerView.ViewHolder{
        public TextView nom_dep, deporte;
        public View v;
        public Context c;

        public AdapterViewHolder(View v){
            super(v);
            c = v.getContext();
            nom_dep = (TextView) v.findViewById(R.id.comp);
            deporte = (TextView) v.findViewById(R.id.pru);
            this.v = v;
        }
    }

    public DepAdapter(List<Deportista> items){
        this.items = items;
    }

    public int getItemCount(){
        return items.size();
    }

    public DepAdapter.AdapterViewHolder onCreateViewHolder(ViewGroup vg, int i){
        View v = LayoutInflater.from(vg.getContext()).inflate(R.layout.card_view_dep,vg,false);
        return new DepAdapter.AdapterViewHolder(v);
    }

    public void onBindViewHolder(final DepAdapter.AdapterViewHolder vh, final int i){
        vh.nom_dep.setText(items.get(i).getNombre());
        vh.deporte.setText("Disciplina: "+items.get(i).getDisciplina());
    }
}