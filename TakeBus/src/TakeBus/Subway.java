package TakeBus;

public class Subway{
    String subwayNum;
    int passengerNum;
    int money;

    public Subway(String subwayNum){
        this.subwayNum = subwayNum;
    }

    public void taken(int money){
        this.passengerNum += 1;
        this.money += money;
        
    }


    @Override
    public String toString(){
        return "지하철" + subwayNum + "호선의 승객은 " + passengerNum + "명이며, 수익은 " + money + "원입니다."; 
    }
}
