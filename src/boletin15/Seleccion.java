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
public class Seleccion {


    int id;
    String nome;
    String apelido;
    int edade;

    public Seleccion(int id, String nome, String apelido, int edade) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.edade = edade;
    }

    public void Concentrarse() {
        JOptionPane.showMessageDialog(null, "concentrase a seleccion");
    }

    public void Viaxar() {
        JOptionPane.showMessageDialog(null, "viaxa a seleccion");

    }

    public String toString() {
        return "Seleccion{" + "id=" + id + ", nome=" + nome + ", apelido=" + apelido + ", edade=" + edade + '}';
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
