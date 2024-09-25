public class Dato {
int day;
int month;
int year;
String fuldDato;


    public  Dato(){
year = 2003;
month = 6;
day = 25;
fuldDato = year+"-"+month+"-"+day;
    }
    public Dato(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
        fuldDato = year+"-"+month+"-"+day;

    }
    public String getDato() {
        return fuldDato;
    }


}
