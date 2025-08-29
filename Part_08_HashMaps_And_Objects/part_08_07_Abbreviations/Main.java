package Part_08_HashMaps_And_Objects.part_08_07_Abbreviations;

public class Main {
    public static void main(String[] args){
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for(String i: text.split(" ")){
            if(abbreviations.hasAbbreviation(i)){
                i = abbreviations.findExplanationFor(i);
            }
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
