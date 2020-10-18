package training.module3.stringAndStringBuilderUsage;

public class Task10 {

    //Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
    //знаком. Определить количество предложений в строке X

    public static int countSentence(String text) {
        return text.split("[\\.!?]").length;
    }
}
