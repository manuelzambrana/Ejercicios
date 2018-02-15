/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author manue
 */
public class Discos {
  private String autor;
  private String nombreDisco;
  private int numeroPremios;
  private int numeroConciertos;

  public Discos(String autor, String nombreDisco, int numeroPremios, int numeroConciertos) {
    this.autor = autor;
    this.nombreDisco = nombreDisco;
    this.numeroPremios = numeroPremios;
    this.numeroConciertos = numeroConciertos;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getNombreDisco() {
    return nombreDisco;
  }

  public void setNombreDisco(String nombreDisco) {
    this.nombreDisco = nombreDisco;
  }

  public int getNumeroPremios() {
    return numeroPremios;
  }

  public void setNumeroPremios(int numeroPremios) {
    this.numeroPremios = numeroPremios;
  }

  public int getNumeroConciertos() {
    return numeroConciertos;
  }

  public void setNumeroConciertos(int numeroConciertos) {
    this.numeroConciertos = numeroConciertos;
  }
  
  
  
  
  
}
