/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visao;

import com.mycompany.modelo.Computador;
import java.util.Scanner;

/**
 *
 * @author jose.5989
 */
public class VisaoComputador {
    public static Computador telaCadastroComputador(){
        Computador computador = new Computador();
        System.out.println("==================CADASTRO DE COMPUTADOR===============");
        System.out.println("Nome: ");
        computador.setNome(new Scanner(System.in).nextLine());
        System.out.println("Preço: ");
        computador.setPreco(new Scanner(System.in).nextDouble());
        System.out.println("Memória ram: ");
        computador.setMemoriaRam(new Scanner(System.in).nextDouble());
        System.out.println("Procesador: ");
        computador.setProcessador(new Scanner(System.in).nextLine());
        System.out.println("========================================================");
        return computador;
    }
}
