package com.example.dianac.coc;

import com.example.dianac.coc.models.Escenarios;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Diana C on 23/11/2017.
 */

public interface SitiosServicee {
    @GET("53ga-fhf4.json")
    Call<List<Escenarios>> obtenerListadeSitios();
}
