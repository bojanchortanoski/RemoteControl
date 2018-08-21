public class Light {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(String.format("The %s light is turned on!", name));
    }

    public void off() {
        System.out.println(String.format("The %s light is turned off!", name));
    }
}
