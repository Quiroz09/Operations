package trafficLight;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.color = "verde";
        trafficLight.state = true;
        if(trafficLight.showStatus()){
            System.out.println("Message "+ trafficLight.showTraffic());
        }
    }
}
