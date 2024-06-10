package com.mycompany.project2ap;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.scene.image.*;
import javafx.animation.*;
import javafx.util.Duration;

public class App extends Application {

    @Override
    public void start(Stage stage) {

        //colors
        Color color1 = Color.rgb(219, 246, 148, 1);

        //-------------------------------------------------------
        // root - Scene Animation
        Pane IntroPage = new Pane();
        Scene scene0 = new Scene(IntroPage, 945, 640);
        scene0.setFill(Color.WHITE);
        // Scene 1 - Sign up
        Pane Page1 = new Pane();
        Scene scene1 = new Scene(Page1, 945, 640);
        //-------------------------------------------------------

        //the letters
        Image imgT = new Image("T.png");
        ImageView imgViewT = new ImageView(imgT);
        Image imgOO = new Image("OO.png");
        ImageView imgViewOO = new ImageView(imgOO);
        Image imgN = new Image("N.png");
        ImageView imgViewN = new ImageView(imgN);

        //bird
        Image imgBird = new Image("bird.png");
        ImageView imgViewBird = new ImageView(imgBird);
        imgViewBird.setFitWidth(728);
        imgViewBird.setFitHeight(719);
        imgViewBird.setRotate(11);

        //stars
        Image imgStar1 = new Image("WhiteStar1.png");
        ImageView imgViewStar1 = new ImageView(imgStar1);
        imgViewStar1.setX(300);
        imgViewStar1.setY(80);

        Image imgStar2 = new Image("WhiteStar1.png");
        ImageView imgViewStar2 = new ImageView(imgStar2);
        imgViewStar2.setX(500);
        imgViewStar2.setY(60);

        Image imgStar3 = new Image("WhiteStar1.png");
        ImageView imgViewStar3 = new ImageView(imgStar3);
        imgViewStar3.setX(750);
        imgViewStar3.setY(130);

        Image imgStar4 = new Image("WhiteStar1.png");
        ImageView imgViewStar4 = new ImageView(imgStar4);
        imgViewStar4.setX(840);
        imgViewStar4.setY(240);

        Image imgStar5 = new Image("WhiteStar1.png");
        ImageView imgViewStar5 = new ImageView(imgStar5);
        imgViewStar5.setX(790);
        imgViewStar5.setY(450);

        Image imgStar6 = new Image("WhiteStar1.png");
        ImageView imgViewStar6 = new ImageView(imgStar6);
        imgViewStar6.setX(650);
        imgViewStar6.setY(490);

        Text text1 = new Text("HAVE");
        text1.setFill(Color.WHITE);
        text1.setOpacity(0.9);
        text1.setFont(Font.font("Lovelo Black", FontWeight.BOLD, FontPosture.REGULAR, 70));

        Text text2 = new Text("FUN & LEARN");
        text2.setFill(Color.WHITE);
        text2.setOpacity(0.9);
        text2.setFont(Font.font("Lovelo Black", FontWeight.BOLD, FontPosture.REGULAR, 70));

        Text text3 = new Text("AT THE SAME TIME");
        text3.setFill(Color.GREY);
        text3.setOpacity(0.8);
        text3.setFont(Font.font("Lovelo Black", FontWeight.BOLD, FontPosture.REGULAR, 57));

        Timeline time1 = new Timeline();

        //Animation "Toon"
        time1.getKeyFrames().add(new KeyFrame(
            Duration.seconds(0.95),
            e -> {
                IntroPage.getChildren().addAll(imgViewT);
                imgViewT.setX(60);
                imgViewT.setY(35);
                imgViewT.setFitWidth(750);
                imgViewT.setFitHeight(650);

                ScaleTransition scale1 = new ScaleTransition();
                scale1.setNode(imgViewT);
                scale1.setDuration(Duration.millis(150));
                scale1.setAutoReverse(true);
                scale1.setCycleCount(2);
                scale1.setByX(0.4);
                scale1.setByY(0.4);
                scale1.play();
            }
        ));

        time1.getKeyFrames().add(new KeyFrame(
            Duration.seconds(1.5),
            e -> {
                IntroPage.getChildren().addAll(imgViewOO);
                imgViewOO.setX(25.5);
                imgViewOO.setY(-20);
                imgViewOO.setFitWidth(860);
                imgViewOO.setFitHeight(740);

                ScaleTransition scale1 = new ScaleTransition();
                scale1.setNode(imgViewOO);
                scale1.setDuration(Duration.millis(160));
                scale1.setAutoReverse(true);
                scale1.setCycleCount(2);
                scale1.setByX(0.4);
                scale1.setByY(0.4);
                scale1.play();
            }
        ));

        time1.getKeyFrames().add(new KeyFrame(
            Duration.seconds(1.8),
            e -> {
                IntroPage.getChildren().addAll(imgViewN);
                imgViewN.setX(30);
                imgViewN.setY(60);
                imgViewN.setFitWidth(850);
                imgViewN.setFitHeight(600);

                ScaleTransition scale1 = new ScaleTransition();
                scale1.setNode(imgViewN);
                scale1.setDuration(Duration.millis(150));
                scale1.setAutoReverse(true);
                scale1.setCycleCount(2);
                scale1.setByX(0.4);
                scale1.setByY(0.4);
                scale1.play();
            }
        ));

        time1.getKeyFrames().add(new KeyFrame(
            Duration.seconds(3),
            e -> {
                ScaleTransition scale1 = new ScaleTransition();
                scale1.setNode(imgViewT);
                scale1.setDuration(Duration.millis(100));
                scale1.setAutoReverse(true);
                scale1.setCycleCount(2);
                scale1.setByX(0.4);
                scale1.setByY(0.4);
                scale1.play();
            }
        ));

        time1.getKeyFrames().add(new KeyFrame(
            Duration.seconds(3.1),
            e -> {
                ScaleTransition scale1 = new ScaleTransition();
                scale1.setNode(imgViewOO);
                scale1.setDuration(Duration.millis(100));
                scale1.setAutoReverse(true);
                scale1.setCycleCount(2);
                scale1.setByX(0.4);
                scale1.setByY(0.4);
                scale1.play();
            }
        ));

        time1.getKeyFrames().add(new KeyFrame(
            Duration.seconds(3.2),
            e -> {
                ScaleTransition scale1 = new ScaleTransition();
                scale1.setNode(imgViewN);
                scale1.setDuration(Duration.millis(100));
                scale1.setAutoReverse(true);
                scale1.setCycleCount(2);
                scale1.setByX(0.4);
                scale1.setByY(0.4);
                scale1.play();
            }
        ));

        time1.getKeyFrames().add(new KeyFrame(
            Duration.seconds(3.2),
            e -> {
                ScaleTransition scale1 = new ScaleTransition();
                scale1.setNode(imgViewT);
                scale1.setDuration(Duration.millis(70));
                scale1.setByX(-0.9999999999);
                scale1.setByY(-0.9999999999);
                scale1.play();
            }
        ));

        time1.getKeyFrames().add(new KeyFrame(
            Duration.seconds(3.3),
            e -> {
                ScaleTransition scale1 = new ScaleTransition();
                scale1.setNode(imgViewOO);
                scale1.setDuration(Duration.millis(70));
                scale1.setByX(-0.9999999999);
                scale1.setByY(-0.9999999999);
                scale1.play();
            }
        ));

        time1.getKeyFrames().add(new KeyFrame(
            Duration.seconds(3.4),
            e -> {
                ScaleTransition scale1 = new ScaleTransition();
                scale1.setNode(imgViewN);
                scale1.setDuration(Duration.millis(70));
                scale1.setByX(-0.9999999999);
                scale1.setByY(-0.9999999999);
                scale1.play();
            }
        ));

        time1.getKeyFrames().add(new KeyFrame(
            Duration.seconds(3.42),
            e -> {
                IntroPage.getChildren().removeAll(imgViewT, imgViewOO, imgViewN);
            }
        ));

        //Animation "HAVE FUN & LEARN AT THE SAME TIME" + Bird + Stars
        time1.getKeyFrames().add(new KeyFrame(
            Duration.seconds(3.63),
            e -> {
                IntroPage.setBackground(Background.fill(color1));
            }
        ));

        time1.getKeyFrames().add(new KeyFrame(
            Duration.seconds(4),
            e -> {
                IntroPage.getChildren().addAll(imgViewBird);

                TranslateTransition translate1 = new TranslateTransition();
                translate1.setNode(imgViewBird);
                translate1.setDuration(Duration.millis(980));
                imgViewBird.setX(-445);
                imgViewBird.setY(292);
                translate1.setToX(260);//-170
                translate1.setToY(-260);//32
                translate1.play();
            }
        ));

        time1.getKeyFrames().add(new KeyFrame(
            Duration.seconds(4.2),
            e -> {
                IntroPage.getChildren().addAll(imgViewStar1, imgViewStar2, imgViewStar3);
                imgViewStar1.setFitWidth(10);
                imgViewStar1.setFitHeight(10);
                imgViewStar2.setFitWidth(5);
                imgViewStar2.setFitHeight(5);
                imgViewStar3.setFitWidth(5);
                imgViewStar3.setFitHeight(5);

                ScaleTransition scale1 = new ScaleTransition();
                scale1.setNode(imgViewStar1);
                scale1.setDuration(Duration.millis(700));
                scale1.setAutoReverse(true);
                scale1.setCycleCount(100);
                scale1.setByX(1.6);
                scale1.setByY(1.6);
                scale1.play();

                ScaleTransition scale2 = new ScaleTransition();
                scale2.setNode(imgViewStar2);
                scale2.setDuration(Duration.millis(700));
                scale2.setAutoReverse(true);
                scale2.setCycleCount(100);
                scale2.setByX(1.6);
                scale2.setByY(1.6);
                scale2.play();

                ScaleTransition scale3 = new ScaleTransition();
                scale3.setNode(imgViewStar3);
                scale3.setDuration(Duration.millis(700));
                scale3.setAutoReverse(true);
                scale3.setCycleCount(100);
                scale3.setByX(1.5);
                scale3.setByY(1.5);
                scale3.play();
            }
        ));

        time1.getKeyFrames().add(new KeyFrame(
            Duration.seconds(4.3),
            e -> {
                IntroPage.getChildren().addAll(text1);
                text1.setX(415);
                text1.setY(197);

                FadeTransition fade1 = new FadeTransition();
                fade1.setNode(text1);
                fade1.setDuration(Duration.millis(2000));
                fade1.setFromValue(0);
                fade1.setToValue(1);

                TranslateTransition translate1 = new TranslateTransition();
                translate1.setNode(text1);
                translate1.setDuration(Duration.millis(1200));
                translate1.setToX(-30);

                ParallelTransition parallel = new ParallelTransition(fade1, translate1);
                parallel.play();
            }
        ));

        time1.getKeyFrames().add(new KeyFrame(
            Duration.seconds(4.38),
            e -> {
                IntroPage.getChildren().addAll(text2, imgViewStar4);
                imgViewStar4.setFitWidth(12);
                imgViewStar4.setFitHeight(12);
                text2.setX(355);
                text2.setY(270);

                FadeTransition fade1 = new FadeTransition();
                fade1.setNode(text2);
                fade1.setDuration(Duration.millis(2000));
                fade1.setFromValue(0);
                fade1.setToValue(1);

                TranslateTransition translate1 = new TranslateTransition();
                translate1.setNode(text2);
                translate1.setDuration(Duration.millis(1250));
                translate1.setToX(30);

                ScaleTransition scale1 = new ScaleTransition();
                scale1.setNode(imgViewStar4);
                scale1.setDuration(Duration.millis(700));
                scale1.setAutoReverse(true);
                scale1.setCycleCount(100);
                scale1.setByX(1.5);
                scale1.setByY(1.5);

                ParallelTransition parallel = new ParallelTransition(fade1, translate1, scale1);
                parallel.play();
            }
        ));

        time1.getKeyFrames().add(new KeyFrame(
            Duration.seconds(4.4),
            e -> {
                IntroPage.getChildren().addAll(text3, imgViewStar5, imgViewStar6);
                imgViewStar5.setFitWidth(6);
                imgViewStar5.setFitHeight(6);
                imgViewStar6.setFitWidth(6);
                imgViewStar6.setFitHeight(6);
                text3.setX(425);
                text3.setY(340);

                FadeTransition fade1 = new FadeTransition();
                fade1.setNode(text3);
                fade1.setDuration(Duration.millis(2000));
                fade1.setFromValue(0);
                fade1.setToValue(1);

                TranslateTransition translate1 = new TranslateTransition();
                translate1.setNode(text3);
                translate1.setDuration(Duration.millis(1200));
                translate1.setToX(-40);

                ScaleTransition scale1 = new ScaleTransition();
                scale1.setNode(imgViewStar5);
                scale1.setDuration(Duration.millis(700));
                scale1.setAutoReverse(true);
                scale1.setCycleCount(100);
                scale1.setByX(1.5);
                scale1.setByY(1.5);

                ScaleTransition scale2 = new ScaleTransition();
                scale2.setNode(imgViewStar6);
                scale2.setDuration(Duration.millis(700));
                scale2.setAutoReverse(true);
                scale2.setCycleCount(100);
                scale2.setByX(1.9);
                scale2.setByY(1.9);

                ParallelTransition parallel = new ParallelTransition(fade1, translate1, scale1, scale2);
                parallel.play();
            }
        ));

        time1.getKeyFrames().add(new KeyFrame(
            Duration.seconds(8),
            e -> {
                FadeTransition fade1 = new FadeTransition();
                fade1.setNode(text1);
                fade1.setDuration(Duration.millis(1000));
                fade1.setFromValue(1);
                fade1.setToValue(0);

                TranslateTransition translate1 = new TranslateTransition();
                translate1.setNode(text1);
                translate1.setDuration(Duration.millis(1200));
                translate1.setToX(30);

                ParallelTransition parallel = new ParallelTransition(fade1, translate1);
                parallel.play();
            }
        ));

        time1.getKeyFrames().add(new KeyFrame(
            Duration.seconds(8.09),
            e -> {
                FadeTransition fade1 = new FadeTransition();
                fade1.setNode(text2);
                fade1.setDuration(Duration.millis(1000));
                fade1.setFromValue(1);
                fade1.setToValue(0);

                TranslateTransition translate1 = new TranslateTransition();
                translate1.setNode(text2);
                translate1.setDuration(Duration.millis(1250));
                translate1.setToX(-30);

                ParallelTransition parallel = new ParallelTransition(fade1, translate1);
                parallel.play();
            }
        ));

        time1.getKeyFrames().add(new KeyFrame(
            Duration.seconds(8.14),
            e -> {
                FadeTransition fade1 = new FadeTransition();
                fade1.setNode(text3);
                fade1.setDuration(Duration.millis(1000));
                fade1.setFromValue(1);
                fade1.setToValue(0);

                TranslateTransition translate1 = new TranslateTransition();
                translate1.setNode(text3);
                translate1.setDuration(Duration.millis(1200));
                translate1.setToX(40);

                ParallelTransition parallel = new ParallelTransition(fade1, translate1);
                parallel.play();
            }
        ));

        time1.getKeyFrames().add(new KeyFrame(
            Duration.seconds(8.2),
            e -> {
                TranslateTransition translate1 = new TranslateTransition();
                translate1.setNode(imgViewBird);
                translate1.setDuration(Duration.millis(1500));
                translate1.setToX(-445);
                translate1.setToY(292);
                translate1.play();
            }
        ));

        time1.getKeyFrames().add(new KeyFrame(
            Duration.seconds(8.35),
            e -> {
                IntroPage.getChildren().removeAll(imgViewStar1, imgViewStar2, imgViewStar3, imgViewStar4, imgViewStar5, imgViewStar6);
            }
        ));

        //show the next scene + stop animation time
        time1.getKeyFrames().add(new KeyFrame(
            Duration.seconds(10),
            e -> {
                stage.setScene(scene1);
                //time1.stop();
            }
        ));

        time1.play();

        //-------------------------------------------------------
        stage.setTitle("TOON");
        stage.setScene(scene0);
        stage.show();
        //-------------------------------------------------------

    }

    public static void main(String[] args) {
        launch();
    }

}