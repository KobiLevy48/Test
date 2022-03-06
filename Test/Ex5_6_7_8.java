package Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex5_6_7_8 {
    public static void main(String[] args) {

    }

    public static class MyProtectedUniqueList<T> {
        private List<String> words;
        private String secretWord;

        public MyProtectedUniqueList(List<String> words, String secretWord) {
            this.words =new ArrayList<>();
            this.secretWord = secretWord;
        }
        public void Add (String word)throws Exception{
            if(word == null || word.isEmpty()){
                throw new Exception("the word is empty or null");
            }
            if(!word.equals(secretWord)){
                words.add(word);
            }
            else {
                throw new Exception();
            }
        }
        public void Remove(String word)throws Exception{
            if(word == null || word.isEmpty()){
                throw new Exception("the word is empty or null");
            }
            if(word.equals(secretWord)){
                words.remove(word);
            }
            else {
                throw new Exception();
            }

        }
        public void RemoveAt(int n)throws Exception{
            if(n> words.size() || n<0){
                throw new Exception("n is bigger or smaller then a list");
            }
            for (int i = 0; i< words.size();i++){
                if(words.get(n).equals(secretWord)){
                    words.remove(words.get(n));
                }
                else {
                    throw new Exception();
                }

            }

        }
        public void Clear(String word) throws Exception {
            for (int i =0;i< words.size();i++){
                RemoveAt(i);
            }
        }
        public void Sort(String word)throws Exception{
            if(word.equals(secretWord)){
                words.sort(String::compareTo);
            }
            else {
                throw new Exception();
            }

        }

        @Override
        public String toString() {
            return "MyProtectedUniqueList{" +
                    "words=" + words +
                    ", secretWord='" + secretWord + '\'' +
                    '}';
        }

        public Iterator iterator() {
            return new Iterator() {
                int pos=0;
                @Override
                public boolean hasNext() {
                    return !(words.isEmpty());
                }

                @Override
                public Object next() {
                    return words.get(pos++);
                }
            };
        }
    }


}
