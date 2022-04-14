import java.util.*;

public class Esconde {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RegrasMenu regramenu = new RegrasMenu();
        ArrayList<String> listaJogador = new ArrayList();
        ArrayList<String> esconderijos = new ArrayList();
        ArrayList<Integer> outrosJogadores = new ArrayList();
        Random posicaoAleatoria = new Random();

        for(int i=0;i<10;i++){
            esconderijos.add("ESCONDERIJO");
        }

        System.out.println(regramenu.getMenu());
        boolean continuar = true;

        int escolha1 = scanner.nextInt();
        if (escolha1 == 1) {
            while (continuar) {
                System.out.println("Digite a quantidade de BOTS que irao se esconder de voce: ");
                int qntBots = scanner.nextInt();
                if (qntBots < 2) {
                    System.out.println("Quantidade de BOTS deve ser maior ou igual a 2: ");
                    continue;

                }else if(qntBots >= 2){
                    System.out.println("Digite o seu nome: ");
                    String nomeJogador = scanner.next();
                    listaJogador.add(nomeJogador);
                    continuar=false;

                    System.out.println("Ola, "+listaJogador.get(0) + " agora os BOTS irao se esconder de voce!");

                    // Gerando posicoes para serem adicionadas na lista de esconderijos
                    // cada laço ira adicionar um jogador diferente numa posicao aleatoria
                    for(int i=0; i<qntBots; i++) {

                        // posicao esta espalhada entre 10 numeros que é o tamanho da lista de esconderijos
                        int posicao = posicaoAleatoria.nextInt(9);
                        esconderijos.set(posicao, "BOT "+i);
                        outrosJogadores.add(posicao);
                        }
                    }
                    System.out.println(esconderijos.toString());
                    System.out.println(outrosJogadores.toString());
                    System.out.println("Voce tem 3 tentativas para tentar achar pelo menos 1 BOT!");
                    System.out.println("Os BOTS estao espalhados numa lista com 10 posicoes");
                    System.out.println("Seu palpite deve ser um numero entre 1 e 10");

                    int auxiliar = 0;
                    int acertos = 0;
                    int pontos = 0;

                    // Enquanto o auxiliar for menor que a lista dos bots escondidos
                    // Compara a posicao usando o indexOf comparando com o conteudo da lista de jogadores escondidos
                    while (auxiliar < outrosJogadores.size()+1) {
                        System.out.println("Digite aqui o seu palpite(posicao): ");
                        int palpite = scanner.nextInt();

                        for(int i=0;i<outrosJogadores.size();i++){
                            if (outrosJogadores.get(i) == palpite) {
                                System.out.println("Parabens " +  listaJogador.get(0) + ", voce achou " + esconderijos.get(palpite));
                                acertos += 1;
                                pontos += 1;
                                if (acertos >= 2) {
                                    pontos += 1;
                                }
                                break;
                            }
                        }
                        auxiliar++;
                    }
                    System.out.println("Voce acertou: " + acertos);
                    System.out.println("E fez: " + pontos + " ponto(s)");
                }
        }else if (escolha1 == 2){
            System.out.println(regramenu.getRegras());
            //continue;
        }else if (escolha1 == 3){
            continuar=false;
        }else{
            System.out.println("Opcao nao disponivel");
        }
    }
}