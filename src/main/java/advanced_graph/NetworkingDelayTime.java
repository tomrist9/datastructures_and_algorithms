package main.java.advanced_graph;

import java.util.*;

public class NetworkingDelayTime {
    public int networkDelayTime(int[][] times, int n, int k) {

        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] t : times) {
            graph
                    .computeIfAbsent(t[0], x -> new ArrayList<>())
                    .add(new int[]{t[1], t[2]});
        }


        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0; // start node


        PriorityQueue<int[]> pq =
                new PriorityQueue<>((a, b) -> a[0] - b[0]);

        pq.offer(new int[]{0, k});


        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int time = cur[0];
            int node = cur[1];


            if (time > dist[node]) continue;


            if (!graph.containsKey(node)) continue;

            for (int[] next : graph.get(node)) {
                int nextNode = next[0];
                int travelTime = next[1];

                int newTime = time + travelTime;

                if (newTime < dist[nextNode]) {
                    dist[nextNode] = newTime;
                    pq.offer(new int[]{newTime, nextNode});
                }
            }
        }


        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE) return -1;
            answer = Math.max(answer, dist[i]);
        }

        return answer;
    }
}
