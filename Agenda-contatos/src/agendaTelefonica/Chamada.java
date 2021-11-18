package agendaTelefonica;

public class Chamada {
	
	private String telefone;
	private String data;
	
	
	public Chamada(String telefone, String data) {
		this.telefone = telefone;
		this.data = data;
	}


	public String getTelefone() {
		return telefone;
	}


	@Override
	public String toString() {
		return telefone + ", data - " + data;
	}
	

}
