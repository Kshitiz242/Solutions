import java.util.*;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean k=true;
        if(ransomNote.length()>magazine.length()){
            k=false;
        }
        else{
            
            for(int i=0;i<ransomNote.length();i++){
                int match=-1;
                char r = ransomNote.charAt(i);
                for(int j=0;j<magazine.length();j++){
                    if(r==magazine.charAt(j)){
                        match=j;
                        break;
                    }
                }
            if(match==-1){
                k=false;
                break;
            }
            else{
                magazine=magazine.substring(0,match)+magazine.substring(match+1);
            }
                } 
            } 
            return k;
                }
            }
