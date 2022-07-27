
public class Jogador2 extends Jogador1 {
	
	private boolean armadura;
	private int energia;

	public Jogador2(String nome, String arma, int energia, boolean armadura) {
		super(nome, arma, energia);
		this.armadura = armadura;
		this.energia = energia;
	}

	@Override
	public void danoArma1() {
		if(armadura) {
			this.energia -= 20;
			if(this.energia <= 0) this.energia = 0;
			System.out.println("Armadura está ativa. Atingido por arma 1.  -20 de energia. Sua energia agora é " + this.energia);
		}if(!armadura) {
			this.energia -= 30;
			if(this.energia <= 0) this.energia = 0;
			System.out.println("Armadura está desativada. Atingido por arma 1.  -30 de energia. Sua energia agora é " + this.energia);
		}
		if (this.energia == 0) {
			System.out.println(getNome() + "Morreu");
		}
	}

	@Override
	public void danoArma2() {
		if(armadura) {
			this.energia -= 40;
			if(this.energia <= 0) this.energia = 0;
			System.out.println("Armadura está ativa. Atingido por arma 1.  -40 de energia. Sua energia agora é " + this.energia);
		}if(!armadura) {
			this.energia -= 40;
			if(this.energia <= 0) this.energia = 0;
			System.out.println("Armadura está desativada. Atingido por arma 1.  -40 de energia. Sua energia agora é " + this.energia);
		}
		if (this.energia == 0) {
			System.out.println(getNome() + "Morreu");
		}
	}

	@Override
	public void cura() {
		super.cura();
	}
	
	
	

}
