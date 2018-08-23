/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.DAO;

import br.edu.ifrs.entity.Oficina;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
import br.edu.ifrs.persistence.Conexao;
import br.edu.ifrs.util.DateUtil;
import br.edu.ifrs.util.Termos;
import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel M. Kuhn 
 */
public class OficinaDAO {

    private static final Logger LOG = Logger.getLogger(OficinaDAO.class.getName());

    public Integer adicionarOficina(Oficina objeto) {
         try {
            String sql = "INSERT INTO oficina (descricao, data_inicio, data_fim, carga_horaria, local, programacao, texto_assinatura_01, texto_assinatura_02) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement pstmt = Conexao.getConnection()
                .prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            
            pstmt.setString(1, objeto.getDescricao());
            pstmt.setDate(2, new Date(objeto.getDataInicio().getTime()));
            pstmt.setDate(3, new Date(objeto.getDataInicio().getTime()));
            pstmt.setInt(4, objeto.getCargaHoraria());
            pstmt.setString(5, objeto.getLocal());
            pstmt.setString(6, objeto.getProgramacao());
            pstmt.setString(7, objeto.getTextoAssinatura1());
            pstmt.setString(8, objeto.getTextoAssinatura2());
            
            pstmt.executeUpdate();
            
            Integer oficina_id = null;
            
            ResultSet rs = pstmt.getGeneratedKeys();
            
            if (rs.next()) {
                oficina_id = rs.getInt(1);
            }
            
            return oficina_id;
            
        } catch(SQLException e) {
            System.out.println(LOG+" - "+e.getMessage());
            return null;
        }
    }
    
    
    public List<Oficina> selecionaTodasOficinas() {
    
        Connection conn = Conexao.getConnection();
        
        String sql = "SELECT * FROM oficina o";
        
        try 
        {   
            Statement stmt  = conn.createStatement();
            ResultSet rs    = stmt.executeQuery(sql);

            List<Oficina> oficinas = new ArrayList<>();
            
            while (rs.next()) 
            {
                Oficina o = new Oficina();

                o.setId(rs.getInt("id"));
                o.setDescricao(rs.getString("descricao"));
                o.setDataInicio(rs.getDate("data_inicio"));
                o.setDataFim(rs.getDate("data_fim"));
                o.setCargaHoraria((rs.getInt("carga_horaria")));
                o.setLocal((rs.getString("local")));
                o.setProgramacao((rs.getString("programacao")));
                o.setTextoAssinatura1((rs.getString("texto_assinatura_01")));
                o.setTextoAssinatura2((rs.getString("texto_assinatura_02")));
                
                oficinas.add(o);
            }
            stmt.close();
            return oficinas;
            
        } catch (SQLException e) {
            System.out.println(LOG+" "+e.getMessage());
            return null;
        }
    }
    
    
    public Oficina selecionaOficinasPorId(Integer id) {        
       
        String sql = " SELECT * FROM oficina o WHERE o.id = ? ";
    
        try 
        {   
            System.out.println("aki: "+id);
            PreparedStatement pstmt = Conexao.getConnection().prepareStatement(sql);

            pstmt.setInt(1, id);
            
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) 
            {    
                Oficina o = new Oficina();

                o.setId(rs.getInt("id"));
                System.out.println("aki01: "+rs.getString("descricao"));
                o.setDescricao(rs.getString("descricao"));
                System.out.println("aki02: "+o.getDescricao());
                o.setDataInicio(DateUtil.sql2util(rs.getString("data_inicio")));
                o.setDataFim(DateUtil.sql2util(rs.getString("data_fim")));
                o.setCargaHoraria((rs.getInt("carga_horaria")));
                o.setLocal((rs.getString("local")));
                o.setProgramacao((rs.getString("programacao")));
                o.setTextoAssinatura1((rs.getString("texto_assinatura_01")));
                o.setTextoAssinatura2((rs.getString("texto_assinatura_02")));
                
                return o;
            }
            
            return null;
                        
        } catch(SQLException e) {
            System.out.println(LOG+" "+e.getMessage());
            return null;
        }
    }
    
   
    
    public List<Oficina> selecionaOficinasPorDescricao(String termo) 
    {
        String sql = " SELECT * "  
                   + "   FROM oficina "     
                   + "  WHERE unaccent(descricao) "
                   + "  ILIKE unaccent('%"+Termos.limpaTermos(termo)+"%') ";
                    
        try {
            Connection conn = Conexao.getConnection();

            Statement stmt  = conn.createStatement();
            ResultSet rs    = stmt.executeQuery(sql);

            List<Oficina> oficina = new ArrayList<>();
            
            while (rs.next()) 
            {
                Oficina o = new Oficina();

                o.setId(rs.getInt("id"));
                o.setDescricao(rs.getString("descricao"));
                o.setDataInicio(rs.getDate("data_inicio"));
                o.setDataFim((rs.getDate("data_fim")));
                o.setCargaHoraria((rs.getInt("carga_horaria")));
                o.setLocal((rs.getString("local")));
                o.setProgramacao((rs.getString("programacao")));
                o.setTextoAssinatura1((rs.getString("texto_assinatura_01")));
                o.setTextoAssinatura2((rs.getString("texto_assinatura_02")));
                
                oficina.add(o);
            }

            stmt.close();
            return oficina;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    
    
    public boolean deleteOficina(Integer id) {
        try 
        {
            String sql = " DELETE FROM oficina WHERE id = ? ";
            
            PreparedStatement pstmt = Conexao.getConnection().prepareStatement(sql);
            
            pstmt.setInt(1, id);
            
            if (pstmt.executeUpdate() == 1) {
                return true;
            }
            return false;
            
        } catch(SQLException e) {
            System.out.println(LOG+" "+e.getMessage());
            return false;
        }
    }
    
     public boolean alterarOficina(Oficina objeto) {
        try 
        {
            String sql = " UPDATE oficina "
                       + "    SET descricao = ?, "
                       + "        data_inicio = ?, "
                       + "        data_fim = ?, "
                       + "        local = ?, "
                       + "        programacao = ?, "
                       + "        texto_assinatura_01 = ?, "
                       + "        texto_assinatura_02 = ? "
                       + "  WHERE id = ? ";

            PreparedStatement pstmt = Conexao.getConnection().prepareStatement(sql);
            
            pstmt.setString(1, objeto.getDescricao());
            pstmt.setDate(2, new Date(objeto.getDataInicio().getTime()));
            pstmt.setDate(3, new Date(objeto.getDataInicio().getTime()));
            pstmt.setInt(4, objeto.getCargaHoraria());
            pstmt.setString(5, objeto.getLocal());
            pstmt.setString(6, objeto.getProgramacao());
            pstmt.setString(7, objeto.getTextoAssinatura1());
            pstmt.setString(8, objeto.getTextoAssinatura1());
            pstmt.setInt(9, objeto.getId());

            if (pstmt.executeUpdate() == 1) {
                return true;
            }
            return false;
            
        } catch(SQLException e) {
            System.out.println(LOG+" "+e.getMessage());
            return false;
        }
    }
     
    public static void main(String[] args) {
        
    }
}
