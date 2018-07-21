/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPL;

import java.io.InputStream;
import javax.swing.JLabel;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author Sompod_Programmer
 */
public class RunClass {

    int check = 0;

    public RunClass() {
        MainInterface s = new MainInterface();
        s.setVisible(true);
        s.jLabel6.setVisible(false);
        s.jLabel7.setVisible(false);
        s.jButton1.setVisible(false);
        s.jButton2.setVisible(false);
        s.arrow2.setVisible(false);
        Welcometext(s.jLabel2, s.jLabel4, s.jLabel5);
        s.jLabel6.setVisible(true);
        s.jLabel7.setVisible(true);
        s.arrow2.setVisible(true);
        s.jButton1.setVisible(true);
        s.jButton2.setVisible(true);

    }

    public static void main(String[] args) {
        new RunClass();

    }

    void Welcometext(JLabel j, JLabel j4, JLabel j5) {
        for (int i = 1; i <= 44; i++) {
            switch (i) {
                case 1:
                    j.setText("W");
                    typingmusic();
                    break;
                case 2:
                    j.setText("WE");
                    typingmusic();
                    break;
                case 3:
                    j.setText("WEL");
                    typingmusic();
                    break;
                case 4:
                    j.setText("WELC");
                    typingmusic();
                    break;
                case 5:
                    j.setText("WELCO");
                    typingmusic();
                    break;
                case 6:
                    j.setText("WELCOM");
                    typingmusic();
                    break;
                case 7:
                    j.setText("WELCOME");
                    typingmusic();
                    break;
                case 8:
                    j.setText("WELCOME ");
                    typingmusic();
                    break;
                case 9:
                    j.setText("WELCOME T");
                    typingmusic();
                    break;
                case 10:
                    j.setText("WELCOME TO");
                    typingmusic();
                    break;
                case 11:
                    j4.setText("\"");
                    typingmusic();
                    break;
                case 12:
                    j4.setText("\"P");
                    typingmusic();
                    break;
                case 13:
                    j4.setText("\"PL");
                    typingmusic();
                    break;
                case 14:
                    j4.setText("\"PLA");
                    typingmusic();
                    break;
                case 15:
                    j4.setText("\"PLAY");
                    typingmusic();
                    break;
                case 16:
                    j4.setText("\"PLAY ");
                    typingmusic();
                    break;
                case 17:
                    j4.setText("\"PLAY W");
                    typingmusic();
                    break;
                case 18:
                    j4.setText("\"PLAY WI");
                    typingmusic();
                    break;
                case 19:
                    j4.setText("\"PLAY WIT");
                    typingmusic();
                    break;
                case 20:
                    j4.setText("\"PLAY WITH");
                    typingmusic();
                    break;
                case 21:
                    j4.setText("\"PLAY WITH ");
                    typingmusic();
                    break;
                case 22:
                    j4.setText("\"PLAY WITH L");
                    typingmusic();
                    break;
                case 23:
                    j4.setText("\"PLAY WITH LE");
                    typingmusic();
                    break;
                case 24:
                    j4.setText("\"PLAY WITH LEA");
                    typingmusic();
                    break;
                case 25:
                    j4.setText("\"PLAY WITH LEAR");
                    typingmusic();
                    break;
                case 26:
                    j4.setText("\"PLAY WITH LEARN");
                    typingmusic();
                    break;
                case 27:
                    j4.setText("\"PLAY WITH LEARNI");
                    typingmusic();
                    break;
                case 28:
                    j4.setText("\"PLAY WITH LEARNIN");
                    typingmusic();
                    break;
                case 29:
                    j4.setText("\"PLAY WITH LEARNING");
                    typingmusic();
                    break;
                case 30:
                    j4.setText("\"PLAY WITH LEARNING\"");
                    typingmusic();
                    break;
                case 31:
                    j5.setText(" ");
                    typingmusic();
                    break;
                case 32:
                    j5.setText(" A");
                    typingmusic();
                    break;
                case 33:
                    j5.setText(" AP");
                    typingmusic();
                    break;
                case 34:
                    j5.setText(" APP");
                    typingmusic();
                    break;
                case 35:
                    j5.setText(" APPL");
                    typingmusic();
                    break;
                case 36:
                    j5.setText(" APPLI");
                    typingmusic();
                    break;
                case 37:
                    j5.setText(" APPLIC");
                    typingmusic();
                    break;
                case 38:
                    j5.setText(" APPLICA");
                    typingmusic();
                    break;
                case 39:
                    j5.setText(" APPLICAT");
                    typingmusic();
                    break;
                case 40:
                    j5.setText(" APPLICATI");
                    typingmusic();
                    break;
                case 41:
                    j5.setText(" APPLICATI");
                    typingmusic();
                    break;
                case 42:
                    j5.setText(" APPLICATIO");
                    typingmusic();
                    break;
                case 43:
                    j5.setText(" APPLICATION");
                    typingmusic();
                    break;
                default:
                    j5.setText(" APPLICATION.");
                    typingmusic();
                    break;

            }

            try {
                Thread.sleep(150);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    void playarrow(JLabel j, JLabel j1) {
        while (true) {
            if (check == 0) {
                j.setVisible(true);
                j1.setVisible(false);
                check = 1;
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println(e);
                }
            } else if (check == 1) {
                j1.setVisible(true);
                j.setVisible(false);
                check = 0;
            }
        }

    }

    void typingmusic() { // This method for play music when car hit the player car

        InputStream inputStream;
        AudioPlayer audioPlayer = AudioPlayer.player; // this is need for play music
        AudioStream audio; // this is need for play music
        try {
            inputStream = getClass().getClassLoader().getResourceAsStream("s.wav");
            audio = new AudioStream(inputStream);

            audioPlayer.start(audio);

        } catch (Exception ex) {

            System.out.println(ex);
        }

    }

}
