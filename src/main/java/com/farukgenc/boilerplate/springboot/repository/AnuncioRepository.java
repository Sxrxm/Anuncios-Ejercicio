package com.farukgenc.boilerplate.springboot.repository;

import com.farukgenc.boilerplate.springboot.model.Anuncio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AnuncioRepository extends JpaRepository<Anuncio, Long> {

}
