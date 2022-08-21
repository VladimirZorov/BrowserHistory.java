package parrots;

public class Parrot {

    private String name;
    private String species;
    private  boolean available;

    public Parrot(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getSpecies() {
        return this.species;
    }

    public String getName(){
        return  this.name;
    }

    public  boolean isAvailable(){
        return  this.available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return String.format("Parrot (%s): %s", this.species, this.name);
    }
}
