/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.DAO;

import br.edu.ifrs.entity.Pessoa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
import br.edu.ifrs.persistence.Conexao;
import br.edu.ifrs.util.Termos;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel M. Kuhn
 */
public class PessoaDAO {

    private static final Logger LOG = Logger.getLogger(PessoaDAO.class.getName());

    public Long adicionarPessoa(Pessoa p) {
        try {
            String sql = "INSERT INTO pessoa (cpf, nome, email) VALUES (?, ?, ?)";

            PreparedStatement pstmt = Conexao.getConnection()
                    .prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            pstmt.setLong(1, p.getCpf());
            pstmt.setString(2, p.getNomeCompleto());
            pstmt.setString(3, p.getEmail());

            pstmt.executeUpdate();

            Long pessoa_cpf = null;

            ResultSet rs = pstmt.getGeneratedKeys();

            if (rs.next()) {
                pessoa_cpf = rs.getLong(1);
            }

            return pessoa_cpf;

        } catch (SQLException e) {
            System.out.println(LOG + " - " + e.getMessage());
            return null;
        }
    }

    public List<Pessoa> selecionaTodasPessoas() {

        Connection conn = Conexao.getConnection();

        String sql = "SELECT * FROM pessoa p";

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            List<Pessoa> pessoa = new ArrayList<>();

            while (rs.next()) {
                Pessoa p = new Pessoa();

                p.setCpf(rs.getLong("cpf"));
                p.setNomeCompleto(rs.getString("nome"));
                p.setEmail(rs.getString("email"));

                pessoa.add(p);
            }
            stmt.close();
            return pessoa;

        } catch (SQLException e) {
            System.out.println(LOG + " " + e.getMessage());
            return null;
        }
    }

    public Pessoa selecionaPessoasPorCpf(Long cpf) {

        String sql = " SELECT * FROM pessoa p WHERE p.cpf = ? ";

        try {
            PreparedStatement pstmt = Conexao.getConnection().prepareStatement(sql);

            pstmt.setLong(1, cpf);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println("Entrou aqui 02");
                Pessoa p = new Pessoa();

                p.setCpf(rs.getLong("cpf"));
                p.setNomeCompleto(rs.getString("nome"));
                p.setEmail(rs.getString("email"));

                return p;
            }

            return null;

        } catch (SQLException e) {
            System.out.println(LOG + " " + e.getMessage());
            return null;
        }
    }

    public List<Pessoa> selecionaPessoaPorNome(String termo) {
        String sql = " SELECT * "
                + "   FROM pessoa "
                + "  WHERE unaccent(nome) "
                + "  LIKE unaccent('%" + Termos.limpaTermos(termo) + "%') ";

        try {
            Connection conn = Conexao.getConnection();

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            List<Pessoa> pessoa = new ArrayList<>();

            while (rs.next()) {
                Pessoa p = new Pessoa();

                p.setCpf(rs.getLong("cpf"));
                p.setNomeCompleto(rs.getString("nome"));
                p.setEmail(rs.getString("email"));

                pessoa.add(p);
            }

            stmt.close();
            return pessoa;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public boolean deletePessoa(Long cpf) {
        try {
            String sql = " DELETE FROM pessoa WHERE cpf = ? ";

            PreparedStatement pstmt = Conexao.getConnection().prepareStatement(sql);

            pstmt.setLong(1, cpf);

            if (pstmt.executeUpdate() == 1) {
                return true;
            }
            return false;

        } catch (SQLException e) {
            System.out.println(LOG + " " + e.getMessage());
            return false;
        }
    }

    public boolean alterarPessoa(Pessoa p) {
        try {
            String sql = " UPDATE pessoa "
                    + "    SET nome = ?, "
                    + "        email = ? "
                    + "  WHERE cpf = ? ";

            PreparedStatement pstmt = Conexao.getConnection().prepareStatement(sql);

            pstmt.setString(1, p.getNomeCompleto());
            pstmt.setString(2, p.getEmail());
            pstmt.setLong(3, p.getCpf());

            if (pstmt.executeUpdate() == 1) {
                return true;
            }
            return false;

        } catch (SQLException e) {
            System.out.println(LOG + " " + e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        PessoaDAO pdao = new PessoaDAO();
        pdao.selecionaPessoaPorNome("pessoa");
    }
}
