import java.util.Scanner;

class Complex{
    double real;
    double imag;
    Complex(double r,double i){
        this.real=r;
        this.imag=i;
    }

    public Complex add(Complex c){
        return new Complex(this.real+c.real,this.imag+c.imag);
    }
    public Complex subtract(Complex c){
        return new Complex(this.real-c.real,this.imag-c.imag);
    }

    public Complex multiply(Complex c){
        double realPart= (this.real*c.real)-(this.imag*c.imag);
        double imagPart= (this.real*c.imag)-(this.imag*c.real);
        return new Complex(realPart,imagPart);
    }
    void display(){
        if(imag>=0) {
            System.out.println(real + " + " + imag + "i");
        }
        else{
            System.out.println(real + " - " + (-imag) + "i");
        }
    }

}

public class ComplexOperations {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real and imaginary part of first complex number: ");
        double r1= sc.nextDouble();
        double i1= sc.nextDouble();
        Complex c1 = new Complex(r1,i1);

        System.out.print("Enter real and imaginary part of second complex number: ");
        double r2= sc.nextDouble();
        double i2= sc.nextDouble();
        Complex c2 = new Complex(r2,i2);

        Complex sum = c1.add(c2);
        Complex diff = c1.subtract(c2);
        Complex prod = c1.multiply(c2);

        System.out.print("Addition: ");
        sum.display();

        System.out.print("Subtraction: ");
        diff.display();

        System.out.print("Multiplication: ");
        prod.display();

        sc.close();

    }
}
