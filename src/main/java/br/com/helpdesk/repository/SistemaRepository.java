package br.com.helpdesk.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.helpdesk.entidades.Sistema;

/**
 * Representa uma classe de repositorio - acesso a dados
 * 
 * @author j.a.vasconcelos
 *
 */
@Repository
public interface SistemaRepository extends CrudRepository<Sistema, Long> {

}
