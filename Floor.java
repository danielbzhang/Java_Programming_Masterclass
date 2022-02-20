public class Floor {
 
    private double width;
    private double length;
 
    public Floor(double width, double length){
        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 : length;
    }
 
    public double getArea(){
        return (this.width * this.length);
    }
}
 
public class Carpet {
    private double cost;
 
    public Carpet(double cost){
        this.cost = cost < 0 ? 0 : cost;
    }
 
    public double getCost(){
        return this.cost;
    }
}
 
public class Calculator {
    private Floor floor;
    private Carpet carpet;
 
    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }
 
    public double getTotalCost(){
        return (floor.getArea() * carpet.getCost());
    }
}


// TEST:
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator1 = new Calculator(floor, carpet);
        System.out.println("Total= "+calculator1.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator1 = new Calculator(floor, carpet);
        System.out.println("Total= "+calculator1.getTotalCost());

        Total= 38.5
        Total= 36.45
