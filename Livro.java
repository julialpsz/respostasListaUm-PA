public class Livro {
	private String titulo;
	private String autor;
	private String editora;
	private int anoPublicado;
	
	public Livro(String t,String a,String e, int p) {
		this.titulo = t;
		this.autor = a;
		this.editora = e;
		this.anoPublicado = p;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public String getEditora() {
		return editora;
	}
	public int getAnoPublicado() {
		return anoPublicado;
	}
	
	public void setTitulo(String t) {
		this.titulo = t;
	}
	public void setAutor(String a) {
		this.autor = a;
	}
	public void setEditora(String e) {
		this.editora = e;
	}
	public void setAnoPublicado(int p) {
		this.anoPublicado = p;
	}
}
