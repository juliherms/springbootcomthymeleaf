package br.com.helpdesk.web;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.stream.StreamSupport;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.Model;

import br.com.helpdesk.controller.HelpDeskController;
import br.com.helpdesk.entidades.Sistema;
import br.com.helpdesk.repository.SistemaRepository;
import br.com.helpdesk.service.SistemaService;

/**
 * Classe responsavel por realizar testes automatizados da nossa aplicacao
 * @author j.a.vasconcelos
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelpDeskControllerTest {
	
	@Autowired
	private HelpDeskController controller;
	
	@Autowired
	private SistemaService sistemaService;
	
	@Autowired
	private SistemaRepository sistemaRepository;
	
	@Mock
	private Model model;
	
	/**
	 * Teste a injecao de dependencia da classe controler
	 * @throws Exception
	 */
	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
	
	/**
	 * Teste de pesquisa de sistemas
	 * @throws Exception
	 */
	@Test
	public void pesquisarSistemas() throws Exception {
		
		String retorno = controller.pesquisarSistemas(model);
		assertEquals("sistemas",retorno);
	}
	
	/**
	 * Testa a pesquisa de sistemas a partir do servico
	 * @throws Exception
	 */
	@Test
	public void pesquisarSistemasAPartirDoService() throws Exception {
		
		Iterable<Sistema> sistemas = sistemaService.list();
		
		assertNotNull(sistemas);
		assertEquals(2, StreamSupport.stream(sistemas.spliterator(),false).count());
	}

	/**
	 * Testa a pesquisa de sistemas a partir do repositorio
	 * @throws Exception
	 */
	@Test
	public void pesquisarSistemasAPartirDoRepository() throws Exception {
		
		Iterable<Sistema> sistemas = sistemaRepository.findAll();
		
		assertNotNull(sistemas);
		assertEquals(2,StreamSupport.stream(sistemas.spliterator(), false).count());
	}
}
