public class Main {
    public static void main(String[]args){
        //pon tu codigo para probar aqui, pero puedes usar el codigo que aparece en la retroaliementacion que entrega PA3P
        Tubo t = new Tubo();
        Pelota p1 = new Pelota();
        Pelota p2 = new Pelota();
        t.meteA(p1);
        t.meteB(p2);
    }
}
class Tubo {
    //debes completar el codigo escribiendo el metodo constructor, las propiedades y metodos: meteA, meteB,verTubo
    Pelota p1,p2;
    public Tubo(){
        p1 = null;
        p2 = null;
    }
    public void meteA(Pelota p){
        p1 = p;
    }
    public void meteB(Pelota p){
        p2 = p;
    }
}

class Pelota {
  //debes completar el codigo escribiendo el metodo constructor, la propiedad y metodo dameTuSerie
  //debes preguntarte si cada pelota que creas con este molde debe incicializarse con numero de serie distinto
  //debes imaginar que dameTuSerie es lo mismo que mirar el numero de serie impreso en la pelota por la fabrica
}