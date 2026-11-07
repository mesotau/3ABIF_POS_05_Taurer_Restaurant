public class Restaurant{

    private String name;
    private int sitzplaetze;
    private boolean vegetarisch;
    private boolean lieferdienst;
    private int tische;
    
    //Konstruktor Orignal neu
    
    public Restaurant(String name, int sitzplaetze, boolean vegetarisch, boolean lieferdienst, int tische){
    
        setName(name);
        setSitzplaetze(sitzplaetze);
        setVegetarisch(vegetarisch);
        setLieferdienst(lieferdienst);
        setTische(tische);
    }
    
    //Konstruktor Orignal
    
    public Restaurant(String name, int sitzplaetze, boolean vegetarisch){
    
        setName(name);
        setSitzplaetze(sitzplaetze);
        setVegetarisch(vegetarisch);
    }
    
    //Konstruktor 03
    
    public Restaurant(String name, boolean vegetarisch){
    
        setName(name);
        setVegetarisch(vegetarisch);
    }
    
    //Konstruktor 04 kann nicht weil selbe Signatur wie Konstruktor Original
    
    /*public Restaurant(String name, int sitzplaetze, boolean lieferdienst){
    
        setName(name);
        setSitzplaetze(sitzplaetze);
        setLieferdienst(lieferdienst);
    }*/
    
    //Konstruktor 05
    
    public Restaurant(String name, boolean lieferdienst, int sitzplaetze){
    
        setName(name);
        setSitzplaetze(sitzplaetze);
        setLieferdienst(lieferdienst);
    }
    
    //Konstruktor 06
    
    public Restaurant(String name){
    
        setName(name);
    }

    //Default Konstruktor
    
    public Restaurant(){
    
        setName("UNKN");
        setSitzplaetze(1);
        setVegetarisch(false);
        
    }

    
    // Get
    
    public String getName(){
    
        return name;
    }
    
    public int getSitzplaetze(){
    
        return sitzplaetze;
    }
    
    public boolean getVegetarisch(){
    
        return vegetarisch;
    }
    
    public boolean getLieferdinst(){
    
        return lieferdienst;
    }
    
    public int getTische(){
    
        return tische;
    }
    
    //Set
    
    public void setName(String name){
    
        this.name = name;
    }
    
    public void setSitzplaetze(int sitzplaetze){
        
        if((sitzplaetze >= 1) && (sitzplaetze <= 1000)){
            
            this.sitzplaetze = sitzplaetze;
        }
        else{
        
            System.out.println("Fehler: ungültige Sitzplatzanzahl!");
            this.sitzplaetze = 0;
        }
    }
    
    public void setVegetarisch(boolean vegetarisch){
    
        this.vegetarisch = vegetarisch;
    }
    
    public void setLieferdienst(boolean lieferdienst){
    
        this.lieferdienst = lieferdienst;
    }
    
    public void setTische(int tische){
    
        this.tische = tische;
    }
    
    //print Methode = Ausgabe
    
    public void printRestaurant(){
    
        System.out.println(name + " Restaurant: " + sitzplaetze + " Sitzplätze - " + vegetarisch);
    }

}