package br.com.unialfa.aula.controller;

import java.io.IOException;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class CalculadoraController {
	@FXML
	private TextField txtA;
	@FXML
	private TextField txtB;
	@FXML
	private Label lblResultado;
	@FXML
	private Button btnSomar;
	@FXML
	private Button btnSubtrair;
	@FXML
	private Button btnMultiplicar;
	@FXML
	private Button btnUm;
	@FXML
	private Button btnDois;
	@FXML
	private Button btnTres;
	@FXML
	private Button btnQuatro;
	@FXML
	private Button btnCinco;
	@FXML
	private Button btnSeis;
	@FXML
	private Button btnSete;
	@FXML
	private Button btnOito;
	@FXML
	private Button btnNove;
	@FXML
	private Button btnZero;
	@FXML
	private Button btnIgual;
	@FXML
	private Button btnApagar;
	
	private boolean pressionado = false;
	private double Operando1, Operando2;
	private char operador = ' ';
	private Scanner entrada;
	private int numOperados = 0;


	//declaração dos metodos de ação de cada botao 
	public void um() {
		DigiteNaTela("1");
	}

	public void dois() {
		DigiteNaTela("2");
		}
	
	public void tres() {
		DigiteNaTela("3");
	}

	public void quatro() {
		DigiteNaTela("4");
	}

	public void cinco() {
		DigiteNaTela("5");
	}

	public void seis() {
		DigiteNaTela("6");
	}

	public void sete() {
		DigiteNaTela("7");
	}

	public void oito() {
		DigiteNaTela("8");
	}

	public void nove() {
		DigiteNaTela("9");	
	}

	public void zero() {
		DigiteNaTela("0");	
	}

	//Metodo para os numeros aparecerem na tela
	private void DigiteNaTela(String numero) {
		
		if(!pressionado) {
		txtA.setText("");
		
		}	
	String fiinal = txtA.getText();
	txtA.setText(fiinal + numero);
	pressionado = true ;
	
	}
	


//Declara metodos de operações
	public void igual() {
		Operacao("=");
	}	
	public void somar() {
		Operacao("+");
	}	
	public void multiplicar() {
		Operacao("*");
	}
	public void dividir() {	
		Operacao("/");
	}
	public void subtrair() {
		Operacao("-");
	}
	
//metodo de apagar 	
	public void Apagar() {
		pressionado = false;
		Operando1=0;
		Operando2=0;
		operador = ' ';
		numOperados = 0;
		txtA.setText("0");
	}
	
	//Metodo para as operações serem realizadas
	public void Operacao(String Operador) {
		
		if (pressionado) 
			numOperados ++;
						
		if(numOperados==1) 
			Operando1 = Double.parseDouble(txtA.getText());
			
		if(numOperados==2)
		{
			Operando2 =  Double.parseDouble(txtA.getText());
			switch (this.operador)
			{
			case '-':
				Operando1=Operando1 - Operando2;
				break;
			case '+':
				Operando1=Operando1 + Operando2;
				break;
			case '/':
				Operando1=Operando1 / Operando2;
				break;
			case '*':
				Operando1=Operando1 * Operando2;
				break;
			case '=':
				Operando1 = Operando2;
				break;
			}
			txtA.setText(String.valueOf(Operando1));
			numOperados = 1; 
		}
		pressionado = false ;
		this.operador= Operador.charAt(0);
			
	}
	
}


