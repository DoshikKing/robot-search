package com.robot.search.model;

import java.util.List;
import lombok.Data;

/**
 * Class which describes Node for graph
 */
@Data
public class Node implements Comparable<Node>{

    private List<Edge> children;
    
    private Node parent;

    private Double cost;

    private Integer posX;

    private Integer posY;

    private Integer minDistance = Integer.MAX_VALUE;

    public String toString(){
		return String.format("Node with positions: X = %d, Y = %d", this.posX, this.posY);
	}

    @Override
	public int compareTo(Node other) {
		return Double.compare(this.cost, other.getCost());
	}
}
