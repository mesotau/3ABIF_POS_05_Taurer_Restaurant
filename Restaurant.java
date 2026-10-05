public class Restaurant{

    private String name;
    private int sitzplaetze;
    private boolean vegetarisch;
    
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
}