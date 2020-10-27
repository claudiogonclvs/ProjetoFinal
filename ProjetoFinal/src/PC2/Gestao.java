package PC2;

import java.util.ArrayList;

public class Gestao {
    private ArrayList<Veiculo> veiculos = new ArrayList<>();

    private ArrayList<Cliente> clientes = new ArrayList<>();

    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    /*private ArrayList<Compra> compras = new ArrayList<>();

    private ArrayList<Venda> venda = new ArrayList<>();*/

    private ArrayList<Negociacao> negociacoes = new ArrayList<>();

    private ArrayList<Manutencao> manutencoes = new ArrayList<>();

    ////////////////VEICULOS//////////////////

    /**
     * permite adicionar um veiculo ao array dos veiculos
     * @param v recebe o veiculo
     */

    public void adicionarVeiculo(Veiculo v){
        veiculos.add(v);
    }

    /**
     * Mostra todos os veiculos
     * @return devolve uma string com os veiculos
     */
    public String mostrarveiculos(){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < veiculos.size(); i++) {
            s.append(veiculos.get(i)).append("\n");
        }
        return s.toString();
    }

    public int pesquisarVeiculo (String matricula){
        for (int i = 0; i < veiculos.size(); i++) {
            if (matricula == veiculos.get(i).getMatricula()){
                return i;
            }
        }
        return -1;
    }

    public Veiculo obterVeiculo(int pos){
        return veiculos.get(pos);
    }

    public int getNumveiculos(){
        return veiculos.size();
    }
}
