package com.example.disneyjava.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "personajes")
public class Personaje implements Serializable {

    private static final long serialVersionUID = 4255248638373971136L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String imagen;

    @Column(length = 50)
    private String name;

    private int edad;

    private double peso;

    private String historia;

    //Relacion muchos a muchos de personajes con peliculas o series
    @ManyToMany
    @JoinTable(name = "personaje_peliculaOSeries"
    ,joinColumns = @JoinColumn(name = "personajes_id")
    ,inverseJoinColumns = @JoinColumn(name = "peliculaOSeries_id")
    )

    private Set<PeliculaOSerie> peliculaOSeries;

    public Personaje(){}

    public Personaje(long id, String imagen, String name, int edad, double peso, String historia, Set<PeliculaOSerie> peliculaOSeries) {
        this.id = id;
        this.imagen = imagen;
        this.name = name;
        this.edad = edad;
        this.peso = peso;
        this.historia = historia;
        this.peliculaOSeries = peliculaOSeries;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public Set<PeliculaOSerie> getPeliculaOSeries() {
        return peliculaOSeries;
    }

    public void setPeliculaOSeries(Set<PeliculaOSerie> peliculaOSeries) {
        this.peliculaOSeries = peliculaOSeries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Personaje)) return false;
        Personaje personaje = (Personaje) o;
        return getId() == personaje.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "id=" + id +
                ", imagen='" + imagen + '\'' +
                ", name='" + name + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", historia='" + historia + '\'' +
                ", peliculaOSeries=" + peliculaOSeries +
                '}';
    }
}
