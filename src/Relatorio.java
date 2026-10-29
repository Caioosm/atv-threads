import java.util.concurrent.locks.ReentrantLock;

public class Relatorio {
    private final StringBuilder conteudo = new StringBuilder();
    private final ReentrantLock lock = new ReentrantLock();

    public void adicionarTrecho(String trecho) {
        lock.lock();
        try {
            conteudo.append(trecho).append("\n");
        } finally {
            lock.unlock();
        }
    }

    public String getConteudo(){
        return conteudo.toString();
    }
}
