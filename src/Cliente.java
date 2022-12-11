import java.math.BigDecimal;
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
            String num1 = String.valueOf(sc.nextFloat());
            System.out.println("Segundo valor:");
            String num2 = String.valueOf(sc.nextFloat());
            BigDecimal resultado;

            //Referência para um objeto remoto associado a um nome específico
            Interface obj = (Interface) Naming.lookup("rmi://localhost:5050/obj");

            switch(opt){
                case 1:
                    resultado = obj.add(num1, num2);
                    System.out.println("Adição = " + resultado);
                    break;
                case 2:
                    resultado = obj.sub(num1, num2);
                    System.out.println("Subtração = " + resultado);
                    break;
                case 3:
                    resultado = obj.mul(num1, num2);
                    System.out.println("Multiplicação = " + resultado);
                    break;
                case 4:
                    resultado = obj.div(num1, num2);
                    System.out.println("Divisão = " + resultado);
                    break;
            }
        }
    }

}

