package ar.com.ada.api.empleadas.entities;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.*;


@Entity
@Table (name = "Empleada")
public class Empleada {

    @Id
    //Genera el autoincremental en el MySQL
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    @Column (name = "empleada_Id")
    private Integer empleada_Id;

    private String nombre;
    private Integer edad;

    @ManyToOne //join columns van donde esta FK
    @JoinColumn(name = "categoria_id", referencedColumnName = "categoria_id")
    private Categoria categoria;
    private BigDecimal sueldo;
    private int estado;

    @Column(name = "fecha_Alta")
    private Date fechaAlta;

    @Column(name = "fecha_Baja")
    private Date fechaBaja;

    

    public Integer getEmpleada_Id() {
        return empleada_Id;
    }

    public void setEmpleada_Id(Integer empleada_Id) {
        this.empleada_Id = empleada_Id;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }



    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }



    public BigDecimal getSueldo() {
        return sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }



    //ENUMERADO

    public EstadoEmpleadaEnum getEstado() {

        return EstadoEmpleadaEnum.parse(this.estado);
    }

    public void setEstadoId(EstadoEmpleadaEnum estado) {
        this.estado = estado.getValue();
    }



    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }



    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }



    //enumerado
    public enum EstadoEmpleadaEnum {
        ACTIVO(1), 
        INACTIVO(2); 
        

        private final int value;

        // NOTE: Enum constructor tiene que estar en privado
        private EstadoEmpleadaEnum(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static EstadoEmpleadaEnum parse(int id) {
            EstadoEmpleadaEnum status = null; // Default
            for (EstadoEmpleadaEnum item : EstadoEmpleadaEnum.values()) {
                if (item.getValue() == id) {
                    status = item;
                    break;
                }
            }
            return status;
        }
    

    }
}
