/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author aluno
 */
public class PacienteModel {
    
    private int Id_Paciente;
    private String Nome_Completo;
    private int Idade;
    private String Celular;
    private String Email;
    private String Sexo;
    private String Dores_no_Corpo;
    private String Queixa_Principal_e_Duracao_da_Queixa;
    private String Alergias;
    private String Sintomas_de_Gripe;
    private String Endereco;
    private String Medicamento_em_Uso;
    private String CEP;
    private String Estado;
    private String Sintomas_de_Febre;
    private String Numero;
    private String Cidade;
    
     public PacienteModel() {
    }

    public PacienteModel(int Id_Paciente, String Nome_Completo, int Idade, String Celular, String Email, String Sexo,
            String Dores_do_Corpo, String Queixa_Principal_e_Duracao_da_Queixa, String Alergias, String Sintoma_de_Gripe, String Endereco, String Medicamento_em_Uso,
            String CEP, String Estado, String Sintomas_de_Febre, String Numero, String Cidade) {
        this.Id_Paciente = Id_Paciente;
        this.Nome_Completo = Nome_Completo;
        this.Idade = Idade;
        this.Celular = Celular;
        this.Email = Email;
        this.Sexo = Sexo;
        this.Dores_no_Corpo = Dores_no_Corpo;
        this.Queixa_Principal_e_Duracao_da_Queixa = Queixa_Principal_e_Duracao_da_Queixa;
        this.Alergias = Alergias;
        this.Sintomas_de_Gripe = Sintomas_de_Gripe;
        this.Endereco = Endereco;
        this.Medicamento_em_Uso = Medicamento_em_Uso;
        this.CEP = CEP;
        this.Estado = Estado;
        this.Sintomas_de_Febre = Sintomas_de_Febre;
        this.Numero = Numero;
        this.Cidade = Cidade;
    }
   

    public int getId_Paciente() {
        return Id_Paciente;
    }

    public void setId_Paciente(int Id_Paciente) {
        this.Id_Paciente = Id_Paciente;
    }

    public String getNome_Completo() {
        return Nome_Completo;
    }

    public void setNome_Completo(String Nome_Completo) {
        this.Nome_Completo = Nome_Completo;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getDores_no_Corpo() {
        return Dores_no_Corpo;
    }

    public void setDores_no_Corpo(String Dores_no_Corpo) {
        this.Dores_no_Corpo = Dores_no_Corpo;
    }

    public String getQueixa_Principal_e_Duracao_da_Queixa() {
        return Queixa_Principal_e_Duracao_da_Queixa;
    }

    public void setQueixa_Principal_e_Duracao_da_Queixa(String Queixa_Principal_e_Duracao_da_Queixa) {
        this.Queixa_Principal_e_Duracao_da_Queixa = Queixa_Principal_e_Duracao_da_Queixa;
    }

    public String getAlergias() {
        return Alergias;
    }

    public void setAlergias(String Alergias) {
        this.Alergias = Alergias;
    }

    public String getSintomas_de_Gripe() {
        return Sintomas_de_Gripe;
    }

    public void setSintomas_de_Gripe(String Sintomas_de_Gripe) {
        this.Sintomas_de_Gripe = Sintomas_de_Gripe;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getMedicamento_em_Uso() {
        return Medicamento_em_Uso;
    }

    public void setMedicamento_em_Uso(String Medicamento_em_Uso) {
        this.Medicamento_em_Uso = Medicamento_em_Uso;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getSintomas_de_Febre() {
        return Sintomas_de_Febre;
    }

    public void setSintomas_de_Febre(String Sintomas_de_Febre) {
        this.Sintomas_de_Febre = Sintomas_de_Febre;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }
}

