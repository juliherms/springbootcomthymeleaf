package br.com.helpdesk.service;

import br.com.helpdesk.entidades.Release;

/**
 * Interface responsavel por garantir os metodos de servico da classe release
 * @author j.a.vasconcelos
 *
 */
public interface ReleaseService {
	
	/**
	 * Lista todas as releases cadastradas no sistema
	 * @return
	 */
	Iterable<Release> list();

}
