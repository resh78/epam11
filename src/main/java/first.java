import java.util.*;
    public class first{
        public static void main(String []args)
        {
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter two numbers: ");
            double first = reader.nextDouble();
            double second = reader.nextDouble();
            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = reader.next().charAt(0);

            double result;

            switch (operator)
            {
                case '+':
                    result =addition(first,second);
                    break;

                case '-':
                    result = subtraction(first,second);
                    break;

                case '*':
                    result = multiplication(first,second);
                    break;

                case '/':
                    result =division(first,second);
                    break;

                // operator doesn't match any case constant (+, -, *, /)
                default:
                    System.out.printf("Error! operator is not correct");
                    return;
            }

            System.out.println(first + " " + operator + " " + second + " = " + result);

        }

        public static double multiplication(double n1,double n2)
        {
            double c=n1*n2;
            return c;
        }
        public static double addition(double n1,double n2)
        {
            double c=n1+n2;
            return c;
        }
        public static double subtraction(double n1,double n2)
        {
            double c=n1-n2;
            return c;
        }
        public static double division(double n1,double n2)
        {
            double c=n1/n2;
            return c;
        }
    }

