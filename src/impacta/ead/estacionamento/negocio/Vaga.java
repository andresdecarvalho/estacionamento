package impacta.ead.estacionamento.negocio;

/*
 * Representa as informações relativas as vagas do estcioanmento
 * ou estatus de ocupação.
 * 
 */
public class Vaga {
	public static int TOTAL_VAGAS = 100;
	private static int vagasOcupadas =0;
	
	/*
	 * Verificar a existencia de alguma vaga livre no estacionamento 
	 * 
	 * @return true se houver alguma vaga e false se estiver lotado
	 */
	public static boolean temVagaLivre() {
		//TODO implementar este metodo
		return false;
	}
	
	/**
	 * Buscar status atual das vagas do estacionamento
	 */
	public static void inicializarOcupadas() {
		//TODO implementar este metodo
	}
	
	/**
	 * Retorna o numero de vagas ocupadas 
	 * @return numero total de vagas ocupadas num determinado instante
	 */
	public static int ocupadas() {
		return Vaga.vagasOcupadas;
	}
	
	/**Retorna o numero de vagas livres
	 * @return numero total de vagas livres num determinado instante
	 */
	public static int livres() {
		return TOTAL_VAGAS - Vaga.vagasOcupadas;
	}
	
	/**
	 * Atualiza o numero de vagas ocupadas apos a entrada do veiculo
	 */
	public static void entrou() {
		Vaga.vagasOcupadas ++;
	}
}
