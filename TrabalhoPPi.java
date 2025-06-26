import java.util.*;
/* Introduzir os conceitos relativos aos procedimentos de conversão das bases decimal para binário, 
 * binário para decimal, decimal para octal, octal para decimal, decimal para hexadecimal, 
 * hexadecimal para decimal, binário para hexadecimal, hexadecimal para binário, binário para octal e octal para binário.
 */
public class TrabalhoPPi {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int opcao;
            long num = 0, decimal = 0, hexadecimal = 0, octal = 0, binario = 0;
            String binarios, decimais, octals;            


            
       do{
        System.out.println("\n");
        System.out.println("Qual conversão deseja escolher \n");

        System.out.println("1 - decimal para binário:");
        System.out.println("2 - binário para decimal");
        System.out.println("3 - decimal para octal");
        System.out.println("4 - octal para decimal");
        System.out.println("5 - decimal para hexadeimal");
        System.out.println("6 - hexadecimal pra decimal");
        System.out.println("7 - binário para hexadecimal");
        System.out.println("8 - hexadecimal para binário");
        System.out.println("9 - binário para octal");
        System.out.println("10- octal para binário");
        System.out.println("0 - Sair");
        opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o núemro decimal: ");

                    

                    decimal = scan.nextLong();

                    binarios = "";

                if(decimal == 0){
                    binarios = "0";
                }else {
                    for(;decimal > 0; ){
                        
                    long resto = decimal % 2;
                    binarios = resto + binarios;
                    decimal = decimal / 2;
                
                }

                }

                System.out.println("Binario: " + binarios);
                
                
                
                break;

            case 2:

             System.out.println("Digite o núemro binário: ");

                    scan.nextLine();

                   binarios = scan.nextLine();
                   
                    long potencia = 1;
                    

                    for (int i = binarios.length() - 1; i >=0; i--){

                        char bit = binarios.charAt(i);

                        if (bit == '1'){
                            decimal += potencia;

                        }else if (bit != '0'){
                            System.out.println("Número errado, digite um número binário");
                            
                            break;
                        }

                        potencia *=2;


                    }

                    System.out.println("Decimal: " + decimal);
                   

                    
                   

                break;

            case 3:

            System.out.println("Digite o núemro decimal: ");

                    

                    decimal = scan.nextLong();

                    octals = "";

                    

                if(decimal == 0){
                    octals = "0";
                }else {
                    for(;decimal > 0; ){
                        
                    long resto = decimal % 8;
                    octals = resto + octals;
                    decimal = decimal / 8;
                
                }

                }

                System.out.println("Octal " + octals);
                
                
                
                break;


            case 4:

                System.out.println("Digite o número octal: ");
                scan.nextLine();
                octals = scan.nextLine();

                long potencia8 = 1;

                for (int i = octals.length() -1; i >= 0; i--){
                    char digito = octals.charAt(i);

                    if( digito >= '0' && digito <= '7'){

                        int valor = digito - '0';
                        decimal += valor * potencia8;
                        potencia8 *= 8;



                    }else {
                        System.out.println("Número invalido, digite um número octal");
                        break;

                    }



                }
                    System.out.println("Decimal: " + decimal);
                   

                break;
            case 5:
                   

                break;
            case 6:
                   

                break;
            case 7:
                   

                break;
            case 8:

                break;

            case 9:

                break;

            case 10:

                break;
                    
            
        
            default:
                break;
        }


       }while (opcao != 0);
       scan.close();
       
       

        }
            

    }