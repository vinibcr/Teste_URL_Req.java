package URL_Req;

import java.util.Scanner;

public class Resposta {
	String cep;
	String logradouro;
	String complemento;
	String bairro;
	String localidade;
	String uf;
	
	Resposta( String cep,
			String logradouro,
			String complemento,
			String bairro,
			String localidade,
			String uf){
		
			this.cep= cep;	
			this.logradouro= logradouro;		
			this.complemento= complemento;	
			this.bairro= bairro;	
			this.uf= uf;			
			this.localidade= localidade;	
			}
	
		void consultaDados(){
		
			System.out.println("\ncep -"+this.cep);
			System.out.println("logradouro -"+this.logradouro);
			System.out.println("complemento -" + this.complemento);
			System.out.println("bairro -" +this.bairro);
			System.out.println("localidade -"+this.localidade);
			System.out.println("uf -"+this.uf); 
		}
		
		void alteraDados() {
			
			Scanner leitor = new Scanner(System.in);
			System.out.println ("Digite o complemento: ");  
			String complemento = leitor.next();
			leitor.close();
			this.complemento = complemento;
			this.consultaDados();
			
					
			
		}
		
		

}
