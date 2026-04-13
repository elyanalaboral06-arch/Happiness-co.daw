/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package happiness;

/**
 *
 * @author Ely
 */
public class Favoritos {

    private String correoUsuario;
    private String idEvento;

    public Favoritos(String correoUsuario, String idEvento) {
        this.correoUsuario = correoUsuario;
        this.idEvento = idEvento;
    }

    @Override
    public String toString() {
        return "Favoritos{" + "correoUsuario=" + correoUsuario + ", idEvento=" + idEvento + '}';
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(String idEvento) {
        this.idEvento = idEvento;
    }

}
