package com.example.trivia.db.repository;

import com.example.trivia.db.entity.Categorie;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface CategoryRepository extends JpaRepository<Categorie, Integer> {
    /*
      La Interface CategoryRepository extiende de JpaRepository que a su vez
      extiende de CRUDRepository que esta clase tiene funciones ya definidas, 2 de ellas son findAll() y findById().
      Por lo tanto al solo declarar la interface no necesito escribir las funciones en el cuerpo, y este queda vacio. Automaticamente seran llamadas cuando las requiera.
    */

}
