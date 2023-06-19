package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import utility.Lesson;
import utility.Task;
import utility.Video;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Lesson> list = new ArrayList<>();
		
		System.out.print("Quantas aulas tem o curso? ");
		int numberClasses = sc.nextInt();

		for (int i = 0; i < numberClasses; i++) {
			System.out.println("\nDados da " + (i + 1) + "a aula:");
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			char taskOrVideo = sc.next().charAt(0);
			System.out.print("Título: ");
			sc.nextLine();
			String title = sc.nextLine();
			if(taskOrVideo == 'c') {
				System.out.print("URL do vídeo: ");
				String url = sc.nextLine();
				System.out.print("Duração em segudos: ");
				int duration = sc.nextInt();
				list.add(new Video(title, url, duration));
			}
			else if(taskOrVideo == 't') {
				System.out.print("Descrição: ");
				String description = sc.nextLine();
				System.out.print("Quantidade de questões: ");
				int quantity = sc.nextInt();
				list.add(new Task(title, description, quantity));
			}
		}
		int seconds = 0;
		for(Lesson x : list) {
			seconds += x.duration();
		}
		System.out.println("\nDURAÇÃO TOTAL DO CURSO = " + seconds + " segundos");
		System.out.println("\nVoltei a fazer o curso \\o/, agora pretende ir até o final, pois em 3 meses acabo meu estágio de desenvolvimento de sistemas(estou a 1 ano e 3 meses no Banrisul, banco do RS)");
		System.out.println("e pretendo conseguir minha primeira vaga de dev junior, muito obrigado professor Nélio e a toda equipe da devsuperior,");
		System.out.println("pelo conhecimento que venho adquirindo ao longo desses anos (comecei assistindo la na udemy)!");
		sc.close();

	}

}
