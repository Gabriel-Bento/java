package com.softgraf.thread_heranca;
/*
 *  Thread é uma classe java que permite processamento concorrente, ou seja,
 *  consigo rodar multiplas classes ao mesmo tempo em um ou mais processadores.
 *  
 *  Há duas formas de implementar Thread em Java:
 *  1. Através do processo de herança: estendendo a classe Thread do java
 *     e sobrescrevendo o método run()
 *     Principal problema da heranç Thread:
 *     Se precisarmos, não podemos estender outra classe!
 *  2. Através  da implementação da interface Runnable do java: criamos uma classe
 *  qualquer e implementamos Runnable sobrescrevendo o método run()
 *  
 *  Neste exemplo estendemos a classe Thread, sobrescrevemos o método run() 
 *  e depois executamos run() chamando o método start()
 *  
 *  Alguns métodos herdados da classe Thread:
 *  - run() serve apenas para sobrescrita, nunca é chamado diretamente
 *  - start() é através dele que é chamado o método run()
 *  - sleep() suspende a thread por um intervalo de tempo dado em milisegundos.
 *  - setName() define o nome da thread
 *  - currentThread() retorna a thread em execução no exato momento.
 *  
 *  Importante: mesmo iniciando threads em sequência, nunca sabemos qual vai ser a 
 *  ordem exata de execução, mas podemos definir prioridades.
 *  
 *  Em qualquer programa Java, temos pelo menos 2 threads em execução:
 *  - o método main(), com alta prioridade
 *  - O Garbage Collector (DAEMON) -> coletor de lixo do java, com baixa prioridade. 
 */

public class MinhaThread extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("Thread: " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

}
