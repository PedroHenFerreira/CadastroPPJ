import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class PPJ {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome dx alunx: ");
        String nomeAluno = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.print("Data de nascimento (dd/mm/aaaa): ");
        Date dataNascimento = sdf.parse(sc.next());

        System.out.print("Data de ingresso (dd/mm/aaaa): ");
        Date dataIngresso = sdf.parse(sc.next());

        System.out.print("Escola e ano escolar (Escola - X ano): ");
        String escolaAnoEscolar = sc.nextLine();

        sc.nextLine();

        System.out.print("Valor da mensalidade: ");
        double mensalidade = sc.nextDouble();

        sc.nextLine();

        System.out.print("Telefone dx alunx(XX XXXXX-XXXX): ");
        String telefoneAluno = sc.nextLine();

        System.out.print("Nome dx responsável: ");
        String nomeResponsavel = sc.nextLine();

        System.out.print("Documento dx responsável (CPF ou RG): ");
        String documento = sc.nextLine();

        System.out.print("Telefone dx responsável(XX XXXXX-XXXX): ");
        String telefoneResponsavel = sc.nextLine();

        System.out.print("Dia do vencimento(05 ou 10): ");
        int diaVencimento = sc.nextInt();

        AlunoPPJ alunoPPJ = new AlunoPPJ(nomeAluno, idade, dataNascimento, dataIngresso, escolaAnoEscolar,
                mensalidade, telefoneAluno);

        ResponsavelPPJ responsavelPPJ = new ResponsavelPPJ(nomeResponsavel, telefoneResponsavel, diaVencimento, documento);

        String caminho = "C:\\Aluno\\" + alunoPPJ.getNome() + ".txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))) {
            bw.write("Nome: " + alunoPPJ.getNome());
            bw.newLine();

            bw.write("Idade: " + alunoPPJ.getIdade());
            bw.newLine();

            bw.write("Data de nascimento: " + alunoPPJ.getDataNascimento());
            bw.newLine();

            bw.write("Escola e ano escolar: " + alunoPPJ.getEscolaAnoEscolar());
            bw.newLine();

            bw.write("Telefone dx alunx: " + alunoPPJ.getTelefoneAluno());
            bw.newLine();

            bw.write("Data de ingresso: " + alunoPPJ.getDataIngresso());
            bw.newLine();

            bw.write(String.format("Mensalidade: R$%.2f", alunoPPJ.getMensalidade()));
            bw.newLine();

            bw.write("-------------------------------------------------------------");
            bw.newLine();

            bw.write("Nome dx responsável: " + responsavelPPJ.getNomeResponsavel());
            bw.newLine();

            bw.write("Telefone dx responsável: " + responsavelPPJ.getTelefoneResponsavel());
            bw.newLine();

            bw.write("Documento: " + responsavelPPJ.getDocumento());
            bw.newLine();

            bw.write("Dia do vencimento: " + responsavelPPJ.getDiaVencimento());
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();

    }
}
