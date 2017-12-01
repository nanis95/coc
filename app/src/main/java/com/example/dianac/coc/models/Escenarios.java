package com.example.dianac.coc.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Diana C on 23/11/2017.
 */

public class Escenarios {

    @SerializedName("codigo")
    @Expose
    private String codigo;
    @SerializedName("departamento")
    @Expose
    private String departamento;
    @SerializedName("deporte")
    @Expose
    private String deporte;
    @SerializedName("direccion")
    @Expose
    private String direccion;
    @SerializedName("latitud")
    @Expose
    private String latitud;
    @SerializedName("longitud")
    @Expose
    private String longitud;
    @SerializedName("municipio")
    @Expose
    private String municipio;
    @SerializedName("nombre")
    @Expose
    private String nombre;
    @SerializedName("telefono")
    @Expose
    private String telefono;
    @SerializedName("tipo")
    @Expose
    private String tipo;
    @SerializedName("claseubicacion")
    @Expose
    private String claseubicacion;
    @SerializedName("descripcion")
    @Expose
    private String descripcion;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("localidadcomuna")
    @Expose
    private String localidadcomuna;
    @SerializedName("paginaweb")
    @Expose
    private String paginaweb;
    @SerializedName("razonsocial")
    @Expose
    private String razonsocial;
    @SerializedName("ubicacion")
    @Expose
    private String ubicacion;
    @SerializedName("urlimagen")
    @Expose
    private String urlimagen;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClaseubicacion() {
        return claseubicacion;
    }

    public void setClaseubicacion(String claseubicacion) {
        this.claseubicacion = claseubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocalidadcomuna() {
        return localidadcomuna;
    }

    public void setLocalidadcomuna(String localidadcomuna) {
        this.localidadcomuna = localidadcomuna;
    }

    public String getPaginaweb() {
        return paginaweb;
    }

    public void setPaginaweb(String paginaweb) {
        this.paginaweb = paginaweb;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getUrlimagen() {
        return urlimagen;
    }

    public void setUrlimagen(String urlimagen) {
        this.urlimagen = urlimagen;
    }

}

