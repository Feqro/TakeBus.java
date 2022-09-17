package TakeBus;

public class Bus{
    String busNum;
    int passengerNum = 0;
    int money = 0;

    public Bus(String busNum){
        this.busNum = busNum;
    }

    public void taken(int money){
        this.passengerNum += 1;
        this.money += money;
        
    }

    @Override
    public String toString(){
        return "버스" + busNum + "의 승객은 " + passengerNum + "명이며, 수익은 " + money + "원입니다."; 
    }
}