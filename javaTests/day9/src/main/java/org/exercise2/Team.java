package org.exercise2;

import java.util.List;

public class Team {

    private String name;
    private List<Integer> runs;

    public Team(String name, List<Integer> runs) {
        this.name = name;
        this.runs = runs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getRuns() {
        return runs;
    }

    public void setRuns(List<Integer> runs) {
        this.runs = runs;
    }

    public void printRuns() {
        System.out.println("Runs scored by " + name);
        for(Integer run: runs){
            System.out.println(run);
        }
    }

    public void printRunsMoreThanValue(Integer value) {
        System.out.println("Runs scored by " + name + " more than " + value);
        for(Integer run: runs){
            if (run > value) System.out.println(run);
        }
    }
}
