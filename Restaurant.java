public class Restaurant{

    private String name;
    private int sitzplaetze;
    private boolean vegetarisch;
    
    //Konstruktor
    
    public Restaurant(String name, int sitzplaetze, boolean vegetarisch){
    
        setName(name);
        setSitzplaetze(sitzplaetze);
        setVegetarisch(vegetarisch);
    }

    //Default Konstruktor
    
    public Restaurant(){
    
        setName("UNKN");
        setSitzplaetze(0);
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
    
    //print Methode = Ausgabe
    
    public void printRestaurant(){
    
        System.out.println(name + " Restaurant: " + sitzplaetze + " Sitzplätze - " + vegetarisch);
    }

}