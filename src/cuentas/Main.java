package cuentas;
public class Main {

    public static void main(String[] args) {
        CCuenta micuenta1;
        double saldoActual;

        micuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = micuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_cuenta(micuenta1, 4);
    }

	private static void operativa_cuenta(CCuenta micuenta1, float cantidad) {
		try {
            micuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            micuenta1.ingresar(600);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
