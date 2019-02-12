package exercism;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        for (String words : splitting("AUGUUUUCU")){
          System.out.println(words);}


    }
    public static  String[] splitting (String inputString) {
        return inputString.split("(?<=\\G.{" + 3 + "})");

    }

    public static String[][] aminoAcids = {{"Methionine" , "AUG"},
                                            {"Phenylalanine","UUU", "UUC"},
                                            {"Leucine","UUA", "UUG"},
                                            {"Serine", "UCU", "UCC", "UCA", "UCG"},
                                             {"Tyrosine", "UAU", "UAC"},
                                            {"Cysteine", "UGU", "UGC"},
                                              {"Tryptophan", "UGG"},
                                              {"STOP", "UAA", "UAG", "UGA"}};
}
