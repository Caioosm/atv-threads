public class Impressora {

//    public void imprimir(String documento){
//        System.out.println("Iniciando impressao de: " + documento);
//        try {
//            Thread.sleep(1000);
//        }catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//        }
//        System.out.println("finalizando impressao de: " + documento);
//        System.out.println("========================================");
//    }
    public synchronized void imprimir(String documento){
        System.out.println("Iniciando impressao de: " + documento);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("finalizando impressao de: " + documento);
        System.out.println("========================================");
    }
}
