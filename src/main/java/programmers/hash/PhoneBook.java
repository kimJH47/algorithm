package programmers.hash;

import java.util.HashMap;

public class PhoneBook {
    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String value : phone_book) {
            hashMap.put(value, 1);
        }
        for (String s : phone_book) {
            for (int i = 0; i < s.length(); i++) {
                if (hashMap.containsKey(s.substring(0, i))) {
                    return false;
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.solution(new String[]{"119", "97674223", "1195524421"});
    }
}
