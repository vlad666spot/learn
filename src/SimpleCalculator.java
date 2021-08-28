public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return this.firstNumber;
    }

    public double getSecondNumber(){
        return this.secondNumber;
    }

    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        double result = this.firstNumber+this.secondNumber;
        return result;
    }

    public double getSubtractionResult (){
        double result = this.firstNumber-this.secondNumber;
        return result;
    }

    public double getMultiplicationResult(){
        double result = this.firstNumber*this.secondNumber;
        return result;
    }

    public double getDivisionResult(){
        if (secondNumber!=0){
            double result =this.firstNumber/this.secondNumber;
            return result;
        } else {
            return 0.0;
        }
    }
}

