public class MathCalculatorProxy implements Calculator{
   private MathCalculator mathCalculator;

   public MathCalculatorProxy(){
       this.mathCalculator = new MathCalculator();
   }

   @Override
    public double add(double firstNum, double secondNum){
       if (firstNum/2 + secondNum/2 >= Double.MAX_VALUE/2){
           throw new RuntimeException("no");
       }
       if (firstNum/2 + secondNum/2 <= Double.MIN_VALUE){
           throw new RuntimeException("no");
       }
       return mathCalculator.add(firstNum,secondNum);
   }

    @Override
    public double sub(double firstNum, double secondNum) {
        if (firstNum/2 - secondNum/2 >= Double.MAX_VALUE/2){
            throw new RuntimeException("no");
        }
        if (firstNum/2 - secondNum/2 <= Double.MIN_VALUE){
            throw new RuntimeException("no");
        }
        return mathCalculator.sub(firstNum,secondNum);
    }

    @Override
    public double mul(double firstNum, double secondNum) {
        double result = mathCalculator.mul(firstNum, secondNum);
        if(firstNum != 0 && result / firstNum != secondNum){
            throw new RuntimeException("Out of range");
        }
        return result;
    }

    @Override
    public double div(double firstNum, double secondNum) {
        if(secondNum == 0){
            throw new RuntimeException("Can't divide by zero");
        }
        return mathCalculator.div(firstNum, secondNum);
    }
}
