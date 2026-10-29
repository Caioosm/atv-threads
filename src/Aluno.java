import java.util.concurrent.Semaphore;

public class Aluno {

    private static final Semaphore computadores = new Semaphore(6);

    public void usarComputador(int aluno) {
        try {
            computadores.acquire();
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
            return;
        }
        try {
            System.out.println("Aluno " + aluno + " esta usando um computador");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Aluno " + aluno + " terminou");
        } finally {
            computadores.release();
        }
    }
}
