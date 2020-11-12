/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan41.massajenis;

/**
 *
 * @author 
 * Nama     : Reihan Wiyanda
 * Kelas    : IF-1
 * Nim      : 10119011
 */
public class Kubus {
    private int sisi, massa;
    
  public int getSisi () {
      return sisi;
  }
  
  public void setSisi(int sisi) {
      this.sisi = sisi;
  }
  
  public int getMassa () {
      return massa;
  }
  
  public void setMassa (int massa) {
      this.massa = massa;
  }
  
  public int hitungVolume (int parSisi) {
      return parSisi * parSisi * parSisi;
  }
  
  public int hitungMassaJenis (int parMassa, int volume) {
      return parMassa / hitungVolume(volume);
  }
}

