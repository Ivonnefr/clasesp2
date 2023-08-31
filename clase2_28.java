public class clase2_28 {
    Expendedor ex = new Expendedor();
    Moneda m = new Moneda();
    //main es el cliente
}
class Expendedor{
    //no hay propiedades
    private Deposito d;
    public Expendedor(capacidadDeposito){
        d = new Deposito();
        for (int i = 0; i < capacidadDeposito; i++) {
            deposito.addBebida(new Bebida(i));
        }
    }
    public void comprarBebida(Moneda m){
    }
}
class Bebida{
    public Bebida(){

    }
    public String beber(){
        return "gluglu";
    }
}
class Moneda{
    public Moneda(){

    }
}

class Deposito{
    public Deposito(){

    }
    public void agregarBebida(Bebida b){

    }
    public Bebida getBebida(){
        
    }
}
