package PC2;

import java.util.ArrayList;
import java.util.Calendar;

public class Cliente {
    private int nif;
    private String nome;
    private String morada;
    private int telefone;
    private Calendar dataEntrada; // date/calendar
    private ArrayList<Servico> servicos = new ArrayList<>();
    //lista de servicos (adicionar e remover);


    public Cliente(int nif, String nome, String morada, int telefone) {
        this.nif = nif;
        this.nome = nome;
        this.morada = morada;
        this.telefone = telefone;
    }
}
