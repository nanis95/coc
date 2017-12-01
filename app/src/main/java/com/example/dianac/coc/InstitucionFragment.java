package com.example.dianac.coc;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class InstitucionFragment extends Fragment {


    @Override
    public void onAttach(Activity activity) {
        myContext=(FragmentActivity) activity;
        super.onAttach(activity);
    }

    View v;
    private FragmentActivity myContext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_institucion, container, false);

        CardView historia = v.findViewById(R.id.c_historia);
        CardView mv = v.findViewById(R.id.c_mision_vision);
        CardView valores = v.findViewById(R.id.c_valores);

        historia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent miIntent = new Intent(myContext,HistoriaActivity.class);
                startActivity(miIntent);
            }
        });

        mv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent miIntent = new Intent(myContext,MisionActivity.class);
                startActivity(miIntent);
            }
        });

        valores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent miIntent = new Intent(myContext,ValoresActivity.class);
                startActivity(miIntent);
            }
        });

        return v;
    }

}
