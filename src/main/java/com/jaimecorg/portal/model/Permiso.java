package com.jaimecorg.portal.model;

import java.util.List;

public class Permiso {

    private int codigo;

    private String nombre;

    private List<Usuario> users;

    public Permiso(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Permiso(int codigo) {
        this.codigo = codigo;
    }

    public Permiso() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Permiso other = (Permiso) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }

    public List<Usuario> getUsers() {
        return users;
    }

    public void setUsers(List<Usuario> users) {
        this.users = users;
    }

}