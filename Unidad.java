package hibernate.main.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "unidades")
public class Unidad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "numero_de_unidad")
	private int numero;
	@Column(name = "estado")
	private String estado;

	public Unidad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Unidad(int numero, String estado) {
		super();
		this.numero = numero;
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Unidad [id=" + id + ", numero=" + numero + ", estado=" + estado + "]";
	}

}
