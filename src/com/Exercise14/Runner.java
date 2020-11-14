package com.Exercise14;

public enum Runner {
    BEGINNER(5, 7),
    INTERMEDIATE(4, 5),
    ADVANCED(3, 4);

    int minTimeOfMarathon;
    int maxTimeOfMarathon;


    Runner(int minTimeOfMarathon, int maxTimeOfMarathon) {
        this.minTimeOfMarathon = minTimeOfMarathon;
        this.maxTimeOfMarathon = maxTimeOfMarathon;
    }

    static int getFitnesLevel(int time) {
        if ( BEGINNER.minTimeOfMarathon <= time && time <= BEGINNER.maxTimeOfMarathon) {
            System.out.println("You are BEGINNER");
        } else if (INTERMEDIATE.minTimeOfMarathon <= time && time <= INTERMEDIATE.maxTimeOfMarathon) {
            System.out.println("You are INTERMEDIATE");
        } else if (ADVANCED.minTimeOfMarathon <= time && time <= ADVANCED.maxTimeOfMarathon) {
            System.out.println("You are ADVANCED");
        }
        return time;
    }
}
