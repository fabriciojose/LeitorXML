package principal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.thoughtworks.xstream.XStream;

import entidades.Button;
import entidades.Children;
import entidades.ComboBox;
import entidades.DatePicker;
import entidades.Label;
import entidades.Pane;
import entidades.TableColumn;
import entidades.TableView;
import entidades.TextField;

public class Main {


	public static void main(String[] args) throws FileNotFoundException {
		
		
		// tabEndereco C:\Users\fabricio.barrozo\eclipse-workspace\adasa\src\main\resources\fxml\principal\tempTabEndereco.fxml
		
		// tela demanda C:\Users\fabricio.barrozo\eclipse-workspace\adasa\src\main\resources\fxml\principal\tempTelaDemanda.fxml
		
		// INTERFERENCIA C:\Users\fabricio.barrozo\eclipse-workspace\adasa\src\main\resources\fxml\principal\tempInteferencia.fxml
		
		// SUBTERRANEA C:\Users\fabricio.barrozo\eclipse-workspace\adasa\src\main\resources\fxml\principal\tempSubterranea.fxml
		
		// SUPERFICIAL C:\Users\fabricio.barrozo\eclipse-workspace\adasa\src\main\resources\fxml\principal\tempSuperficial.fxml
		
		
			File  file = new File("C:\\Users\\fabricio.barrozo\\eclipse-workspace\\adasa\\src\\main\\resources\\fxml\\principal\\tempInteferencia.fxml");
			FileReader fileReader = new FileReader(file);
	        
			XStream xstream = new XStream();
			xstream.ignoreUnknownElements();
			 
		   // Pane pane = new Pane(12.2, 13.23, 14.2, 15.4);
		    
		    xstream.alias("Pane", Pane.class);
		    
		    xstream.alias("children", Children.class);
		    	xstream.alias("Button", Button.class);
		    	xstream.alias("TextField", TextField.class);
		    	xstream.alias("Label", Label.class);
		    	xstream.alias("ComboBox", ComboBox.class);
		    	xstream.alias("DatePicker", DatePicker.class);
		    	xstream.alias("TableView", TableView.class);
		    	xstream.alias("TableColumn", TableColumn.class);
		    
		  
		    	
		    String whxy [] = {"layoutX", "layoutY", "prefHeight", "prefWidth"};
		    
		    xstream.useAttributeFor(Pane.class, "id");
	    	xstream.aliasField("Pane", Pane.class,"fx:id");
	    	
		    
		    for (int i = 0; i < whxy.length; i++  ) {
		    	
		    	xstream.useAttributeFor(Pane.class, whxy[i]);
		    	xstream.aliasField("Pane", Pane.class,whxy[i]);
		    	
		    	xstream.useAttributeFor(Children.class, whxy[i]);
		    	xstream.aliasField("children", Children.class,whxy[i]);
		    
		    	
		    }
		  
		    xstream.addImplicitCollection(Pane.class, "childrens");
		    xstream.addImplicitCollection(Children.class, "objetos"); 
		    
		   // String xml = xstream.toXML(pane);
		 
		   // System.out.println(xml);
		    
		    Pane p = (Pane) xstream.fromXML(fileReader);
		    
		    System.out.println("pane");
		    
		    System.out.println(p.getPrefWidth() + "," + p.getPrefHeight() + "," + p.getLayoutX() + "," + p.getLayoutY());
		    
		    List<Children> chList = p.getChildrens();
		    
		    for (int i = 0; i<chList.size(); i++) 
		   
		    for (Object o : chList.get(i).getObjetos()) {
		    
		    	System.out.println("objetos");
		 	   
		    	switch ( o.getClass().getName()) {
		    	
					case "entidades.Button":
						//System.out.println("-      Button      -");
						System.out.println("{" 
								+ ((Button) o).getPrefWidth() + "," + ((Button) o).getPrefHeight()
								+ "," + ((Button) o).getLayoutX() + "," + ((Button) o).getLayoutY()
								+ "},"
								);
						break;
						
					case "entidades.TextField":
						//System.out.println("--- TextField ");
						System.out.println("{" 
								+ ((TextField) o).getPrefWidth() + "," + ((TextField) o).getPrefHeight()
								+ "," + ((TextField) o).getLayoutX() + "," + ((TextField) o).getLayoutY()
								+ "},"
								);
						break;
						
					case "entidades.Label":
						//System.out.println("--- Label ");
						System.out.println("{" 
								+ ((Label) o).getPrefWidth() + "," + ((Label) o).getPrefHeight()
								+ "," + ((Label) o).getLayoutX() + "," + ((Label) o).getLayoutY()
								+ "},"
								);
						break;
						
					case "entidades.ComboBox":
						//System.out.println("--- ComboBox ");
						System.out.println("{" 
								+ ((ComboBox) o).getPrefWidth() + "," + ((ComboBox) o).getPrefHeight()
								+ "," + ((ComboBox) o).getLayoutX() + "," + ((ComboBox) o).getLayoutY()
								+ "},"
								);
						break;	
						
					case "entidades.DatePicker":
						//System.out.println("--- DatePicker ");
						System.out.println("{" 
								+ ((DatePicker) o).getPrefWidth() + "," + ((DatePicker) o).getPrefHeight()
								+ "," + ((DatePicker) o).getLayoutX() + "," + ((DatePicker) o).getLayoutY()
								+ "},"
								);
						break;	
						
					case "entidades.TableView":
						System.out.println("--- TableView --");
						System.out.println("{" 
								+ ((TableView) o).getPrefWidth() + "," + ((TableView) o).getPrefHeight()
								+ "," + ((TableView) o).getLayoutX() + "," + ((TableView) o).getLayoutY()
								+ "},"
								);
						break;	
					
					case "entidades.Pane":
						
						System.out.println(" Pane Secundario ");
						
						System.out.println("{" 
								+ ((Pane) o).getPrefWidth() + "," + ((Pane) o).getPrefHeight()
								+ "," + ((Pane) o).getLayoutX() + "," + ((Pane) o).getLayoutY()
								
								+ "},"
								);
					
								/* --------------------
								 	* 					-------------------- */
						
							for (Object oo : ((Pane) o).getChildrens().get(0).getObjetos()){
								
								//System.out.println("nome do objeto +-------------------------- " + oo.getClass().getName());
								
								switch (oo.getClass().getName()) {
							
										case "entidades.Button":
											//System.out.println("-      Button      -");
											System.out.println("{" 
													+ ((Button) oo).getPrefWidth() + "," + ((Button) oo).getPrefHeight()
													+ "," + ((Button) oo).getLayoutX() + "," + ((Button) oo).getLayoutY()
													+ "},"
													);
											break;
											
										case "entidades.TextField":
											//System.out.println("--- TextField ");
											System.out.println("{" 
													+ ((TextField) oo).getPrefWidth() + "," + ((TextField) oo).getPrefHeight()
													+ "," + ((TextField) oo).getLayoutX() + "," + ((TextField) oo).getLayoutY()
													+ "},"
													);
											break;
											
										case "entidades.Label":
											//System.out.println("--- Label ");
											System.out.println("{" 
													+ ((Label) oo).getPrefWidth() + "," + ((Label) oo).getPrefHeight()
													+ "," + ((Label) oo).getLayoutX() + "," + ((Label) oo).getLayoutY()
													+ "},"
													);
											break;
											
										case "entidades.ComboBox":
											//System.out.println("--- ComboBox ");
											System.out.println("{" 
													+ ((ComboBox) oo).getPrefWidth() + "," + ((ComboBox) oo).getPrefHeight()
													+ "," + ((ComboBox) oo).getLayoutX() + "," + ((ComboBox) oo).getLayoutY()
													+ "},"
													);
											break;	
											
										case "entidades.DatePicker":
											//System.out.println("--- DatePicker ");
											System.out.println("{" 
													+ ((DatePicker) oo).getPrefWidth() + "," + ((DatePicker) oo).getPrefHeight()
													+ "," + ((DatePicker) oo).getLayoutX() + "," + ((DatePicker) oo).getLayoutY()
													+ "},"
													);
											break;	
									
							
										case "entidades.Pane":
												System.out.println("Outros Panes");
												
												System.out.println("{" 
														+ ((Pane) oo).getPrefWidth() + "," + ((Pane) oo).getPrefHeight()
														+ "," + ((Pane) oo).getLayoutX() + "," + ((Pane) oo).getLayoutY()
													
														+ "},"
														);
												
												for (Object ooo : ((Pane) oo).getChildrens().get(0).getObjetos()){
													
													//System.out.println("nome do objeto +-------------------------- " + oo.getClass().getName());
										
													
													switch (ooo.getClass().getName()) {
												
													case "entidades.Button":
														//System.out.println("-      Button      -");
														System.out.println("{" 
																+ ((Button) ooo).getPrefWidth() + "," + ((Button) ooo).getPrefHeight()
																+ "," + ((Button) ooo).getLayoutX() + "," + ((Button) ooo).getLayoutY()
																+ "},"
																);
														break;
														
													case "entidades.TextField":
														//System.out.println("--- TextField ");
														System.out.println("{" 
																+ ((TextField) ooo).getPrefWidth() + "," + ((TextField) ooo).getPrefHeight()
																+ "," + ((TextField) ooo).getLayoutX() + "," + ((TextField) ooo).getLayoutY()
																+ "},"
																);
														break;
														
													case "entidades.Label":
														//System.out.println("--- Label ");
														System.out.println("{" 
																+ ((Label) ooo).getPrefWidth() + "," + ((Label) ooo).getPrefHeight()
																+ "," + ((Label) ooo).getLayoutX() + "," + ((Label) ooo).getLayoutY()
																+ "},"
																);
														break;
														
													case "entidades.ComboBox":
														//System.out.println("--- ComboBox ");
														System.out.println("{" 
																+ ((ComboBox) ooo).getPrefWidth() + "," + ((ComboBox) ooo).getPrefHeight()
																+ "," + ((ComboBox) ooo).getLayoutX() + "," + ((ComboBox) ooo).getLayoutY()
																+ "},"
																);
														break;	
														
													case "entidades.DatePicker":
														//System.out.println("--- DatePicker ");
														System.out.println("{" 
																+ ((DatePicker) ooo).getPrefWidth() + "," + ((DatePicker) ooo).getPrefHeight()
																+ "," + ((DatePicker) ooo).getLayoutX() + "," + ((DatePicker) ooo).getLayoutY()
																+ "},"
																);
														break;	
														
														
													case "entidades.TableView":
														System.out.println("--- TableView --");
														System.out.println("{" 
																+ ((TableView) ooo).getPrefWidth() + "," + ((TableView) ooo).getPrefHeight()
																+ "," + ((TableView) ooo).getLayoutX() + "," + ((TableView) ooo).getLayoutY()
																+ "},"
																);
														break;	
														
														
														
														
														
													
													default:
													break;
													}}
								
						

							default:
							break;
						}
						
					} /* fim switch oo */
					
					break;	


				default:
					
					break;
					
				} // fim switch
		    	
		    	
		    	
		    } // fim loop for - imprimir width heigh layout x y
		  
		    
		} // fim main
		
		
	
}
