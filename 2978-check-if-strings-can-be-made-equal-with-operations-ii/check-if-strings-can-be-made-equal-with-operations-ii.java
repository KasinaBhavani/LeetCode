class Solution {
    public boolean checkStrings(String s1, String s2) {
        int[] ec= new int[26];
        int[] oc =new int[26];
        int n = s1.length();
        for(int i=0;i<n;i++){
            if(i%2==0){
                ec[s1.charAt(i)-'a']++;
                ec[s2.charAt(i)-'a']--;
            }
            else{
                oc[s1.charAt(i)-'a']++;
                oc[s2.charAt(i)-'a']--;
            }
        }
        for(int i=0;i<26;i++){
            if(ec[i]!=0 || oc[i]!=0){
                return false;
            }
        }
        return true;
    }
}