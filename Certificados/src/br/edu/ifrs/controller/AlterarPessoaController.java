/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.controller;

import br.edu.ifrs.DAO.PessoaDAO;
import br.edu.ifrs.util.IfrsShowAlert;
import br.edu.ifrs.entity.Pessoa;
import br.edu.ifrs.view.panel.PanelAlterarPessoa;

/**
 *
 * @author Daniel M. Kun
 */
public class AlterarPessoaController {

    ListagemPessoaController listagempessoacontroller; // atualizar a tabela quando inserir

    PanelAlterarPessoa panelalterarpessoa;

    IfrsShowAlert csa = new IfrsShowAlert(); // para usar o método ShowAlert

    
    // preenche os campos do formulário
    public void setFormulario(Long pessoa_cpf) {
    
        PessoaDAO pdao = new PessoaDAO();
        
        Pessoa p = pdao.selecionaPessoasPorCpf(pessoa_cpf);
        
        panelalterarpessoa.etNome.setText(p.getNomeCompleto());
        panelalterarpessoa.etEmail.setText(p.getEmail());
    }
    
    
    // valida os campos obrigatórios e emite alertas
    public boolean verificarFormulario(String nome, String email, Long cpf) {
        if (!nome.equals("")) {
            if (!email.equals("")) {
                return true;
            } else {
                // usando o método CyberShowAlert 
                csa.showAlert(panelalterarpessoa.pnAlert, panelalterarpessoa.lbIconAlert, panelalterarpessoa.lbAlert, false, "Informe um email");
            }
        } else {
            csa.showAlert(panelalterarpessoa.pnAlert, panelalterarpessoa.lbIconAlert, panelalterarpessoa.lbAlert, false, "Informe um nome");
        }
        return false;
    }
    

    public void limparCampos() {

        panelalterarpessoa.etNome.setText("");
        panelalterarpessoa.etEmail.setText("");
        
        // dá o foco no campo titulo novamente, caso o usuário queira adicionar outro
        panelalterarpessoa.etNome.requestFocus(); 
    }

    
    public boolean alterarPessoa(Long pessoa_cpf) {

        String nome = panelalterarpessoa.etNome.getText();
        String email = panelalterarpessoa.etEmail.getText();

        PessoaDAO pdao = new PessoaDAO();

        if (verificarFormulario(nome, email, pessoa_cpf)) 
        {
            boolean alteracao = pdao.alterarPessoa(new Pessoa(nome, email, pessoa_cpf));

            if (alteracao) {
                limparCampos();
                // atualiza a tabela da janela de listagem das pessoas
                listagempessoacontroller.atualizaTabela();
                csa.showAlert(panelalterarpessoa.pnAlert, panelalterarpessoa.lbIconAlert, panelalterarpessoa.lbAlert, true, "Alterado com sucesso");
                return true;
            }
        }
        return false;
    }
}
