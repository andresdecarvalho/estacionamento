package impacta.ead.estacionamento.utilitario;

import impacta.ead.estacionamento.negocio.Movimentacao;

/*
 * Representa uma classe de apoio as demais do sistema
 * 
 */

public class EstacionamentoUtil {
	
	/**
	 * Valida a placa com o padrão nacional LL-NNNN
	 * L = Letra
	 * N = Numero
	 * 
	 * @param placa Placa do veiculo
	 * @return true se atender o padrão e false senão
	 */
	public boolean validarPadraoPlaca(String placa) {
		//TODO implementar 
		return false;
	}
	
	/**
	 * O calculo do valor da esta do veiculo baseado no tarifario
	 * e na hora de entrada e saida de veiculo
	 * 
	 * Altera o propria instancia do paramentro
	 * 
	 * @param movimentacao Instancia da movimentação
	 */
	public void calcularPagamento(Movimentacao movimentacao) {
		//TODO implementar 
		
	}
}
