
package Modelo;

import java.sql.Date;

public class Técnico extends Persona1 {
    String id_tecnico;

    public String getId_tecnico() {
        return id_tecnico;
    }

    public void setId_tecnico(String id_tecnico) {
        this.id_tecnico = id_tecnico;
    }

    @Override
    
    public String getDni() {
        return dni;
    }

    @Override
    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public Date getFechnac() {
        return fechnac;
    }

    @Override
    public void setFechnac(Date fechnac) {
        this.fechnac = fechnac;
    }

    @Override
    public int getIdrol() {
        return idrol;
    }

    @Override
    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    @Override
    public String getUser() {
        return user;
    }

    @Override
    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String getPass() {
        return pass;
    }

    @Override
    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
    
}
