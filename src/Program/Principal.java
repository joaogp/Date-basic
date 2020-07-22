/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import java.text.ParseException;        //importação para ignorar exceções do "parse"
import java.text.SimpleDateFormat;      //importação do simpleDateFormat 
import java.time.Instant;               //importação
import java.util.Calendar;  
import java.util.Date;                  //importação do Date

/**
 *
 * @author joaov
 */
public class Principal {
    public static void main(String[] args) throws ParseException{
     
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");             //instanciação e criação do objeto sdf colocando um padrão de como quer que apareça a data e hora
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");    //SimpleDateFormat serve exatamente para facilitar a manipulção de data e hora 
        
        Date y1 = sdf1.parse("22/07/2020");                 //criando variavel y1 do tipo Date
        Date y2 = sdf2.parse("22/07/2020 17:27:05");        //o "parse" serve para receber um dado no formato de string, respeitando o padrão que colocou acima e convertendo em data
        
        Date x1 = new Date();                               //cria variavel do tipo Date, porém pega o horario atual do seu pc automaticamente 
        Date x2 = new Date(System.currentTimeMillis());     //msm comando que o acima, porém pega o instante do sistema, converte para milissegundos e cria a data com esse valor
        
        System.out.println("y1: " + sdf2.format(y1));       //quando pede-se para imprimir apenas o "y1", o java imprime em um padrão dele msm, dai vem a necessidade de chamar esse comando "y2.format" que serve para puxar o padrão que você criou antes
        System.out.println("y2: " + sdf2.format(y2));
        System.out.println("Dia e Hora atual: " + sdf2.format(x1));
        System.out.println("Dia e Hora atual: " + sdf2.format(x2));
        System.out.println("-------------------------------------------------------------------------------");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
        
        Date d = Date.from(Instant.parse("2020-07-22T15:42:07Z"));      //padrão UTC, onde a hora é baseada com o ponto 0 da linha de greenwich
                                                                        //obs: na saida de dados utilizando o padrão UTC, a hora sairá 3h adiantado por causa da localização do Brasil em relação a linha de greenwich
                                                                        //comando "Instant.parse" transforma automaticamente o string em date
        System.out.println("Hora e dia inicial: " + sdf.format(d));
        
        Calendar cal = Calendar.getInstance();              //instanciação do Calendar
        cal.setTime(d);                                     //instanciando a data criada acima dentro do Calendar
                                                            //Obs: a partir de agora, pode-se acrescentar, diminuir horas ou dias
        cal.add(Calendar.HOUR_OF_DAY, 4);                   //comando para adicionar um dado no calendario,utiliza-se esse padrão de primeiro colocar o dado que quer adicionar e do lado a quantidade, no caso 4 horas no dia
        d = cal.getTime();                                  //comando para retornar d com os dados atualizados
        
        System.out.println("Data e hora com 4 horas acrescentada: " + sdf.format(d));
        
        int minutes = cal.get(Calendar.MINUTE);             //criando variavel minutes, armazenando nela os minutos informados no calendario, seguindo esse comando q manipula o tempo
        int month = 1 + cal.get(Calendar.MONTH);            //mesmo processo, porém o java identifica que os meses começa no 0, por isso vem a necessidade de acrescentar o 1 somado ao comando

        System.out.println("Minutos: " + minutes);
        System.out.println("Mês: " + month);
        
                                                          
        
        
        
    }
    
}
