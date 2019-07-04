/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panagram.checking;

public class PanagramChecking {

    public static void main(String[] args) {
      String check1 = "abcdefghijklmnopqrstuvwxyz";
        String check2 = "Rajan Midun Magar";
        int inc = 0, big = 65,small = 97;
        for (int j = 0; j < 26; j++) {
            for (int i = 0; i < check1.length(); i++) 
                {
                    if ((check1.charAt(i) == (char) big) || (check1.charAt(i) == (char) small)) {
                       inc++;
                       big++;
                       small++;
                    }
                }
        }
      /*  for (int j = 0; j < 26; j++) {
            for (int i = 0; i < check2.length(); i++) 
                {
                    if ((check2.charAt(i) == (char) big) || (check2.charAt(i) == (char) small)) {
                       inc++;
                       big++;
                       small++;
                    }
                }
        }
*/
        if(inc==26)
            System.out.println("Yes it's panagram");
        else
            System.out.println("No it's not a panagram");
    }
    
}
