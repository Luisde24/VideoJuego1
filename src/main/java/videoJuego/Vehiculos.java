package videoJuego;
import java.util.Scanner;
public class Vehiculos {

    private int nPersonas;
    private int cToneladas;
    private String ListaArmamento;
    private int municiones;

    public Vehiculos(int nPersonas, int cToneladas, String listaArmamento, int municiones) {
        this.nPersonas = nPersonas;
        this.cToneladas = cToneladas;
        this.ListaArmamento = listaArmamento;
        this.municiones = municiones;


    }

    public int getnPersonas() {
        return nPersonas;
    }

    public void setnPersonas(int nPersonas) {
        this.nPersonas = nPersonas;
    }

    public int getcToneladas() {
        return cToneladas;
    }

    public void setcToneladas(int cToneladas) {
        this.cToneladas = cToneladas;
    }

    public String getListaArmamento() {
        return ListaArmamento;
    }

    public void setListaArmamento(String  listaArmamento) {
        ListaArmamento = listaArmamento;
    }

    public int getMuniciones() {
        return municiones;
    }

    public void setMuniciones(int municiones) {
        this.municiones = municiones;
    }


    public int PersonasEnAtaqueCombinado(){

        int numero=0;
        //Un grupo de ataques combinados
        CamionHI c = new CamionHI(4,32,"",50);
        c.getnPersonas();
        Jeep j = new Jeep(4,30,"",10);
        j.getnPersonas();
        TanqueM4 t = new TanqueM4(10,25,"",15);
        t.getnPersonas();
        Motocicleta m = new Motocicleta(5,1,"",12);
        m.getnPersonas();
        CamionHI ca = new CamionHI(3,38,"",12);
        ca.getnPersonas();
        BombarderosB56 b = new BombarderosB56(10,32,"",20);
        b.getnPersonas();

        numero = c.getnPersonas() + j.getnPersonas() + t.getnPersonas() +  m.getnPersonas() +   ca.getnPersonas() + b.getnPersonas();



        return numero;
    }
    public int capacidadTransporte(){
        int capacidad=0;

        CamionHI c = new CamionHI(4,32,"",50);
        c.getcToneladas();
        Jeep j = new Jeep(4,30,"",10);
        j.getcToneladas();
        TanqueM4 t = new TanqueM4(10,25,"",15);
        t.getcToneladas();
        Motocicleta m = new Motocicleta(5,1,"",12);
        m.getcToneladas();
        CamionHI ca = new CamionHI(3,38,"",12);
        ca.getcToneladas();
        BombarderosB56 b = new BombarderosB56(10,32,"",20);
        b.getcToneladas();

        capacidad = c.getcToneladas() + j.getcToneladas() + t.getcToneladas() +  m.getcToneladas() +   ca.getcToneladas() + b.getcToneladas();



        return capacidad;
    }




}




