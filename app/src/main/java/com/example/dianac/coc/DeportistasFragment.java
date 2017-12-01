package com.example.dianac.coc;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dianac.coc.models.Deportista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class DeportistasFragment extends Fragment {

    private FragmentActivity myContext;
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    public String linea;

    @Override
    public void onAttach(Activity activity) {
        myContext=(FragmentActivity) activity;
        super.onAttach(activity);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_deportistas, container, false);

        List<Deportista> lista = new ArrayList<Deportista>();

        // Obtener el Recycler
        recycler = (RecyclerView) view.findViewById(R.id.reciclador);
        // Usar un administrador para LinearLayout
        recycler.setLayoutManager(new LinearLayoutManager(myContext));
        InputStream is = this.getResources().openRawResource(R.raw.deportistas);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        if (is != null){
            try {
                while ((linea=reader.readLine()) != null){
                    lista.add(new Deportista(linea.split(";")[0], linea.split(";")[1], linea.split(";")[2]));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Crear un nuevo adaptador
        adapter = new DepAdapter(lista);
        recycler.setAdapter(adapter);

        return view;
    }
}
