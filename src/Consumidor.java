public class Consumidor extends Thread{
    //Declarar el recurs
    private Recurs recurs;

    //Constructor amb recurs i nom


    public Consumidor(Recurs recurs) {
        this.recurs = recurs;
    }

    @Override
    public void run() {
        //Per sempre més repetir

        //Consumeix del recurs una quantitat aleatòria

        //Mostrar quant recurs consumit i el nom

        //Dormir un temps aleatori entre [0-200]ms
    }
}
