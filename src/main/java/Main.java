package main.java;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");

        String apellido = JOptionPane.showInputDialog("Ingrese su apellido");

        String usuario = JOptionPane.showInputDialog("Ingrese su usuario");

        String contrasenia = JOptionPane.showInputDialog("Ingrese su contraseña");

        String telefono = JOptionPane.showInputDialog("Ingrese su telefono");

        String mail = JOptionPane.showInputDialog("Ingrese su mail");

        Usuario usuario1 = new Usuario(usuario, contrasenia, nombre, apellido, telefono, mail);
        JOptionPane.showMessageDialog(null, "main.java.Usuario creado: \nnombre: " + usuario1.getNombre() + "\napellido: "
        + usuario1.getApellido() + "\nusuario: " + usuario1.getUsuario() + "\ncontraseña: " + usuario1.getContrasenia() + "\ntelefono: " +
                usuario1.getNumeroTelefono() + "\nmail: " + usuario1.getMail());
    }
}