/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import java.text.ParseException;        //importação para ignorar exeções do "parse"
import java.text.SimpleDateFormat;      //importação do simpleDateFormat 
import java.util.Date;                  //importação do Date

/**
 *
 * @author joaov
 */
public class Principal {
    public static void main(String[] args) throws ParseException{
     
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");             //instanciação e criação do objeto sdf colocando um padrão de como quer q apareça a data e hora
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");    //SimpleDateFormat serve exatamente para facilitar a manipulção de data e hora 
        
        Date y1 = sdf1.parse("22/07/2020");                 //criando variavel y1 do tipo Date
        Date y2 = sdf2.parse("22/07/2020 17:27:05");        //o parse serve para receber um dado no formato de string, respeitando o padrão que colocou acima e convertendo em data
        
        Date x1 = new Date();                               //cria variavel do tipo Date, porém pega o horario atual do seu pc automaticamente 
        Date x2 = new Date(System.currentTimeMillis());     //msm comando que o acima, porém pega o instante do sistema, converte para milissegundos e cria a data com esse valor
        
        System.out.println("y1: " + sdf2.format(y1));       //quando pede-se para imprimir apenas o "y1", o java imprime em um padrão dele msm, dai vem a necessidade de chamar esse comando "y2.format" que serve para puxar o padrão que você criou antes
        System.out.println("y2: " + sdf2.format(y2));
        System.out.println("Dia e Hora atual: " + sdf2.format(x1));
        System.out.println("Dia e Hora atual: " + sdf2.format(x2));
        
        
    }
    
}
