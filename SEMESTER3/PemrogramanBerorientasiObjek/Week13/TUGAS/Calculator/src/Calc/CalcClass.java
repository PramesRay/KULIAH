/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calc;

/**
 *
 * @author prame
 */
public class CalcClass {
    int operator    = 0;
    double operand1 = 0.0;
    double operand2 = 0.0;
    double hasil    = 0.0;
    
    public void setOperand(String opr) {
        if(!opr.equals("")){
            if(operator == 0){
                operand1 = Double.valueOf(opr);
            }else{
                operand2 = Double.valueOf(opr);
            }
        }
    }
    
    public void setOperator(int operator) {
        this.operator = operator;
    }
    
    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }
    
    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }
    
    public void setHasil(double hasil) {
        this.hasil = hasil;
    }
    
    public double getHasil() {
        return hasil;
    }
    
    public double getOperand1() {
        return operand1;
    }
    
    public double getOperand2() {
        return operand2;
    }
    
    public void process(){
        switch (operator){
            case 1:
                hasil = operand1 + operand2;
                break;
            case 2:
                hasil = operand1 - operand2;
                break;
            case 3:
                hasil = operand1 * operand2;
                break;
            case 4:
                hasil = operand1 / operand2;
                break;
            default: hasil = operand1;
        }
        operand1 = hasil;
    }
}
