package com.gabriel.estruturadados.vetor.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

import com.gabriel.estruturadados.vetor.application.Contato;

public class Exercicio07 extends Exercicio06 {

	public static void main(String[] args) {
				// criação das variáveis
				Scanner scan = new Scanner(System.in);

				// criar vetor com 20 de capacidade
				ArrayList<Contato> list = new ArrayList<Contato>(20);

				// criar e adicionar X contatos
				criarContatosDinamicamente(5, list);

				// criar um menu para que o usuário escolha a opção
				int opcao = 1;

				while (opcao != 0) {

					opcao = obterOpcaoMenu(scan);

					switch (opcao) {
					case 1:
						adicionarContatoFinal(scan, list);
						break;
					case 2:
						adicionarContatoPosicao(scan, list);
						break;
					case 3:
						obtemContatoPosicao(scan, list);
						break;
					case 4:
						obtemContato(scan, list);
						break;
					case 5:
						pesquisarUltimoIndice(scan, list);
						break;
					case 6:
						pesquisarContatoExiste(scan, list);
						break;
					case 7:
						excluirPorPosicao(scan, list);
						break;
					case 8:
						excluirContato(scan, list);
						break;
					case 9:
						imprimeTamanhoVetor(list);
						break;
					case 10:
						limparVetor(list);
						break;
					case 11:
						imprimirVetor(list);
						break;
					default:
						break;
					}
				}

				System.out.println("Usuário digitou 0, programa terminado");
			}

			private static void imprimirVetor(ArrayList<Contato> list) {

				System.out.println(list);
			}

			private static void limparVetor(ArrayList<Contato> list) {

				list.clear();

				System.out.println("Todos os contatos do vetor foram excluídos");
			}

			private static void imprimeTamanhoVetor(ArrayList<Contato> list) {

				System.out.println("Tamanho do vetor é de: " + list.size());
			}

			private static void excluirPorPosicao(Scanner scan, ArrayList<Contato> list) {

				int pos = leInformacaoInt("Entre com a posição a ser removida", scan);

				try {

					list.remove(pos);

					System.out.println("Contato excluído");

				} catch (Exception e) {
					System.out.println("Posição inválida!");
				}
			}

			private static void excluirContato(Scanner scan, ArrayList<Contato> list) {

				int pos = leInformacaoInt("Entre com a posição a ser removida", scan);

				try {

					Contato contato = list.get(pos);

					list.remove(contato);

					System.out.println("Contato excluído");

				} catch (Exception e) {
					System.out.println("Posição inválida!");
				}
			}

			private static void pesquisarContatoExiste(Scanner scan, ArrayList<Contato> list) {

				int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

				try {

					Contato contato = list.get(pos);

					boolean existe = list.contains(contato);

					if (existe) {
						System.out.println("Contato existe, seguem dados:");
						System.out.println(contato);
					} else {
						System.out.println("Contato não existe");
					}

				} catch (Exception e) {
					System.out.println("Posição inválida!");
				}
			}

			private static void pesquisarUltimoIndice(Scanner scan, ArrayList<Contato> list) {

				int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

				try {

					Contato contato = list.get(pos);

					System.out.println("Contato existe, seguem dados:");
					System.out.println(contato);

					System.out.println("Fazendo pesquisa do último índice do contato encontrado:");
					pos = list.lastIndexOf(contato);

					System.out.println("Contato encontrado na posição " + pos);

				} catch (Exception e) {
					System.out.println("Posição inválida!");
				}
			}

			private static void obtemContato(Scanner scan, ArrayList<Contato> list) {

				int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

				try {

					Contato contato = list.get(pos);

					System.out.println("Contato existe, seguem dados:");
					System.out.println(contato);

					System.out.println("Fazendo pesquisa do contato encontrado:");
					pos = list.indexOf(contato);

					System.out.println("Contato encontrado na posição " + pos);

				} catch (Exception e) {
					System.out.println("Posição inválida!");
				}
			}

			private static void obtemContatoPosicao(Scanner scan, ArrayList<Contato> list) {

				int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

				try {

					Contato contato = list.get(pos);

					System.out.println("Contato existe, seguem dados:");
					System.out.println(contato);

				} catch (Exception e) {
					System.out.println("Posição inválida!");
				}
			}

			private static void adicionarContatoFinal(Scanner scan, ArrayList<Contato> list) {

				System.out.println("Criando um contato, entre com as informações:");
				String nome = leInformacao("Entre com o nome", scan);
				String telefone = leInformacao("Entre com o telefone", scan);
				String email = leInformacao("Entre com o email", scan);

				Contato contato = new Contato(nome, telefone, email);

				list.add(contato);

				System.out.println("Contato adicionado com sucesso!");
				System.out.println(contato);
			}

			private static void adicionarContatoPosicao(Scanner scan, ArrayList<Contato> list) {

				System.out.println("Criando um contato, entre com as informações:");
				String nome = leInformacao("Entre com o nome", scan);
				String telefone = leInformacao("Entre com o telefone", scan);
				String email = leInformacao("Entre com o email", scan);

				Contato contato = new Contato(nome, telefone, email);

				int pos = leInformacaoInt("Entre com a posição a adicionar o contato", scan);

				try {
					list.add(pos, contato);

					System.out.println("Contato adicionado com sucesso!");
					System.out.println(contato);

				} catch (Exception e) {
					System.out.println("Posição inválida, contato não adicionado");
				}
			}

			

			

			private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> list) {

				Contato contato;

				for (int i = 1; i <= quantidade; i++) {

					contato = new Contato();
					contato.setNome("Contato " + i);
					contato.setTelefone("1111111" + i);
					contato.setEmail("contato" + i + "@email.com");

					list.add(contato);
				}
			}
		}