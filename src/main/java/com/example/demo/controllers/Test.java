package com.example.demo.controllers;

import com.example.demo.model.DatosConvenio;
import com.example.demo.repository.ConveniosRepository;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.List;

@Service
public class Test {

    @PersistenceContext
    private EntityManager em;


    public  List<DatosConvenio> test(){


        StoredProcedureQuery procedureQuery = em.createStoredProcedureQuery("PR_OBTENERDATOSCONVENIO",
                DatosConvenio.class);//PERSON_HISTORY table also has same fields
        procedureQuery.registerStoredProcedureParameter("PCUR_DATOS", void.class, ParameterMode.REF_CURSOR);
        procedureQuery.execute();
        @SuppressWarnings("unchecked")
        List<DatosConvenio> resultList = procedureQuery.getResultList();
        //without Person.class arg above list of object array will be returned
        resultList.forEach(System.out::println);



        return  resultList;


    }

}
