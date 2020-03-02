package Lesson12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class GivenList {
    public static void main(String[] args) {
     StringBuilder  br=new StringBuilder();
        List<String> subjects = new ArrayList<>(Arrays.asList("Noel", "The cat", "The dog"));
        List<String> verbs =new ArrayList<>(Arrays.asList("wrote", "chased", "slept on"));
        List<String> objects =new ArrayList<>(Arrays.asList("the book", "the ball", "the bed"));

      for (int i = 0; i < subjects.size(); i++) {
            for (int j = 0; j < verbs.size(); j++) {
                for (int k = 0; k < objects.size(); k++) {

                  br.append(subjects.get(i));
                    br.append(" ");
                    br.append(verbs.get(j));
                    br.append(" ");
                    br.append(objects.get(k));
                    br.append("\n");
                }
            }
        }
        System.out.println(br.toString());
    }



}
