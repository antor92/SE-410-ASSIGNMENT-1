public class all {
    
    public static void main( String[] args) {
       champions_league ucl = new champions_league();
       ipl IPL = new ipl();
       sports sport = new sports();
       sport.printPlay("CRICKET", "FOOTBALL");
       ucl.printtop();
       ucl.printfoot("Football", "National");
       ucl.printtop2("CR7", "Goal Scorer");
       IPL.printipl();
       IPL.printcric("Cricket","Popular");
       IPL.printipl2("IPL", "huge platform");



       
      }
}