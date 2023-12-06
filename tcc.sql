create database medconnect;
use medconnect;
 
create table Paciente (
 Id_paciente INT AUTO_INCREMENT PRIMARY KEY,
  Nome_Completo VARCHAR(150)not null,
    Idade int not null,
    Celular VARCHAR(12)not null,
    Email VARCHAR(150)not null,
    Sexo varchar (15) not null,
    Dores_no_Corpo varchar (1500) not null,
    Queixa_Principal_e_Duracao_da_Queixa varchar (1500) not null,
    Alergias VARCHAR(255)not null,
    Sintomas_de_Gripe  VARCHAR(4)not null,
    Endereco VARCHAR(255) not null,
    Medicamentos_em_Uso varchar (100)  not null,
    CEP varchar (10) not null,
    Estado varchar(25) not null,
    Sintomas_de_Febre VARCHAR(4)not null,
    Numero varchar (5) not null,
    Cidade VARCHAR(50)not null
    );
    
    create table Usuario(
    Id_Usuario  INT AUTO_INCREMENT PRIMARY KEY,
    Nome varchar (30) not null,
    Sobrenome varchar (70) not null,
    CPF varchar (20)not null,
    Celular varchar (11) not null,
    Nascimento varchar(11) not null,
    Sexo varchar (15) not null,
    Email varchar (150) not null,
    Senha varchar (15) not null,
    Confirma_Senha varchar (15) not null
    );
    
    