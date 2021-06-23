package ar.com.ada.api.empleadas.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
@Table (name = "categoria")
public class Categoria {

    @Id
    //Genera el autoincremental en el MySQL
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    @Column (name = "Categoria_id")
    private Integer categoria_Id;

    private String nombre;

    @Column (name = "sueldo_ Base")
    private BigDecimal sueldo_Base;

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Empleada> empleadas = new ArrayList<>();

    public List<Empleada> getEmpleadas() {
        return empleadas;
    }

    public void setEmpleadas(List<Empleada> empleadas) {
        this.empleadas = empleadas;
    }

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

    public void agregarEmpleada (Empleada empleada){
        this.empleadas.add(empleada);
    }

    

}
