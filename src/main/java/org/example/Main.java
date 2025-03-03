package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado= new Scanner(System.in);

        int u;
        int tv=0;
        int vc1=0;
        int vc2=0;
        int vc3=0;
        int ci=700000;
        int cr=200000;
        int ct=600000;
        int ctc1=0;
        int ctc2=0;
        int ctc3=0;

        do{
            System.out.println("**********        MENU           *********");
            System.out.println(" ");
            System.out.println(" 1) VOTAR POR UN CANDIDATO");
            System.out.println(" 2) CALCULAR COSTO DE LA CAMPAÑA");
            System.out.println(" 3) VACIAR LAS URNAS");
            System.out.println(" 4) CONOCER EL NÚMERO TOTAL DE VOTOS");
            System.out.println(" 5) PORCENTAJE DE VOTOS OBTENIDOS * CANDIDATO");
            System.out.println(" 6) COSTO PROMEDIO DE CAMPAÑA ");
            System.out.println(" 7) SALIR ");
            System.out.println(" ");
            System.out.println(" DIGITE EL NÚMERO DE LA OPCIÓN DESEADA" );
            u=teclado.nextInt();

            switch(u){

                case 1 :
                    System.out.println("ESCOJA EL NÚMERO QUE CORRESPONDE AL CANDIDATO POR EL QUE DESEA VOTAR");
                    System.out.println(" 1) FEDERICO");
                    System.out.println(" 2) ALBERTO");
                    System.out.println(" 3) CHARLES");
                    u=teclado.nextInt();

                    switch(u){
                        case 1:
                            System.out.println(" ");
                            System.out.println(" SU VOTO FUE POR FEDERICO");
                            System.out.println(" ");
                            vc1=vc1+1;
                            tv=tv+vc1;
                        break;

                        case 2:
                            System.out.println(" ");
                            System.out.println(" SU VOTO FUE POR ALBERTO");
                            System.out.println(" ");
                            vc2=vc2+1;
                            tv=tv+vc2;
                        break;

                        case 3:
                            System.out.println(" ");
                            System.out.println(" SU VOTO FUE POR CHARLES");
                            System.out.println(" ");
                            vc3=vc3+1;
                            tv=tv+vc3;
                        break;
                        default:
                            System.out.println(" ");

                    }

                    System.out.println(" ");
                    System.out.println(" ESCOJA EL MEDIO POR EL CUAL EL VOTO FUE INFLUENCIADO");
                    System.out.println(" 1) INTERNET");
                    System.out.println(" 2) RADIO");
                    System.out.println(" 3) TELEVISIÓN");
                    u=teclado.nextInt();

                    switch(u){
                        case 1:
                            System.out.println(" ");
                            System.out.println("EL MEDIO ESCOGIDO FUE INTERNET");
                        break;

                        case 2:
                            System.out.println(" ");
                            System.out.println("EL MEDIO ESCOGIDO FUE RADIO");
                        break;

                        case 3:
                            System.out.println(" ");
                            System.out.println("EL MEDIO ESCOGIDO FUE TELEVISIÓN");
                        break;

                    default:
                         System.out.println(" ");

                    } break;

                case 2:
                    System.out.println("ESCOJA EL NÚMERO QUE CORRESPONDE AL CANDIDATO DEL CUAL DESEA CONOCER EL COSTO DE LA CAMPAÑA");
                    System.out.println(" 1) FEDERICO");
                    System.out.println(" 2) ALBERTO");
                    System.out.println(" 3) CHARLES");
                    u=teclado.nextInt();

                    switch(u){
                        case 1:
                        System.out.println("EL COSTO PARA LA CAMPAÑA DE FEDERICO FUE:");
                        break;

                        case 2:
                            System.out.println("EL COSTO PARA LA CAMPAÑA DE ALBERTO FUE:");
                        break;


                        case 3:
                            System.out.println("EL COSTO PARA LA CAMPAÑA DE CHARLES FUE:");
                        break;

                    default:
                       System.out.println(" ");
                    }
                break;

                case 3:
                    vc1=0;
                    vc2=0;
                    vc3=0;
                    System.out.println("LAS URNAS NO TIENEN VOTOS");
                break;

                case 4:
                    System.out.println("LA TOTALIDAD DE VOTOS ES:"+tv);
                break;

                case 5:
                    System.out.println("ESCOJA EL NÚMERO QUE CORRESPONDE AL CANDIDATO DEL CUAL DESEA CONOCER EL PORCENTAJE DE VOTOS OBTENIDOS");
                    System.out.println(" 1) FEDERICO");
                    System.out.println(" 2) ALBERTO");
                    System.out.println(" 3) CHARLES");
                    u=teclado.nextInt();
                break;

                case 6:
                    System.out.println("ESCOJA EL NÚMERO QUE CORRESPONDE AL CANDIDATO DEL CUAL DESEA CONOCER EL COSTO PROMEDIO DE LA CAMPAÑA");
                    System.out.println(" 1) FEDERICO");
                    System.out.println(" 2) ALBERTO");
                    System.out.println(" 3) CHARLES");
                    u=teclado.nextInt();
                break;

            }break;

        }while(u!=7);
    }
}