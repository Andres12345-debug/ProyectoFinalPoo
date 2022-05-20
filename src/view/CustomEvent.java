package view;

public interface CustomEvent {
    public void retornarLogIn(String usuario, String contraseña);
    public void retornarImpresionPersonas(String nombre, String apellido, String sexo, String identificacion, int cantidadNinos, int cantidadAdultos);
}

