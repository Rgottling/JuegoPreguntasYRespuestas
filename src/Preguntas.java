import javax.swing.JOptionPane;
import java.util.Scanner;



public class Preguntas {

	public static void main(String[] args) {

		int valorPregunta = 3;
		int puntaje = 0;

		String si = "si";

		// preguntas geografia;

		String preguntasGeografia[] = { "¿cual es la capital de argentina?", "¿cual la capital de la India?",
		"¿cual es el la capital de Inglaterra?", "¿cual es la la capital de Corea del sur?",
		"¿cual es la capital de Rusia?" };

		String respuestasGeografia[] = { "B", "A", "B", "C", "C", };

		// preguntas deportes

		String preguntasDeportes[] = { "¿Cual es el ultimo seleccionado que gano la Copa America?",
		"¿En qué equipo de la NBA jugó Kobe Bryant desde 1996?",
		"¿Cual es el golfista golfista con mas titulos?", "¿Quien es el nadador con mas medallas olimpicas?",
		"¿En qué equipo debuto el futbolista Cristiano Ronaldo?" };

		String respuestasDeportes[] = { "A", "B", "C", "C", "B" };

		// Preguntas Musica

		String preguntasMusica[] = { "¿como se llama el artefacto para tocar la cuerdas de la guitarra?","¿Quien fue el bajista de la banda de rock The beatles?",
			"¿cual es el nombre del cantantae de la banda Queen?","¿En que anio fallecio el cantante Gustavo Cerati?",
		"¿Cual fue la priemra banda en la que toco Charly Garcia?" };
		
		String respuestasMusica[] = { "A","B","C","C","A" };

		//

		Scanner scanner = new Scanner(System.in);

		JOptionPane.showMessageDialog(null, "bienvenido cual es su nombre?");
		String nombre = scanner.nextLine();
		System.out.println("quiere jugar  " + nombre);

		String r0 = scanner.nextLine();

		while (!r0.equalsIgnoreCase(si)) {
		System.out.println("No tenga miedo... " + nombre);
		r0 = scanner.nextLine();
		}

		System.out.println("Primera Pregunta: " + preguntasGeografia[0]);
		System.out.println("A: Cordoba || B: Buenos Aires || C: Salta");

		String r1 = scanner.nextLine();

		if (r1.equalsIgnoreCase(respuestasGeografia[0])) {

		puntaje = puntaje + 1;

		System.out.println("respuesta correcta");

		} else {

		System.out.println(
		"respuesta incorrecta, La respuesta correcta es " + respuestasGeografia[0] + ":Buenos aires");

		}

		System.out.println("Segunda pregunta: " + preguntasGeografia[1]);
		System.out.println("A: Nueva Delhi || B: Mumbai || C: Bangalore");

		String r2 = scanner.nextLine();

		if (r2.equalsIgnoreCase(respuestasGeografia[1])) {

		puntaje = puntaje + 1;

		System.out.println("respuesta correcta");

		} else {

		System.out.println(
		"Respuesta Incorrecta, La respuesta correcta es: " + respuestasGeografia[1] + ":Nueva Delhi");

		}

		System.out.println("Tercera pregunta: " + preguntasGeografia[2]);
		System.out.println("A: Leeds || B: Londres || C: Liverpool");
		String r3 = scanner.nextLine();

		if (r3.equalsIgnoreCase(respuestasGeografia[2])) {

		puntaje = puntaje + 1;

		System.out.println("respuesta correcta");

		} else {

		System.out.println("Respuesta Incorrecta, La respuesta es " + respuestasGeografia[2] + ":Londres");

		}

		System.out.println("Cuarta pregunta: " + preguntasGeografia[3]);
		System.out.println("A: Busan || B: Daegu || C: Seul");

		String r4 = scanner.nextLine();

		if (r4.equalsIgnoreCase(respuestasGeografia[3])) {

		puntaje = puntaje + 1;

		System.out.println("respuesta correcta");

		} else {

		System.out.println("Respuesta Incorrecta, La respuesta es " + respuestasGeografia[3] + ":Seul");

		}

		System.out.println("Quinta pregunta: " + preguntasGeografia[4]);
		System.out.println("A: San Petersburso || B: Novosibirsk || C: Moscu");

		String r5 = scanner.nextLine();

		if (r5.equalsIgnoreCase(respuestasGeografia[4])) {

		puntaje = puntaje + 1;

		System.out.println("respuesta correcta");

		} else {

		System.out.println("Respuesta Incorrecta, La respuesta es " + respuestasGeografia[4] + ":Moscu");

		}

		System.out.println("Preguntas de deportes, Primera pregunta; " + preguntasDeportes[0]);
		System.out.println("A: Argentina || B: Chile || C: Brasil");

		String r6 = scanner.nextLine();

		if (r6.equalsIgnoreCase(respuestasDeportes[0])) {

		puntaje = puntaje + 1;

		System.out.println("respuesta correcta");

		} else {

		System.out
		.println("respuesta incorrecta, La respuesta correcta es " + respuestasDeportes[0] + ":Argentina");

		}

		System.out.println("Segunda pregunta: " + preguntasDeportes[1]);
		System.out.println("A: Milwuakee Bucks || B: Los Ángeles Lakers || C: Miami Heat");

		String r7 = scanner.nextLine();

		if (r7.equalsIgnoreCase(respuestasDeportes[1])) {

		puntaje = puntaje + 1;

		System.out.println("respuesta correcta");

		} else {

		System.out.println(
		"Respuesta Incorrecta, La respuesta correcta es: " + respuestasDeportes[1] + ":Los Ángeles Lakers");

		}

		System.out.println("tercera pregunta: " + preguntasDeportes[2]);
		System.out.println("A: Phil Mickelson || B: Dustin Johnson || C: Tiger Woods");

		String r8 = scanner.nextLine();

		if (r8.equalsIgnoreCase(respuestasDeportes[2])) {

		puntaje = puntaje + 1;

		System.out.println("respuesta correcta");

		} else {

		System.out.println("Respuesta Incorrecta, La respuesta es " + respuestasDeportes[2] + ":Tiger Woods");

		}

		System.out.println("Cuarta pregunta: " + preguntasDeportes[3]);
		System.out.println("A: Paavo Nurmi || B: Larisa Latynina || C: Michael Phelps");

		String r9 = scanner.nextLine();

		if (r9.equalsIgnoreCase(respuestasDeportes[3])) {

		puntaje = puntaje + 1;

		System.out.println("respuesta correcta");

		} else {

		System.out.println("Respuesta Incorrecta, La respuesta es " + respuestasDeportes[3] + ":Michael Phelps");

		}

		System.out.println("Quinta pregunta: " + preguntasDeportes[4]);
		System.out.println("A: Manchester United F. C.   || B: Sporting C. P.  || C: Fútbol Club Oporto");

		String r10 = scanner.nextLine();

		if (r10.equalsIgnoreCase(respuestasDeportes[4])) {

		puntaje = puntaje + 1;

		System.out.println("respuesta correcta");

		} else {

		System.out.println("Respuesta Incorrecta, La respuesta es " + respuestasDeportes[4] + ":Sporting C. P.");

		}

		System.out.println("Preguntas de Musica, Primera pregunta: " + preguntasMusica[0]);
		System.out.println("A: Pua || B: Moneda || C: anillo");
		String r11 = scanner.nextLine();

		if (r11.equalsIgnoreCase(respuestasMusica[0])) {

		puntaje = puntaje + 1;

		System.out.println("respuesta correcta");

		} else {

		System.out.println("respuesta incorrecta, La respuesta correcta es " + respuestasMusica[0] + ":Pua");

		}
		
		System.out.println("Segunta pregunta: " + preguntasMusica[1]);
		System.out.println("A: Jhon Lennon || B: Paul Mccartney || C: Ringo Starr");
		String r12 = scanner.nextLine();

		
		if (r12.equalsIgnoreCase(respuestasMusica[1])) {

			puntaje = puntaje + 1;

			System.out.println("respuesta correcta");

			} else {

			System.out.println("respuesta incorrecta, La respuesta correcta es " + respuestasMusica[1] + ":Paul Mccartney");

			}
		
		System.out.println("Tercera Pregunta: " + preguntasMusica[2]);
		System.out.println("A: Jim Morrison || B: Bon Jovi || C: Freddie Mercury");
		String r13 = scanner.nextLine();

		
		if (r13.equalsIgnoreCase(respuestasMusica[2])) {

			puntaje = puntaje + 1;

			System.out.println("respuesta correcta");

			} else {

			System.out.println("respuesta incorrecta, La respuesta correcta es " + respuestasMusica[2] + ":Freddie Mercury");

			}
		
		
		System.out.println("Cuarta Pregunta: " + preguntasMusica[3]);
		System.out.println("A: 2015 || B: 2010 || C: 2014");
		String r14 = scanner.nextLine();

		
		if (r14.equalsIgnoreCase(respuestasMusica[3])) {

			puntaje = puntaje + 1;

			System.out.println("respuesta correcta");

			} else {

			System.out.println("respuesta incorrecta, La respuesta correcta es " + respuestasMusica[3] + ":2014");

			}
		
		System.out.println("Quinta Pregunta: " + preguntasMusica[4]);
		System.out.println("A: Sui Generis || B: Seru Giran || C: Billy Bond and The Jets");
		String r15 = scanner.nextLine();

		
		if (r15.equalsIgnoreCase(respuestasMusica[4])) {

			puntaje = puntaje + 1;

			System.out.println("respuesta correcta");

			} else {

			System.out.println("respuesta incorrecta, La respuesta correcta es " + respuestasMusica[4] + ":Sui Generis");

			}

		System.out.println("Tu puntaje es " + valorPregunta * puntaje);

		}
		
	}


