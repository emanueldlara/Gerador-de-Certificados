/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.controller;

import br.edu.ifrs.DAO.PessoaDAO;
import br.edu.ifrs.util.ButtonColumnDelete;
import br.edu.ifrs.util.ButtonColumnUpdate;
import br.edu.ifrs.util.IfrsJOptionPane;
import br.edu.ifrs.entity.Pessoa;
import br.edu.ifrs.view.exec.AlterarPessoa;
import br.edu.ifrs.view.exec.ListagemPessoa;
import br.edu.ifrs.view.panel.PanelListagemPessoa;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel M. Kuhn
 */
public class ListagemPessoaController {

    private static final Logger LOG = Logger.getLogger(ListagemPessoaController.class.getName());
    
    
    private static ListagemPessoa listagempessoa;
    
    private List<Pessoa> pessoas; // lista referente a tabela
        
    private static PanelListagemPessoa panellistagempessoa;
    
   

    // Remove as linhas antigas da tabela, seleciona no banco e adiciona novamente
    public static void atualizaTabela() {
        removeLinhas();
        ListagemPessoaController lpc = new ListagemPessoaController();
        
        String termos_pesquisa = panellistagempessoa.etBuscar.getText();
        
        // verifica se existe algo no campo de busca
        if (termos_pesquisa.isEmpty()) {
            lpc.addLinhaTabela(false, null);
        } else {
            lpc.addLinhaTabela(true, termos_pesquisa);
        }
    }
    
    
    /**
     * Adiciona linhas na tabela
     * 
     * @fontes https://www.youtube.com/watch?v=GAl1FSKvoFY
     */
    public void addLinhaTabela(boolean pesquisa, String termos) {
        try {
            DefaultTableModel model = (DefaultTableModel) panellistagempessoa.jtPessoa.getModel();
            
            PessoaDAO pdao = new PessoaDAO();

            // caso seja uma pesquisa por termos chave
            if (pesquisa) {
                pessoas = pdao.selecionaPessoaPorNome(termos);
            } else {
                // listagem de todas as pessoas
                pessoas = pdao.selecionaTodasPessoas();
            }
            Object rowData[] = new Object[4];
            
            if (!pessoas.isEmpty()) 
            {
                for (Pessoa pessoa : pessoas) 
                {
                    rowData[0] = pessoa.getNomeCompleto();
                    rowData[1] = pessoa.getEmail();
                    rowData[2] = "Alterar";
                    rowData[3] = "Excluir";
                    model.addRow(rowData);
                }

                Action update;
                update = new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int modelRow = Integer.valueOf(e.getActionCommand());
                        

                        AlterarPessoa ap = new AlterarPessoa(listagempessoa, true, pessoas.get(modelRow).getCpf());
                        ap.setVisible(true);
                    }
                };

                Action delete;
                delete = new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        String title = "Excluir";
                        String msg = "Tem certeza que deseja excluir?";
                        boolean result = IfrsJOptionPane.showMyOptionPane(title, msg, "Sim", "Não");

                        if (result == true) 
                        {
                            int modelRow = Integer.valueOf(e.getActionCommand());

                            if (pdao.deletePessoa(pessoas.get(modelRow).getCpf())) {
                                atualizaTabela();
                            }
                        }
                    }
                };
                
                // aqui as colunas de índice 2 e 3 são alteradas para serem botões
                
                ButtonColumnUpdate buttonColumn2 = new ButtonColumnUpdate(panellistagempessoa.jtPessoa, update, 2);
                buttonColumn2.setMnemonic(KeyEvent.VK_D);

                ButtonColumnDelete buttonColumn3 = new ButtonColumnDelete(panellistagempessoa.jtPessoa, delete, 3);
                buttonColumn3.setMnemonic(KeyEvent.VK_D);
            }

        } catch (Exception e) {
            System.out.println(LOG+" "+e.getMessage());
        }
    }
    
    
    /**
     * 
     * Remove todas as linhas da tabela
     * 
     * @fontes
     * https://stackoverflow.com/questions/6232355/deleting-all-the-rows-in-a-jtable
     */
    public static void removeLinhas() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) panellistagempessoa.jtPessoa.getModel();
            dtm.setRowCount(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
   
    // Limpa o campo de busca
    public static void limpaCampoBusca() {
        panellistagempessoa.etBuscar.setText("");
    }
}
