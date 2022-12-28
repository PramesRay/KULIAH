/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KalkulatorClass;
import java.lang.Math;


/**
 *
 * @author Windows 10
 */
public class Kalkulator {
    int operator=0;
    double operand1=0.0;
    double operand2=0.0;
    double hasil=0.0;
    
    public void setOperand(String opr) {
        if(!opr.equals("")){
            if(operator==0){
                operand1=Double.valueOf(opr);
            }
            else{
                operand2=Double.valueOf(opr);
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
    
    public double processFactorial(double hitung){
        double jadi = 1;
       for(int i=1;i<=hitung;i++){
           jadi*=i;
       }
        
        return jadi; 
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
            
            case 5:
                hasil = (operand1/100)*operand2;
                break;
            case 6:
                hasil = Math.sqrt(operand1);
                break;
            case 7:
                hasil = operand1*operand1;
                break;
            
            case 8:
                hasil = Math.sin(operand1);
                break;
            
            case 9:
                hasil = Math.cos(operand1);
                break;
            
            case 10:
                hasil = Math.tan(operand1);
                break;
            
            case 11:
                hasil = Math.exp(operand1);
                break;
            
            case 12:
                hasil = Math.toRadians(operand1);
                break;
            
            case 13:
                hasil = this.processFactorial(operand1);
                break;
                
                
            default: 
                hasil = operand1;
        }
        operand1=hasil;
    }

}
