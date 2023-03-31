/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inf3n212.carrro;

import controller.Ccarro;
import controller.CPessoa;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 182110084
 */
public class INF3N212Carrro {

    public static CPessoa cadPessoa = new CPessoa();
    public static Ccarro cadCarro = new Ccarro();
    static Scanner leia = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cadPessoa.mockPessoas();
        cadCarro.mockCarros();
        int opM = 99;
        int opSM = 99;

        do {
            System.out.println("--Sistema de Cadastro--");
            menuP();
            opM = leiaNumInt();
            switch (opM) {
                case 1:
                case 2:
                    do {
                        subMenu(opM);
                        opSM = leiaNumInt();
                        switch (opSM) {
                            case 1:
                                System.out.println("--Cadastrar--");
                                if (opM==1) {
                                    cadastrarPessoa();
                                    
                                }else{
                                    cadastrarCarro();
                                }
                                break;
                            case 2:
                                System.out.println("--Edita--");
                                if (opM==1) {
                                    editarCarro();
                                    
                                }else{
                                    editarCarro();
                                }
                                break;
                            case 3:
                                System.out.println("--Lista--");
                                if (opM==1) {
                                    listarCarro();
                                    
                                }else{
                                    listarCarro();
                                }
                                break;
                            case 4:
                                System.out.println("--Deleta--");
                                if (opM==1) {
                                    deletarCarro();
                                    
                                }else{
                                    deletarCarro();
                                }
                                break;
                            case 0:
                                break;

                            default:
                                System.out.println("Opção inválida,tente novamente!");
                        }
                    } while (opSM !=0);
                    break;
                case 0:
                    System.out.println("Aplicação encerrada pelo usuário!");
                    break;
                default:
                    System.out.println("Opção inválida,tente novamente!");
            }
        } while (opM != 0);

    }//fim métoda main

    public static int leiaNumInt() {
        Scanner leiaNum = new Scanner(System.in);
        try {
            return leiaNum.nextInt();
        } catch (InputMismatchException i) {
            System.out.println("Erro:" + i.getMessage() + "\nTente novamente!");
            leiaNumInt();
        }
        return 99;
    }

    public static void menuP() {
        System.out.println("--Menu Principal--");
        System.out.println("1 - Ger.Pessoa");
        System.out.println("2 - Ger.Carro");
        System.out.println("0 - sair");
        System.out.println("Digite aqui:");
    }//fim menuP

    public static void subMenu(int opM) {
        String subM = null;
        if (opM == 1) {
            subM = "Pessoa";
        }
        if (opM == 2) {
            subM = "Carro";
        }
        System.out.println("--Ger." + subM + "--");
        System.out.println("1 - Cadastrar" + subM);
        System.out.println("2 - Editar" + subM);
        System.out.println("3 - Listar" + subM + "s");
        System.out.println("4 - Deletar" + subM);
        System.out.println("0 - Voltar");
        System.out.print("Digite aqui:");
    }//fim subMenu

     private static void cadastrarPessoa() {
         System.out.println("Pessoa");
    }

    private static void cadastrarCarro() {
        System.out.println("Carro");
    }


    private static void editarCarro() {
        System.out.println("Macaco");
    }

    private static void listarCarro() {
        System.out.println("Alcool");
    }

    private static void deletarCarro() {
        System.out.println("Jonas");
    }

}//fim classe
