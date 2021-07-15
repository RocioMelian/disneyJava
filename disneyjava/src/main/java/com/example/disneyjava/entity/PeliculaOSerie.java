package com.example.disneyjava.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "pelicula_serie")
public class PeliculaOSerie implements Serializable {

    private static final long serialVersionUID = -5318714837037449291L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String imagen;

    @Column(length = 50)
    private String titulo;

    private Date fecha_creacion;

    private String calificacion;

    public PeliculaOSerie(){}

   @ManyToOne
   @JoinColumn(name = "peliculasOSerie_genero")
   private Genero genero;

    public PeliculaOSerie(long id, String imagen, String titulo, Date fecha_creacion, String calificacion, Genero genero) {
        this.id = id;
        this.imagen = imagen;
        this.titulo = titulo;
        this.fecha_creacion = fecha_creacion;
        this.calificacion = calificacion;
        this.genero = genero;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PeliculaOSerie)) return false;
        PeliculaOSerie that = (PeliculaOSerie) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "PeliculaOSerie{" +
                "id=" + id +
                ", imagen='" + imagen + '\'' +
                ", titulo='" + titulo + '\'' +
                ", fecha_creacion='" + fecha_creacion + '\'' +
                ", calificacion='" + calificacion + '\'' +
                ", genero=" + genero +
                '}';
    }
}
