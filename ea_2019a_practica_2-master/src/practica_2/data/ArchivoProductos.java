


import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import practica_2.Templates.Producto;


public class ArchivoProductos {
    void guardarProductos(ArrayList<Producto> productos){
        try {
            FileWriter fileWriter = new FileWriter("productos.txt", true);
            for (int i = 0; i < productos.size(); i++) {
                fileWriter.write(
                        "{{" + productos.get(i).getNombre() + "}}" +
                        "{{" + productos.get(i).getPrecio() + "}}" +
                        "{{" + productos.get(i).getPeso() + "}}" +
                        "{{" + productos.get(i).getVolumen() + "}}"
                );
                System.out.println(
                "{{" + productos.get(i).getNombre() + "}}" +
                "{{" + productos.get(i).getPrecio() + "}}" +
                "{{" + productos.get(i).getPeso() + "}}" +
                "{{" + productos.get(i).getVolumen() + "}}");
            }
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(ArchivoProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
