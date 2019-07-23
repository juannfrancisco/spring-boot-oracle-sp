package com.example.demo.repository;

import com.example.demo.model.DatosConvenio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface ConveniosRepository extends JpaRepository<DatosConvenio, Integer> {


    @Transactional
    @Procedure
    List<DatosConvenio> getAll();




    @Transactional
    @Query(nativeQuery = true,value = "? = call PR_OBTENERDATOSCONVENIO()")
    List<DatosConvenio> obt2();
}
