package teste;

public class Teste {

    public static void main(String[] args) {
        DetalhesdoPedido ovo = new DetalhesdoPedido(01,"Skyrim",
                5,58.8f,0);
        
        float x;
        x = ovo.calcularPreco();
        System.out.println(x);
        
    }
}
