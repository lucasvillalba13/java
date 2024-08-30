package d;

public class Pibes {

    String name;
    int age;
    String major;
    boolean worksOut;
    boolean goesOut;

    Pibes(String name, int age, String major, boolean worksOut, boolean goesOut){
        this.name = name;
        this.age = age;
        this.major = major;
        this.worksOut = worksOut;
        this.goesOut = goesOut;

        }

    @Override
    public String toString(){
        String p = "Pibe: " +name+ " age: "+ age + " major: " + major+ " works out?: "+ worksOut + " goes out?: "+ goesOut;
        return p;
    }
}
