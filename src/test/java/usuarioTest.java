package test.java;

import main.java.Usuario;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class usuarioTest {
    @Test
    public void validarNombreUsuarioSinNumerosTrue(){
        Usuario usuario = new Usuario();
        assertTrue("El nombre de usuario no debe de contener numeros",usuario.esNombreValido("Lucio"));
    }
    @Test
    public void testEsNombreValido_ConNumeros() {
        Usuario usuario = new Usuario();
        String nombre = "Juan123";
        assertFalse(usuario.esNombreValido(nombre));
    }
}

