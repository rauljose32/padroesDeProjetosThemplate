/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manoelcampos.retornoboleto;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author aluno
 */
class LeituraRetornoBradesco {

    static Boleto processarLinha(String[] vetor) {
        Boleto boleto = new Boleto();
        boleto.setId(Integer.parseInt(vetor[0]));
        boleto.setCodBanco(vetor[1]);
        boleto.setAgencia(vetor[2]);
        boleto.setContaBancaria(vetor[3]);

        boleto.setDataVencimento(LocalDate.parse(vetor[4], ProcessarBoletos.FORMATO_DATA));
        boleto.setDataPagamento(LocalDateTime.parse(vetor[5], ProcessarBoletos.FORMATO_DATA_HORA));

        boleto.setCpfCliente(vetor[6]);
        boleto.setValor(Double.parseDouble(vetor[7]));
        boleto.setMulta(Double.parseDouble(vetor[8]));
        boleto.setJuros(Double.parseDouble(vetor[9]));
        return boleto;

    }

}
