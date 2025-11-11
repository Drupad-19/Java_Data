package Package3;
import Package1.Demo1;

public class Demo4 {

    void disp(){
      Demo1 d1= new Demo1();

        System.out.println(d1.a);
        System.out.println(d1.b);
        System.out.println(d1.c);
        System.out.println(d1.d);
    }

}

//if weusing extend in Demo4 "Protected" also accessible,
//but in above Program i am using "create an object"{JVM},
//So only "Public" will access.