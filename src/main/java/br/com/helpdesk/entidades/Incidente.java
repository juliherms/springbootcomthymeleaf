package br.com.helpdesk.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

/**
 * Classe responsavel por representar no banco de dados uma tabela de incidentes
 * 
 * @author j.a.vasconcelos
 *
 */
@Entity
public class Incidente implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String titulo;
	private String descricao;

	@ManyToOne
	@JoinColumn(name = "sistema_id")
	private Sistema sistema;

	@ManyToOne
	@JoinTable(name = "incidente_release", joinColumns = @JoinColumn(name = "incidente_fk"), inverseJoinColumns = @JoinColumn(name = "release_fk"))
	private Release release;

	private String status;

	public Incidente() {

	}

	public Incidente(String titulo, String descricao, Sistema sistema, Release release, String status) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.sistema = sistema;
		this.release = release;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Sistema getSistema() {
		return sistema;
	}

	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}

	public Release getRelease() {
		return release;
	}

	public void setRelease(Release release) {
		this.release = release;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
