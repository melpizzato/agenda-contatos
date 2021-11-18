package agendaTelefonica;

import org.junit.Test;

public class AgendaTest {
	
	@Test
	public void insereContatoCorretamente() {
		Contato c1 = new Contato("Maria", "51 94563-1213");
		Agenda agenda = new Agenda();
		
		agenda.adicionaContato(c1);
		
		System.out.println(agenda.getContatos());
	}
	
	@Test
	public void insereChamadaCorretamente() {
		Chamada c1 = new Chamada("51 97485-1417", "18/11/2021");
		Agenda agenda = new Agenda();
		
		agenda.cadastrarChamadaNaoAtendida(c1);
		
		System.out.println(agenda.getChamadas());
	}
	
	@Test
	public void removeContatoCorretamente() {
		Contato c1 = new Contato("Maria", "51 94563-1213");
		Agenda agenda = new Agenda();
		
		agenda.adicionaContato(c1);
		
		System.out.println(agenda.getContatos());
		
		agenda.removerContato(c1);
		
		System.out.println(agenda.getContatos());
	}
	
	@Test
	public void excluiListaDeChamadasNaoAtendidas() {
		Chamada c1 = new Chamada("51 97485-1417", "18/11/2021");
		Agenda agenda = new Agenda();
		
		agenda.cadastrarChamadaNaoAtendida(c1);
		
		System.out.println(agenda.getChamadas());
		
		agenda.excluirChamadasNaoAtendidas();
		
		System.out.println(agenda.getChamadas());
	}
	
	@Test
	public void mostraChamadasNaoAtendidasCorretamente() {
		Chamada ca1 = new Chamada("51 97485-1417", "18/11/2021");
		Contato co1 = new Contato("Maria", "51 94563-1213");
		Chamada ca2 = new Chamada("51 94563-1213", "11/11/2021");
		Agenda agenda = new Agenda();
		
		agenda.adicionaContato(co1);
		agenda.cadastrarChamadaNaoAtendida(ca2);
		agenda.cadastrarChamadaNaoAtendida(ca1);
		
		System.out.println(agenda.mostraChamadasNaoAtendidas());
	}

}
