public class clase2 {
    public static void main(String[] args) {
	    //para probar el ejercicio:
        Balde b=new Balde(5); //se crea un balde de 5 litros
        b.llenar(12);         //trato de llenarlo con 12 litros
        int s = b.verificar();
        System.out.println(s);
	}
}
class Balde{
//atributos o propiedades de Balde: capacidad y contenido

    public Balde(){
        
    }
    
    public void llenar(int b){
        
    }
    
    public int verificar(){
        return 0;
    }
    
    public int vaciar(){
        return 0;
    }
}
