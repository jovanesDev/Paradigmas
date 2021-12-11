package TP5.equals1;

import java.util.Objects;

public class Album {

    protected String artista;
    protected String titulo;

    public Album(String artista, String titulo) {
        this.artista = artista;
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return Objects.equals(artista, album.artista) && Objects.equals(titulo, album.titulo);
    }

}
