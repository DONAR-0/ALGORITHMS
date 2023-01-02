package aw.some;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * Time Complexity: O(|V| + |E|)
 * SC: O(|V|)
 *
 */
public class Scenario52 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Scenario52.class);
    public static class Graph{
        HashMap<Integer, ArrayList<Integer>> adjList;

        public Graph(){
            this.adjList = new HashMap<>();
        }
    }

    /**
     *
     * @param graph
     * @param root
     */
    static void bfs(Graph graph,int root) {
        ArrayList<Integer> queue = new ArrayList<>();
        queue.add(root);
        Set<Integer> visited = new HashSet<>();
        visited.add(root);
        int i = 0;
        while (i < queue.size()) {
            int vertex = queue.get(i++);
            LOGGER.info("{}",vertex);
            for (int neighbor: graph.adjList.get(vertex)) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }
}
