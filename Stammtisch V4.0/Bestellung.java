public class Bestellung {
  private int tid;
  private int anzExport;
  private int anzWasser;
  private int anzCola;
  private int anzCoWeizen;
  private int anzWeizen;
  private int anzBeWecken;
  private int anzSeele;
  private int anzWurstsalat;
  private double bPreis; //gesamterPreis
  
  public Bestellung(int tid_b, double preis, int Export, int Wasser, int Cola, int Colaweizen, int Weizen, int Wecken, int Seele, int Wurstsalat){
    this.tid=tid_b;
    this.bPreis=preis;
    this.anzExport=Export;
    this.anzWasser=Wasser;
    this.anzCola=Cola;
    this.anzCoWeizen=Colaweizen;
    this.anzWeizen=Weizen;
    this.anzBeWecken=Wecken;
    this.anzSeele=Seele;
    this.anzWurstsalat=Wurstsalat;
  }

  
  
}
