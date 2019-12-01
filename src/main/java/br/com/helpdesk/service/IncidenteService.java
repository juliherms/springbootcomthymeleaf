package br.com.helpdesk.service;

import br.com.helpdesk.entidades.Incidente;

/**
 * Classe responsavel por prover os metodos da classe de Incidente
 * 
 * @author j.a.vasconcelos
 *
 */
public interface IncidenteService {

	/**
	 * Lista todos os incidentes cadastrados no banco de dados
	 * @return
	 */
	Iterable<Incidente> list();

}
