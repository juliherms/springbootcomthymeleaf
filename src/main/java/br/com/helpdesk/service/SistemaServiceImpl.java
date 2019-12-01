package br.com.helpdesk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.helpdesk.entidades.Sistema;
import br.com.helpdesk.repository.SistemaRepository;

/**
 * Representa uma classe de servicos que prover todos os metodos para a entidade Sistema
 * @author j.a.vasconcelos
 *
 */
@Service
public class SistemaServiceImpl implements SistemaService {
	
	@Autowired
    private SistemaRepository repo;

	/**
	 * Lista todos os sistemas cadastrados na base
	 */
	public Iterable<Sistema> list() {
		return repo.findAll();
	}

}
