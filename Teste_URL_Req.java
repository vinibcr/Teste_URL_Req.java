package URL_Req;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.util.Calendar;

import org.json.JSONObject;

import com.mysql.jdbc.Connection;


public class Teste_URL_Req {
	
	Teste_URL_Req() {
		
		
		
	}
	
	
	
	
	public static void main (String [] args) {
		
		int cep;
		
		try {
			
		//outro link utilizado https://viacep.com.br/ws/17013905/json/ em vez de https://viacep.com.br/ws/17013905/json/?callback=?
			
		Scanner leitor = new Scanner(System.in);
	
		System.out.println ("Digite o cep: ");  

		cep=leitor.nextInt();
		//leitor.close();
			
		String url = "https://viacep.com.br/ws/"+cep+"/json/"; 
		//link para leitura
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		
		int responseCode = con.getResponseCode();
		System.out.println("\nURL : " + url);
		System.out.println("\nCodigo de resposta: " + responseCode);
		BufferedReader in = new BufferedReader( new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
		
		}
		in.close();
		
		//escreveremstring
		 //System.out.println(response.toString());
		
		//escrever resposta json
		 
		JSONObject myresponse= new JSONObject(response.toString());
		
		System.out.println("resposta trazida " +myresponse);
		
		//cep, logradouro, complemento, bairro, localidade e uf
		
		Resposta res = new Resposta(myresponse.getString("cep"), 
									myresponse.getString("logradouro"),
									myresponse.getString("complemento"),
									myresponse.getString("bairro"),
									myresponse.getString("localidade"),
									myresponse.getString("uf"));
		
		
			
				res.alteraDados();
			
		
				
				
				
	
		} catch (Exception e) {
			System.out.println(e);
		}
	}}
