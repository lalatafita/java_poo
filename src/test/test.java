package test;

public class test {
    public static void main(String[] args) {
        //principal
       ville ville1= new ville("fianara",2356,"mada");
        System.out.println("\n nom de ville: "+ ville1.getNom() + " nombre de population: " +ville1.getNbPopulation()+ " appartient à "+ville1.getVilleParent());
    }
}