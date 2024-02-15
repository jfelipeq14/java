package models;

public class Aprendiz{
    public String documento = "";
    public String nombre = "";
    public String apellido = "";

    public String getDocumento(){
        return documento;
    }

    public void setDocumento(String documento){
        this.documento = documento;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public Aprendiz(){
        this.documento="";
        this.nombre="";
        this.apellido="";
    }
}