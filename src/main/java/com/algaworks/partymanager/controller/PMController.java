package com.algaworks.partymanager.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.algaworks.partymanager.model.Convidado;
import com.algaworks.partymanager.model.Evento;
import com.algaworks.partymanager.model.ItemOrcamento;
import com.algaworks.partymanager.model.Lista;
import com.algaworks.partymanager.model.Presente;
import com.algaworks.partymanager.model.Promoter;
import com.algaworks.partymanager.repository.Eventos;
import com.algaworks.partymanager.service.CadastroConvidadoService;
import com.algaworks.partymanager.service.CadastroEventoService;
import com.algaworks.partymanager.service.CadastroItemOrcamentoService;
import com.algaworks.partymanager.service.CadastroListaService;
import com.algaworks.partymanager.service.CadastroPresenteService;
import com.algaworks.partymanager.service.CadastroPromoterService;

@Controller
@RequestMapping("/partymanager")
public class PMController {
	
	@RequestMapping
	public String home() {
		return "/partymanager/Home";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "/partymanager/Login";
	}
	
	@RequestMapping("/alterarSenha")
	public String alterarSenha() {
		return "/partymanager/AlterarSenha";
	}
/*================================CLASSE EVENTO==============================================================================*/	
		
	@Autowired
	private Eventos eventos;
	
	/* ******************REDIRECIONAR PARA CADASTRO DE EVENTOS************************** */
	@RequestMapping("/novoEvento")
	public ModelAndView novoEvento(Evento evento) {
		ModelAndView mv = new ModelAndView("/partymanager/CadastroEventos");
		return mv;
	}
	
	/* ******************LISTAR TODOS EVENTOS************************** */
	@RequestMapping("/listagemEventos")
	public ModelAndView listagemEventos() {
		List<Evento> todosEventos = eventos.findAll();
		ModelAndView mv = new ModelAndView("/partymanager/ListagemEventos");
		mv.addObject("eventos", todosEventos);
		return mv;
	}
	
	/* ******************CADASTRAR NOVO EVENTO************************** */
	@Autowired
	private CadastroEventoService cadastroEventoService;
	
	@RequestMapping(value = "/novoEvento", method = RequestMethod.POST)
	public ModelAndView salvarEvento(@Valid Evento evento, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()){
			return novoEvento(evento);
		}
		cadastroEventoService.Salvar(evento);
		attributes.addFlashAttribute("mensagem", "Evento salvo com sucesso!");
		return new ModelAndView("redirect:/partymanager/listagemEventos");
	}
	
	/* ******************EDITAR e MOSTRAR UM EVENTO************************** */
	private static final String CADASTRO_VIEW = "/partymanager/CadastroEventos";
	@RequestMapping("{id_evento}")
	public ModelAndView edicao(@PathVariable("id_evento") Evento evento) {
		ModelAndView mv = new ModelAndView(CADASTRO_VIEW); 
		mv.addObject(evento);
		return mv;
	}
	
	/*======================================FIM CLASSE EVENTO==========================================*/
	
	
	@RequestMapping("/novoPromoter")
	public ModelAndView novoPromoter(Promoter promoter) {
		ModelAndView mv = new ModelAndView("/partymanager/CadastroPromoter");
		return mv;
	}
	

	
	@RequestMapping("/listagemPresentes")
	public String pesquisaPresentes() {
		return "/partymanager/ListagemPresentes";
	}
	
	@RequestMapping("/novoPresente")
	public ModelAndView novoPresente(Presente presente){
		ModelAndView mv = new ModelAndView("/partymanager/CadastroPresentes");
		return mv;
	}
	
	@RequestMapping("/novoConvidado")
	public ModelAndView novoConvidado(Convidado convidado){
		ModelAndView mv = new ModelAndView("/partymanager/CadastroConvidados");
		return mv;
	}
	
	@RequestMapping("/listagemConvidados")
	public String listagemConvidado(){
		return "/partymanager/ListagemConvidados";
	}
	
	@RequestMapping("/novoItemOrcamento")
	public ModelAndView novoItemOrcamento(ItemOrcamento itemOrcamento){
		ModelAndView mv = new ModelAndView("/partymanager/CadastroItemOrcamento");
		return mv;
	}
	
	@RequestMapping("/novaLista")
	public ModelAndView novaLista(Lista lista){
		ModelAndView mv = new ModelAndView("/partymanager/CadastroLista");
		return mv;
	}
	
	@RequestMapping("/listagemItemOrcamento")
	public String listagemItemOrcamento(){
		return "/partymanager/ListagemItemOrcamento";
	}
	
	@RequestMapping("/listagemOrcamentos")
	public String listagemOrcamento(){
		return "/partymanager/ListagemOrcamentos";
	}
	
	@RequestMapping("/minhaConta")
	public String minhaConta(){
		return "/partymanager/MinhaConta";
	}
	
	@Autowired
	private CadastroPromoterService cadastroPromoterService;
	
	@RequestMapping(value = "/novoPromoter", method = RequestMethod.POST)
	public ModelAndView salvarPromoter(@Valid Promoter promoter, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()){
			return novoPromoter(promoter);
		}
		cadastroPromoterService.Salvar(promoter);
		attributes.addFlashAttribute("mensagem", "Promoter salvo com sucesso!");
		return new ModelAndView("redirect:/partymanager/login");
	}
	
	@Autowired
	private CadastroConvidadoService cadastroConvidadoService;
	
	@RequestMapping(value = "/novoConvidado", method = RequestMethod.POST)
	public ModelAndView salvarConvidado(@Valid Convidado convidado, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()){
			return novoConvidado(convidado);
		}
		cadastroConvidadoService.Salvar(convidado);
		attributes.addFlashAttribute("mensagem", "Convidado salvo com sucesso!");
		return new ModelAndView("redirect:/partymanager/listagemEventos");
	}
	
	@Autowired
	private CadastroPresenteService cadastroPresenteService;
	
	@RequestMapping(value = "/novoPresente", method = RequestMethod.POST)
	public ModelAndView salvarPresente(@Valid Presente presente, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()){
			return novoPresente(presente);
		}
		cadastroPresenteService.Salvar(presente);
		attributes.addFlashAttribute("mensagem", "Presente salvo com sucesso!");
		return new ModelAndView("redirect:/partymanager/listagemEventos");
	}
	
	@Autowired
	private CadastroItemOrcamentoService cadastroItemOrcamentoService;
	
	@RequestMapping(value = "/novoItemOrcamento", method = RequestMethod.POST)
	public ModelAndView salvarItemOrcamento(@Valid ItemOrcamento itemOrcamento, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()){
			return novoItemOrcamento(itemOrcamento);
		}
		cadastroItemOrcamentoService.Salvar(itemOrcamento);
		attributes.addFlashAttribute("mensagem", "Item de Orçamento salvo com sucesso!");
		return new ModelAndView("redirect:/partymanager/listagemItemOrcamento");
	}
	
	@Autowired
	private CadastroListaService cadastroListaService;
	
	@RequestMapping(value = "/novaLista", method = RequestMethod.POST)
	public ModelAndView salvarLista(@Valid Lista lista, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()){
			return novaLista(lista);
		}
		cadastroListaService.Salvar(lista);
		attributes.addFlashAttribute("mensagem", "Lista salva com sucesso!");
		return new ModelAndView();
	}
	
}
