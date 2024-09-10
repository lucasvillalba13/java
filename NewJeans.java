package d;

public class NewJeans {

    String name;
    int age;
    String color;
    String company;
    String[] song;



    NewJeans(String name, int age, String color, String company, String[] song) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.company = company;
        this.song = song;
    }

    public String sing(int songIndex) {
       if (songIndex >= 0 && songIndex < song.length){
           return name + " is singing " + song[songIndex];
       } else return "Song Index is not valid";
    }
}