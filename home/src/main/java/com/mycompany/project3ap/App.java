package com.mycompany.project3ap;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import java.io.File;
import java.util.List;
import javafx.collections.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.scene.image.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.FileChooser;
import javafx.util.Duration;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class App extends Application {

    private Button bu17_4;
    private Button bu17_5;
    private Button bu17_6;
    
    ///////// Scenes
    Scene CourseScene;
    Scene JavaCourseInfo;
    Scene JavaVedio;
    Scene PythonCourseInfo;
    Scene PythonVedio;
    Scene HtmlCourseInfo;
    Scene HtmlVedio;
    Scene CreateCourseScene;
    Scene NewCourse1;
    Scene NewCourse2;
    Scene NewCourse3;
    Scene NewCourseVid1;
    Scene NewCourseVid2;
    Scene NewCourseVid3;
    Scene Questions1Scene ;

    File filePic;
    File fileVid;
    
    int numCourse = 0; //Number of new courses
    int Score; //to collacte point 
    int g1 =  0,  g2 = 0, sum = 0;
    String s;
    
    private int nowUser;
    String NowPattern="22.png";
    private int IdPlayer; 
    private String ProfilePicture = "22.png";
    private ObservableList<players> player = FXCollections.observableArrayList();
    
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction tx = session.beginTransaction();
    
    @Override
    public void start(Stage stage) {
        
        //scene 1*
	BorderPane root = new BorderPane();
        
	Button bu1 = new Button("LOGIN");
	bu1.setPrefSize(80, 40);
	bu1.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
	HBox hb1 = new HBox(bu1);
	hb1.setPadding(new Insets(200));
	hb1.setAlignment(Pos.CENTER);
		    
	Image image1 = new Image("2_3.png");
	ImageView imageView1 = new ImageView(image1); //Setting the image view 
	imageView1.setFitHeight(640); //setting the fit height and width of the image view
	imageView1.setFitWidth(945);
	imageView1.setPreserveRatio(true);
			
	Circle circle = new Circle(); //Drawing a Circle
	circle.setRadius(70);
	circle.setCenterX(466);
	circle.setCenterY(197);
	circle.setFill(Color.WHITE); //Setting color to the circle
	circle.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.4), 5, 0.0, 0, 4);");
	Image imagep = new Image("22.png");
	ImagePattern pattern = new ImagePattern(imagep,0,0,1,1,true);
	//Setting the image pattern to the circle and text
	circle.setFill(pattern);
	         
	TextField t1 = new TextField();
	PasswordField t2 = new PasswordField();
	t1.setStyle("-fx-background-color: #FFFFFF;-fx-font-family: Comic Sans MS;-fx-font-weight: bold; -fx-font-size: 12px;-fx-text-fill:#DF7373;");
	t2.setStyle("-fx-background-color: #FFFFFF;-fx-font-family: Comic Sans MS;-fx-font-weight: bold; -fx-font-size: 12px;-fx-text-fill:#DF7373;");
	VBox vb1 = new VBox(20,t1,t2);
	vb1.setAlignment(Pos.CENTER);
	vb1.setPadding(new Insets(300,0,0,0));
	t1.setMaxSize(200,150);
	t2.setMaxSize(200,150);
			
	Text tx1 = new Text("User name :");
	tx1.setX(277);
	tx1.setY(315);
	tx1.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,15));
	tx1.setFill(Color.web("#C64159"));
			 
	Text tx2 = new Text("  Password :");
	tx2.setX(277);
	tx2.setY(362);
	tx2.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,15));
	tx2.setFill(Color.web("#C64159"));
			 
	Text tx3 = new Text("Don't have an account ?");
	tx3.setX(370);
	tx3.setY(400);
	tx3.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,10));
	tx3.setFill(Color.web("#C64159"));
			 
	Text tx4 = new Text(" sign up ");
	tx4.setX(490);
	tx4.setY(400);
	tx4.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,10));
	tx4.setFill(Color.web("#004AAD"));
			 
	root.getChildren().add(imageView1);
	root.setBottom(hb1);
	root.setCenter(vb1);
	root.getChildren().addAll(circle,tx1,tx2,tx3,tx4);
	Scene scene = new Scene(root,945,640);
			
			
	//scene 2*
	BorderPane root2 = new BorderPane();
        
	Button ch1= new Button("Choose Picture");
        ch1.setPrefSize(100,90);
        ch1.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Impact; -fx-font-size:12px;-fx-text-fill:#FEFEDA;");
        HBox hb55 = new HBox(ch1);
        hb55.setAlignment(Pos.CENTER);
        hb55.setTranslateX(400);
            
	Button bu1_1=new Button("SAVE");
	bu1_1.setPrefSize(80, 40);
	bu1_1.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
	VBox hb1_1 = new VBox(bu1_1);
	hb1_1.setPadding(new Insets(200));
	hb1_1.setAlignment(Pos.CENTER);
		    
	Circle circle2 = new Circle(); //Drawing a Circle
        circle2.setRadius(70);
	circle2.setCenterX(466);
	circle2.setCenterY(197);
	circle2.setFill(Color.WHITE); //Setting color to the circle
	circle2.setFill(pattern);
	circle2.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.4), 5, 0.0, 0, 4);");
	         
	Image image = new Image("2_3.png");
	ImageView imageView = new ImageView(image); //Setting the image view 
	imageView.setFitHeight(640); //setting the fit height and width of the image view
	imageView.setFitWidth(945);
	imageView.setPreserveRatio(true);
			
	TextField t3 = new TextField();
	PasswordField t4 = new PasswordField();
	TextField t5 =new TextField();
	t3.setStyle("-fx-background-color: #FFFFFF;-fx-font-family: Comic Sans MS;-fx-font-weight: bold; -fx-font-size: 12px;-fx-text-fill:#DF7373;");
	t4.setStyle("-fx-background-color: #FFFFFF;-fx-font-family: Comic Sans MS;-fx-font-weight: bold; -fx-font-size: 12px;-fx-text-fill:#DF7373;");
	t5.setStyle("-fx-background-color: #FFFFFF;-fx-font-family: Comic Sans MS;-fx-font-weight: bold; -fx-font-size: 12px;-fx-text-fill:#DF7373;");
			 
	VBox vb2 = new VBox(20,ch1,t3,t5,t4,bu1_1);
	vb2.setAlignment(Pos.CENTER);
	vb2.setPadding(new Insets(300,0,300,0));
	t3.setMaxSize(200,150);
	t4.setMaxSize(200,150);
	t5.setMaxSize(200,150);

	Text tx5 = new Text("User name :");
	tx5.setX(277);
	tx5.setY(362);
	tx5.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,15));
	tx5.setFill(Color.web("#C64159"));
			 
	Text tx6 = new Text("     Email :");
	tx6.setX(285);
	tx6.setY(407);
	tx6.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,15));
	tx6.setFill(Color.web("#C64159"));
			
	Text tx7 = new Text("  Password :");
	tx7.setX(277);
	tx7.setY(453);
	tx7.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,15));
	tx7.setFill(Color.web("#C64159"));
			 
	root2.getChildren().add(imageView);
	root2.setCenter(vb2);
	root2.getChildren().addAll(circle2,tx5,tx6,tx7);
	Scene scene2 = new Scene(root2,945,640);
                      
        
        //scene 3* - Home Page
            BorderPane root3 = new BorderPane();
			
            Image image3 = new Image("4.png");  
            ImageView imageView3 = new ImageView(image3); //Setting the image view 
            imageView3.setFitHeight(640); //setting the fit height and width of the image view
            imageView3.setFitWidth(945);
            imageView3.setPreserveRatio(true);
            Image image3_3 = new Image("23.png");  
            ImagePattern i1= new ImagePattern (image3_3,0,0,1,1,true);
			
            Button bu2=new Button("?");
            bu2.setPrefSize(60,60);
            bu2.setStyle("-fx-background-radius: 50%; -fx-min-width: 50px; -fx-min-height: 50px;-fx-background-color: #85BAA6;-fx-font-family: Impact; -fx-font-size:20px;-fx-text-fill:#FEFEDA;");
            HBox hb2 = new HBox(20, bu2);
            hb2.setPadding(new Insets(65,25,60,60));
            hb2.setAlignment(Pos.BOTTOM_RIGHT);
		   
            Circle circle3 = new Circle(); //Drawing a Circle
	    circle3.setRadius(10);
	    circle3.setCenterX(30);
            circle3.setCenterY(89);
	    circle3.setFill(Color.WHITE); //Setting color to the circle
	    circle3.setFill(i1);
		    
	    Circle circle3_3 = new Circle(); //Drawing a Circle
	    circle3_3.setRadius(30);
	    circle3_3.setCenterX(90);
            circle3_3.setCenterY(89);
	    circle3_3.setFill(Color.WHITE); //Setting color to the circle
	    circle3_3.setFill(pattern);
	    circle3_3.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.4), 5, 0.0, 0, 4);");
	         
            Image imager3 = new Image("e1 (4).jpg");  
            ImagePattern patternr3 = new ImagePattern(imager3);
            Image imager4 = new Image("e1 (1).jpg");  
            ImagePattern patternr4 = new ImagePattern(imager4);
             
            Rectangle re3=new Rectangle(300,250);
            re3.setX(500);
            re3.setY(200);
            re3.setFill(Color.RED);
            re3.setArcHeight(40);
            re3.setArcWidth(40);
            re3.setFill(patternr3);
            re3.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.4), 5, 0.0, 0, 4);");
            Rectangle re4=new Rectangle(300,250);
            re4.setX(150);
            re4.setY(200);
            re4.setFill(Color.RED);
            re4.setArcHeight(40);
            re4.setArcWidth(40);
            re4.setFill(patternr4);
            re4.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.4), 5, 0.0, 0, 4);");
			
            Text textc=new Text();
            textc.setX(350);
            textc.setY(105);
            textc.setStyle("-fx-font-family: Impact; -fx-font-size:30px;");
            textc.setFill(Color.web("#585A84"));
            textc.setStyle("-fx-font-family: Impact; -fx-font-size:30px;-fx-text-fill:#FEFEDA;");
            
            root3.getChildren().add(imageView3);
            root3.getChildren().addAll(re3,re4);
            root3.setTop(hb2);
            root3.getChildren().addAll(circle3,circle3_3,textc);
            Scene scene3 = new Scene(root3,945,640);
            
            
            //scene 4* - Team Member
            BorderPane root4 = new BorderPane();
			
            Image image4 = new Image("15.png");  
            ImageView imageView4 = new ImageView(image4); //Setting the image view 
            imageView4.setFitHeight(640); //setting the fit height and width of the image view
            imageView4.setFitWidth(945);
            imageView4.setPreserveRatio(true);
			
            Button bu4=new Button("HOME");
            bu4.setPrefSize(80, 40);
            bu4.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
            HBox hb4 = new HBox(20, bu4);
            hb4.setPadding(new Insets(20));
            hb4.setAlignment(Pos.BOTTOM_RIGHT);
			
            root4.getChildren().add(imageView4);
            root4.setBottom(hb4);
            Scene scene4 = new Scene(root4,945,640);
                        
			
            //scene 5* - Profile Page
            BorderPane root5 = new BorderPane();
            
            Button ch2= new Button("Choose Picture");
            ch2.setPrefSize(100,90);
            ch2.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Impact; -fx-font-size:12px;-fx-text-fill:#FEFEDA;");
            HBox hb5 = new HBox( ch2);
            hb5.setAlignment(Pos.CENTER);
            hb5.setTranslateX(400);
            
            Image image5 = new Image("13_14.png");  
            ImageView imageView5 = new ImageView(image5); //Setting the image view 
            imageView5.setFitHeight(640); //setting the fit height and width of the image view
            imageView5.setFitWidth(945);
            imageView5.setPreserveRatio(true);
			
            Button bu5=new Button("BACK");
            bu5.setPrefSize(80, 40);
            bu5.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Impact; -fx-font-size:12px;-fx-text-fill:#FEFEDA;");
		   
            Button bu6=new Button("EDIT");
            bu6.setPrefSize(80, 40);
            bu6.setStyle("-fx-background-color: #D4739C;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
            HBox hb6 = new HBox(20, bu6,bu5,hb5);
            hb6.setPadding(new Insets(65,25,60,60));
            hb6.setAlignment(Pos.BOTTOM_LEFT);
		    
            Circle circle4 = new Circle(); //Drawing a Circle
	    circle4.setRadius(120);
	    circle4.setCenterX(720);
            circle4.setCenterY(320);
	    circle4.setFill(Color.WHITE); //Setting color to the circle
	    circle4.setFill(pattern);
	    circle4.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.4), 5, 0.0, 0, 4);");
	         
	    TextField t33 =new TextField();
	    PasswordField t44 = new PasswordField();
	    TextField t55 =new TextField();
            t33.setStyle("-fx-background-color: #FFFFFF;-fx-font-family: Comic Sans MS;-fx-font-weight: bold; -fx-font-size: 12px;-fx-text-fill:#DF7373;");
            t44.setStyle("-fx-background-color: #FFFFFF;-fx-font-family: Comic Sans MS;-fx-font-weight: bold; -fx-font-size: 12px;-fx-text-fill:#DF7373;");
            t55.setStyle("-fx-background-color: #FFFFFF;-fx-font-family: Comic Sans MS;-fx-font-weight: bold; -fx-font-size: 12px;-fx-text-fill:#DF7373;");
			
            VBox vb22 = new VBox(20,t33,t55,t44,hb6);
            vb22.setAlignment(Pos.CENTER);
            vb22.setPadding(new Insets(270,0,300,0));
            t33.setMaxSize(200,150);
            t44.setMaxSize(200,150);
            t55.setMaxSize(200,150);

            Text tx55 = new Text("User name :");
            tx55.setX(277);
            tx55.setY(290);
            tx55.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,15));
            tx55.setFill(Color.web("#C64159"));
			 
            Text tx66 = new Text("     Email :");
            tx66.setX(285);
            tx66.setY(337);
            tx66.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,15));
            tx66.setFill(Color.web("#C64159"));
			
            Text tx77 = new Text("  Password :");
            tx77.setX(277);
            tx77.setY(389);
            tx77.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,15));
            tx77.setFill(Color.web("#C64159"));
			 
            t1.textProperty().addListener((observable, oldValue, newValue) -> {
		t33.setText(newValue);
            });

            t2.textProperty().addListener((observable, oldValue, newValue) -> {
		t44.setText(newValue);
            });
            
            t5.textProperty().addListener((observable, oldValue, newValue) -> {
		t55.setText(newValue);
            });
				
            root5.getChildren().addAll(imageView5,circle4);
            root5.setCenter(vb22);
            root5.getChildren().addAll(tx55,tx66,tx77);
            Scene scene5 = new Scene(root5,945,640);
        
        
        //------------------------------------------------------------
        
        tx4.setOnMouseClicked(e->{
            circle2.setFill(pattern);
            stage.setScene(scene2); //sign up page
	});
                        
	bu1.setOnAction( e -> { //click login
            
            String firstValue = t1.getText();
            String thValue = t2.getText();
            boolean validUser = false;
            
            //retrive list 
            session = HibernateUtil.getSessionFactory().openSession(); 
            List<players> pList = null; 
            String queryStr = "from players"; 
            Query query = session.createQuery(queryStr); 
            pList = query.list(); 
            session.close(); 
            System.out.println("List size: "+pList.size());
            
            if(firstValue.isEmpty() || thValue.isEmpty() || pList.isEmpty()) {
		Alert a = new Alert(AlertType.ERROR);
		a.setTitle("ERORR!!");
		a.setHeaderText("You are not logged in \n or there is an error in your data");
		a.showAndWait();
            }
            else {
                for(players p: pList) { 
                    System.out.println(p.getPlayerName());
                    if(firstValue.equals(p.getPlayerName()) && thValue.equals(p.getPassword())) { 
                        validUser=true; 
                        nowUser=pList.indexOf(p);
                        circle3_3.setFill(new ImagePattern(new Image(p.getProfilePicture())));
                    }
                    if(validUser==true) { 
                        stage.setScene(scene3);
                    }
                    else {
                        if(pList.size()-1==pList.indexOf(p)){
                            Alert a = new Alert(AlertType.ERROR);
                            a.setTitle("ERORR!!");
                            a.setHeaderText("You are not logged in \n or there is an error in your data");
                            a.showAndWait();
                        }
                    }
                }
            }
        });
                        
        bu1_1.setOnAction( e -> { //save sign up
            
            //retrive list 
            session = HibernateUtil.getSessionFactory().openSession(); 
            List<players> pList = null; 
            String queryStr = "from players"; 
            Query query = session.createQuery(queryStr); 
            pList = query.list(); 
            session.close(); 
            System.out.println("List size: "+pList.size());
            if(pList.isEmpty()){IdPlayer=1;}
            else{ IdPlayer = pList.get(pList.size()-1).getId()+1; }
                
            String firstValue = t3.getText();
            String secondValue = t4.getText();
            String thValue = t5.getText();
		         
            if(firstValue.isEmpty() || secondValue.isEmpty() || thValue.isEmpty()) {
		Alert a=new Alert(AlertType.ERROR);
		a.setTitle("ERORR!!");
		a.setHeaderText("All fields must be filled out !!");
		a.showAndWait();
            }
            else {
                player.add(new players(IdPlayer,t3.getText(),t5.getText(),t4.getText(),ProfilePicture));
                IdPlayer++;
                int index = player.size()-1;
                               
                session = HibernateUtil.getSessionFactory().openSession();
                tx = session.beginTransaction();
                session.save(player.get(index));
                tx.commit();
                session.close();
                System.out.println("inserted player: "+t3.getText());
		t3.getText();
		t4.getText();
                
		stage.setScene(scene);
                t3.setText("");
                t5.setText("");
                t4.setText("");
                ProfilePicture = "22.png";
            }		
	});
        
        //Settings scene
	circle3.setOnMouseClicked( e -> {
            //retrive list 
            session = HibernateUtil.getSessionFactory().openSession(); 
            List<players> pList = null; 
            String queryStr = "from players"; 
            Query query = session.createQuery(queryStr); 
            pList = query.list(); 
            session.close(); 
            System.out.println("List size: "+pList.size());
            
            t33.setText(pList.get(nowUser).getPlayerName());
            t55.setText(pList.get(nowUser).getEmail());
            t44.setText(pList.get(nowUser).getPassword());
            circle4.setFill(new ImagePattern(new Image(pList.get(nowUser).getProfilePicture())));
            stage.setScene(scene5);
	});
                         
        ch1.setOnAction(e -> { //click picture sign up
            FileChooser fileChooser = new FileChooser();
            fileChooser.getExtensionFilters().addAll(
            new FileChooser.ExtensionFilter("All Images", "."),
            new FileChooser.ExtensionFilter("JPG", "*.jpg"),
            new FileChooser.ExtensionFilter("PNG", "*.png"));
            
            File file = fileChooser.showOpenDialog(null);
            if (file != null) {
                String link = file.toURI().toString();
                ProfilePicture = link;
		Image image2 = new Image(link);
		ImagePattern pattern1 = new ImagePattern(image2);
		circle2.setFill(pattern1);
            }
	});
        
        bu2.setOnAction( e -> { 
            stage.setScene(scene4);
	});
        
        bu4.setOnAction( e -> { 
            sum = g1 + g2 + Score ;
            s = Integer.toString(sum);
            textc.setText(s);
                            
            stage.setScene(scene3);
	});
        
        re3.setOnMouseClicked( e -> {
           
	});
        
        ch2.setOnAction(e -> { //click profile picture
            FileChooser fileChooser = new FileChooser();
		            
            fileChooser.getExtensionFilters().addAll(
            new FileChooser.ExtensionFilter("All Images", "."),
            new FileChooser.ExtensionFilter("JPG", "*.jpg"),
            new FileChooser.ExtensionFilter("PNG", "*.png"));
		            
            File file = fileChooser.showOpenDialog(null);
            if (file != null) { 
                String link = file.toURI().toString();
		Image image2 = new Image(link);
		ImagePattern pattern1 = new ImagePattern(image2);
		circle4.setFill(pattern1);
                NowPattern=pattern1.getImage().getUrl();
            }
	});
        
        bu5.setOnAction( e -> { //profile back 
            sum = g1 + g2 + Score ;
            s = Integer.toString(sum);
            textc.setText(s);
            stage.setScene(scene3);
	});
                        
	bu6.setOnAction( e -> { //edit
            sum = g1 + g2 + Score ;
            s = Integer.toString(sum);
            textc.setText(s);
            
            if(t33.getText().isEmpty() || t44.getText().isEmpty() || t55.getText().isEmpty()) {
		Alert a = new Alert(AlertType.ERROR);
		a.setTitle("ERORR!!");
		a.setHeaderText("You are not logged in \n or there is an error in your data");
		a.showAndWait();
            }
            else {
                session = HibernateUtil.getSessionFactory().openSession(); 
                tx = session.beginTransaction(); 
                players Supdate = null; 
                int sid=nowUser+1; 
                Supdate = (players)session.get(players.class, sid); 
                Supdate.setPlayerName(t33.getText()); 
                Supdate.setEmail(t55.getText());
                Supdate.setPassword(t44.getText()); 
                Supdate.setProfilePicture(NowPattern); 
                session.update(Supdate); 
                tx.commit(); 
                session.close(); 
                System.out.println("Student "+ sid +" was updated by: "+Supdate.getPlayerName());
                
                stage.setScene(scene3);
            }
        });
                        
        stage.setScene(scene);
        stage.show();
        
    }

    public static void main(String[] args) {
        launch();
    }

}