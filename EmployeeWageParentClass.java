package com.company1.EmployeeWageComputationUsingOOps;

import java.util.Random;

public class EmployeeWageParentClass {

    //Constant variable
    protected static final int IS_FULL_TIME = 1;
    protected static final int IS_PART_TIME = 2;

    //variable
    protected int randomCheck;
    protected int EMP_HRS;
    protected int TOTAL_EMP_HRS = 0;
    protected int TOTAL_WORKING_DAYS = 0;
    protected int TOTAL_SALARY =0;



    //generating random number
    protected void getRandomNumber() {
        Random num = new Random();
        randomCheck = num.nextInt(2) + 1;
    }

    //Calculating employee hours using switch case statement
    protected void employeeWageUsingSwitch(int randomCheck) {
        switch (randomCheck) {
            case IS_FULL_TIME -> EMP_HRS = 8;
            case IS_PART_TIME -> EMP_HRS = 4;
            default -> EMP_HRS = 0;
        }
        TOTAL_EMP_HRS = TOTAL_EMP_HRS + EMP_HRS;

    }
}