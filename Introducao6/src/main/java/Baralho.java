/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria
 */
public class Baralho {
    Carta[] cartas=new Carta[52];
    int qnt=0;

    void adicionarCartas(){
        for(int i=0;i<4;i++){
            for (int j=0;j<13;j++){
                if(i==0){
                    cartas[qnt].naipe="Espadas";
                    if (j==0){
                        cartas[qnt].naipe="Espadas";
                        cartas[qnt].nome="Às";
                        qnt++;}

                    if (j>0 && j<=10){
                        cartas[qnt].naipe="Espadas";
                        cartas[qnt].nome="j";
                        qnt++;}
                    if(j==11){
                        cartas[qnt].naipe="Espadas";
                        cartas[qnt].nome="Valete";
                        qnt++;}
                    if(j==12){
                        cartas[qnt].naipe="Espadas";
                        cartas[qnt].nome="Dama";
                        qnt++;}
                    if(j==11){
                        cartas[qnt].naipe="Espadas";
                        cartas[qnt].nome="Rei";
                        qnt++;}}


                if(i==1){
                    if (j==0){
                        cartas[qnt].naipe="Copas";
                        cartas[qnt].nome="Às";
                        qnt++;}

                    if (j>0 && j<=10){
                        cartas[qnt].naipe="Copas";
                        cartas[qnt].nome="j";
                        qnt++;}
                    if(j==11){
                        cartas[qnt].naipe="Copas";
                        cartas[qnt].nome="Valete";
                        qnt++;}
                    if(j==12){
                        cartas[qnt].naipe="Copas";
                        cartas[qnt].nome="Dama";
                        qnt++;}
                    if(j==11){
                        cartas[qnt].naipe="Copas";
                        cartas[qnt].nome="Rei";
                        qnt++;}}


                if(i==2){
                    if (j==0){
                        cartas[qnt].naipe="Paus";
                        cartas[qnt].nome="Às";
                        qnt++;}

                    if (j>0 && j<=10){
                        cartas[qnt].naipe="Paus";
                        cartas[qnt].nome="j";
                        qnt++;}
                    if(j==11){
                        cartas[qnt].naipe="Paus";
                        cartas[qnt].nome="Valete";
                        qnt++;}
                    if(j==12){
                        cartas[qnt].naipe="Paus";
                        cartas[qnt].nome="Dama";
                        qnt++;}
                    if(j==11){
                        cartas[qnt].naipe="Paus";
                        cartas[qnt].nome="Rei";
                        qnt++;}}

                if(i==0){
                    if (j==0){
                        cartas[qnt].naipe="Ouros";
                        cartas[qnt].nome="Às";
                        qnt++;}

                    if (j>0 && j<=10){
                        cartas[qnt].naipe="Ouros";
                        cartas[qnt].nome="j";
                        qnt++;}
                    if(j==11){
                        cartas[qnt].naipe="Ouros";
                        cartas[qnt].nome="Valete";
                        qnt++;}
                    if(j==12){
                        cartas[qnt].naipe="Ouros";
                        cartas[qnt].nome="Dama";
                        qnt++;}
                    if(j==11){
                        cartas[qnt].naipe="Ouros";
                        cartas[qnt].nome="Rei";
                        qnt++;}}


                    }
                }
            }

    void imprimeBaralho(Baralho carta){
        for (qnt=0;qnt<52;qnt++){
            System.out.println(cartas[qnt].nome +"de"+ cartas[qnt].naipe);
        }



            }
        }