class TV{
    int polegada;
    int voltagem;
    int volume = 5;
    String marca;
    int canal = 11;
    
    void ligar(){
        int consumo = voltagem * polegada;
        System.out.println("TV ligada.");
        System.out.println("Consumo: " + voltagem * polegada + "Kwh.");
    }
    
    void desligar(){
        System.out.println("TV desligada.");
    }
    
    void Aumentarv(){
        if(volume < 10){
            volume++;
        }
    }
    
    void diminuirv(){
        if(volume > 5){
            volume--;
        }
    }
    
    void passarcanal(){
        canal++;
    }
    
    void voltarcanal(){
        canal--;
    }
}

public class TVnovas{
    public static void main(String [] args){
        
        TV t1= new TV();
        
        t1.marca = "Sony.";
        t1.polegada = 50;
        t1.voltagem = 110;
        
        
        t1.ligar();
        t1.passarcanal();
        t1.voltarcanal();
        
        System.out.println("Marca: " + t1.marca);
        System.out.println("Polegada: " + t1.polegada);
        System.out.println("Voltagem: " + t1.voltagem);
        System.out.println("Volume: " + t1.volume);
        System.out.println("Canal: " + t1.canal);
        t1.desligar();
    }
}
