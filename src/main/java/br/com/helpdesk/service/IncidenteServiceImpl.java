package br.com.helpdesk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.helpdesk.entidades.Incidente;
import br.com.helpdesk.repository.IncidenteRepository;

/**
 * Classe responsavel por implementar a interface de incidente 
 * @author j.a.vasconcelos
 *
 */
@Service
public class IncidenteServiceImpl implements IncidenteService {

	@Autowired
    private IncidenteRepository repo;

	/**
	 * Lista todos os incidentes cadastrados no banco de dados
	 */
	public Iterable<Incidente> list() {
		return repo.findAll();
	}
}
