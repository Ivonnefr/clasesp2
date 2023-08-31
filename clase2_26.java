public class clase2_26 {
    Expendedor x = new Expendedor();
    Moneda m = new Moneda();
}


class Bebida {
    private int serie;

    public Bebida(int serie) {
        this.serie = serie;
    }

    public int getSerie() {
        return this.serie;
    }

    public void beber() {}
}

class Expendedor{

}
class Deposito{
    ArrayList<Bebida> bebidas = new ArrayList<Bebida>();
    public Deposito(){

    }
    Bebida b= new Bebida()
    
}