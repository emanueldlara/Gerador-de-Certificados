package br.edu.ifrs.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Oficina {

    private String descricao;
    private String local;
    private String programacao;
    private String textoAssinatura1;
    private String textoAssinatura2;
    private Date dataInicio;
    private Date dataFim;
    private int cargaHoraria;
    private int id;

    public Oficina(String descricao, String local, String programacao, String textoAssinatura1, String textoAssinatura2, String dataInicio, String dataFim, int cargaHoraria) {
        this.descricao = descricao;
        this.local = local;
        this.programacao = programacao;
        this.textoAssinatura1 = textoAssinatura1;
        this.textoAssinatura2 = textoAssinatura2;
        setDataInicio(dataInicio);
        setDataFim(dataFim);
        this.cargaHoraria = cargaHoraria;

    }

    public Oficina(String descricao, String local, String programacao, String textoAssinatura1, String textoAssinatura2, String dataInicio, String dataFim, int cargaHoraria, Integer id) {
        this.descricao = descricao;
        this.local = local;
        this.programacao = programacao;
        this.textoAssinatura1 = textoAssinatura1;
        this.textoAssinatura2 = textoAssinatura2;
        setDataInicio(dataInicio);
        setDataFim(dataFim);
        this.cargaHoraria = cargaHoraria;
        this.id = id;
    }

    public Oficina() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getProgramacao() {
        return programacao;
    }

    public void setProgramacao(String programacao) {
        this.programacao = programacao;
    }

    public String getTextoAssinatura1() {
        return textoAssinatura1;
    }

    public void setTextoAssinatura1(String textoAssinatura1) {
        this.textoAssinatura1 = textoAssinatura1;
    }

    public String getTextoAssinatura2() {
        return textoAssinatura2;
    }

    public void setTextoAssinatura2(String textoAssinatura2) {
        this.textoAssinatura2 = textoAssinatura2;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public String getDataInicioFormatada() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return format.format(dataInicio);
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            setDataInicio(format.parse(dataInicio));
        } catch (ParseException ex) {
            Logger.getLogger(Oficina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Date getDataFim() {
        return dataFim;
    }

   
    
    public String getDataFimFormatada() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return format.format(dataFim);
    }
    
    
    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public void setDataFim(String dataFim) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            setDataInicio(format.parse(dataFim));
        } catch (ParseException ex) {
            Logger.getLogger(Oficina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
