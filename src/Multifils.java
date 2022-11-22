public class Multifils {
    public static void main(String[] args) throws InterruptedException {
        //Construir el recurs
        Recurs recurs = new Recurs();

        //Crear 2 consumidors i 2 productors amb el mateix recurs i noms diferents
        Consumidor consumidor1 = new Consumidor(recurs);
        Consumidor consumidor2 = new Consumidor(recurs);
        Productor productor1 = new Productor(recurs);
        Productor productor2 = new Productor(recurs);

        //Iniciar els 2 productors
        productor1.run();
        productor2.run();

        //Esperar 1s
        Thread.sleep(1000);

        //Iniciar els 2 consumidors
        consumidor1.run();
        consumidor2.run();
    }
}
