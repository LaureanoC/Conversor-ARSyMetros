package Test;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Modelo.Moneda;

import Modelo.Metros;
import Modelo.Centimetro;
import Modelo.Kilometro;
import Modelo.Milimetro;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		
		Boolean me = true;
		String resultado = null;
		
		while(me) {
			
			Boolean m = true;
			String [] menuOp = {"Convertidor de Moneda Argentina", "Convertidor de medidas de Longitud"};
			ImageIcon iconConversor = new ImageIcon("conversor.png");
			String menu = ((String) JOptionPane.showInputDialog(null, "Elige una opción","Convertidor de Monedas",JOptionPane.QUESTION_MESSAGE, iconConversor, menuOp, menuOp[0]));
			
			if (menu == menuOp[0]) {
				while (m == true) {
					try {
						
						double valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresar un valor para convertir"));
						String valorString = Double.toString(valor);
						
						String [] opciones = {"ARS to Dólar blue", "ARS to Dólar","ARS to Euro","ARS to Libra","ARS to Yen", "ARS pesos to Won", "Dólar blue to ARS", "Dólar to ARS", "Euro to ARS", "Libra to ARS", "Yen to ARS", "Won to ARS"};
						ImageIcon icon = new ImageIcon("favicon-32x32.png");
						String opcion = (String) JOptionPane.showInputDialog(null, "Elige una opción","Convertidor de Monedas",JOptionPane.QUESTION_MESSAGE, icon, opciones, opciones[0]);
						String tipo = "ARS";
						
						if (opcion == "Dólar to ARS") {
							valor = Moneda.UsdToArg(valor);
						}
						if (opcion == "Euro to ARS") {
							valor = Moneda.EuroToArg(valor);
						}
						if (opcion == "Libra to ARS") {
							valor = Moneda.LibraToArg(valor);
						}
						if (opcion == "Yen to ARS") {
							valor = Moneda.YenToArg(valor);
						}
						if (opcion == "Won to ARS") {
							valor = Moneda.WonToArg(valor);
						}
						
						
						if (opcion == "ARS to Dólar blue") {
							valor = Moneda.ArgToUsdBlue(valor);
							tipo = "USD blue";
						}
						if (opcion == "ARS to Dólar") {
							valor = Moneda.ArgToUsd(valor);
							tipo = "USD";
						}
						if (opcion == "ARS to Euro") {
							valor = Moneda.ArgToEuro(valor);
							tipo = "Euro";
						}
						if (opcion == "ARS to Libra") {
							valor = Moneda.ArgToLibra(valor);
							tipo = "Libras esterlinas";
						}
						if (opcion == "ARS to Yen") {
							valor = Moneda.ArgToYen(valor);
							tipo = "Yen";
						}
						if (opcion == "ARS pesos to Won") {
							valor = Moneda.ArgToWon(valor);
							tipo = "Won";
						}
						if (opcion == "Dólar blue to ARS") {
							valor = Moneda.UsdBlueToArg(valor);
							
						}
						
						
						valorString = Double.toString(valor);
						resultado = "Son " + valorString +" " + tipo;
					
						JOptionPane.showMessageDialog(null,resultado);
						System.out.println("Haz elegido la opción " + opcion + " Con su valor " + valorString);
						int respuesta = JOptionPane.YES_NO_OPTION;
						respuesta = JOptionPane.showConfirmDialog(null, "¿Intentar de nuevo?", "WARNING",respuesta);
						if (respuesta == 1) {
							m = false;
						}
	
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Solo se permiten caracteres numericos","Input Error",JOptionPane.ERROR_MESSAGE);
					}
				}
			} else if(menuOp[1]== menu){
				while (m == true) {
					
					try {
						
						double valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresar un valor para convertir"));
					
				
						String [] opciones = {"Km to m","Km to cm","Km to mm","m to mm", "m to cm", "m to Km", "cm to mm", "cm to m", "cm to Km", "mm to cm", "mm to m", "mm to Km"};
						ImageIcon icon = new ImageIcon("longitud.png");
						String opcion = (String) JOptionPane.showInputDialog(null, "Elige una opción","Convertidor de medidas de longitud",JOptionPane.QUESTION_MESSAGE, icon, opciones, opciones[0]);
						String tipo = null;
						
						if (opcion == "Km to m") {
							valor = Kilometro.Tom(valor);
							tipo = "metros";
							
						}
						if (opcion == "Km to cm") {
							valor = Kilometro.Tocm(valor);
							tipo = "centimetros";
						}
						if (opcion == "Km to mm") {
							valor = Kilometro.Tomm(valor);
							tipo = "milimetros";
						}	
						
						
						
						if (opcion == "m to mm") {
							valor = Metros.Tomm(valor);
							tipo = "milimetros";
						}
						if (opcion == "m to cm") {
							valor = Metros.Tocm(valor);
							tipo = "centimetros";
						}
						if (opcion == "m to Km") {
							valor = Metros.ToKm(valor);
							tipo = "Kilometros";
						}
						
						
						
						if (opcion == "cm to mm") {
							valor = Centimetro.Tomm(valor);
							tipo = "milimetros";
						}
						if (opcion == "cm to m") {
							valor = Centimetro.Tom(valor);
							tipo = "metros";
						}
						if (opcion == "cm to Km") {
							valor = Centimetro.ToKm(valor);
							tipo = "Kilometros";
						}
						
						
						
						if (opcion == "mm to cm") {
							valor = Milimetro.Tocm(valor);
							tipo = "centimetros";
						}
						if (opcion == "mm to m") {
							valor = Milimetro.Tom(valor);
							tipo = "metros";
						}
						if (opcion == "mm to Km") {
							valor = Milimetro.ToKm(valor);
							tipo = "Kilometros";
						}
						
						resultado = "Son " + Double.toString(valor) +" "+tipo;
						
						JOptionPane.showMessageDialog(null,resultado);
						int respuesta = JOptionPane.YES_NO_OPTION;
						respuesta = JOptionPane.showConfirmDialog(null, "¿Intentar de nuevo?", "WARNING",respuesta);
						if (respuesta == 1) {
							m = false;
						}
						
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Solo se permiten caracteres numericos","Input Error",JOptionPane.ERROR_MESSAGE);
					}
				}
				
				
				
			} else {
				me = false;
			}
		}
		
		
		
	}
}
