import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Lê a primeira linha (código informado)
        String codigoInformado = scanner.nextLine();
        
        // Lê a segunda linha (código esperado)
        String codigoEsperado = scanner.nextLine();
        // Compara se os dois textos são idênticos
        if (codigoInformado.equals(codigoEsperado)) {
            System.out.println("ACESSO LIBERADO");
        } else {
            System.out.println("ACESSO NEGADO");
        }
        scanner.close();
    
}

}
