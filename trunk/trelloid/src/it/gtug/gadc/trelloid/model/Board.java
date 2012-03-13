package it.gtug.gadc.trelloid.model;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Board implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1123L;
	private String id;
	private String name;
	private String desc;

	private List<CardContainer> containers;

	
	
	public Board(String id, String name, String desc) {
        this.id=id;
        this.name=name;
        this.desc=desc;
    }

	public Board() {
        this("vuoto","vuoto","default");
    }

    public List<CardContainer> getContainers() {
		return containers;
	}

	public void setContainers(List<CardContainer> containers) {
		this.containers = containers;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString(){
		return name;
	}

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}