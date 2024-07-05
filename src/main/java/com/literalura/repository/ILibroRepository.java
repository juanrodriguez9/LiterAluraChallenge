package com.literalura.repository;

import com.literalura.model.Autor;
import com.literalura.model.Idioma;
import com.literalura.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ILibroRepository extends JpaRepository<Libro, Long> {

    List<Libro> findByIdiomas(Idioma idioma);

    List<Libro> findTop5ByOrderByNumeroDescargasDesc();

    @Query("SELECT l FROM Libro a JOIN a.autor l ")
    List<Autor> mostrarAutores();

    @Query("SELECT l FROM Libro a JOIN a.autor l WHERE l.fechaDeNacimiento <= : anio AND l.fechaDeMuerte >= :anio")
    List<Autor> mostrarAutoresVivos(String anio);

}

