
import com.manoelcampos.retornoboleto.Boleto;
import com.manoelcampos.retornoboleto.EstrategiaBoletoFactory;
import com.manoelcampos.retornoboleto.ProcessarBoletos;
import java.util.function.Function;

/**
 * Classe para ver o funcionamento da leitura de boletos.
 *
 * @author Manoel Campos da Silva Filho
 */
public class Principal {

    public static void main(String[] args) {
        String nomeArquivo = "bradesco-1.csv";

        Function<String[], Boleto> estrategia = EstrategiaBoletoFactory.newStrategy(nomeArquivo);

        final ProcessarBoletos processador = new ProcessarBoletos(estrategia);

        System.out.println("Lendo arquivo " + nomeArquivo + "\n");

        processador.processar(nomeArquivo);
    }
}
