import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class InitTest {




        public static void main(String args[]) {
                String abc = "";

                abc.concat("abc");
                abc.concat("def");
                System.out.print(abc);
        }

      //                LocalDate d1 = LocalDate.of(2018, 4, 24);//print 2018-04-01
//                System.out.println(d1.withDayOfMonth(1)); //print 2018-04-01
//                System.out.println(d1.withDayOfYear(40)); //print 2018-01-01
//                System.out.println(d1.withMonth(5)); //print 2018-05-24
//                System.out.println(d1.withYear(1)); //print 0001-04-014
//                System.out.println(d1.atTime(16,00)); //print 2018-04-24T16:30:20.000000300
//                LocalTime t1 = LocalTime.MIN;
//                LocalTime t2 = LocalTime.MAX;
//                LocalTime t3 = LocalTime.MIDNIGHT;
//                LocalTime t4 = LocalTime.NOON;
//                LocalTime k2 = LocalTime.of(16,20,30,56789);
//                System.out.println(t1); //print 0001-04-014
//                System.out.println(t2); //print 0001-04-014
//                System.out.println(t3); //print 0001-04-014
//                System.out.println(t4); //print 0001-04-014

        //     System.out.println(t1.minusMinutes(15));
//                System.out.println(k2.minusHours(2));
////prints 14:20:12.000098547
//                System.out.println(k2.minusMinutes(15));
////prints 16:05:12.000098547
//                System.out.println(k2.minusSeconds(12));
////prints 14:20:00.000098547
//                System.out.println(k2.minusNanos(900));
////prints 14:20:12.000097647
//
//                Period p1 = Period.of(1, 2, 7);
//                Period p2 = Period.ofYears(-2);
//                Period p3 = Period.ofMonths(-10);
//                Period p4 = Period.ofWeeks(12);
//                Period p5 = Period.ofDays(-15);
//                System.out.println(p1);
//                System.out.println(p2);
//                System.out.println(p3);
//                System.out.println(p4);
//                System.out.println(p5);
//
//
//                Period p = Period.of(2, 4, 40);
//                System.out.println(p.getYears()); //prints 2
//                System.out.println(p.getMonths()); //prints 4
//                System.out.println(p.getDays()); //prints 40
//
//
//                Period j = Period.of(0, -5, 12);
//                j = j.plusMonths(5);
//                System.out.println(j);//prints 13:30:45
}
