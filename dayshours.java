public class daysHours implements Hours{
    public int Totalhours(){
        return 24;
    }
    public double remaininghours(int currenthours){
       if (currenthours < 0 || currenthours > 24){
         System.out.println("Invalid Hours");
     }
         return Totalhours() - currenthours;
    }
}