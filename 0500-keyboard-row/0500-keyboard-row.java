class Solution {
    public String[] findWords(String[] words) {
        HashSet<Character> keyboardRow1 = new HashSet<>();
        HashSet<Character> keyboardRow2 = new HashSet<>();
        HashSet<Character> keyboardRow3 = new HashSet<>();

        keyboardRow1.add('q');
        keyboardRow1.add('w');
        keyboardRow1.add('e');
        keyboardRow1.add('r');
        keyboardRow1.add('t');
        keyboardRow1.add('y');
        keyboardRow1.add('u');
        keyboardRow1.add('i');
        keyboardRow1.add('o');
        keyboardRow1.add('p');

        keyboardRow2.add('a');
        keyboardRow2.add('s');
        keyboardRow2.add('d');
        keyboardRow2.add('f');
        keyboardRow2.add('g');
        keyboardRow2.add('h');
        keyboardRow2.add('j');
        keyboardRow2.add('k');
        keyboardRow2.add('l');

        keyboardRow3.add('z');
        keyboardRow3.add('x');
        keyboardRow3.add('c');
        keyboardRow3.add('c');
        keyboardRow3.add('v');
        keyboardRow3.add('b');
        keyboardRow3.add('n');
        keyboardRow3.add('m');

        ArrayList<String> sameRowWordsList = new ArrayList<>();
        for(int index = 0; index < words.length; index++){
            boolean keyboardRowCheck1 = true;
            boolean keyboardRowCheck2 = true;
            boolean keyboardRowCheck3 = true;
            int sameRowCount = 0;
            for(int characterIndex = 0; characterIndex < words[index].length(); characterIndex++){
                if(keyboardRow1.contains(Character.toLowerCase(words[index].charAt(characterIndex)))){
                    if(keyboardRowCheck1 == true && keyboardRowCheck2 == true && keyboardRowCheck3 == true){
                        sameRowCount++;
                    }
                    else if(keyboardRowCheck1 == false && keyboardRowCheck2 == true && keyboardRowCheck3 == true){
                        sameRowCount++;
                    }
                    else{
                        break;
                    }
                    keyboardRowCheck1 = false;
                }
                else if(keyboardRow2.contains(Character.toLowerCase(words[index].charAt(characterIndex)))){
                    if(keyboardRowCheck1 == true && keyboardRowCheck2 == true && keyboardRowCheck3 == true){
                        sameRowCount++;
                    }
                    else if(keyboardRowCheck1 == true && keyboardRowCheck2 == false && keyboardRowCheck3 == true){
                        sameRowCount++;
                    }
                    else{
                        break;
                    }
                    keyboardRowCheck2 = false;
                }
                else if(keyboardRow3.contains(Character.toLowerCase(words[index].charAt(characterIndex)))){
                    if(keyboardRowCheck1 == true && keyboardRowCheck2 == true && keyboardRowCheck3 == true){
                        sameRowCount++;
                    }
                    else if(keyboardRowCheck1 == true && keyboardRowCheck2 == true && keyboardRowCheck3 == false){
                        sameRowCount++;
                    }
                    else{
                        break;
                    }
                    keyboardRowCheck3 = false;
                }
            }
            if(sameRowCount == words[index].length()){
                sameRowWordsList.add(words[index]);
            }
        }
        String sameRowWordsArray [] = new String[sameRowWordsList.size()];
        for(int index = 0; index < sameRowWordsArray.length; index++){
            sameRowWordsArray[index] = sameRowWordsList.get(index);
        }
        return sameRowWordsArray;
    }
}