package main.java.string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.LongAdder;


public class TopFrequentWords {
    public static void main(String[] args) throws IOException {
        File file = new File("bigdata.txt");

        Map<String, LongAdder> map = new HashMap<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        map.computeIfAbsent(word, k -> new LongAdder()).increment();
                    }
                }
            }

            PriorityQueue<Map.Entry<String, LongAdder>> heap = new PriorityQueue<>(
                    Map.Entry.comparingByValue(Comparator.comparing(LongAdder::longValue)));

            for (Map.Entry<String, LongAdder> entry : map.entrySet()) {
                heap.offer(entry);
                if (heap.size() > 10) {
                    heap.poll();
                }
            }


            List<Map.Entry<String, LongAdder>> top10 = new ArrayList<>(heap);
            top10.sort((a, b) -> Long.compare(a.getValue().longValue(), b.getValue().longValue()));

            for (Map.Entry<String, LongAdder> entry : top10) {
                System.out.println(entry.getKey() + " " + entry.getValue().longValue());
            }

        }
    }
}