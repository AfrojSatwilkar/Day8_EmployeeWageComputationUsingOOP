package com.company1.EmployeeWageComputationUsingOOps;

import java.util.Random;

public class EmployeeWageParentClass {

    //parent variable
    protected int randomCheck;
    protected int IS_FULL_TIME = 1;
    protected int IS_PART_TIME = 2;
    protected int WAGE_PER_HR = 20;
    protected int EMP_HRS;
    protected int TotalWageInDay;
    protected int TOTAL_EMP_HRS = 0;

    //generating random number
    protected void getRandomNumber() {
        Random num = new Random();
        randomCheck = num.nextInt(2) + 1;
    }

    //Calculating employee hours using switch case statement
    protected void employeeWageUsingSwitch() {
        switch (randomCheck) {
            case 1 -> EMP_HRS = 8;
            case 2 -> EMP_HRS = 4;
            default -> EMP_HRS = 0;
        }
        TOTAL_EMP_HRS = TOTAL_EMP_HRS + EMP_HRS;

    }
}