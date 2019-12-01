package br.com.helpdesk.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.helpdesk.service.DBService;


/**
 * Classe responsavel por configurar o properties de test
 * @author j.a.vasconcelos
 *
 */
@Configuration
//@Profile("test")
public class TestConfig {

	@Autowired
	private DBService dbService;
	
	/**
	 * Instancia a carga de testes na base de dados.
	 * @return
	 */
	@Bean
	public boolean instantiateDatabase() {
		dbService.instantiateTestDatabase();
		return true;
	}
}
