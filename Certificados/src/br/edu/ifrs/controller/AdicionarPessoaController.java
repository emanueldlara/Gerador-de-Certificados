/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.controller;

import br.edu.ifrs.DAO.PessoaDAO;
import br.edu.ifrs.util.IfrsShowAlert;
import br.edu.ifrs.entity.Pessoa;
import br.edu.ifrs.view.panel.PanelAdicionarPessoa;

/**
 *
 * @author Daniel M. Kuhn
 */

public class AdicionarPessoaController {
    
    ListagemPessoaController listagempessoacontroller; // atualizar a tabela quando inserir
    
    PanelAdicionarPessoa paneladicionarpessoa;
    
    IfrsShowAlert csa = new IfrsShowAlert(); // para usar o método ShowAlert
    
    
    // valida os campos obrigatórios e emite alertas
    public boolean verificarFormulario(String nome, String email,Long cpf) 
    {
        if (!nome.isEmpty()) {
            if (!email.isEmpty()) {    
                return true;
            } else {
                // usando o método CyberShowAlert 
                csa.showAlert(paneladicionarpessoa.pnAlert, paneladicionarpessoa.lbIconAlert, paneladicionarpessoa.lbAlert, false, "Informe um email");
            }
        } else {
            csa.showAlert(paneladicionarpessoa.pnAlert, paneladicionarpessoa.lbIconAlert, paneladicionarpessoa.lbAlert, false, "Informe um nome");
        }
        return false;
    }
    
    
    public void limparCampos() {
        
        paneladicionarpessoa.etNome.setText("");
        paneladicionarpessoa.etEmail.setText("");
        paneladicionarpessoa.etCPF.setText("");
        
        // dá o foco no campo titulo novamente, caso o usuário queira adicionar outro
        paneladicionarpessoa.etNome.requestFocus(); 
    }
    
    
    public boolean cadastrarPessoa() {
    
        String nome     = paneladicionarpessoa.etNome.getText();
        String email    = paneladicionarpessoa.etEmail.getText();
        Long cpf     = Long.parseLong(paneladicionarpessoa.etCPF.getText());
        
        PessoaDAO pdao = new PessoaDAO();
        
        if (verificarFormulario(nome, email, cpf)) 
        {
            Long pessoa_cpf = pdao.adicionarPessoa(new Pessoa ( nome, email, cpf));
                
            if (pessoa_cpf != null) {
                limparCampos();
                // atualiza a tabela da janela de listagem dos produtos
                listagempessoacontroller.atualizaTabela();
                csa.showAlert(paneladicionarpessoa.pnAlert, paneladicionarpessoa.lbIconAlert, paneladicionarpessoa.lbAlert, true, "Cadastrado com sucesso");
                return true;
            }
        }
        return false;
    }
}
