
package modelo;

public class Livro extends Item {

	private String titulo;
	private String autor;
        private String genero;
	
	public Livro(String titulo, String autor,String genero, int cod, double preco, String editora, int tipo) {
		super(cod, preco, editora, tipo);
		setTitulo(titulo);
		setAutor(autor);
                setGenero(genero);
                setTipo(tipo);
		
		
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
        
        public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void aplicaLucro() {
		
		setPreco(getPreco()+getPreco()*0.2);

		
	}
	
}
