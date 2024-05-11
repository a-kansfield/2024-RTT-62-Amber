package previous.weeks.pa_303_4_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class QuestionSeven {
    //Create a program that lets the users input their filing status and income.
    // Display how much tax the user would have to pay according to status and income.
    //The U.S. federal personal income tax is calculated based on the filing status and taxable income.
    //There are four filing statuses: Single, Married Filing Jointly, Married Filing Separately, and Head of Household.
    //The tax rates for 2009 are shown below.
    public static void main(String[] args) {
        // Will attempt to do with only branch statements. Potentially without too many methods.
        // (Note for future me when I come back to this and wonder what was wrong with me)

        // Init
        String status = "";
        double income = 0.0;
        double taxRate = 0.0;
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);

        //Prompt User for filing status.
        System.out.print("Input filing status.\n[Single | Married Filing Jointly | Married Filing Separately | Head of Household]\n>> ");
        status = scan.nextLine();

        //Next prompt user for taxable income
        System.out.print("Input taxable income. Do not include commas.\n>> ");
        income = scan.nextDouble();                         // initializing down here in conjunction with scanner causes errors, moved init to top.


        //Find marginal tax rate - choosing to ignore how tax rates work here
        //Use switch for filing status - an if statement could help make sure case sensitivity doesn't matter, but I'm not about that mess right now.
            //If statements for tax brackets - save marginal tax rate
        switch (status) {
            case "Single":
                if ((income >= 0) && (income <= 8350)){
                    taxRate = .10;
                } else if ((income >= 8351) && (income <= 33950)){
                    taxRate = .15;
                } else if ((income >= 33951) && (income <= 82250)){
                    taxRate = .25;
                } else if ((income >= 82251) && (income <= 171550)){
                    taxRate = .28;
                } else if ((income >= 171551) && (income <= 372950)){
                    taxRate = .33;
                } else if (income >= 372951){
                    taxRate = .35;
                } else {
                    System.out.println("Invalid income.");
                    break;
                }
                break;
            case "Married Filing Jointly":
                if ((income >= 0) && (income <= 16700)){
                    taxRate = .10;
                } else if ((income >= 16701) && (income <= 67900)){
                    taxRate = .15;
                } else if ((income >= 67901) && (income <= 137050)){
                    taxRate = .25;
                } else if ((income >= 137051) && (income <= 208850)){
                    taxRate = .28;
                } else if ((income >= 208851) && (income <= 372950)){
                    taxRate = .33;
                } else if (income >= 372951){
                    taxRate = .35;
                } else {
                    System.out.println("Invalid income.");
                    break;
                }
                break;
            case "Married Filing Separately":
                if ((income >= 0) && (income <= 8350)){
                    taxRate = .10;
                } else if ((income >= 8351) && (income <= 33950)){
                    taxRate = .15;
                } else if ((income >= 33951) && (income <= 68525)){
                    taxRate = .25;
                } else if ((income >= 68526) && (income <= 104425)){
                    taxRate = .28;
                } else if ((income >= 104426) && (income <= 186475)){
                    taxRate = .33;
                } else if (income >= 186476){
                    taxRate = .35;
                } else {
                    System.out.println("Invalid income.");
                    break;
                }
                break;
            case "Head of Household":
                if ((income >= 0) && (income <= 11950)){
                    taxRate = .10;
                } else if ((income >= 11951) && (income <= 45500)){
                    taxRate = .15;
                } else if ((income >= 45501) && (income <= 117450)){
                    taxRate = .25;
                } else if ((income >= 117451) && (income <= 190200)){
                    taxRate = .28;
                } else if ((income >= 190201) && (income <= 372950)){
                    taxRate = .33;
                } else if (income >= 372951){
                    taxRate = .35;
                } else {
                    System.out.println("Invalid income.");
                    break;
                }
                break;
            default:
                System.out.println("Invalid filing status.");
        }
        // Check to ensure tax rate was properly applied.
        if (taxRate != 0.0){
            //calculate tax
            //taxAmnt = taxableIncome * TaxRate
            double taxAmnt = income * taxRate;
            System.out.println("Status: " + status +
                                "\t Income: " + df.format(income) +
                                "\t Tax Rate: " + df.format(taxRate) +
                                "\t Tax Due: " + df.format(taxAmnt));


        }



    }
}
