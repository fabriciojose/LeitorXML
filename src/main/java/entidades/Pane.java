package entidades;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAnyAttribute;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;


public class Pane  {
	
	private Double layoutX;
	private Double layoutY;
	private Double prefHeight;
	private Double prefWidth;

	@XStreamAsAttribute 
	@XStreamAlias("fx:id") 
	private String id;
	
	private List <Children> childrens = new ArrayList<Children>();
	
	public Pane () {
		
	}

	public Pane (Double layoutX ,Double layoutY , Double prefHeight, Double prefWidth) {
		
		this.layoutX = layoutX;
		this.layoutY = layoutY;
		this.prefHeight = prefHeight;
		this.prefWidth = prefWidth;
		
	}

	public Double getLayoutX() {
		return layoutX;
	}

	public void setLayoutX(Double layoutX) {
		this.layoutX = layoutX;
	}

	public Double getLayoutY() {
		return layoutY;
	}

	public void setLayoutY(Double layoutY) {
		this.layoutY = layoutY;
	}

	public Double getPrefHeight() {
		return prefHeight;
	}

	public void setPrefHeight(Double prefHeight) {
		this.prefHeight = prefHeight;
	}

	public Double getPrefWidth() {
		return prefWidth;
	}

	public void setPrefWidth(Double prefWidth) {
		this.prefWidth = prefWidth;
	}

	public List<Children> getChildrens() {
		return childrens;
	}

	public void setChildrens(List<Children> childrens) {
		this.childrens = childrens;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

}
	