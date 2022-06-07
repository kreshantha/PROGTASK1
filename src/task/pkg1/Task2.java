/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.pkg1;
import java.util.Scanner;
/**
 *
 * @author kreshantha
 */
public class Task2 {

 private int taskNumber;
    private String taskDescription;
    private String taskID;
    private String taskName;
    private double taskDuration;
    private String developerFirstName;
    private String developerLastNAme;

    public int getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    public double getTaskDuration() {
        return taskDuration;
    }

    public void setTaskDuration(double taskDuration) {
        this.taskDuration = taskDuration;
    }

    public String getDeveloperFirstName() {
        return developerFirstName;
    }

    public void setDeveloperFirstName(String developerFirstName) {
        this.developerFirstName = developerFirstName;
    }

    public String getDeveloperLastNAme() {
        return developerLastNAme;
    }

    public void setDeveloperLastNAme(String developerLastNAme) {
        this.developerLastNAme = developerLastNAme;
    }

    private int totalHours;

    public int getNumber() {
        return taskNumber;
    }

    public void setNumber(int number) {
        this.taskNumber = number;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskID() {
        return taskID;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }


    public boolean checkTaskDescription(String taskDescription) {
        Scanner d = new Scanner(System.in);
        this.taskDescription = taskDescription;
        while (taskDescription.length() > 50) {
            System.out.println("Please re enter your task description\n");
            String reEnteredDescription = d.nextLine();
            if (reEnteredDescription.length() < 50) {
                break;
            }
        }
        return true;
    }

    public String createTaskId(String taskID){
        this.taskID = taskID;
        String taskId = taskID;
        System.out.println("Task id = " + taskID.toUpperCase().charAt(0) + taskID.toUpperCase().charAt(1) + ":" + taskID.toUpperCase().substring(taskID.length() - 3));
        return taskID;
    }

    public String printTaskDetails(){
        String details = "dfggc";
        System.out.println("TASK " + getNumber() + " DETAILS:");
        System.out.println("Task name: " + getTaskName());
        System.out.println("Task number: " + getNumber());
        System.out.println("Task description: " + getTaskDescription());
        System.out.println("Developer details:");
        System.out.println(getDeveloperFirstName() + " " + getDeveloperLastNAme());
        System.out.println("Task ID = "+ taskID.toUpperCase().charAt(0) + taskID.toUpperCase().charAt(1) + ":" + taskID.toUpperCase().substring(taskID.length() - 3));
        return details;
    }

    public void returnTotalHours(){
        System.out.println();
    }
}    

