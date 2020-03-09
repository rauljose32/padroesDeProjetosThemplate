package com.manoelcampos.retornoboleto;

import java.util.function.Function;

public class EstrategiaBoletoFactory {

    public static Function<String[], Boleto> newStrategy(String nomeArquivo) {

        if (nomeArquivo.toLowerCase().contains("banco-brasil")) {
            return LeituraRetornoBancoBrasil::processarLinha;
        } else if (nomeArquivo.toLowerCase().contains("bradesco")) {
            return LeituraRetornoBradesco::processarLinha;
        } else {
            throw new UnsupportedOperationException("Arquivo não identificado ou banco não suportado");
        }

    }//method

}//class

