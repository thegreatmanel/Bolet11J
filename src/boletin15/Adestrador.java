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
public class Adestrador extends Seleccion {

    String idFederacion;

    public Adestrador(int id, String nome, String apelido, int edade, String idFederacion) {
        super(id, nome, apelido, edade);
        this.idFederacion = idFederacion;
    }

    public void Concentrarse() {
        super.Concentrarse();
    }

    @Override
    public void Viaxar() {
        JOptionPane.showMessageDialog(null, "viaxa o adestrador");
    }

    public void DirixirPartido() {
    }

    public void DirixirAdestramento() {
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
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
