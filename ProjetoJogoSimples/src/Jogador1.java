
public class Jogador1 {
	private String nome;
	private String arma;
	private int energia;
	
	
	public Jogador1(String nome, String arma, int energia) {
		this.nome = nome;
		this.arma = arma;
		if (energia < 0 || energia > 100) {
			this.energia = 100;
		}else this.energia = energia;
	}
	
	public void danoArma1() {
		this.energia -= 30;
		if(this.energia <= 0) {
			this.energia = 0;
		}
		
		System.out.println("Atingido pela arma 1.  - 30 de energia. Sua energia agora é " + this.energia);
		
		if(this.energia == 0) {
			System.out.println(this.getNome()+" Morreu");
		}
	}
	
	public void danoArma2() {
		this.energia -= 50;
		if(this.energia <= 0) {
			this.energia = 0;
		}
		System.out.println("Atingido pela arma 2.  -50 de energia. Sua energia agora é " + this.energia);
		
		if(this.energia == 0) {
			System.out.println(this.getNome()+" Morreu");
		}
	}
	
	public void cura() {
		if(this.energia <= 0) {
			System.out.println("Jogador morto. Não foi possível curar");
		}else {
			this.energia = 100;
			System.out.println("Energia restabelecida: " + this.energia);
		}
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}


	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
	
	
}
