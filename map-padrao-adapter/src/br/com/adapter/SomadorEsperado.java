package br.com.adapter;
import java.util.Arrays;
import java.util.List;

public class SomadorEsperado extends SomadorExistente{
	
	private int[] vetor;
			
	public int somaVetor(int[] vetor) {
		
		this.vetor = vetor; 
		
		SomadorExistente somadorList = new SomadorExistente();
		
		List vetorList = Arrays.asList(vetor);
			
		return somadorList.somaLista(vetorList);
	}
	
	
	
		
	

}
