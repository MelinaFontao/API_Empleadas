package ar.com.ada.api.empleadas.entities;

import java.math.BigDecimal;

public class Categoria {

    private Integer categoria_Id;

    private String nombre;

    private BigDecimal sueldo_Base;

    public Integer getCategoria_Id() {
        return categoria_Id;
    }

    public void setCategoria_Id(Integer categoria_Id) {
        this.categoria_Id = categoria_Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getSueldo_Base() {
        return sueldo_Base;
    }

    public void setSueldo_Base(BigDecimal sueldo_Base) {
        this.sueldo_Base = sueldo_Base;
    }

    

}
