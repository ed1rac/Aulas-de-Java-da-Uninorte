/*
** Função: nao esquecer de anotar aqui!!!!!
** Autor(a): Juan Carlos Justiniano Coelho
** Data:21/05/2016
** Observações:
*/
import java.util.*;
import java.lang.String;
import javax.swing.JOptionPane;
import java.io.*;

public class EntradaComScanner{
              public static void main(String args[]){ 
             
			  float nota1=0,nota2=0,trabalho=0,media=0;
			  BufferedReader dado;
			  try{
				  System.out.println("Entre com a nota 1: ");
				  Scanner jc =new Scanner(System.in);
				  nota1= jc.nextFloat();
				  
				  System.out.println("Entre com a nota 2: ");
				  jc =new Scanner(System.in);
				  nota2= jc.nextFloat();
				  
				  System.out.println("Entre com a trabalho: ");
				  jc =new Scanner(System.in);
				  trabalho= jc.nextFloat();
				  
				  media=(nota1+nota2+trabalho)/3;
				  System.out.println("Media: "+media);
				   
		         }
			  catch(NumberFormatException erro){
	           System.out.println("Houve erro na conversãom digite apenas caracteres numericos "+erro.toString());
			  }		  		
			   catch(InputMismatchException erro){
	           System.out.println("Houve erro na conversãom digite apenas caracteres numericos "+erro.toString());
			  }		  
		}
}