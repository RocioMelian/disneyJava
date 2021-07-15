package com.example.disneyjava.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "genero")
public class Genero implements Serializable {

    private static final long serialVersionUID = 1688072955951030127L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 50)
    private String nombre;

    private String imagen;

    @OneToMany(mappedBy = "genero")
    private Set<PeliculaOSerie> peliculaOSerieSet;

    public Genero(long id, String nombre, String imagen, Set<PeliculaOSerie> peliculaOSerieSet) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.peliculaOSerieSet = peliculaOSerieSet;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Set<PeliculaOSerie> getPeliculaOSerieSet() {
        return peliculaOSerieSet;
    }

    public void setPeliculaOSerieSet(Set<PeliculaOSerie> peliculaOSerieSet) {
        this.peliculaOSerieSet = peliculaOSerieSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Genero)) return false;
        Genero genero = (Genero) o;
        return getId() == genero.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Genero{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", imagen='" + imagen + '\'' +
                ", peliculaOSerieSet=" + peliculaOSerieSet +
                '}';
    }
}
