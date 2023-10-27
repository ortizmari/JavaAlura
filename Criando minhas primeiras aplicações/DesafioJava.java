import java.util.Scanner;

public class DesafioJava {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nome;
        int numeroTipoConta;
        String tipoConta = "";
        double saldoInicial;
        boolean sair = true;
        int opcao;
        double receberValor;
        double transferirValor;

//----------------------------------------------------------------

        System.out.println("Preencha as seguintes informações:");

        System.out.print("Nome Completo: ");
        nome = input.nextLine();

        String mensagemTipoConta = """
                ----------------
                Tipo da conta  |
                               |
                1- Corrente    |
                2- Poupança    |
                3- Salário     |
                ----------------
                """;
        System.out.print(mensagemTipoConta);
        System.out.print("Digite o tipo da conta desejada: ");
        numeroTipoConta = input.nextInt();

        if (numeroTipoConta == 1) {
            tipoConta = "Corrente";
        } else if (numeroTipoConta == 2){
            tipoConta = "Poupança";
        } else if (numeroTipoConta == 3){
            tipoConta = "Salário";
        } else {
            System.out.println("Opção inválida!");
        }

        System.out.print("Saldo bancário: R$");
        saldoInicial = input.nextDouble();

//----------------------------------------------------------------

        String dados = """
                
                ***************************************
                Dados iniciais do cliente   
                                            
                Nome:           %s         
                Tipo conta:     %s          
                Saldo inicial:  R$%.2f      
                ***************************************               
                """.formatted(nome, tipoConta, saldoInicial);
        System.out.print(dados);

        while (sair) {

            String operacoes = """  
                
                ----------------------     
                Operacoes            |
                                     |
                1- Consultar saldos  |
                2- Receber valor     |
                3- Transferir valor  |
                4- Sair              |
                ----------------------
                """;
            System.out.print(operacoes);
            System.out.print("Digite a opção desejada: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                System.out.println(">> O saldo atual é de R$" + saldoInicial);
                System.out.println("****************************************");
                break;

                case 2:
                System.out.print("Informe o valor a receber: R$");
                receberValor = input.nextDouble();
                saldoInicial += receberValor;
                System.out.println(">> Saldo atualizado R$" + saldoInicial);
                System.out.println("**************************************");
                break;
           
                case 3:
                System.out.print("Informe o valor deseja transferir: R$");
                transferirValor = input.nextDouble();

                if (saldoInicial >= transferirValor) {
                    saldoInicial -= transferirValor;
                    System.out.println(">> Saldo atualizado R$" + saldoInicial);
                    System.out.println("**************************************");
                } else {
                    System.out.println("X Não há saldo o suficiente para fazer essa transferência");
                    System.out.println("*********************************************************");
                }
                break;

                case 4:
                System.out.println(">> Operação finalizada!");
                sair = false;
                break;

                default:
                System.out.println("X Opçao inválida");
                System.out.println("****************");
            }
        }
    }
}

