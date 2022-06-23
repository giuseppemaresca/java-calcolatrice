package jana60Calcolatrice;

import java.util.Random;

public class CalcoliTestMain {

	public static void main(String[] args) {
		/*
		 * Prendiamo due numeri casuali e operiamo con essi (Metodo int) Random random =
		 * new Random(); int numeroRandom1 = random.nextInt((1000) + 1); int
		 * numeroRandom2 = random.nextInt((1000) + 1);
		 * System.out.println("I tuoi due numeri casuali sono : " + numeroRandom1 +
		 * " & " + numeroRandom2 + " e queste sono le operazioni con essi :");
		 * 
		 * // somma fra i due numeri casuali System.out.println("La tua somma è : " +
		 * CalcoliHelper.somma(numeroRandom1, numeroRandom2));
		 * 
		 * // Differenza fra i due numeri casuali
		 * System.out.println("La tua sottrazione è : " +
		 * CalcoliHelper.differenza(numeroRandom1, numeroRandom2));
		 * 
		 * // Prodotto fra i due numeri casuali
		 * System.out.println("Il tuo prodotto è : " +
		 * CalcoliHelper.moltiplicazione(numeroRandom1, numeroRandom2));
		 * 
		 * // Minimo fra i due valori casuali System.out
		 * .println("Il valore minimo fra i due valori è : " +
		 * CalcoliHelper.minimo(numeroRandom1, numeroRandom2));
		 * 
		 * // Massimo fra i due valori casuali
		 * 
		 * System.out.println( "Il valore massimo fra i due valori è : " +
		 * CalcoliHelper.massimo(numeroRandom1, numeroRandom2));
		 * 
		 * // Numero Assoluto di un valore negativo
		 * System.out.println("Il valore assoluto di un numero negativo  è : " +
		 * CalcoliHelper.numeroAssoluto(-20));
		 */

		// Tutte le operazioni con il parametro double
		Random random = new Random();
		double numeroRandom1 = random.nextInt((1000) + 1);
		double numeroRandom2 = random.nextInt((1000) + 1);
		System.out.println("I tuoi due numeri casuali sono : " + numeroRandom1 + " & " + numeroRandom2
				+ " e queste sono le operazioni con essi :");

		System.out.println("La tua somma è : " + CalcoliHelper.somma(numeroRandom1, numeroRandom2));

		System.out.println("La tua sottrazione è : " + CalcoliHelper.differenza(numeroRandom1, numeroRandom2));

		System.out.println("Il tuo prodotto è : " + CalcoliHelper.moltiplicazione(numeroRandom1, numeroRandom2));

		System.out
				.println("Il valore minimo fra i due valori è : " + CalcoliHelper.minimo(numeroRandom1, numeroRandom2));

		System.out.println(
				"Il valore massimo fra i due valori è : " + CalcoliHelper.massimo(numeroRandom1, numeroRandom2));

		System.out.println("Il valore assoluto di un numero negativo  è : " + CalcoliHelper.numeroAssoluto(-20));

	}
}
