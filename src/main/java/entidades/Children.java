package entidades;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class Children {
	
	private Double layoutX;
	private Double layoutY;
	private Double prefHeight;
	private Double prefWidth;
	
	@XStreamAlias("fx:id") 
	@XStreamAsAttribute 
	private String id;
	

	private List<Object> objetos = new ArrayList<Object>();

	public List<Object> getObjetos() {
		return objetos;
	}

	public void setObjetos(List<Object> objetos) {
		this.objetos = objetos;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	
	
	
}
