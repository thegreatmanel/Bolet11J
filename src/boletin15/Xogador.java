/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin15;

import javax.swing.JOptionPane;

/**
 *
 * @author propa
 */
public class Xogador extends Seleccion {

    int dorsal;
    String demarcacion;

    public Xogador(int id, String nome, String apelido, int edade, int dorsal, String demarcacion) {

        super(edade, nome, apelido, id);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void Concentrarse() {
        super.Concentrarse();
    }

    ;
    @Override
    public void Viaxar() {
        JOptionPane.showMessageDialog(null, "viaxa os xogadores");
    }
    public void amosar(){
JOptionPane.showMessageDialog(null,super.toString()+dorsal+demarcacion);};

    ;
    public void XogarPartido() {
    }

    ;
    public void Entrenar() {
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getEdade() {
        return edade;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }

}
