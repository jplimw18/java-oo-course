package br.com.alura.screenmatch.services;

import br.com.alura.screenmatch.interfaces.Classify;

public class FilterRecommendation {
    private String recommended;

    public void filter(Classify classify) {
        if (classify.getClassify() >= 4) {
            System.out.println("Está entre os preferidos do momento!");
        } else if (classify.getClassify() >= 2) {
            System.out.println("Bem avaliado no momento!");
        } else {
            System.out.println("Adicione para assitir mais tarde!");
        }
    }
}
