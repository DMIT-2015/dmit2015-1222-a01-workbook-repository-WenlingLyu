package nait.ca.exercisebmi;

public class BMI {
    private double weight;
    private double height;

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double BMI_Caculate(){
        return (703*weight)/(height*height);
    }

    public static void main(String[] args){
        // create a new instance of circle but did not assign it's value
        BMI bmi = new BMI(50,160);

        if(bmi.BMI_Caculate()<18.5)
        {
            System.out.printf("Underweight, Your BMI is %s",bmi.BMI_Caculate());
        } else if (bmi.BMI_Caculate()<24.9&&bmi.BMI_Caculate()>18.5)
        {
            System.out.printf("Normal,Your BMI is %s",bmi.BMI_Caculate());
        } else if (bmi.BMI_Caculate()>25&&bmi.BMI_Caculate()<29.9) {
            System.out.printf("Overweight,Your BMI is %s",bmi.BMI_Caculate());
        }
        else{
            System.out.printf("Obese,your BMI is %s",bmi.BMI_Caculate());
        }
    }

}
