package com.example.dianac.coc;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dianac.coc.models.Escenarios;

import java.util.List;

/**
 * Created by Diana C on 23/11/2017.
 */

public class EscAdapter extends RecyclerView.Adapter <EscAdapter.AdapterViewHolder> {
    private List<Escenarios> items;

    public static class AdapterViewHolder extends RecyclerView.ViewHolder{
        public TextView nombre;
        public TextView dpto;
        public TextView pag;
        public ImageView imagen;
        public View v;
        public Context c;

        public AdapterViewHolder(View v){
            super(v);
            nombre = (TextView) v.findViewById(R.id.comp);
            dpto = (TextView) v.findViewById(R.id.pru);
            pag = (TextView) v.findViewById(R.id.pag);
            this.v = v;
            c = c = v.getContext();
        }
    }

    public EscAdapter(List<Escenarios> items){
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public AdapterViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_view, viewGroup, false);
        return new AdapterViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final AdapterViewHolder viewHolder, final int i) {
        viewHolder.nombre.setText(items.get(i).getNombre());
        viewHolder.dpto.setText(items.get(i).getDepartamento());
        viewHolder.pag.setText(items.get(i).getPaginaweb());
    }
}
