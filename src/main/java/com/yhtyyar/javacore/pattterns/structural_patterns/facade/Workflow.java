package main.java.com.yhtyyar.javacore.pattterns.structural_patterns.facade;

public class Workflow {

    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();


    public void solveProblem() {
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }
}
