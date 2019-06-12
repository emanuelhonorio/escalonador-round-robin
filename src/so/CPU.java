package so;

public class CPU {
	
	public void executar(Processo processo, long quantum) {
		System.out.println(processo + " entrou na CPU");
		try {
			Thread.sleep(quantum);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		processo.decrementarTempo(quantum);
		
		System.out.println(processo + " saiu na CPU");
		System.out.println("------------------------");
		System.out.println("");
	}
}
