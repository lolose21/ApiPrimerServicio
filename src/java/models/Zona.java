package models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Zona {

    private String nombre;
    private String localidad;
    private String ciudad;

    public Zona() {
    }

    public Zona(String nombre, String localidad, String ciudad) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.ciudad = ciudad;
    }
//<editor-fold defaultstate="collapsed" desc="getter and setter">

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

//</editor-fold>
}
