package agendaTelefonica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Agenda {
	
	List<Chamada> chamadas;
	List<Contato> contatos;
	
	public Agenda() {
		this.chamadas = new ArrayList<>();
		this.contatos = new ArrayList<>();
	}
	
	public void adicionaContato(Contato c) {
		this.contatos.add(c);
	}
	
	public void removerContato(Contato c) {
		this.contatos.remove(c);
	}
	
	public void cadastrarChamadaNaoAtendida(Chamada c) {
		this.chamadas.add(c);
	}
	
	public void excluirChamadasNaoAtendidas() {
		this.chamadas.clear();
	}

	
	public List<Contato> getContatos() {
		return contatos;
	}

	public List<Chamada> getChamadas() {
		return chamadas;
	}

	public List<String> mostraChamadasNaoAtendidas(){
		List<String> chamadasNaoAtendidas = new ArrayList<>();
		
		for(int i = 0; i < this.chamadas.size(); i++) {
			if(i < this.contatos.size() && this.chamadas.get(i).getTelefone().equals(this.contatos.get(i).getTelefone())) {
				chamadasNaoAtendidas.add(this.contatos.get(i).getNome());
			}
			else {
				chamadasNaoAtendidas.add(this.chamadas.get(i).getTelefone());
			}
		}
		
		return chamadasNaoAtendidas;
		
	}
	

}
