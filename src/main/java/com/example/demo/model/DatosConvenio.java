package com.example.demo.model;


import javax.persistence.*;

@Entity( name = "datos_convenios")





@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "DatosConvenio.getAll",
                procedureName = "PR_OBTENERDATOSCONVENIO",
                resultClasses = DatosConvenio.class,
                parameters = {
                        @StoredProcedureParameter( mode=ParameterMode.REF_CURSOR,
                                name="PCUR_DATOS",
                                type=void.class)
                })
})


@NamedNativeQuery(
        name = "getReviews",
        query = "{? = call PR_OBTENERDATOSCONVENIO()}",
        resultClass = DatosConvenio.class)

public class DatosConvenio {

    @Id
    @Column( name = "id_convenio")
    private int idConvenio;

    @Column( name = "nombre_convenio")
    private String nombreConvenio;

    @Column( name = "tipo_de_convenio")
    private int tipoConvenio;

    @Column( name = "rut_de_convenio")
    private int rutConvenio;


    public int getIdConvenio() {
        return idConvenio;
    }

    public void setIdConvenio(int idConvenio) {
        this.idConvenio = idConvenio;
    }

    public String getNombreConvenio() {
        return nombreConvenio;
    }

    public void setNombreConvenio(String nombreConvenio) {
        this.nombreConvenio = nombreConvenio;
    }

    public int getTipoConvenio() {
        return tipoConvenio;
    }

    public void setTipoConvenio(int tipoConvenio) {
        this.tipoConvenio = tipoConvenio;
    }

    public int getRutConvenio() {
        return rutConvenio;
    }

    public void setRutConvenio(int rutConvenio) {
        this.rutConvenio = rutConvenio;
    }
}
