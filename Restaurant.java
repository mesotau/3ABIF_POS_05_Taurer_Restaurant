public class Restaurant{

    private String name;
    private int sitzplaetze;
    private boolean vegetarisch;
    
    //Konstruktor
    
    public Restaurant(String neuName, int neuSitzplaetze, boolean neuVegetarisch){
    
        setName(neuName);
        setSitzplaetze(neuSitzplaetze);
        setVegetarisch(neuVegetarisch);
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
    
    public void setName(String neuName){
    
        name = neuName;
    }
    
    public void setSitzplaetze(int neuSitzplaetze){
    
        sitzplaetze = neuSitzplaetze;
    }
    
    public void setVegetarisch(boolean neuVegetarisch){
    
        vegetarisch = neuVegetarisch;
    }
    
    //print Methode = Ausgabe
    
    public void printRestaurant(){
    
        System.out.println(name + " Restaurant: " + sitzplaetze + " Sitzplätze - " + vegetarisch);
    }

}