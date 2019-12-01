package br.com.helpdesk.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.helpdesk.entidades.Sistema;
import br.com.helpdesk.repository.SistemaRepository;

/**
 * Classe responsavel por executar uma carga de testes do banco de dados de memoria.
 * @author j.a.vasconcelos
 *
 */
@Service
public class DBService {

	@Autowired
	private SistemaRepository sistemaRepository;
	
	/**
	 * executa a carga inicial
	 */
	public void instantiateTestDatabase() {
		
		sistemaRepository.saveAll(getSistemas());
		
	}
	
	public List<Sistema> getSistemas(){
		
		List<Sistema> sistemas = new ArrayList<Sistema>();
		
		Sistema sistema = new Sistema();
		
		sistema.setNome("Sistema de Pagamento");
		sistema.setDescricao("Sistema de Pagamento de Despesas");
		sistemas.add(sistema);
		
		sistema = new Sistema();
		sistema.setNome("Sistema de Estoque");
		sistema.setDescricao("Sistema de Controle de Estoque da Companhia");
		sistemas.add(sistema);
		
		return sistemas;
		
	}
	
}
