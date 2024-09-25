public class Lamp {
    private String lampType;
    private boolean lampOn;
    private int  count = 0;
    private static int antalLamper;

public Lamp(String lampType, boolean lampOn) {
    this.lampType = lampType;
    this.lampOn = lampOn;
    antalLamper++;
}

    public void toggleLight() {
    count++;
    if (this.lampOn == true) {
        this.lampOn = false;

    }else {
        this.lampOn = true;
    }
    }
    public int getCount() {
    return this.count;
    }
public String toString() {
    return this.lampType + " Tændt?=" + this.lampOn + " Og er blevet tændt/slukket "+ this.count + " gange";

}

public static int getAntalLamper() {
    return antalLamper;
}

}
