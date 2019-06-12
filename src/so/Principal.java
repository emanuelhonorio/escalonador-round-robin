package so;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		CPU cpu = new CPU();
		long quantum = 2000L; // millis
		List<Processo> listaDePronto = preecherListaDePronto();
				
		while (!listaDePronto.isEmpty()) {
			Processo processoEscolhido = listaDePronto.remove(0);
			cpu.executar(processoEscolhido, quantum);
			
			if (processoEscolhido.getTempoExecucao() > 0) {
				listaDePronto.add(processoEscolhido); // Devolve a lista de pronto
			}
		}
		
		System.out.println("Acabou!");
	}

	private static List<Processo> preecherListaDePronto() {
		List<Processo> listaDePronto = new ArrayList<>();
		listaDePronto.add(new Processo(1L, "Processo 1", 8500L));
		listaDePronto.add(new Processo(2L, "Processo 2", 6325L));
		listaDePronto.add(new Processo(3L, "Processo 3", 12230L));
		listaDePronto.add(new Processo(4L, "Processo 5", 5000L));
		return listaDePronto;
	}
	

}
