package so;

public class Processo {
	private Long id;
	private String nome;
	private Long tempoExecucao;

	public Processo(Long id, String nome, Long tempoExecucao) {
		this.id = id;
		this.nome = nome;
		this.tempoExecucao = tempoExecucao;
	}

	public void decrementarTempo(long millis) {
		if (millis > this.tempoExecucao) {
			this.tempoExecucao = 0L;
		} else {
			this.tempoExecucao -= millis;
		}
	}

	@Override
	public String toString() {
		return "Processo [id=" + id + ", nome=" + nome + ", tempoExecucao=" + tempoExecucao + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getTempoExecucao() {
		return tempoExecucao;
	}

	public void setTempoExecucao(Long tempoExecucao) {
		this.tempoExecucao = tempoExecucao;
	}

}
