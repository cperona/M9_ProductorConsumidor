public class Recurs {
    private float quantitat;
    private String nom;

    public synchronized float consumeix(float quant) {
        //Esperar fins que quantitat >= quant;

        //Retornar quant i descontar-ho de quantitat
        return 0f;
    }

    public synchronized void produeix(float quant) {
        //Afegir a quantitat quant

        //Notificar-ho a tots
    }
}