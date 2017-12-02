package modelo;

import android.media.Image;

/**
 * Created by desarrollo on 02-12-17.
 */

public class Producto {
     private int id;
     private String nombre;
     private String marca;
     private String categoria;
     private Double precio;
     private  Boolean estado;
     private int stock;
     private Image imagen;


     public Producto() {
     }

     public Producto(int id, String nombre, String marca, String categoria, Double precio, Boolean estado, int stock) {
          this.id = id;
          this.nombre = nombre;
          this.marca = marca;
          this.categoria = categoria;
          this.precio = precio;
          this.estado = estado;
          this.stock = stock;
         // this.imagen = imagen;
     }

     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
     }

     public String getNombre() {
          return nombre;
     }

     public void setNombre(String nombre) {
          this.nombre = nombre;
     }

     public String getMarca() {
          return marca;
     }

     public void setMarca(String marca) {
          this.marca = marca;
     }

     public String getCategoria() {
          return categoria;
     }

     public void setCategoria(String categoria) {
          this.categoria = categoria;
     }

     public Double getPrecio() {
          return precio;
     }

     public void setPrecio(Double precio) {
          this.precio = precio;
     }

     public Boolean getEstado() {
          return estado;
     }

     public void setEstado(Boolean estado) {
          this.estado = estado;
     }

     public int getStock() {
          return stock;
     }

     public void setStock(int stock) {
          this.stock = stock;
     }

     public Image getImagen() {
          return imagen;
     }

     public void setImagen(Image imagen) {
          this.imagen = imagen;
     }
}
