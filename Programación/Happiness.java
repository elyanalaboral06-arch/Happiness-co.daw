/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package happiness;

import java.util.*;

/**
 *
 * @author Ely
 */
public class Happiness {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    static HashMap<String, Usuarios> usuarios = new HashMap<>();

    static HashMap<String, Eventos> eventos = new HashMap<>();
    static int contadorEventos = 0;

    static HashMap<String, Galerias> galerias = new HashMap<>();
    static int contadorGalerias = 0;

    public static void main(String[] args) {

        int opcion;
        do {
        System.out.println("=====MENU=====");
        System.out.println("1.Opción Añadir usuario: ");
        System.out.println("2.Opción Eliminar usuario: ");
        System.out.println("3.Opción Añadir evento: ");
        System.out.println("4.Opción Eliminar evento: ");
        System.out.println("5.Opción Añadir galería: ");
        System.out.println("6.Opción Eliminar galería: ");
        System.out.println("7.Opción Añadir favorito: ");
        System.out.println("8.Opción Eliminar favorito: ");
        System.out.println("9. Salir");

        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {

            case 1 ->
                añadirUsuario();


            case 2 ->
                eliminarUsuraio();

            case 3 ->
                añadirEvento();

            case 4 ->
                eliminarEvento();

            case 5 ->
                añadirGaleria();
            case 6 ->
                eliminarGaleria();
            case 7 ->
                añadirFavorito();
            case 8 ->
                eliminarFavorito();




        }

        } while (opcion != 9);

}


    public static void añadirUsuario() {

        System.out.println("Nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Email: ");
        String email = sc.nextLine();

        System.out.println("Password: ");
        String password = sc.nextLine();

        if (usuarios.containsKey(email)) {
            System.out.println("El usuario ya existe");
        } else {
            Usuarios u = new Usuarios(nombre, email, password);
            usuarios.put(email, u);

            System.out.println("Usuario creado correctamente");
        }
        
    }


    public static void eliminarUsuraio() {

        System.out.println("Introduce el email: ");
        String email = sc.nextLine();

        if (!usuarios.containsKey(email)) {
            System.out.println("El usuario no existe ");

        } else {
            usuarios.remove(email);
            System.out.println("Usuario eliminiado correctamente");
        }
    }

    public static void añadirEvento() {

        sc.nextLine();

        System.out.println("Escribe la fecha: ");
        String fecha = sc.nextLine();

        System.out.println("Escribe el titulo: ");
        String titulo = sc.nextLine();

        System.out.println("Escribe la ubicacion:");
        String ubicacion = sc.nextLine();

        System.out.println("Escribe la descripcion");
        String descripcion = sc.nextLine();


        int id = contadorEventos++;

        Eventos e = new Eventos(id, fecha, titulo, ubicacion, descripcion);

        eventos.put(String.valueOf(id), e);

        System.out.println("Evento creado correctamente");


    }

    private static void eliminarEvento() {

        if (eventos.isEmpty()) {
            System.out.println("No hay eventos existentes ");
            return;
        }

        // Mostrar id, y titulo por pantalla
        for (Eventos e : eventos.values()) {
            System.out.println("ID" + e.getId() + "-" + e.getTitulo());
        }

        //pedir id
        System.out.println("Escribe el ID el evento a eliminar: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (eventos.remove(id) != null) {
            System.out.println("Evento eliminado correctamente");

        } else {
            System.out.println("El evento no exsite");

        }
    }

    private static void añadirGaleria() {
        // mostrar eventos por pantalla

        for (Eventos e : eventos.values()) {
            System.out.println("ID" + e.getId() + "-" + e.getTitulo());
        }

        //pedir id al usuario el idEvento
        System.out.println("Introduce el ID del evento: ");

        String idEvento = sc.nextLine();
        sc.nextLine();

        // comprobar el evento
        if (!eventos.containsKey(idEvento)) {
            System.out.println("El evento no existe");

            return;

        }
        // pedir datos al usuario para crear la galeria

        System.out.println("Introduce el titulo de la galeria");
        String titulo = sc.nextLine();

        int id = contadorGalerias++; //Id autogenerado

        Galerias g = new Galerias(id, titulo);

        //Obtener evento
        Eventos e = eventos.get(idEvento);

        // añadir al arrayList la galeria
        e.getColeccionGalerias().add(g);

        System.out.println("Galeria añanida correctamente");



    }

    private static void eliminarGaleria() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void añadirFavorito() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void eliminarFavorito() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
