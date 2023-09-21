/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistema_vendas_2_0;

import com.mycompany.controle.ControleSistema;
import com.mycompany.outros.Constantes;
import com.mycompany.visao.VisaoMenu;

/**
 *
 * @author jose.5989
 */
public class Sistema_Vendas_2_0 {

    public static void main(String[] args) {
        int opcaoMenu;
        
        while(true){
            
            opcaoMenu = VisaoMenu.menuPrincipal();
            
            if(opcaoMenu == Constantes.CADASTRAR){
                ControleSistema.cadastrar();
            }else if (opcaoMenu == Constantes.ALTERAR){
                ControleSistema.alterar(VisaoMenu.menuAteracaoProduto());
            }else if (opcaoMenu == Constantes.LISTAR){
                ControleSistema.listar(ControleSistema.produtos);
            }
        }
    }
}
