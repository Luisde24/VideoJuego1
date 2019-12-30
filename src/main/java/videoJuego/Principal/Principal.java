package videoJuego.Principal;

import videoJuego.Vehiculos;

public class Principal {

    public static void main(String[] args) {

        //NUMERO DE PERSONAS QUE REALIZAN ATAQUES COMBINADOS
        Vehiculos v = new Vehiculos(3,4,"",2);
        System.out.println(v.PersonasEnAtaqueCombinado());


    }
}
