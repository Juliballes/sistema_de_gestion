package hibernate.main.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "reclamos")
public class Reclamo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_de_creacion")
	private Date fechaCreacion;
	@Column(name = "tipo_de_reclamo")
	private String tipo;
	@Column(name = "estado")
	private String estado;

	

	

	

	public Reclamo(String tipo, String estado) {
		super();
		this.tipo = tipo;
		this.estado = estado;
		this.fechaCreacion = new Date();
	}

	public Reclamo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Reclamo [id=" + id + ", fechaCreacion=" + fechaCreacion + ", tipo=" + tipo + ", estado=" + estado + "]";
	}

	

}
