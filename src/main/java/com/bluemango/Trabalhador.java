package com.bluemango;

public class Trabalhador extends Pessoa {

    private double salario;
    private String setor;

    public Trabalhador() {}

    public Trabalhador(double salario, String setor) {
        this.salario = salario;
        this.setor = setor;
    }

    public Trabalhador(String nome, int idade, String nacionalidade, double salario, String setor) {
        super(nome, idade, nacionalidade);
        this.salario = salario;
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "trabalhador [salario=" + salario + ", setor=" + setor + "]";
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    } 






    
}
