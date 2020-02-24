package com.company;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

            polyCentre polyCentre1 = new polyCentre(0,0,1,2);
            vector vector1 = new vector(polyCentre1.xpos, polyCentre1.ypos,2,2);

            while (true){
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                polyCentre1.xpos= polyCentre1.xpos + polyCentre1.slopex;
                polyCentre1.ypos= polyCentre1.ypos + polyCentre1.slopey;

                vector1.xpos = polyCentre1.xpos+vector1.displacementX;
                vector1.ypos = polyCentre1.ypos+vector1.displacementY;


                System.out.println("center x,y: "+polyCentre1.xpos+","+polyCentre1.ypos);
                System.out.println("vector 1 x,y: "+vector1.xpos+","+vector1.ypos);



            }

    }
    public void break(int ){


    }
}
