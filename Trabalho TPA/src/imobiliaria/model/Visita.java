package imobiliaria.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Visita implements Serializable {
    private Imovel imovelVisitado;
    private Funcionario corretorResponsavel;
    private Comprador cliente;
    private float gasto;
    private LocalDate data;
    private final int codigoVisita;

    public int getCodigoVisita() {
        return codigoVisita;
    }

    public Imovel getImovel() {
        return imovelVisitado;
    }

    public void setImovel(Imovel imovelVisitado) {
        this.imovelVisitado = imovelVisitado;
    }

    public Funcionario getCorretor() {
        return corretorResponsavel;
    }

    public void setCorretor(Funcionario corretor) {
        this.corretorResponsavel = corretorResponsavel;
    }

    public Comprador getCliente() {
        return cliente;
    }

    public void setCliente(Comprador cliente) {
        this.cliente = cliente;
    }

    public float getGasto() {
        return gasto;
    }

    public void setGasto(float gasto) {
        this.gasto = gasto;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Visita(Imovel imovelVisitado, Funcionario corretorResponsavel, Comprador cliente, float gasto, LocalDate data, int codigoVisita) {
        this.imovelVisitado = imovelVisitado;
        this.corretorResponsavel = corretorResponsavel;
        this.cliente = cliente;
        this.gasto = gasto;
        this.data = data;
        this.codigoVisita = codigoVisita;
    }
}
