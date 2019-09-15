
package modelo;


import java.util.ArrayList;

public class Livraria {
	
private	double saldo;

private ArrayList<Item>acervo;


	public Livraria(){
		
		this.saldo = 1200;
		this.acervo = new ArrayList<Item>();
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	private void setSaldo(double saldo)throws NegativeException {
		if(saldo < 0 ) 
			throw new NegativeException("Operação não é válida, o saldo não poderá ficar negativo!");
	
		this.saldo = saldo;
	}
	
	public ArrayList<Item> getAcervo() {
		return this.acervo;
	}
        
	
	public void adquirirLivro(String titulo, String autor,String genero, int cod, double preco, String editora, int tipo){
		try {
		
		Livro novo = new Livro (titulo, autor, genero, cod, preco, editora, tipo);
		setSaldo(getSaldo()-novo.getPreco());
		acervo.add(novo);
		}catch(NegativeException e){
			System.err.println(e.getMessage());
			
		}
		
	}
	
	public void adquirirRevista(String nome, int cod, double preco, String editora, int tipo){
		try {
		
		Revista nova = new Revista (nome, cod, preco, editora, tipo);
		setSaldo(getSaldo()- nova.getPreco());
		acervo.add(nova);
		}catch(NegativeException e){
			System.err.println(e.getMessage());
			
		}
	}
	
	
	public void venderLivro(String nome){
            int f = 0;
            for(Item i:this.getAcervo()){
			
			if(i instanceof Livro && ((Livro) i).getTitulo().equals(nome))
                        {
                            try{

                           i.aplicaLucro();
                           acervo.remove(f);
                           setSaldo(getSaldo() + i.getPreco());
                           }catch(NegativeException e) {
                                   System.err.println(e.getMessage());

                           }
                            break;
                        }
			f++;
		
			}
		
		
	}
	
	
	/*public void venderRevista(String nome) {
		int i=0;
		int k=0;
		for(Item e: this.acervo) {
			if(e instanceof Revista && ((Revista)e).getNome().equals(nome));
			try {
				
				e.aplicaLucro();
				acervo.remove(e);
                                break;
			}catch(Exception ex){
				
				
				System.out.println(ex.getMessage());
			}
			
			i++;
			
			
		}
	
	}*/
	
	
	public void venderRevista(String nome){
            int f = 0;
            for(Item i:this.getAcervo()){
			
			if(i instanceof Revista && ((Revista) i).getNome().equals(nome))
                        {
                            try{

                           i.aplicaLucro();
                           acervo.remove(f);
                           setSaldo(getSaldo() + i.getPreco());
                           }catch(NegativeException e) {
                                   System.err.println(e.getMessage());

                           }
                            break;
                        }
			f++;
		
			}
		
		
	}
	
	public String verEstoque(){
		String lista = "";
		
		for(Item i:acervo){
			
			if(i instanceof Livro){
				
				lista= ((Livro)i).getTitulo() + "\n" + ((Livro) i).getAutor() + "\n" + ((Livro)i).getGenero()+ "\n" + i.getCod() + "\n" + i.getPreco() + "\n" + i.getEditora();
			}
			if (i instanceof Revista) {
				
				lista = ((Revista)i).getNome() + "\n" + i.getCod() + "\n" + i.getEditora()+ "\n"+ i.getPreco();
			}
		}
		return lista;
		
		
	}

        	public Item buscar(int cod){
		
		for(Item e: this.acervo) {
		try {	
                    if( e instanceof Livro) {
			if(cod == (e.getCod())) {
				System.out.println("Nome: " + ((Livro)e).getTitulo() + "Autor: " + ((Livro)e).getAutor() + "Gênero:" + ((Livro)e).getGenero()+ "Preço: " + ((Livro)e).getPreco());
				return e;
                               
			}
		} if( e instanceof Revista) {
			if(cod == (e.getCod())) {
				System.out.println("Nome: " + ((Revista)e).getNome() + "Editora: " + ((Revista)e).getEditora() + "Preço: " + ((Revista)e).getPreco());
				return e;
                               
			}
		} 
                }catch (Exception c) {
                        System.err.println("Produto não cadastrado" + c.getMessage());
                        
                        }
		
	}return null;
                }
}
