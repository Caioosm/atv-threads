public class PainelSenhas {
    private int senhaAtual = 0;

    public synchronized void aguardarSenha(int senha) {
        while(senhaAtual != senha) {
            try {
                wait();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.println("paciente com senha: " + senha + " foi atendido!");
        System.out.println("================================================");
    }

    public synchronized void chamarSenha(int senha){
        senhaAtual = senha;
        System.out.println("Atendente chamou senha " + senhaAtual);
        notifyAll();
    }
}
