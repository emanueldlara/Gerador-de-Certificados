/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.controller;

import br.edu.ifrs.DAO.OficinaDAO;
import br.edu.ifrs.util.IfrsShowAlert;
import br.edu.ifrs.entity.Oficina;
import br.edu.ifrs.view.panel.PanelAdicionarOficina;

/**
 *
 * @author Daniel M. Kuhn
 */
public class AdicionarOficinaController {

    ListagemOficinaController listagemoficinacontroller; // atualizar a tabela quando inserir

    PanelAdicionarOficina paneladicionaroficina;

    IfrsShowAlert csa = new IfrsShowAlert(); // para usar o método ShowAlert

    // valida os campos obrigatórios e emite alertas
    public boolean verificarFormulario(String descricao, String local, String programacao, String textoAssinatura1, String textoAssinatura2, String dataInicio, String dataFim, Integer cargaHoraria) {
        if (descricao.isEmpty()) {
            csa.showAlert(paneladicionaroficina.pnAlert, paneladicionaroficina.lbIconAlert, paneladicionaroficina.lbAlert, false, "Informe uma descrição");
            return false;
        }
        
        if (local.isEmpty()) {
            csa.showAlert(paneladicionaroficina.pnAlert, paneladicionaroficina.lbIconAlert, paneladicionaroficina.lbAlert, false, "Informe um local");
            return false;
        }
        
        if (programacao.isEmpty()) {
            csa.showAlert(paneladicionaroficina.pnAlert, paneladicionaroficina.lbIconAlert, paneladicionaroficina.lbAlert, false, "Informe uma programação");
            return false;
        }
        
        if (textoAssinatura1.isEmpty()) {
            csa.showAlert(paneladicionaroficina.pnAlert, paneladicionaroficina.lbIconAlert, paneladicionaroficina.lbAlert, false, "Informe o primeiro texto de assinatura");
            return false;
        }
        
        if (textoAssinatura2.isEmpty()) {
            csa.showAlert(paneladicionaroficina.pnAlert, paneladicionaroficina.lbIconAlert, paneladicionaroficina.lbAlert, false, "Informe o segundo texto de assinatura");
            return false;
        }
        
        if (dataInicio.isEmpty()) {
            csa.showAlert(paneladicionaroficina.pnAlert, paneladicionaroficina.lbIconAlert, paneladicionaroficina.lbAlert, false, "Informe uma data de início");
            return false;
        }
        
        if (dataFim.isEmpty()) {
            csa.showAlert(paneladicionaroficina.pnAlert, paneladicionaroficina.lbIconAlert, paneladicionaroficina.lbAlert, false, "Informe uma data final");
            return false;
        }
        
        if (cargaHoraria == null) {
            csa.showAlert(paneladicionaroficina.pnAlert, paneladicionaroficina.lbIconAlert, paneladicionaroficina.lbAlert, false, "Informe uma carga horária");
            return false;
        }
        return true;
    }

    public void limparCampos() {

        paneladicionaroficina.etDescricao.setText("");
        paneladicionaroficina.etLocal.setText("");
        paneladicionaroficina.etProgramacao.setText("");
        paneladicionaroficina.etTextoAssinatura1.setText("");
        paneladicionaroficina.etTextoAssinatura2.setText("");
        paneladicionaroficina.etDataInicio.setText("");
        paneladicionaroficina.etDataFim.setText("");
        paneladicionaroficina.etCargaHoraria.setText("");

        // dá o foco no campo titulo novamente, caso o usuário queira adicionar outro
        paneladicionaroficina.etDescricao.requestFocus();
    }

    public boolean cadastrarOficina() {

        String descricao = paneladicionaroficina.etDescricao.getText();
        String local = paneladicionaroficina.etLocal.getText();
        String programacao = paneladicionaroficina.etProgramacao.getText();
        String textoAssinatura1 = paneladicionaroficina.etTextoAssinatura1.getText();
        String textoAssinatura2 = paneladicionaroficina.etTextoAssinatura2.getText();
        String dataInicio = (paneladicionaroficina.etDataInicio.getText());
        String dataFim = (paneladicionaroficina.etDataFim.getText());
        Integer cargaHoraria = Integer.parseInt(paneladicionaroficina.etCargaHoraria.getText());

        OficinaDAO odao = new OficinaDAO();

        if (verificarFormulario(descricao, local, programacao, textoAssinatura1, textoAssinatura2, dataInicio, dataFim, cargaHoraria)) {
            Integer oficina_id = odao.adicionarOficina(new Oficina(descricao, local, programacao, textoAssinatura1, textoAssinatura2, dataInicio, dataFim, cargaHoraria));

            if (oficina_id != null) {
                limparCampos();
                // atualiza a tabela da janela de listagem dos produtos
                ListagemOficinaController.atualizaTabela();
                csa.showAlert(paneladicionaroficina.pnAlert, paneladicionaroficina.lbIconAlert, paneladicionaroficina.lbAlert, true, "Cadastrado com sucesso");
                return true;
            }
        }
        return false;
    }
}
