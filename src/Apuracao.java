import java.util.HashMap;
import java.util.Map;

public class Apuracao {
    public final Map<String, Integer> votos = new HashMap<>();

    public synchronized void registrarVoto(String candidato){
        votos.merge(candidato, 1, Integer::sum);
    }

    public synchronized int getTotal(){
        int total = 0;
        for (int v : votos.values()) {
            total += v;
        }
        return total;
    }

    public synchronized Map<String, Integer> getVotos() {
        return new HashMap<>(votos);
    }
}
