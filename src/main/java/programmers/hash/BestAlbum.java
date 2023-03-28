package programmers.hash;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class BestAlbum {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> genresAndPlays = new HashMap<>();
        HashMap<String, List<Integer>> genreCodes = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            genresAndPlays.put(genre, genresAndPlays.getOrDefault(genre, 0) + plays[i]);
            genreCodes.put(genre, genreCodes.getOrDefault(genre, new ArrayList<>()));
            genreCodes.get(genre).add(i);
        }
        List<String> sortedGenres = genresAndPlays.entrySet()
                .stream()
                .sorted(Comparator.comparingInt(Entry::getValue))
                .map(Entry::getKey)
                .collect(Collectors.toList());

        Collection<List<Integer>> values = genreCodes.values();

        for (List<Integer> value : values) {
            value.sort((Integer o1, Integer o2) -> {
                int play1 = plays[o1];
                int play2 = plays[o2];
                if (play2 == play1) {
                    return o1 > o2 ? 1 : -1;
                }
                return play1 < play2 ? 1 : -1;
            });
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = sortedGenres.size() - 1; i >= 0; i--) {
            String sortedGenre = sortedGenres.get(i);
            List<Integer> codes = genreCodes.get(sortedGenre);
            result.add(codes.get(0));
            if (codes.size() < 2) {
                continue;
            }
            result.add(codes.get(1));

        }

        return result.stream().mapToInt(value -> value).toArray();
    }

    public static void main(String[] args) {
        BestAlbum bestAlbum = new BestAlbum();
        bestAlbum.solution(new String[]{"classic", "pop", "classic", "classic", "pop"},
                new int[]{500, 600, 800, 800, 2500});

    }
}
/*                genreCodeAndPlaysHashMap.get(genre)
                        .add(i);*/
/*          PriorityQueue<Integer> queue = new PriorityQueue<>(plays.length,
                    (Integer o1, Integer o2) -> {
                            int play1 = plays[o1];
                            int play2 = plays[o2];
                        if (play1 == play2) {
                            return o1 < o2 ? 1 : -1;
                        }
                            return play1 < play2 ? 1 : -1;
                    });
            queue.add(i);
            genresAndPlaysHashMap.put(genre, plays[i]);
            genreCodeAndPlaysHashMap.put(genre, queue);*/