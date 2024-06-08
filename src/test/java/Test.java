package test.java;

import main.java.Usuario;
import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class Test {

    //Validar que si envio un nombre sin numeros esta correcto
    @org.testng.annotations.Test
    public void validarNombreUsuarioSinNumerosTrue(){
        Usuario usuario = new Usuario();
        assertTrue(usuario.esNombreValido("Lucio"));
    }

    //Validar que si mando un nombre con numeros me tira el error

    @org.testng.annotations.Test
    public void testEsNombreValido_ConNumeros() {
        Usuario usuario = new Usuario();
        assertFalse(usuario.esNombreValido("Juan123"));
    }

    //Validar que teléfono debe contener solo números y tener entre 10 y 15 dígitos
    @org.testng.annotations.Test
    public void validarNumeroTelefonoSoloNumeros(){
        Usuario usuario = new Usuario();
        assertTrue(usuario.esTelefonoValido("2612194702"));
    }

    //Validar que si el telefono tiene letras tire el error
    @org.testng.annotations.Test
    public void validarNumeroTelefonoNumerosYletras(){
        Usuario usuario = new Usuario();
        assertFalse(usuario.esTelefonoValido("261219470qwerty"));
    }

    //Validar TelefonoMenos10Caracteres tire error
    @org.testng.annotations.Test
    public void validarNumeroTelefonoMenos10Caracteres(){
        Usuario usuario = new Usuario();
        assertFalse(usuario.esTelefonoValido("261219470"));
    }

    //Validar TelefonoMas15Caracteres tire error
    @org.testng.annotations.Test
    public void validarNumeroTelefonoMas15Caracteres(){
        Usuario usuario = new Usuario();
        assertFalse(usuario.esTelefonoValido("2612194701234567"));
    }

    //"El mail debe tener A-Z  @ A-Z ."
    @org.testng.annotations.Test
    public void mailTieneFormatoAdecuado(){
        Usuario usuario = new Usuario();
        assertTrue(usuario.esEmailValido("boca@boca"));
    }
    //"El mail debe tener A-Z  @ A-Z "
    @org.testng.annotations.Test
    public void mailTieneFormatoInadecuado(){
        Usuario usuario = new Usuario();
        assertFalse("El mail debe tener A-Z  @ A-Z ", usuario.esEmailValido("boca"));

    }

    //"El mail no debe estar vacio .",
    @org.testng.annotations.Test
    public void esMailVacio(){
        Usuario usuario = new Usuario();
        assertTrue( usuario.esMailVacio(""));
    }
    //Validar que el apellido contenga mayuscula inicial
    @org.testng.annotations.Test
    public void validarApellidoMayusculaInicial(){
        Usuario usuario = new Usuario();
        String apellido = "Martinez";
        assertTrue("El nombre de usuario no debe de contener numeros",usuario.apellidoConMayuscula(apellido));
    }

    //validar si la contraseña tiene 8 caracteres
    @org.testng.annotations.Test
    public void validarLongitudContraseniaCorrecta(){
        Usuario usuario = new Usuario();
        String contrasenia = "12345678";
        assertTrue("La contraseña debe tener al menos 8 caracteres.",usuario.esContraseniaValida(contrasenia));
    }

    //validar si la contraseña no tiene 8 caracteres
    @org.testng.annotations.Test
    public void validarLongitudContraseniaIncorrecta(){
        Usuario usuario = new Usuario();
        String contrasenia = "1234567";
        assertFalse("La contraseña debe tener al menos 8 caracteres.",usuario.esContraseniaValida(contrasenia));
    }

}

