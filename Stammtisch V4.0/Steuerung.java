import java.util.ArrayList;
public class Steuerung {
  public Ware[] dieWare=new Ware[8];   // Legt die Anzahl möglicher Waren fest
  private Tische[]   dieTische=new Tische[4];
  private GUI dieGUI=new GUI(this);
  private Bestellung[] dieBestellung=new Bestellung[99];
  private int anzBest=0;
  
  
  public Steuerung(){
    initWare();
    initTische();
    dieGUI.setLabel();
  }
  
  public void initWare(){
    //Ware anlegen       
    this.dieWare[0]=new Ware(1,"Export",3.0);
    
    this.dieWare[1]=new Ware(2,"Wasser",1.5);
    
    this.dieWare[2]=new Ware(3,"Cola",2.8);
    
    this.dieWare[3]=new Ware(4,"Colaweizen",3.4);
    
    this.dieWare[4]=new Ware(5,"Weizen",3.5);
    
    this.dieWare[5]=new Ware(6,"Belegte Wecken",3.5);
     
    this.dieWare[6]=new Ware(7,"Seele",5.8);
    
    this.dieWare[7]=new Ware(8,"Wurstsalat",6.5);
    
  }
  
  public void initTische() {
    //Tische anlegen
    this.dieTische[0]= new Tische(1,"Stammtisch");
    
    this.dieTische[1]= new Tische(2,"Bettlertisch");
    
    this.dieTische[2]= new Tische(3,"Gemeindetisch");
    
    this.dieTische[3]= new Tische(4,"Vereinstisch");
    
  }
  
  public void initBestellung(){
    int tischnr=; //hier weiter machen
    dieBestellung[anzBest]= new Bestellung(dieTische[tischnr].gibNummer,);
  }

  public void setBestellung(){
    initBestellung();   
    } 
  
    }  
        
    }
    } 
        
    } 
  



