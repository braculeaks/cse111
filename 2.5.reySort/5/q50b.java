public class q50b {
    public static void main(String [] args) {
        SmartDevice d1 = new SmartDevice("AC", "Cooling", 1500);
        SmartDevice d2 = new SmartDevice("TV", "Entertainment", 200);
        SmartDevice d3 = new SmartDevice("Bulb", "Lighting", 50);
        System.out.println(" 1============== ");
        Controller c = new Controller("Living Room", 1600);
        c.addDevice(d1);
        c.addDevice(d2);
        c.addDevice(d3);
        System.out.println(" 2============== ");
        c.turnOn("AC");
        c.turnOn("TV");
        System.out.println(" 3============== ");
        c.printDetails ();
        System.out.println(" 4============== ");
        SmartDevice d4 = new SmartDevice("Heater", "Heating", 2000);
        c. replaceDevice (0, d4);
        System.out.println(" 5============== ");
        c.turnOff("AC");
        c.turnOn("TV");
        c.turnOn("Bulb");
        c.printDetails ();
        System.out.println(" 6============== ");
        SmartDevice d5 = new SmartDevice("PC", "Gaming", 600);
        c. replaceDevice (0, d5);
        c.printDetails ();
    }
}


/*

1==============
AC added.
TV added.
Bulb
added.
2==============
AC turned on.
Overload! Cannot
turn on TV.
3==============
Controller: Living
Room
Power
Usage: 1500W / 1600W
Devices:
1. AC [Cooling] - 1500W (On)
2. TV [ Entertainment ] - 200W (Off)
3. Bulb [Lighting] - 50W (Off)
4==============
Swap
failed! Replacing AC with
Heater
causes
power
overload.
5==============
AC turned off.
TV turned on.
Bulb
turned on.
Controller: Living
Room
Power
Usage: 250W / 1600W
Devices:
1. AC [Cooling] - 1500W (Off)
2. TV [ Entertainment ] - 200W (
On)
3. Bulb [Lighting] - 50W (On)
6==============
AC successfully
replaced by PC.
Controller: Living
Room
Power
Usage: 250W / 1600W
Devices:
1. PC [Gaming] - 600W (Off)
2. TV [ Entertainment ] - 200W (
On)
3. Bulb [Lighting] - 50W (On)

 */