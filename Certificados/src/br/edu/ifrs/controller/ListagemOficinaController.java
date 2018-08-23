/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.controller;


import br.edu.ifrs.DAO.OficinaDAO;
import br.edu.ifrs.entity.Oficina;
import br.edu.ifrs.util.ButtonColumnDelete;
import br.edu.ifrs.util.ButtonColumnUpdate;
import br.edu.ifrs.util.IfrsJOptionPane;
import br.edu.ifrs.view.exec.AlterarOficina;
import br.edu.ifrs.view.exec.ListagemOficina;
import br.edu.ifrs.view.panel.PanelListagemOficina;
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
public class ListagemOficinaController {

    private static final Logger LOG = Logger.getLogger(ListagemOficinaController.class.getName());
    
    
    private static ListagemOficina listagemoficina;
    
    private List<Oficina> oficinas; // lista referente a tabela
        
    private static PanelListagemOficina panellistagemoficina;
    
   

    // Remove as linhas antigas da tabela, seleciona no banco e adiciona novamente
    public static void atualizaTabela() {
        removeLinhas();
        ListagemOficinaController lpc = new ListagemOficinaController();
        
        String termos_pesquisa = panellistagemoficina.etBuscar.getText();
        
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
            DefaultTableModel model = (DefaultTableModel) panellistagemoficina.jtOficina.getModel();
            
            OficinaDAO pdao = new OficinaDAO();

            // caso seja uma pesquisa por termos chave
            if (pesquisa) {
                oficinas = pdao.selecionaOficinasPorDescricao(termos);
            } else {
                // listagem de todas as oficinas
                oficinas = pdao.selecionaTodasOficinas();
            }
            Object rowData[] = new Object[7];
            
            if (!oficinas.isEmpty()) 
            {
                for (Oficina oficina : oficinas) 
                {
                    rowData[0] = oficina.getId();
                    rowData[1] = oficina.getDescricao();
                    rowData[2] = oficina.getDataInicioFormatada();
                    rowData[3] = oficina.getDataFimFormatada();
                    rowData[4] = oficina.getCargaHoraria();                  
                    rowData[5] = "Alterar";
                    rowData[6] = "Excluir";
                    model.addRow(rowData);

                }

                Action update;
                update = new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int modelRow = Integer.valueOf(e.getActionCommand());
                        

                        AlterarOficina ao = new AlterarOficina(listagemoficina, true, oficinas.get(modelRow).getId());
                        ao.setVisible(true);
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

                            if (pdao.deleteOficina(oficinas.get(modelRow).getId())) {
                                atualizaTabela();
                            }
                        }
                    }
                };
                
                // aqui as colunas de índice 2 e 3 são alteradas para serem botões
                
                ButtonColumnUpdate buttonColumn2 = new ButtonColumnUpdate(panellistagemoficina.jtOficina, update, 5);
                buttonColumn2.setMnemonic(KeyEvent.VK_D);

                ButtonColumnDelete buttonColumn3 = new ButtonColumnDelete(panellistagemoficina.jtOficina, delete, 6);
                buttonColumn3.setMnemonic(KeyEvent.VK_D);
            }

        } catch (Exception e) {
            System.out.println(LOG+""+e.getMessage());
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
            DefaultTableModel dtm = (DefaultTableModel) panellistagemoficina.jtOficina.getModel();
            dtm.setRowCount(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
   
    // Limpa o campo de busca
    public static void limpaCampoBusca() {
        panellistagemoficina.etBuscar.setText("");
    }
}
