/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
 import Model.UsuarioModel;
import Connection.conexao;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author aluno
 */
public class UsuarioDAO { 
    

Connection con = null;
    PreparedStatement pstm = null;

    public void CadastrarUsuario(UsuarioModel um) {

        String sql = "INSERT INTO usuario ( Nome, Sobrenome, CPF, Celular, Nascimento, Sexo, Email, Senha, Confirma_Senha) VALUES (?,?,?,?,?,?,?,?,?)";

        try (Connection connection = conexao.Conexao(); PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, um.getNome());
            ps.setString(2, um.getSobrenome());
            ps.setString(3, um.getCPF());
            ps.setString(4, um.getCelular());
            ps.setString(5, um.getNascimento());
            ps.setString(6, um.getSexo());
            ps.setString(7, um.getEmail());
            ps.setString(8, um.getSenha());
            ps.setString(9, um.getConfirma_Senha());

            ps.execute();

            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void AtualizarUsurio(UsuarioModel UsuarioModel) {
        String sql = "UPDATE usuario SET Senha=? WHERE Confirma_Senha=?";

        Connection con = null;
        PreparedStatement ps = null;

    }
    
   
    
    
    public ResultSet AutenticarLogin(UsuarioModel um) throws Exception{
        String sql = "select * from usuario where Email = ? and Senha = ?";
        con = conexao.Conexao();
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, um.getEmail());
            pstm.setString(2,um.getSenha());
            ResultSet rset = pstm.executeQuery();
            return rset;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro Login Usuario:"+e);
            return null;
        }   
    }

    public List<UsuarioModel> mostrarUsuarios() {

        String sql = "SELECT * FROM usuario";

        List<UsuarioModel> usuarios = new ArrayList<>();

        try (Connection connection = conexao.Conexao(); PreparedStatement preparedStatement = connection.prepareStatement(sql); ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {

                UsuarioModel um = new UsuarioModel();

                um.setId_Usuario(resultSet.getInt("Id_Usuario"));
                um.setNome(resultSet.getString("Nome"));
                um.setSobrenome(resultSet.getString("Sobrenome"));
                um.setCPF(resultSet.getString("cpf"));
                um.setNascimento(resultSet.getString("Nascimento"));
                um.setSexo(resultSet.getString("Sexo"));
                um.setEmail(resultSet.getString("Email"));
                um.setSenha(resultSet.getString("Senha"));
                um.setConfirma_Senha(resultSet.getString("Confirma_Senha"));

                usuarios.add(um);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return usuarios;
    }

}
    

