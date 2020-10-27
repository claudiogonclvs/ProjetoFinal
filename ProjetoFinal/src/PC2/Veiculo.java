package PC2;

import java.util.ArrayList;

public class Veiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private int combustivel;
    private int numQuilometros;
    private String caracteristicas;
    private int estado = 1; //Valor fixo
    private double precoVenda; //n é pedido no inicio
    private int numManutencoes = 0; //n é pedido no inicio
    private ArrayList<Manutencao> manutencoes = new ArrayList<>();
    //lista das manutencoes (adicionar e mostrar)


    public Veiculo(String matricula, String marca, String modelo, int combustivel,
                   int numQuilometros, String caracteristicas) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.combustivel = combustivel;
        this.numQuilometros = numQuilometros;
        this.caracteristicas = caracteristicas;
    }

    public int getNumQuilometros() {
        return numQuilometros;
    }

    public void setNumQuilometros(int numQuilometros) {
        this.numQuilometros = numQuilometros;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getNumManutencoes() {
        return numManutencoes;
    }

    public void setNumManutencoes(int numManutencoes) {
        this.numManutencoes = numManutencoes;
    }

    public ArrayList<Manutencao> getManutencoes() {
        return manutencoes;
    }

    public void setManutencoes(ArrayList<Manutencao> manutencoes) {
        this.manutencoes = manutencoes;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", combustivel=" + combustivel +
                ", numQuilometros=" + numQuilometros +
                ", caracteristicas='" + caracteristicas + '\'' +
                ", precoVenda=" + precoVenda +
                ", numManutencoes=" + numManutencoes +
                '}';
    }
}


