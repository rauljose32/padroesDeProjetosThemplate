package com.manoelcampos.retornoboleto;

import java.time.LocalDate;
import java.util.List;

class LeituraRetornoBancoBrasil {
    
    public static Boleto processarLinha(String[] t) {
        Boleto boleto = new Boleto();
        boleto.setId(Integer.parseInt(t[0]));
        boleto.setCodBanco(t[1]);

        boleto.setDataVencimento(LocalDate.parse(t[2], ProcessarBoletos.FORMATO_DATA));
        boleto.setDataPagamento(LocalDate.parse(t[3], ProcessarBoletos.FORMATO_DATA).atTime(0, 0, 0));

        boleto.setCpfCliente(t[4]);
        boleto.setValor(Double.parseDouble(t[5]));
        boleto.setMulta(Double.parseDouble(t[6]));
        boleto.setJuros(Double.parseDouble(t[7]));
        return boleto;
    }

}
