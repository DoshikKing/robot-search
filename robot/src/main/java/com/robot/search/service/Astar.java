package com.robot.search.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.robot.search.model.Node;

import lombok.RequiredArgsConstructor;

/**
 * Class which describes base A* algorithm
 */
@RequiredArgsConstructor
public class Astar {
    // Array of visited nodes
    private Set<Node> closedList;

    // Array of observable nodes
    private List<Node> openList;

    // Start node
    private Node startNode;

    // Terget node
    private Node targetNode;


    public Node findPath() {
        
        // Searching for target node while we have nodes
        while (!this.openList.isEmpty()) {
            
        }

        return null;
    }

}
