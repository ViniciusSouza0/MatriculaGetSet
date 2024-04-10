package com.mycompany.matriculagetset;
public class Matricula {
    private String nome;
    private int matricula;
    private int anoIngresso;
    private String curso;
    
    // Construtor
    public Matricula (String nome, int matricula, int anoIngresso, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.anoIngresso = anoIngresso;
        this.curso = curso;
    }
    
    // Getter para o nome
    public String getNome() {
        return nome;
    }
    
    // Setter para o nome
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // Getter para a matrícula
    public int getMatricula() {
        return matricula;
    }
    
    // Setter para a matrícula
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    // Getter para o ano de ingresso
    public int getAnoIngresso() {
        return anoIngresso;
    }
    
    // Setter para o ano de ingresso
    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
    
    // Getter para o curso
    public String getCurso() {
        return curso;
    }
    
    // Setter para o curso
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
