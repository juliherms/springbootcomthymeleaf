package br.com.helpdesk.service;

import br.com.helpdesk.entidades.Sistema;

/**
 * Interface responsavel por garantir os meteodos de servico da classe sistema
 * @author j.a.vasconcelos
 *
 */
public interface SistemaService {
	
	/**
	 * retona uma lista de sistemas cadastrados no banco.
	 * @return
	 */
	Iterable<Sistema> list();

}
