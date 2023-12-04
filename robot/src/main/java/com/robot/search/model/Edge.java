package com.robot.search.model;

import lombok.Data;

/**
 * Class which describes edges for graphs
 */
@Data
public class Edge {
    
    private Integer weight;

    private Node node;
}
