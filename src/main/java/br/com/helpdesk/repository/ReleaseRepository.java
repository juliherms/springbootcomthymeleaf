package br.com.helpdesk.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.helpdesk.entidades.Release;

/**
 * Representa uma classe de repositorio de acesso a dados
 * @author j.a.vasconcelos
 *
 */
@Repository
public interface ReleaseRepository extends CrudRepository<Release, Long> {

}
