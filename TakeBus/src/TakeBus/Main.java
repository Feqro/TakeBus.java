package TakeBus;

public class Main {
    public static void main(String[] args){
        Student s1 = new Student("홍길동", 50000);
        Bus bus110 = new Bus("110");
        Subway subway1 = new Subway("1");
        
        System.out.println(bus110);
        System.out.println(subway1);
        System.out.println(s1);
        System.out.println("-----------------------------------");


        s1.takeBus(bus110);
        s1.takeBus(bus110);
        s1.takeBus(bus110);
        s1.takeSubway(subway1);
        s1.takeSubway(subway1);

        System.out.println(bus110);
        System.out.println(subway1);
        System.out.println(s1);


    }    
}
