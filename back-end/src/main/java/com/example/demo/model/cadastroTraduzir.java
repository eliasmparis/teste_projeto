package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cadastro")
public class cadastroTraduzir{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String nome_prestado;
private int telefone;
private String endereco;
private String especialidade;
private boolean ativo;

public cadastroTraduzir(String nome_prestado, int telefone, String endereco, String especialidade, boolean ativo) {
    this.nome_prestado = nome_prestado;
    this.telefone = telefone;
    this.endereco = endereco;
    this.especialidade = especialidade;
    this.ativo = ativo;
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getNome_prestado() {
    return nome_prestado;
}
public void setNome_prestado(String nome_prestado) {
    this.nome_prestado = nome_prestado;
}
public int getTelefone() {
    return telefone;
}
public void setTelefone(int telefone) {
    this.telefone = telefone;
}
public String getEndereco() {
    return endereco;
}
public void setEndereco(String endereco) {
    this.endereco = endereco;
}
public String getEspecialidade() {
    return especialidade;
}
public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
}

public boolean getAtivo() {
    return ativo;
}
public void setAtivo(boolean ativo) {
    this.ativo = ativo;
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    cadastroTraduzir other = (cadastroTraduzir) obj;
    if (nome_prestado == null) {
        if (other.nome_prestado != null)
            return false;
    } else if (!nome_prestado.equals(other.nome_prestado))
        return false;
    if (telefone != other.telefone)
        return false;
    if (endereco == null) {
        if (other.endereco != null)
            return false;
    } else if (!endereco.equals(other.endereco))
        return false;
    if (especialidade == null) {
        if (other.especialidade != null)
            return false;
    } else if (!especialidade.equals(other.especialidade))
        return false;
    return true;
    }

public boolean existsById(Long id2) {
    return false;
}

public cadastroTraduzir save(cadastroTraduzir traduzirRepository) {
    return null;
}
}