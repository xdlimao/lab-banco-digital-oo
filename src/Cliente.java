
public class Cliente {

	private String nome;
	private String senha;
	public Cliente(){}
	public Cliente(String senha){
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
