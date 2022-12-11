import java.rmi.Naming;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        while(true){

            System.out.println("\n1: Adição\n2: Subtração\n3: Multiplicação\n4: Divisão\n5: Sair");
            System.out.println("Opção desejada: ");

            int opt = sc.nextInt();
            while(opt != 1 && opt != 2 && opt != 3 && opt != 4 && opt != 5){
                opt = sc.nextInt();
            }
            if(opt == 5) {break;}

            System.out.println("Primeiro valor:");
            int num1 = sc.nextInt();
            System.out.println("Segundo valor:");
            int num2 = sc.nextInt();
            int resultado;

            switch(opt){
                case 1:
                    Interface obj = (Interface) Naming.lookup("rmi://localhost:5050/obj");
                    resultado = obj.add(num1, num2);
                    System.out.println("Adição = " + resultado);
                    break;
                case 2:
                    Interface obj1 = (Interface) Naming.lookup("rmi://localhost:5050/obj");
                    resultado = obj1.sub(num1, num2);
                    System.out.println("Subtração = " + resultado);
                    break;
                case 3:
                    Interface obj2 = (Interface)Naming.lookup("rmi://localhost:5050/obj");
                    resultado = obj2.mul(num1, num2);
                    System.out.println("Multiplicação = " + resultado);
                    break;
                case 4:
                    Interface obj3 = (Interface)Naming.lookup("rmi://localhost:5050/obj");
                    resultado = obj3.div(num1, num2);
                    System.out.println("Divisão = " + resultado);
                    break;
            }
        }
    }

}

