package main.java;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Ingrese su nombre (El nombre no debe contener números)");

        String apellido = JOptionPane.showInputDialog("Ingrese su apellido (El apellido no debe contener números y debe empezar con mayusculas)");

        String usuario = JOptionPane.showInputDialog("Ingrese su usuario (El usuario debe tener al menos 5 caracteres y no debe contener espacios)");

        String contrasenia = JOptionPane.showInputDialog("Ingrese su contraseña (La contraseña debe tener al menos 8 caracteres)");

        String telefono = JOptionPane.showInputDialog("Ingrese su telefono (El teléfono debe contener solo números y tener entre 10 y 15 dígitos)");

        String mail = JOptionPane.showInputDialog("Ingrese su mail");

        Usuario usuario1 = new Usuario(nombre, apellido, usuario, contrasenia, telefono, mail);
        JOptionPane.showMessageDialog(null, "main.java.Usuario creado: \nnombre: " + usuario1.getNombre() + "\napellido: "
        + usuario1.getApellido() + "\nusuario: " + usuario1.getUsuario() + "\ncontraseña: " + usuario1.getContrasenia() + "\ntelefono: "
        + usuario1.getTelefono() + "\nmail: " + usuario1.getEmail());
    }
}