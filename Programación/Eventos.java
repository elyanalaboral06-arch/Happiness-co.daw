/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package happiness;

import java.util.ArrayList;

/**
 *
 * @author Ely
 */
public class Eventos {

    private int id;
    private String fecha;
    private String titulo;
    private String ubicacion;
    private String descripcion;

    private ArrayList<Galerias> coleccionGalerias;

    @Override
    public String toString() {
        return "Eventos{" + "id=" + id + ", fecha=" + fecha + ", titulo=" + titulo + ", ubicacion=" + ubicacion + ", descripcion=" + descripcion + ", coleccionGalerias=" + coleccionGalerias + '}';
    }

    public Eventos(int id, String fecha, String titulo, String ubicacion, String descripcion) {
        this.id = id;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.coleccionGalerias = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Galerias> getColeccionGalerias() {
        return coleccionGalerias;
    }

    public void setColeccionGalerias(ArrayList<Galerias> coleccionGalerias) {
        this.coleccionGalerias = coleccionGalerias;
    }

}
