//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

void main() throws InterruptedException {

    /* Atv 1 - Impressora */

//    Impressora impressora = new Impressora();
//
//    Thread t1 = new Thread(() -> impressora.imprimir("documento 1"));
//    Thread t2 = new Thread(() -> impressora.imprimir("documento 2"));
//    Thread t3 = new Thread(() -> impressora.imprimir("documento 3"));
//    Thread t4 = new Thread(() -> impressora.imprimir("documento 4"));
//    Thread t5 = new Thread(() -> impressora.imprimir("documento 5"));
//
//    t1.start();
//    t2.start();
//    t3.start();
//    t4.start();
//    t5.start();

    /* Atv 2 - Clinica painel senhas */

//    PainelSenhas painelSenhas = new PainelSenhas();
//
//    Thread paciente1 = new Thread(() -> painelSenhas.aguardarSenha(1));
//    Thread paciente2 = new Thread(() -> painelSenhas.aguardarSenha(2));
//    Thread paciente3 = new Thread(() -> painelSenhas.aguardarSenha(3));
//
//    Thread atendente = new Thread(() -> {
//        for (int i = 1; i <= 3; i++){
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e){
//                Thread.currentThread().interrupt();
//            }
//
//            painelSenhas.chamarSenha(i);
//        }
//    });
//
//    paciente1.start();
//    paciente2.start();
//    paciente3.start();
//
//    atendente.start();

    /* Atv 3 - relatorio funcionarios */

//    Relatorio relatorio = new Relatorio();
//
//    Thread t1 = new Thread(() -> relatorio.adicionarTrecho("trecho funcionario 1"));
//    Thread t2 = new Thread(() -> relatorio.adicionarTrecho("trecho funcionario 2"));
//    Thread t3 = new Thread(() -> relatorio.adicionarTrecho("trecho funcionario 3"));
//
//    t1.start();
//    t2.start();
//    t3.start();
//
//    t1.join();
//    t2.join();
//    t3.join();
//    System.out.println(relatorio.getConteudo());

    /* Atv 4 - alunos computador */

//    Thread[] alunos = new Thread[15];
//    Aluno aluno = new Aluno();
//    for(int i = 0; i < 15; i++){
//        final int numero = i + 1;
//        alunos[i] = new Thread(() -> aluno.usarComputador(numero));
//        alunos[i].start();
//    }
//
//    for (Thread t : alunos){
//        t.join();
//    }

    /* Atv 5 - Apuracao */

//    Apuracao apuracao = new Apuracao();
//    String[] candidatos = {"Ana", "Flavio", "Lula"};
//    Thread[] secoes = new Thread[4];
//
//    for (int s = 0; s < 4; s++){
//        secoes[s] = new Thread(() -> {
//            for (int i = 0; i < 100; i++) {
//                String candidato = candidatos[i % candidatos.length];
//                apuracao.registrarVoto(candidato);
//            }
//        });
//        secoes[s].start();
//    }
//
//    for (Thread t : secoes) {
//        t.join();
//    }
//    System.out.println(apuracao.getVotos());
//    System.out.println("Total de votos: " + apuracao.getTotal());
}
