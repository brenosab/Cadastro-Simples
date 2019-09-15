
package modelo;

public abstract class Item {
	
	private int cod;
	private double preco;
	private String editora;
        private int tipo;
	
	
	public Item (int cod, double preco, String editora, int tipo) {
		setCod(cod);
		setPreco(preco);
		setEditora(editora);
                setTipo(tipo);
		
	}
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}

        public int getTipo() {
            return tipo;
        }

        public void setTipo(int tipo) {
            this.tipo = tipo;
        }
        
	

	public abstract void aplicaLucro() throws NegativeException;
}
