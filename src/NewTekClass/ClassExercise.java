package NewTekClass;

public class ClassExercise {
    public static void main(String[] args){
        String cityName="virginia";
        System.out.println(cityName);
        String[] citiesName ={"new york", "stafford"," new jerci"};
        System.out.println(citiesName[2]);
        System.out.println(add2num(10,12));
        printMassage();
        String fishes;
        fishes="catfish";
        String book = "my book";
        System.out.println(book);
        System.out.println(fishes);

    }
    public static int add2num( int a,int b) { return a+b;}
    public static void printMassage(){
        System.out.println("hello commonders");}
}