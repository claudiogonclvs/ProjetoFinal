package PC2;

import util.Consola;

public class Main {

    private static Gestao g = new Gestao();

    public static void main(String[] args) {
        //Só se fazem sout's na main,  todas as funcoes devem ser modelaveis!!!
        int opcao, opcao2;
        do {
            opcao = menu();
            switch (opcao) {
                case 1:
                    do {
                        opcao2 = gerirVeiculos();
                        switch (opcao2) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 0:
                        }
                    } while (opcao2 != 0);
                    break;
                case 2:
                    do {
                        opcao2 = gerirFuncionarios();
                        switch (opcao2) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 0:
                        }
                    } while (opcao2 != 0);
                    break;
                case 3:
                    do {
                        opcao2 = gerirClientes();
                        switch (opcao2) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 0:
                        }
                    }while (opcao2 != 0);
                    break;
                case 4:
                    do {
                        opcao2 = gerirManutencoes();
                        switch (opcao2) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 0:
                        }
                    } while (opcao2 != 0);
                    break;
                case 5:
                    do {
                        opcao2 = gerirNegociacoes();
                        switch (opcao2) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break
                            case 0:
                        }
                    } while (opcao2 != 0);
                    break;
                case 6:
                    do {
                        opcao2 = estatisticas();
                        switch (opcao2) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 0:
                        }
                    } while (opcao2 != 0);
                    break;
                case 0:
                    System.out.println("FIM DO PROGRAMA");
            }
            Consola.sc.nextLine();
        } while (opcao != 0);
    }


    private static int menu() {
        int opcao;
        System.out.println();
        System.out.println("1 - Gerir Veículos");
        System.out.println("2 - Gerir Funcionários");
        System.out.println("3 - Gerir Clientes");
        System.out.println("4 - Gerir Manutenções");
        System.out.println("5 - Gerir Negociações");
        System.out.println("6 - Estatísticas");
        System.out.println("0 - Sair\n");
        opcao = Consola.lerInt("Opção: ", 0, 6);
        return opcao;
    }

    private static int gerirVeiculos() {
        int opcao;
        System.out.println("1 - Registar Veículos");
        System.out.println("2 - Consultar por Matrícula");
        System.out.println("3 - Alterar dados");
        System.out.println("0 - Voltar ao menu anterior");
        opcao = Consola.lerInt("Opção: ", 0, 3);
        return opcao;
    }

    private static int gerirFuncionarios() {
        int opcao;
        System.out.println("1 - Registar");
        System.out.println("2 - Consultar por numero");
        System.out.println("0 - Voltar ao menu anterior");
        opcao = Consola.lerInt("Opção: ", 0, 2);
        return opcao;
    }

    private static int gerirClientes() {
        int opcao;
        System.out.println("1 - Registar novo Cliente");
        System.out.println("2 - Consultar cliente por NIF");
        System.out.println("0 - Voltar ao menu anterior");
        opcao = Consola.lerInt("Opção: ", 0, 2);
        return opcao;
    }
    
    private static int gerirCompras() {
        int opcao;
        System.out.println("1 - Registar");
        System.out.println("2 - Consultar numero");
        System.out.println("3 - Alterar estado");
        System.out.println("4 - Alterar condicao");
        System.out.println("5 - Registar negociação");
        System.out.println("0 - Voltar ao menu anterior");
        opcao = Consola.lerInt("Opção: ", 0, 5);
        return opcao;
    }

    private static int gerirVendas() {
        int opcao;
        System.out.println("1 - Registar");
        System.out.println("2 - Consultar numero");
        System.out.println("3 - Alterar estado");
        System.out.println("4 - Alterar condicao");
        System.out.println("5 - Registar negociação");
        System.out.println("0 - Voltar ao menu anterior");
        opcao = Consola.lerInt("Opção: ", 0, 5);
        return opcao;
    }

    private static int gerirManutencoes() {
        int opcao;
        System.out.println("1 - Registar");
        System.out.println("2 - Consultar por matricula");
        System.out.println("3 - Alterar estado");
        System.out.println("0 - Voltar ao menu anterior");
        opcao = Consola.lerInt("Opção: ", 0, 3);
        return opcao;
    }

    private static int estatisticas() {
        int opcao;
        System.out.println("1 - Percentagem de serviços não concluídos com sucesso");
        System.out.println("2 - Funcionário(s) com mais vendas realizadas");
        System.out.println("3 - Preço total em vendas/compras, por ano");
        System.out.println("4 - Número total de serviços registados por mês num determinado ano (ordenado de forma decrescente pelo total)");
        System.out.println("0 - Voltar ao menu anterior");
        opcao = Consola.lerInt("Opção: ", 0, 2);
        return opcao;
    }


}
