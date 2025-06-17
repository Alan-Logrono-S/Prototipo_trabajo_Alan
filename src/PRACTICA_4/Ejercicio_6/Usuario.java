package PRACTICA_4.Ejercicio_6;

public class Usuario {
    private String password;

    public void setPassword(String password) {
        if(password.length() >= 8){
            this.password = password;
            System.out.println("Contraseña Aceptada.");
        }
        else{
            System.out.println("Contraseña Erronea.");
        }
        }
    }

