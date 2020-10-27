package PC2;

import java.util.ArrayList;
import java.util.Calendar;

public class Servico {
    private Veiculo veiculo;
    private Calendar dataIniVenda; // calendar
    private int dataFimVenda; // calendar
    private Cliente cliente; // sem construtor
    private Funcionario funcionario; // sem construtor
    private int numero; //único
    private char estado = 0;
    private char condicao;
    private double precoFinal;
    private ArrayList<Negociacao> negociacoes = new ArrayList<>();
    //lista de negociacoes (adicionar e remover)


    public Servico(Veiculo veiculo, Calendar dataIniVenda, Cliente cliente,
                   Funcionario funcionario, int numero, char condicao) {
        this.veiculo = veiculo;
        this.dataIniVenda = dataIniVenda;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.numero = numero;
        this.condicao = condicao;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Calendar getDataIniVenda() {
        return dataIniVenda;
    }

    public void setDataIniVenda(Calendar dataIniVenda) {
        this.dataIniVenda = dataIniVenda;
    }

    public int getDataFimVenda() {
        return dataFimVenda;
    }

    public void setDataFimVenda(int dataFimVenda) {
        this.dataFimVenda = dataFimVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public char getCondicao() {
        return condicao;
    }

    public void setCondicao(char condicao) {
        this.condicao = condicao;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }

    public ArrayList<Negociacao> getNegociacoes() {
        return negociacoes;
    }

    public void setNegociacoes(ArrayList<Negociacao> negociacoes) {
        this.negociacoes = negociacoes;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "veiculo=" + veiculo +
                ", dataIniVenda=" + dataIniVenda +
                ", dataFimVenda=" + dataFimVenda +
                ", cliente=" + cliente +
                ", funcionario=" + funcionario +
                ", numero=" + numero +
                ", estado=" + estado +
                ", condicao=" + condicao +
                ", precoFinal=" + precoFinal +
                '}';
    }
}
