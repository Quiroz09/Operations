package trafficLight;

public class TrafficLight {
    public boolean state;
    public String color;

    public boolean showStatus(){
        return state;
    }
    public String showTraffic(){
        if(color.equals("green")){
            return "Advance";
        }else if(color.equals("red")){
            return "stop your vehicle..";
        }else if(color.equals("yellow")){
            return "start engines..";
        }else{
            return "damaged traffic light";
        }
    }
}
