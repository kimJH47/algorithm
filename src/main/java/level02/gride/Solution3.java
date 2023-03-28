package level02.gride;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution3 {
    public static void main(String[] args) throws IOException {

//        int[] parent = new int[100001]; //팀의 숫자가 1부터 시작하므로 편의를 위해 10001 생성
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        //부모노드 배열 초기화
//        for (int i = 1; i <= 10000; i++) {
//            parent[i] = i;
//        }
//
//        StringTokenizer tokenizer1 = new StringTokenizer(br.readLine(), " ");
//        int N = Integer.parseInt(tokenizer1.nextToken());
//        int M = Integer.parseInt(tokenizer1.nextToken()); //입력갯수
//
//        ArrayList<String> result = new ArrayList<>();
//
//        for (int i = 0; i < M; i++) {
//            StringTokenizer tokenizer2 = new StringTokenizer(br.readLine(), " ");
//            String check = tokenizer2.nextToken();
//            String first = tokenizer2.nextToken();
//            String second = tokenizer2.nextToken();
//
//            if (isZeroNumber(check)) {
//                //팀 합차기
//                linkToTeam(parent, first, second);
//                continue;
//            }
//            //같은팀 확인 여부
//            isSameTeam(parent, result, first, second);
//        }
//        result.forEach(System.out::println);
        System.out.println("\twww");


    }

    private static void isSameTeam(int[] parent, List<String> result, String first, String second) {

        int min = Math.min(Integer.parseInt(first), Integer.parseInt(second));
        int max = Math.max(Integer.parseInt(first), Integer.parseInt(second));

        //값이 큰 노드의 부모를 순회
        int aParent = reqNode(parent, min);
        int bParent = reqNode(parent, max);

        if (aParent == bParent) {
            result.add("YES");
            return;
        }
        result.add("NO");
    }

    private static void linkToTeam(int[] parent, String first, String second) {

        int min = Math.min(Integer.parseInt(first), Integer.parseInt(second));
        int max = Math.max(Integer.parseInt(first), Integer.parseInt(second));
        //값이 큰 노드의 부모를 순회
        int aParent = reqNode(parent, min);
        int bParent = reqNode(parent, max);
        if (aParent < bParent) {
            //실제 큰노드의 부모가 작은노드의 부모보다 클 때 부모노드를 작은노드로 바꾼다
            parent[bParent] = parent[min];
        }
        parent[min] = Math.min(parent[min], bParent);
    }

    private static int reqNode(int[] parent, int a) {
        if (parent[a] == a) {
            return parent[a];
        }
        return reqNode(parent, parent[a]);
    }

    private static boolean isZeroNumber(String nextToken) {
        return nextToken.equals("0");
    }
}


/**
 * 1. 팀합치기 연산 구현
 * 2. 같은팀 확인 여부 구현
 * <p>
 * 초기에 부모노드배열의 값은 자기자신을 가르킨다.
 * 팀합치기 시 작은 값을 가지는 노드가 부모가 된다 예 ) 0 2 3 일때 3번 노드의 부모노드배열의 값은 3에서 2가 된다
 * 같은팀 확인 여부 시 큰값의 노드를 기준으로 부모노드를 순회해서 부모노드가 같으면YES 아니면 NO 를 결고 배열에 넣는다(전체출력을위한 배열)
 * 예) 1 2 3 이고 3번 노드가 2번노드에 속할 때 -> 3이 더 크므로 3번노드부터 순회하여 2번노드가 포함되는지 확인 후 결과를 출력한다.
 * 노드의 갯수 N 는 1보다 크거나 같다(1<=N) -> 노드의 시작은 1부터함
 * 최대 입력 갯수 M 는 10만개이다 -> 노드의 최대갯수는 100,000개 이다.
 * <p>
 */
