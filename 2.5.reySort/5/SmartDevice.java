public class SmartDevice {
    private String name;
    private String type;
    private int power;
    private String status = "Off";

    SmartDevice(String n, String t, int p){
        name = n;
        type = t;
        power = p;
    }

    public String getName(){return name;}
    public String getType(){return type;}
    public int getPower(){return power;}
    public String getStatus(){return status;}
    public void setStatus(String s){status = s;}
}
