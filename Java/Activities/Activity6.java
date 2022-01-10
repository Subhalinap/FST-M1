package Activities;

import java.util.Date;
import java.util.List;

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane pln = new Plane(10);
        pln.onboard("Subhalina");
        pln.onboard("Nick");
        pln.onboard("John");
        Date takeof = pln.takeOff();
        System.out.println(takeof);
        List<String> pssngrs =  pln.getPassesngers();
        for (String pssg:pssngrs) {
            System.out.println(pssg);
        }
        Thread.sleep(2000);
        pln.land();
        System.out.println(pln.getLastTimeLanded());
    }
}
