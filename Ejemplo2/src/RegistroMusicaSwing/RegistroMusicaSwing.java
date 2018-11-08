package RegistroMusicaSwing;

import javax.swing.*;

public class RegistroMusicaSwing 
{
    public static void main(String[] args)
    {
        Registro_de_Musica();
    }
    
    public static void Registro_de_Musica()
    {
        String nombre, publico, clasificacion;
        double precio, total;
        String num;
        nombre = JOptionPane.showInputDialog("Ingrese el titulo de la cancion");
        publico = JOptionPane.showInputDialog("Ingrese tipo de musica Heavy, Pop, Salsa o Samba");
        num = JOptionPane.showInputDialog("Ingrese el precio de la Cancion");
        precio = Double.parseDouble(num);
        
        CalculoMusica met = new CalculoMusica();
        clasificacion = met.clasificacion(publico);
        total = met.precioenvio(precio);
        
        JOptionPane.showMessageDialog(
            null, "Titulo: " + nombre + "\nClasificacion: " + clasificacion
            + "\nCosto de Envio: " + total,
            "Los Datos de su cancion son: ", JOptionPane.PLAIN_MESSAGE);
        
        System.exit(0);
    }
}
