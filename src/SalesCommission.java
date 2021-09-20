
/*
A car salesperson typically earns an hourly wage and a commission on any sales they completed. They typically work 30 to 40
hours a week, earning $5.25 to $7.50 an hour. Additionally, they earn 1% to 3% of all sales they've completed that week,
which a typical car sells for $10,000 to $30,000. A salesperson with a 1% commission that sells a car for $20,000 earns $200.00.

Write a program which prompts the user to enter the hourly rate, hours worked, the sales commission percent and the total
sales of a salesperson and calculates their total earnings. The program should include multiple methods. (What ARE the
smaller pieces?)

Example:

Hourly Rate: 6.25
Hours Worked: 33.5
Sales Commission: 1.5%
Total Sales: $65,000.00

Total Earnings: $1184.38

 */
/* 1. Find the hourly wage - variable : rate
   2. Find the hours worked - variable : timeWorked
   3. Find the sales commission percentage ; commissionPercent
   4. Find the amount of car sales ;
   5. Calculate total earnings ; hourly rate * hours worked + (total sales*sales commission percentage)
   6. Display total earnings
 */


import javax.swing.*;
import java.text.DecimalFormat;

public class SalesCommission {


    public static void main(String[] args) {
        double rate = getInput("What is the rate?");
        double timeWorked = getInput("How many hours did you work?");
        double commissionPercent = getInput("What is the commission percent?");
        double carSaleAmount = getInput("What is the amount of sales?");
        double totalCheck = total(rate, timeWorked, commissionPercent, carSaleAmount);


        outPut(totalCheck);
        System.exit(0);
    }

    public static double getInput(String message) {
        return Double.parseDouble(JOptionPane.showInputDialog(message));
    }
        public static double total (double rate, double timeWorked, double commissionPercent, double carSaleAmount){
            commissionPercent /= 100;
            return (rate * timeWorked) + (commissionPercent * carSaleAmount);
        }

        public static void outPut(double totalCheck) {
        DecimalFormat round = new DecimalFormat("##,###.##");
            JOptionPane.showMessageDialog(null, "The total check is: " + round.format(totalCheck));

        }

    }

