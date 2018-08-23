/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.controller;

import br.edu.ifrs.DAO.OficinaDAO;
import br.edu.ifrs.util.IfrsShowAlert;
import br.edu.ifrs.entity.Oficina;
import br.edu.ifrs.view.panel.PanelAlterarOficina;

/**
 *
 * @author Daniel M. Kun
 */
public class AlterarOficinaController {

    ListagemOficinaController listagemoficinacontroller; // atualizar a tabela quando inserir

    PanelAlterarOficina panelalteraroficina;

    IfrsShowAlert csa = new IfrsShowAlert(); // para usar o método ShowAlert

    // preenche os campos do formulário
    public void setFormulario(Integer oficina_id) {

        OficinaDAO odao = new OficinaDAO();

        Oficina o = odao.selecionaOficinasPorId(oficina_id);

        panelalteraroficina.etID.setText(o.getId()+"");
        panelalteraroficina.etCargaHoraria.setText(o.getCargaHoraria()+"");
        panelalteraroficina.etDataInicio.setText(o.getDataInicio()+"");
        panelalteraroficina.etDataFim.setText(o.getDataFim()+"");
        panelalteraroficina.etLocal.setText(o.getLocal());
        panelalteraroficina.etDescricao.setText(o.getDescricao());
        panelalteraroficina.etProgramacao.setText(o.getProgramacao());
        panelalteraroficina.etTextoAssinatura1.setText(o.getTextoAssinatura1());
        panelalteraroficina.etTextoAssinatura2.setText(o.getTextoAssinatura2());

    }

 // valida os campos obrigatórios e emite alertas
    public boolean verificarFormulario(String descricao, String local, String programacao, String textoAssinatura1, String textoAssinatura2, String dataInicio, String dataFim, Integer cargaHoraria) {
        if (descricao.isEmpty()) {
            csa.showAlert(panelalteraroficina.pnAlert, panelalteraroficina.lbIconAlert, panelalteraroficina.lbAlert, false, "Informe uma descrição");
            return false;
        }
        
        if (local.isEmpty()) {
            csa.showAlert(panelalteraroficina.pnAlert, panelalteraroficina.lbIconAlert, panelalteraroficina.lbAlert, false, "Informe um local");
            return false;
        }
        
        if (programacao.isEmpty()) {
            csa.showAlert(panelalteraroficina.pnAlert, panelalteraroficina.lbIconAlert, panelalteraroficina.lbAlert, false, "Informe uma programação");
            return false;
        }
        
        if (textoAssinatura1.isEmpty()) {
            csa.showAlert(panelalteraroficina.pnAlert, panelalteraroficina.lbIconAlert, panelalteraroficina.lbAlert, false, "Informe o primeiro texto de assinatura");
            return false;
        }
        
        if (textoAssinatura2.isEmpty()) {
            csa.showAlert(panelalteraroficina.pnAlert, panelalteraroficina.lbIconAlert, panelalteraroficina.lbAlert, false, "Informe o segundo texto de assinatura");
            return false;
        }
        
        if (dataInicio.isEmpty()) {
            csa.showAlert(panelalteraroficina.pnAlert, panelalteraroficina.lbIconAlert, panelalteraroficina.lbAlert, false, "Informe uma data de início");
            return false;
        }
        
        if (dataFim.isEmpty()) {
            csa.showAlert(panelalteraroficina.pnAlert, panelalteraroficina.lbIconAlert, panelalteraroficina.lbAlert, false, "Informe uma data final");
            return false;
        }
        
        if (cargaHoraria == null) {
            csa.showAlert(panelalteraroficina.pnAlert, panelalteraroficina.lbIconAlert, panelalteraroficina.lbAlert, false, "Informe uma carga horária");
            return false;
        }
        return true;
    }

    public void limparCampos() {

        panelalteraroficina.etID.setText("");
        panelalteraroficina.etCargaHoraria.setText("");
        panelalteraroficina.etDataInicio.setText("");
        panelalteraroficina.etDataFim.setText("");
        panelalteraroficina.etLocal.setText("");
        panelalteraroficina.etDescricao.setText("");
        panelalteraroficina.etProgramacao.setText("");
        panelalteraroficina.etTextoAssinatura1.setText("");
        panelalteraroficina.etTextoAssinatura2.setText("");

        // dá o foco no campo titulo novamente, caso o usuário queira adicionar outro
        panelalteraroficina.etCargaHoraria.requestFocus();
    }

    public boolean alterarOficina(Integer oficina_id) {

        Integer cargaHoraria = Integer.parseInt(panelalteraroficina.etCargaHoraria.getText());
        String dataInicio = panelalteraroficina.etDataInicio.getText();
        String dataFim = panelalteraroficina.etDataFim.getText();
        String local = panelalteraroficina.etLocal.getText();
        String descricao = panelalteraroficina.etDescricao.getText();
        String programacao = panelalteraroficina.etProgramacao.getText();
        String textoAssinatura1 = panelalteraroficina.etTextoAssinatura1.getText();
        String textoAssinatura2 = panelalteraroficina.etTextoAssinatura2.getText();

        OficinaDAO odao = new OficinaDAO();

        if (verificarFormulario(descricao, local, programacao, textoAssinatura1, textoAssinatura2, dataInicio, dataFim, cargaHoraria)) {
            boolean alteracao = odao.alterarOficina(new Oficina(descricao, local, programacao, textoAssinatura1, textoAssinatura2, dataInicio, dataFim, cargaHoraria));

            if (alteracao) {
                limparCampos();
                // atualiza a tabela da janela de listagem das pessoas
                listagemoficinacontroller.atualizaTabela();
                csa.showAlert(panelalteraroficina.pnAlert, panelalteraroficina.lbIconAlert, panelalteraroficina.lbAlert, true, "Alterado com sucesso");
                return true;
            }
        }
        return false;
    }
}
