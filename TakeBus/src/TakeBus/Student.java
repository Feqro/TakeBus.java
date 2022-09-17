package TakeBus;

public class Student {
    String name;
    int money;

    public Student(String name, int money){
        this.name = name;
        this.money = money;
    }

    public void takeBus(Bus bus){
        bus.taken(1500);
        this.money -= 1500;
    } 

    public void takeSubway(Subway subway){
        subway.taken(1300);
        this.money -= 1300;
    } 

    @Override
    public String toString(){
        return name + "학생의 잔액은 " + money + "원입니다.";
    }
}
