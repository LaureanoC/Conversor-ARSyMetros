package Modelo;

public class Moneda {

		public static Double formatearDecimales(Double numero, Integer numeroDecimales) {
	    return Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);
		}
	
		public static double ArgToUsdBlue(double num) {
			return formatearDecimales(num/200,2);
		}
		
		public static double ArgToUsd(double num) {
			return formatearDecimales(num/122.77,2);
		}
		
		public static double ArgToEuro(double num) {
			return formatearDecimales(num/128.79,2);
		}
		
		public static double ArgToYen(double num) {
			return formatearDecimales(num/1.1,2);
		}
		
		public static double ArgToLibra(double num) {
			return formatearDecimales(num/0.0066,2);
		}
		
		public static double ArgToWon(double num) {
			return formatearDecimales(num/10.49,2);
		}
		
		public static double UsdBlueToArg(double num) {
			return formatearDecimales(num*200,2);
		}
		
		public static double UsdToArg(double num) {
			return formatearDecimales(num*122.77,2);
		}
		
		public static double EuroToArg(double num) {
			return formatearDecimales(num*128.79,2);
		}
		
		public static double YenToArg(double num) {
			return formatearDecimales(num/1.1,2);
		}
		
		public static double LibraToArg(double num) {
			return formatearDecimales(num/0.0066,2);
		}
		
		public static double WonToArg(double num) {
			return formatearDecimales(num/10.49,2);
		}
		
}


