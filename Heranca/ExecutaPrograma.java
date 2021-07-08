package heranca;

public class ExecutaPrograma extends Animal{

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		cachorro.setNome("Bob");
		cachorro.setIdade(3);
		cachorro.setCorre("Correndo...");
		cachorro.setEmiteSom("Emitindo som...AUAU");
		
		cavalo.setNome("Mark");
		cavalo.setIdade(5);
		cavalo.setEmiteSom("relinchar, rinchar, bufar...iiirrrrí, rilinchin\r\n"
				+ "");
		cavalo.setCorre("Cavalo Correando...");
		
		preguica.setNome("Lin");
		preguica.setIdade(3);
		preguica.setEmiteSom("Dormindo...ZZZZ");
		preguica.setSobearvores("Subindo em árvores...pulando...SUBI!");
		
		
		
		System.out.println("Nome do cachorro: " + cachorro.getNome());
		System.out.println("Idade do cachorro: " + cachorro.getIdade());
		System.out.println("Deve correr: " + cachorro.getCorre());
		System.out.println("Som: " + cachorro.getEmiteSom());
		
		System.out.println("Nome do cavalo: " + cavalo.getNome());
		System.out.println("Idade do cavalo: " + cavalo.getIdade());
		System.out.println("Deve correr: " + cavalo.getCorre());
		System.out.println("Som: " + cavalo.getEmiteSom());
		
		System.out.println("Nome da preguiça: " + preguica.getNome());
		System.out.println("Idade da preguiça  " + preguica.getIdade());
		System.out.println("Deve suvbir em árvores: " + preguica.getSobearvores());
		System.out.println("Som: " + preguica.getEmiteSom());
		
		
		
		
		
	
	}
	

}
