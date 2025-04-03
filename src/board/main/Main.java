package board.main;

import java.util.Scanner;

public class Main {

	
	//1 - O código deve iniciar disponibilizando um menu com as seguintes opções: Criar novo board, Selecionar board, Excluir boards, Sair;
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Bem vindo ao gerenciador de boards, escolha a opção desejada");
		int opcao = -1;
		while(true) {
			System.out.println("1 - Criar um novo board");
            System.out.println("2 - Selecionar um board existente");
            System.out.println("3 - Excluir um board");
            System.out.println("4 - Sair");
            opcao = scn.nextInt();
            
            switch(opcao) {
            case(1) -> createBoard();
            case(2) -> selectBoard();
            case(3) -> deleteBoard();    
            case(4) -> System.exit(0);
            }
		}
	}

	private static Object deleteBoard() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object selectBoard() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object createBoard() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
