package br.com.heldesk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.helpdesk.service.IncidenteService;
import br.com.helpdesk.service.ReleaseService;
import br.com.helpdesk.service.SistemaService;

/**
 * Classe responsavel por receber as requisicoes e retornar para a view
 * 
 * @author j.a.vasconcelos
 *
 */
@Controller
public class HelpDeskController {

	@Autowired
	private SistemaService sistemaService;

	@Autowired
	private IncidenteService incidenteService;

	@Autowired
	private ReleaseService releaseService;

	/**
	 * Metodo responsavel por retornar uma lista de sistemas
	 * @param model
	 * @return
	 */
	@GetMapping("/sistemas")
	public String pesquisarSistemas(Model model) {
		model.addAttribute("sistemas", sistemaService.list());
		return "sistemas";
	}
	
	/**
	 * Metodo responsavel por lista todos os incidentes no sistema
	 * @param model
	 * @return
	 */
    @GetMapping("/incidentes")
    public String pesqisarIncidentes(Model model){
        model.addAttribute("incidentes", incidenteService.list());
        return "incidentes";
    }
    
    /**
     * Metodo responsavel por listar todas a releases no sistema
     * @param model
     * @return
     */
    @GetMapping("/releases")
    public String retrieveReleases(Model model){
        model.addAttribute("releases", releaseService.list());
        return "releases";
    }

}
