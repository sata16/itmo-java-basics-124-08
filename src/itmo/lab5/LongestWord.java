package itmo.lab5;

public class LongestWord {
    public String getLongestWord(String text) {
        String[] substring = text.split(" ");//сохраняю текст в массив по разделителю пробел
        int maxLength = 0; //максимальная длина
        String res = "";//возвращаемое слово
        for (String s : substring) { //поиск элемента массива с наибльшей длиной
            if (s.length() > maxLength) {
                maxLength = s.length();
            }
        }
        for (int i = 0; i < substring.length; i++) { //вывод значения элемента с наибольшей длиной
            if (substring[i].length() == maxLength) {
                res = substring[i];
            }
        }
        return res;
    }
}
