package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

@DisplayName("Testing Graph")
public class Scenario51Tests {


    @Test
    @DisplayName("TEST_1")
    public void testGraph() {
        /**
         *      1 --- 2 ----3
         *      7_____6_____9
         *      |     |     |
         *      5____12_____13
         */
        Scenario51.Graph graph = new Scenario51.Graph();
        HashMap<Integer, ArrayList<Integer>> adjacentList = new HashMap<>();
        var edge_1 = new ArrayList<Integer>();
        edge_1.add(2);
        edge_1.add(7);
        adjacentList.put(1, edge_1);
        var edge_2 = new ArrayList<Integer>();
        edge_2.add(1);
        edge_2.add(3);
        edge_2.add(6);
        adjacentList.put(2, edge_2);
        var edge_3 = new ArrayList<Integer>();
        edge_3.add(9);
        edge_3.add(2);
        adjacentList.put(3, edge_3);
        var edge_7 = new ArrayList<Integer>();
        edge_7.add(6);
        edge_7.add(1);
        edge_7.add(5);
        adjacentList.put(7, edge_7);
        ArrayList<Integer> edge_6 = new ArrayList<>(Arrays.asList(7, 9, 12));
        ArrayList<Integer> edge_9 = new ArrayList<>(Arrays.asList(6, 13));
        ArrayList<Integer> edge_5 = new ArrayList<>(Arrays.asList(12, 7));
        ArrayList<Integer> edge_12 = new ArrayList<>(Arrays.asList(5, 13, 6));
        ArrayList<Integer> edge_13 = new ArrayList<>(Arrays.asList(9, 12));
        adjacentList.put(6, edge_6);
        adjacentList.put(9, edge_9);
        adjacentList.put(5, edge_5);
        adjacentList.put(12, edge_12);
        adjacentList.put(13, edge_13);
        graph.adjacentList = adjacentList;
        Scenario51.dfs(graph,1);
    }
}
