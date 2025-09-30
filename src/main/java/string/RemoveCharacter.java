package main.java.string;

public class RemoveCharacter {
    public String removeCharacter(String input, char c) {

        if(input == null) return null;
        StringBuilder sb = new StringBuilder();

        for(char ch : input.toCharArray()){
            if(ch!=c){
                sb.append(ch);
            }
        }
        return sb.toString();
    }

}
