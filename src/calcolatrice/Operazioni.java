/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcolatrice;

/**
 *
 * @author Qukaj
 */
public class Operazioni 
{
    public float num1, num2;
    Operazioni(float num1, float num2) 
    {
	this.num1 = num1;
	this.num2 = num2;
    }
    public float addizione() 
    {
	float somma;		
	somma = this.num1 + this.num2;
	return somma;
    }
    public float sottrazione() 
    {
	float differenza;	
	differenza = this.num1 - this.num2;
	return differenza;
    }
    public float moltiplicazione() 
    {
	float prodotto;		
	prodotto = this.num1 * this.num2;
	return prodotto;
    }
    public float divisione() 
    {
	float quoziente;		
	quoziente = this.num1 / this.num2;
	return quoziente;
    }
}
