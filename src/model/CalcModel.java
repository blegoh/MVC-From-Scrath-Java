/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author blegoh
 */
public class CalcModel {
    
    private double bil1;
    private double bil2;
    private char operator;

    public void setBil1(double bil1) {
        this.bil1 = bil1;
    }

    public void setBil2(double bil2) {
        this.bil2 = bil2;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }
    
    public double hitung(){
        switch(operator){
            case '+':
                return bil1 + bil2;
            case '-':
                return bil1 - bil2;
            case '*':
                return bil1 * bil2;
            case '/':
                return bil1 / bil2;
            default:
                return 0;
        }
    }
    
}
