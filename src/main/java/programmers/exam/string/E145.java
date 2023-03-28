package programmers.exam.string;

public class E145 {
    public String solution(String[] arr) {
        StringBuilder stb = new StringBuilder();
        for(String str : arr){
            stb.append(str)
                    .append(",");
        }
        stb.delete(stb.length()-1,stb.length());
        return stb.toString();
    }

}
