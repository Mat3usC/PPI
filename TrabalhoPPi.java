import java.util.*;

/* Introduzir os conceitos relativos aos procedimentos de conversão das bases decimal para binário, 
 * binário para decimal, decimal para octal, octal para decimal, decimal para hexadecimal, 
 * hexadecimal para decimal, binário para hexadecimal, hexadecimal para binário, binário para octal e octal para binário.
 */
public class TrabalhoPPi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int opcao;
        long decimal = 0;
        String binarios, octals;
        String hexaDigitos = "0123456789ABCDEF";

        do {
            System.out.println("\n");
            System.out.println("Qual conversão deseja escolher \n");

            System.out.println("1 - decimal para binário:");
            System.out.println("2 - binário para decimal");
            System.out.println("3 - decimal para octal");
            System.out.println("4 - octal para decimal");
            System.out.println("5 - decimal para hexadecimal");
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

                    if (decimal == 0) {
                        binarios = "0";
                    } else {
                        for (; decimal > 0;) {

                            long resto = decimal % 2;
                            binarios = resto + binarios;
                            decimal = decimal / 2;

                        }

                    }

                    System.out.println("Binario: " + binarios);

                    break;

                case 2:

                    System.out.println("Digite o número binário: ");

                    scan.nextLine();

                    binarios = scan.nextLine();

                    long potencia1 = 1;

                    decimal = 0;

                    for (int i = binarios.length() - 1; i >= 0; i--) {

                        char bit = binarios.charAt(i);

                        if (bit == '1') {
                            decimal += potencia1;

                        } else if (bit != '0') {
                            System.out.println("Número invalido, digite um número binário");

                            break;
                        }

                        potencia1 *= 2;

                    }

                    System.out.println("Decimal: " + decimal);

                    break;

                case 3:

                    System.out.println("Digite o núemro decimal: ");

                    decimal = scan.nextLong();

                    octals = "";

                    if (decimal == 0) {
                        octals = "0";
                    } else {
                        for (; decimal > 0;) {

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

                    decimal = 0;

                    long potencia8 = 1;

                    for (int i = octals.length() - 1; i >= 0; i--) {
                        char digito = octals.charAt(i);

                        if (digito >= '0' && digito <= '7') {

                            int valor = digito - '0';
                            decimal += valor * potencia8;
                            potencia8 *= 8;

                        } else {
                            System.out.println("Número invalido, digite um número octal");
                            break;

                        }

                    }
                    System.out.println("Decimal: " + decimal);

                    break;
                case 5:

                    System.out.println("Digite o número decimal: ");

                    decimal = scan.nextLong();

                    hexaDigitos = "0123456789ABCDEF";

                    String posicaoHex = "";

                    if (decimal == 0) {
                        posicaoHex = "0";

                    } else {
                        while (decimal > 0) {
                            long resto = decimal % 16;
                            char digitoHex = hexaDigitos.charAt((int) resto);
                            posicaoHex = digitoHex + posicaoHex;

                            decimal = decimal / 16;
                        }

                    }

                    System.out.println("Hexadecimal: " + posicaoHex);

                    break;
                case 6:
                    System.out.println("Digite o númer hexadecimal: ");
                    scan.nextLine();
                    String hexadecimais = scan.nextLine().toUpperCase();

                    decimal = 0;

                    long potencia16 = 1;
                    decimal = 0;

                    int i = hexadecimais.length() - 1;

                    while (i >= 0) {
                        char posicao = hexadecimais.charAt(i);
                        int valor = -1;

                        if (posicao == '0')
                            valor = 0;
                        else if (posicao == '1')
                            valor = 1;
                        else if (posicao == '2')
                            valor = 2;
                        else if (posicao == '3')
                            valor = 3;
                        else if (posicao == '4')
                            valor = 4;
                        else if (posicao == '5')
                            valor = 5;
                        else if (posicao == '6')
                            valor = 6;
                        else if (posicao == '7')
                            valor = 7;
                        else if (posicao == '8')
                            valor = 8;
                        else if (posicao == '9')
                            valor = 9;
                        else if (posicao == 'A')
                            valor = 10;
                        else if (posicao == 'B')
                            valor = 11;
                        else if (posicao == 'C')
                            valor = 12;
                        else if (posicao == 'D')
                            valor = 13;
                        else if (posicao == 'E')
                            valor = 14;
                        else if (posicao == 'F')
                            valor = 15;

                        if (valor == -1) {
                            System.out.println("Número hexadecimal inválido!");
                            break;
                        }

                        decimal += valor * potencia16;
                        potencia16 *= 16;
                        i--;

                    }

                    System.out.println("Decimal: " + decimal);

                    break;

                case 7:
                    System.out.println("Digite o número binário:");
                    scan.nextLine();
                    binarios = scan.nextLine();

                    long decimalBinario = 0;
                    long potencia = 1;

                    i = binarios.length() - 1;
                    while (i >= 0) {
                        char bit = binarios.charAt(i);
                        if (bit == '1') {
                            decimalBinario += potencia;
                        } else if (bit != '0') {
                            System.out.println("Número binário inválido!");
                            break;
                        }
                        potencia *= 2;
                        i--;
                    }

                    hexaDigitos = "0123456789ABCDEF";
                    String hexa = "";

                    if (decimalBinario == 0) {
                        hexa = "0";
                    } else {
                        while (decimalBinario > 0) {
                            int resto = (int) (decimalBinario % 16);
                            char digitoHex = hexaDigitos.charAt(resto);
                            hexa = digitoHex + hexa;
                            decimalBinario = decimalBinario / 16;
                        }
                    }

                    System.out.println("Hexadecimal: " + hexa);
                    break;

                case 8:
                    System.out.println("Digite o número hexadecimal:");
                    scan.nextLine();
                    String hexaParaBinario = scan.nextLine().toUpperCase();

                    String resultadoBinario = "";

                    i = 0;
                    while (i < hexaParaBinario.length()) {
                        char posicao = hexaParaBinario.charAt(i);
                        String bin4 = "";

                        if (posicao == '0')
                            bin4 = "0000";
                        else if (posicao == '1')
                            bin4 = "0001";
                        else if (posicao == '2')
                            bin4 = "0010";
                        else if (posicao == '3')
                            bin4 = "0011";
                        else if (posicao == '4')
                            bin4 = "0100";
                        else if (posicao == '5')
                            bin4 = "0101";
                        else if (posicao == '6')
                            bin4 = "0110";
                        else if (posicao == '7')
                            bin4 = "0111";
                        else if (posicao == '8')
                            bin4 = "1000";
                        else if (posicao == '9')
                            bin4 = "1001";
                        else if (posicao == 'A')
                            bin4 = "1010";
                        else if (posicao == 'B')
                            bin4 = "1011";
                        else if (posicao == 'C')
                            bin4 = "1100";
                        else if (posicao == 'D')
                            bin4 = "1101";
                        else if (posicao == 'E')
                            bin4 = "1110";
                        else if (posicao == 'F')
                            bin4 = "1111";
                        else {
                            System.out.println("Caractere hexadecimal inválido: " + posicao);
                            break;
                        }

                        resultadoBinario += bin4;
                        i++;
                    }

                    System.out.println("Binário: " + resultadoBinario);
                    break;

                case 9:
                    System.out.println("Digite o número binário:");
                    scan.nextLine();
                    String binParaOctal = scan.nextLine();

                    while (binParaOctal.length() % 3 != 0) {
                        binParaOctal = "0" + binParaOctal;
                    }

                    String octalFinal = "";

                    i = binParaOctal.length() - 3;
                    while (i >= 0) {
                        String grupo = "";
                        int f = 0;
                        while (f < 3) {
                            grupo += binParaOctal.charAt(i + f);
                            f++;
                        }

                        int valor = 0;
                        int pot3 = 1;
                        int k = 2;
                        while (k >= 0) {
                            if (grupo.charAt(k) == '1') {
                                valor += pot3;
                            }
                            pot3 *= 2;
                            k--;
                        }

                        octalFinal = valor + octalFinal;
                        i -= 3;
                    }

                    System.out.println("Octal: " + octalFinal);
                    break;

                case 10:
                    System.out.println("Digite o número octal:");
                    scan.nextLine();
                    String octalInput = scan.nextLine();

                    String binarioFinal = "";

                    i = 0;
                    while (i < octalInput.length()) {
                        char posicao = octalInput.charAt(i);
                        String grupoBin = "";

                        if (posicao == '0')
                            grupoBin = "000";
                        else if (posicao == '1')
                            grupoBin = "001";
                        else if (posicao == '2')
                            grupoBin = "010";
                        else if (posicao == '3')
                            grupoBin = "011";
                        else if (posicao == '4')
                            grupoBin = "100";
                        else if (posicao == '5')
                            grupoBin = "101";
                        else if (posicao == '6')
                            grupoBin = "110";
                        else if (posicao == '7')
                            grupoBin = "111";
                        else {
                            System.out.println("Caractere inválido no número octal: " + posicao);
                            break;
                        }

                        binarioFinal += grupoBin;
                        i++;
                    }

                    System.out.println("Binário: " + binarioFinal);
                    break;

                default:
                    break;
            }

        } while (opcao != 0);
        scan.close();

    }

}
