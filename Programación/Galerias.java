/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package happiness;

/**
 *
 * @author Ely
 */
public class Galerias {

    private Integer id;
    private String titulo;
    private String idEvento;

    @Override
    public String toString() {
        return "Galerias{" + "id=" + id + ", titulo=" + titulo + ", idEvento=" + idEvento + '}';
    }

    public Galerias(Integer id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(String idEvento) {
        this.idEvento = idEvento;
    }

}
