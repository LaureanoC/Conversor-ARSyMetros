package Test;
import Modelo.Moneda;
public class TestMoneda {

	public static void main(String[] args) {
		System.out.println(Moneda.ArgToUsdBlue(100));
		System.out.println(Moneda.ArgToUsd(100));
		System.out.println(Moneda.ArgToEuro(100));
		System.out.println(Moneda.ArgToYen(100));
		System.out.println(Moneda.ArgToLibra(100));
		System.out.println(Moneda.ArgToWon(100));
		
		System.out.println("Al revez");
		System.out.println(Moneda.UsdBlueToArg(100));
		System.out.println(Moneda.UsdToArg(100));
		System.out.println(Moneda.EuroToArg(100));
		System.out.println(Moneda.YenToArg(100));
	}
}
