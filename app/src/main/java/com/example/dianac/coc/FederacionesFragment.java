package com.example.dianac.coc;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dianac.coc.models.Escenarios;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * A simple {@link Fragment} subclass.
 */
public class FederacionesFragment extends Fragment {

    private FragmentActivity myContext;

    public String linea;

    private Retrofit retrofit;
    public static final String TAG = "DATOSCOLOMBIA";

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    List<Escenarios> listDatos;

    @Override
    public void onAttach(Activity activity) {
        myContext=(FragmentActivity) activity;
        super.onAttach(activity);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_federaciones, container, false);

        retrofit = new Retrofit.Builder().baseUrl("https://www.datos.gov.co/resource/")
                .addConverterFactory(GsonConverterFactory.create()).build();

        listDatos = new ArrayList<Escenarios>();

        // Obtener el Recycler
        recycler = (RecyclerView) view.findViewById(R.id.reciclador);

        // Usar un administrador para LinearLayout
        recycler.setLayoutManager(new LinearLayoutManager(view.getContext()));

        SitiosServicee service = retrofit.create(SitiosServicee.class);
        Call<List<Escenarios>> sitioRespuestaCall = service.obtenerListadeSitios();
        sitioRespuestaCall.enqueue(new Callback<List<Escenarios>>() {
            @Override
            public void onResponse(Call<List<Escenarios>> call, Response<List<Escenarios>> response) {
                if (response.isSuccessful()){
                    List lista = response.body();
                    for (int i=0; i<lista.size(); i++){
                        Escenarios m = (Escenarios) lista.get(i);
                        String tipo = m.getTipo();
                        // Inicializar Escenarios
                        if (tipo.equals("FEDERACIONES")) {
                            listDatos.add(m);
                        }

                        // Crear un nuevo adaptador
                        adapter = new EscAdapter(listDatos);
                        recycler.setAdapter(adapter);
                    }
                }
                else{
                    Log.e(TAG," onResponse: " + response.errorBody());
                }

            }

            @Override
            public void onFailure(Call<List<Escenarios>> call, Throwable t) {
                Log.e(TAG," onFailure: " + t.getMessage());
            }
        });

        return view;
    }

}
