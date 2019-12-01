package br.com.helpdesk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.helpdesk.entidades.Release;
import br.com.helpdesk.repository.ReleaseRepository;

/**
 * Classe responsavel por implementar a interface de servico de release
 * @author j.a.vasconcelos
 *
 */
@Service
public class ReleaseServiceImpl implements ReleaseService {

	@Autowired
	private ReleaseRepository repo;
	
	/**
	 * Lista todas as releases cadastradas no sistema
	 */
	public Iterable<Release> list() {
		return repo.findAll();
	}

}
