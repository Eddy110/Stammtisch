public class Tische{
  private int id_t;
  private String tisch;
  
  public Tische(int nr, String ti) {
    this.id_t=nr;
    this.tisch=ti;
  }
  
  public int gibNummer(){
    int rueckgabe=id_t;
    return rueckgabe;    
  }
  
  public String gibKlasse(){
    String rueckgabe=tisch;
    return rueckgabe;    
  }
}

