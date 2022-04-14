public class RegrasMenu {

        private String regras = (
                "\n--------------------------------------------------------------------------" +
                "\nINTRUCOES" +
                "\n" +
                "--------------------------------------------------------------------------" +
                "\n1 - NUMERO DE JOGADORES TEM QUE SER MAIOR QUE  3." +
                "\n2 - UM DOS JOGADORES SERA ESCOLHIDO ALEATORIAMENTE PARA SER O CONTADOR." +
                "\n3 - OS OUTROS JOGADORES SERAO ESPALHADOS ALEATORIAMENTE NUMA LISTA" +
                "\n4 - JOGADOR ESCOLHIDO COMO CONTADOR TERA 3 TENTATIVAS PARA ACHAR PELO MENOS UM DOS PARTICIPANTES" +
                "\n5 - ENCONTRAR 1 JOGADOR = 1 PONTO. ENCONTRAR 2 JOGADORES = 2 PONTOS. ENCONTRAR MAIS DE 2 JOGADORES = 3 PONTOS" +
                "\n5 - GANHA O JOGADOR COM A MAIOR QUANTIDADE DE PONTOS" +
                "\n--------------------------------------------------------------------------" );

        private String menu = ("Seja bem vindo ao jogo do Pique Esconde" +
                "\n------------------------------------------------------------------------" +
                "\nMENU" +
                "\n------------------------------------------------------------------------" +
                "\nESCOLHA UMA DAS OPCOES" +
                "\n------------------------------------------------------------------------" +
                "\n1 - COMECAR" +
                "\n2 - VER REGRAS" +
                "\n3 - SAIR");

        public String getMenu() {
            return menu;
        }

        public String getRegras() {
            return regras;
        }
}
