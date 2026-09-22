public class Controller {
    String name;
    int maxPower;
    SmartDevice[] device = new SmartDevice[4];
    int count = 0;
    int powerUsage = 0;

    Controller(String n, int p){
        name = n;
        maxPower = p;
    }

    public void addDevice(SmartDevice d){
        if(count < 4){
            device[count] = d;
            System.out.println(d.getName() + " added.");
            count++;
        }
        else 
            System.out.println(d.getName() + " could not be added, Limit exceeded");
    }
    private SmartDevice findDevice(String n){
        for(int i = 0; i < count; i++){
            if(n.equals(device[i].getName())){
                return device[i];
            }
        }
        System.err.println("Couldn't find the device " + n);
        return null;
    }

    public void turnOn(String n){
        SmartDevice d = findDevice(n);
        
        if(d != null){
            String status = d.getStatus();
            if(status.equals("Off")){
                int powerLeft = maxPower - powerUsage;
                if(powerLeft >= d.getPower()){
                    d.setStatus("On");
                    System.out.println(n + " turned on.");
                    powerUsage += d.getPower();
                }
                else
                    System.out.println("Overload! Cannot turn on "+n+".");
            }
            else if (status.equals("On"))
                System.out.println(n + " is already on.");
        }
    }

    public void turnOff(String n){
        SmartDevice d = findDevice(n);
        String status = d.getStatus();
        if(d != null){
            if(status.equals("Off"))
                System.out.println(n + " is already off.");
            else if(status.equals("On")){
                d.setStatus("Off");
                System.out.println(n + " turned off.");
                powerUsage -= d.getPower();
            }
        }
    }

    public void replaceDevice(int index, SmartDevice newD){
        String status = device[index].getStatus();
        String oldName = device[index].getName();
        String newName = newD.getName();
        int oldPow = device[index].getPower();
        int newPow = newD.getPower();

        int tempP = powerUsage - oldPow + newPow;

        if(status.equals("On") && tempP > maxPower){
            System.out.println("Swap failed! Replacing " + oldName + " with " + newName + " causes power overload");
        }
        else {
            System.out.println(oldName + " successfully replaced by " + newName);
            device[index] = newD;
            if(newD.getStatus().equals("On")) 
                powerUsage += newD.getPower();
        }
    }

    public void printDetails(){
        System.out.println("Controller: " + this.name);
        System.out.println("Power usage: " + powerUsage + "W / " + maxPower + "W");
        System.out.println("Devices: ");
        for(int i = 0; i < count; i++){
            System.out.println((i+1) + ". " + device[i].getName() + " [" + device[i].getType() + "] - " + device[i].getPower() + "W (" + device[i].getStatus() + ")");
        }
    }    
}
