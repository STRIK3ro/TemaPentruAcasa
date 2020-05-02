public class AirAnimal extends Animal {
    private int flyingHeight;

    public AirAnimal(String color, int memberNumber, String specimen, int flyingHeight) {
        this.color = color;
        this.memberNumber = memberNumber;
        this.specimen = specimen;
        this.flyingHeight = flyingHeight;

    }

    public int getFlyingHeight() {
        return flyingHeight;
    }
}
