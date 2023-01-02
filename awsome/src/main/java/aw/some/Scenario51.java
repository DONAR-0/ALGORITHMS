package aw.some;

// Time Complexity: O(|V| + |E|)
// Space Complexity: O(|V|)

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Scenario51 {
    private static final Logger LOG = LoggerFactory.getLogger(Scenario51.class);
    public static class Graph{
        HashMap<Integer, ArrayList<Integer>> adjacentList;
        public Graph() {
            this.adjacentList = new HashMap<>();
        }
        public Graph(HashMap<Integer,ArrayList<Integer>> adjacentList) {
            this.adjacentList = adjacentList;
        }
    }

    public static void dfs(Graph graph, int root, Set<Integer> visited) {
        if (visited.contains(root)) return;
        else {
            LOG.info("{}",root);
            visited.add(root);
            for (int neighbour: graph.adjacentList.get(root)) {
                dfs(graph,neighbour,visited);
            }
        }
    }

    public static void dfs(Graph graph,int root) {
        Set<Integer> visited = new HashSet<>();
        dfs(graph,root,visited);
    }
}