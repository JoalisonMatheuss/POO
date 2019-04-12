class Televisao {
	//Atributos
    
	private int polegadas;
    
	private boolean estaLigada;
    
	private double canal;
    
	private int volume;
   
    
	//Construtor
    
	public Televisao(int polegadas, boolean estaLigada, double canal, int volume){
        
		this.polegadas = polegadas;
        
		this.estaLigada = estaLigada;
        
		this.canal = canal;
        
		this.volume = volume;
    }
   
    
	//Métodos
    
	public int getPolegadas() {
        
		return polegadas;
    }
   
    
	public void setPolegadas(int polegadas){
        
		this.polegadas = polegadas;
    
	}
   
    
	public boolean getEstaLigada() {
        
		return estaLigada;
    
	}
   
    
	public void ligarDesligar() {
        
		if (estaLigada) {
            
			estaLigada = false;
        
		}
        
		else{
            
			estaLigada = true;
        
		}
    
	}
   
    
	public double getCanal(){
        
		return canal;
    
	}
   
    
	public void setCanal(double canal){
        
		this.canal = canal;
    
	}
   
    
	public int getVolume(){
        
		return volume;
    
	}
   
    
	public void setVolume(int volume){
        
		this.volume = volume;
    
	}
   

}



//Principal
public class Main {
    
	public static void main(String[] args) {
        
		Televisao tv = new Televisao(50, true, 7, 15);
        
		System.out.println("A Tv está " + tv.getEstaLigada());
    
	}

}




class Controle{
    
	private Televisao tv;
   
    
	//Construtor
    
	public Controle(Televisao tv){
        
		this.tv = tv;
    
	}
   
    
	//Métodos
    
	public double getCanal(){
        
		return tv.getCanal();
    
	}
   
    
	public void setCanal(double canal){
        
		tv.setCanal(canal);
    
	}
   
    
	public int getVolume(){
        
		return tv.getVolume();
    
	}
   
    
	public void setVolume(int volume){
        
		tv.setVolume(volume);
    
	}
   
    
	public boolean getEstaLigada(){
        
		return tv.getEstaLigada();
    
	}
   
    
	public void LigarDesligar(){
        
		tv.ligarDesligar();
    
	}
   

}
