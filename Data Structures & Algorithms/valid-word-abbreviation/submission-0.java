class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        if(word.equals(abbr)){
            return true;
        }

        if(abbr.chars().allMatch(Character::isDigit) && word.length() == Integer.parseInt(abbr)){
            return true;
        }

        int one = 0;
        int sec = 0;
        while(one < word.length() && sec < abbr.length()){
            if(!Character.isDigit(abbr.charAt(sec))){
                if(word.charAt(one) != abbr.charAt(sec)){
                    return false;
                }
                one++;
                sec++;
            } else{
                if(abbr.charAt(sec) == '0'){
                    return false;
                }
                
                String no = "0";
                while(sec < abbr.length()){
                    if(Character.isDigit(abbr.charAt(sec))){
                        no += abbr.charAt(sec);
                        sec++;
                    } else{
                        break;
                    }
                }
                one += Integer.parseInt(no);
            }
        }
        return one == word.length() && sec == abbr.length();
    }
}