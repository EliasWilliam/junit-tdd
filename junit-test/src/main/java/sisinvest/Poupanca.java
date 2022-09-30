package sisinvest;

public class Poupanca {
    private Double valor;
    private int tempo;
    public Poupanca(Double valor, int tempo) {
            this.valor = valor;
            this.tempo = tempo;
    }
        public Double simulador(){
            Double total = valor;
            for(int i=0;  i<tempo; i++){
                    total = total/100*0.5+total;
        }
            return total;

    }
}
