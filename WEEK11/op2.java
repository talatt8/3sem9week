package week11;
interface Device{
    void powerOn();
}
interface SmartDevice extends Device{
    void connectWiFi();
}
class SmartPhone implements SmartDevice{
    public void powerOn(){
        System.out.println("Turning On...");
    }
    public void connectWiFi(){
        System.out.println("Connecting to WiFi...");
    }
}
public class op2 {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        s.powerOn();
        s.connectWiFi();
    }
}
