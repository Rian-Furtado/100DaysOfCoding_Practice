package LeetCode;

public class LengthLastWord_58 {
    public static void main(String[] args) {

        System.out.println(lengthOfLastWord("O Brasil é um país de dimensões continentais, com uma enorme diversidade cultural e natural. Desde as praias do litoral até as florestas da Amazônia, passando pelas savanas do Pantanal e pelas montanhas da região serrana, o país possui uma variedade de paisagens e climas que encantam qualquer viajante. Além disso, a cultura brasileira é rica em influências indígenas, africanas e europeias, o que resulta em uma mistura única de tradições, música, dança e culinária. Em resumo, o Brasil é um lugar fascinante que combina beleza natural e riqueza cultural em uma só terra"));

    }

    public static int lengthOfLastWord(String s){
        String[] vect = s.split(" ");
        int answer = vect[vect.length-1].length();


        return answer;
    }
}
