package edu.campus02;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int station = 1;
        int problem = 0;
        int delay = 0;
        int duration = time(station, problem, delay);
        if (duration == 0)
            System.out.println("You need to get off now!");
        else
            System.out.println("You will arrive at your station in "+duration+" minutes!");
    }
    public static int time (int station, int problem, int delay){
        int duration = 0;
        switch (station){
            case 1:
                duration = 20;
                if (problem >=1)
                    duration = duration + delay;
                break;
            case 2:
                duration = 16;
                if (problem >=2)
                    duration = duration + delay;
                break;
            case 3:
                duration = 15;
                if (problem >=3)
                    duration = duration + delay;
                break;
            case 4:
                duration = 10;
                if (problem >=4)
                    duration = duration + delay;
                break;
            case 5:
                duration = 5;
                if (problem >=5)
                    duration = duration + delay;
                break;
            case 6:
                duration = 0;
                if (problem == 6)
                    duration = duration + delay;
                break;
        }
        return duration;
    }
}