package impacta.ead.estacionamento.negocio;

import java.time.LocalDateTime;

/*
 * Representa o fluxo do veiculo dentro do estacionamento, ou seja
 * ele contem as informações de entra e saida do veiculo, e o valor
 * pago na estada
 * 
 */

public class Movimentacao {
	private Veiculo veiculo;
	private LocalDateTime dataHoraEntrada;
	private LocalDateTime dataHoraSaida;
	private double valor;
	
}
