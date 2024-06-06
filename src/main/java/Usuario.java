package main.java;
import java.util.regex.Pattern;

public class Usuario {
    private String nombre;
    private String apellido;
    private String usuario;
    private String contrasenia;
    private String telefono;
    private String email;

    public Usuario(String nombre, String apellido, String usuario, String contrasenia, String telefono, String email) throws IllegalArgumentException {
        if (!esNombreValido(nombre)) {
            throw new IllegalArgumentException("El nombre no debe contener números.");
        }
        if (!esApellidoValido(apellido)) {
            throw new IllegalArgumentException("El apellido no debe contener números.");
        }
        if (!esUsuarioValido(usuario)) {
            throw new IllegalArgumentException("El usuario debe tener al menos 5 caracteres y no debe contener espacios.");
        }
        if (!esContraseniaValida(contrasenia)) {
            throw new IllegalArgumentException("La contraseña debe tener al menos 8 caracteres.");
        }
        if (!esTelefonoValido(telefono)) {
            throw new IllegalArgumentException("El teléfono debe contener solo números y tener entre 10 y 15 dígitos.");
        }
        if (!esEmailValido(email)) {
            throw new IllegalArgumentException("El formato del email es inválido.");
        }
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.telefono = telefono;
        this.email = email;
    }
public Usuario(){

}
    // Getters
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getUsuario() { return usuario; }
    public String getContrasenia() { return contrasenia; }
    public String getTelefono() { return telefono; }
    public String getEmail() { return email; }

    // Validaciones
    public boolean esNombreValido(String nombre) {
        return nombre.matches("[a-zA-Z ]+");
    }

    private boolean esApellidoValido(String apellido) {
        return apellido.matches("[a-zA-Z ]+");
    }

    private boolean esUsuarioValido(String usuario) {
        return usuario.matches("[a-zA-Z0-9]{5,}");
    }

    private boolean esContraseniaValida(String contraseña) {
        return contraseña.length() >= 8;
    }

    private boolean esTelefonoValido(String telefono) {
        return telefono.matches("\\d{10,15}");
    }

    private boolean esEmailValido(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", usuario='" + usuario + '\'' +
                ", contraseña='" + "********" + '\'' + // Mostrar la contraseña enmascarada
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}