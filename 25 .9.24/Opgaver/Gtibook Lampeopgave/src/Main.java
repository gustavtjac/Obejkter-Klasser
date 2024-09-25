public class Main {
    public static void main(String[] args) {

        Lamp a = new Lamp("gaminglampe",true);
        Lamp b = new Lamp("gamingl2ampe",false);
        Lamp c = new Lamp("gaminglampe",false);
        Lamp d = new Lamp("gaminglampe",false);
        System.out.println(a.toString());
        a.toggleLight();
        a.toggleLight();
        a.toggleLight();
        a.toggleLight();
        a.toggleLight();
        a.toggleLight();
        a.toggleLight();
        a.toggleLight();
        a.toggleLight();
        System.out.println(a.toString());
        System.out.println(a.getAntalLamper());

    }
}
