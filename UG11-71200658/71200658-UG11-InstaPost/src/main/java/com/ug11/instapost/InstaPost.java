package com.ug11.instapost;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InstaPost {
    private int totalMention;
    private String email, username;

    public InstaPost() {
    }

    public void printInfo(){

    }

    public void login(String email){
        String regexGmail = "^[\\w-]+@gmail+.\\w*";
        Pattern p = Pattern.compile(regexGmail);
        Matcher matcher = p.matcher(email);

        try {
            if (!email.contains("@")){
                throw new EmailException(1);
            } else if (!matcher.matches()){
                throw new EmailException(2);
            }
            System.out.println("Login Berhasil!");
        }
        catch (EmailException e){
            System.out.println("Error :"+ e.getErrorMessage());
        }
    }

    public void post(String caption){
        System.out.println("Caption : "+caption);
        String regexMentionUser = "@+\\w*";
        Pattern p = Pattern.compile(regexMentionUser);
        Matcher matcher = p.matcher(caption);

        int count = 0;
        String[] kata = caption.split(" ");
        for (String values : kata){
            if (matcher.matches()){
                count++;
            }

        }
        System.out.println("Pengguna yang anda mention : -");
        System.out.println("Total username yang anda mention : "+count);

    }
}
