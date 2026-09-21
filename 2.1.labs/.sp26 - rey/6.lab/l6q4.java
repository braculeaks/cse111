public class l6q4 {
    public static void main(String[] args) {
        Cricket_Tournament ct1 = new Cricket_Tournament();
        System.out.println(ct1.info());
        System.out.println("-----------------------");
        
        Cricket_Tournament ct2 = new Cricket_Tournament("IPL", 10, "t20");
        System.out.println(ct2.info());
        System.out.println("-----------------------");
        
        Tennis_Tournament tt = new Tennis_Tournament("Roland Garros", 128);
        System.out.println(tt.info());
    }
}
  
class Tournament {
    private String name;
    
    public Tournament() {
      this.name = "Default";
    }
  
    public Tournament(String name) {
      this.name = name;
      
    }
  
    public String getName(){
      return "Tournament Name: "+name;
    }
}
  

/*

Cricket Tournament Name: Default
Number of Teams: 0
Type: No type
-----------------------
Cricket Tournament Name: IPL
Number of Teams: 10
Type: t20
-----------------------
Tennis Tournament Name: Roland Garros
Number of Players: 128

*/