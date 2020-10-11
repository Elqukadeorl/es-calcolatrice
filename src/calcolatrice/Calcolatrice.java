/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcolatrice;
import java.io.*;
import java.net.*;
import java.util.*;
/**
 *
 * @author Qukaj
 */
public class Calcolatrice 
{    
    public static void main(String[] args) throws IOException
    {
        //variabili da operare
        float num1, num2;
        //simbolo dell'operazione
        char operazione;
        //istanza alla classe Operazione per eseguire il calcolo
	Operazioni operazioni;
        //creazione del Socket del Server per poter comunicare con il client
	ServerSocket server = new ServerSocket(1235);
        while(true) 
        {
            //quando il server aspetta che il cliente si connette
            System.out.println(" In attesa che il cliente si connetta ");
            Socket client = server.accept();
            System.out.println(" Cliente connesso ");
            BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));
            DataOutputStream output = new DataOutputStream(client.getOutputStream());
            String[] nums = input.readLine().split("");
            num1 = Float.parseFloat(nums[0]);
            num2 = Float.parseFloat(nums[2]);
            operazione = nums[1].charAt(0);
            operazioni = new Operazioni(num1, num2);
            switch(operazione) 
            {
		case '+' : 
                {
                    output.writeBytes(String.valueOf(operazioni.addizione()) + "\n");
                    break;
		}
		case '-' : 
                {
                    output.writeBytes(String.valueOf(operazioni.sottrazione()) + "\n");
                    break;
                }
                case '/' : 
                {
                    output.writeBytes(String.valueOf(operazioni.divisione()) + "\n");
                    break;
		}
		case '*' : 
                {
                    output.writeBytes(String.valueOf(operazioni.moltiplicazione()) + "\n");
                    break;
		}
		default : 
                {
                    output.writeBytes("Errore" + "\n");
                    break;
		}
            }
            //server.close();
        }		
    }
}
    

