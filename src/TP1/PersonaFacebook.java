package TP1;

public class PersonaFacebook {
    protected String nickname;
    protected String nombre;
    protected  String apellido;
    protected  String id;

    public PersonaFacebook(String nickname, String nombre, String apellido, String id) {
        this.nickname = nickname;
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
