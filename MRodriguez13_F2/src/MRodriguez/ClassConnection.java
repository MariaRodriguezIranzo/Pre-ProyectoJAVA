package MRodriguez;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class ClassConnection {

    private static String Control;
    private static String mail;
    private static String password;
    private static String user;
    private static int id, wash, haircut, hairStyle, dye, perm;

    public static void main(String[] args) throws MalformedURLException, IOException {
        Control = "Create";
        functionCRUD(Control, password, mail, user);
        Control = "Create3";
        functionCRUD2(Control, id, wash, haircut, hairStyle, dye, perm);
        Control = "Create4";
        functionCRUD2(Control, id, wash, haircut, hairStyle, dye, perm);
        Control = "Create5";
        functionCRUD2(Control, id, wash, haircut, hairStyle, dye, perm);
    }

    public static void functionCRUD(String Control, String password, String mail, String user) throws MalformedURLException, IOException {
        String phpFileName = "controllerDB.php";
        String path = "http://localhost/M13/P1/";
        
        String query = "";
        query += "?Control=" + Control;
        query += "&D01=" + user;
        query += "&D02=" + password;
        query += "&D03=" + mail;

        String urlLink = path + phpFileName + query;
        URL url = new URL(urlLink);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuffer sb = new StringBuffer();
        String line;
        while ((line = in.readLine()) != null) {
            sb.append(line);
            System.out.println(line);
        }
    }

    public static void functionCRUD2(String Control, int id, int wash, int haircut, int hairStyle, int dye, int perm) throws MalformedURLException, IOException {
        String phpFileName = "controllerDB.php";
        String path = "http://localhost/M13/P1/";

        String query = "";
        query += "?Control=" + Control;
        query += "&D01=" + id;
        query += "&D02=" + wash;
        query += "&D03=" + haircut;
        query += "&D04=" + hairStyle;
        query += "&D05=" + dye;
        query += "&D06=" + perm;

        String urlLink = path + phpFileName + query;
        URL url = new URL(urlLink);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuffer sb = new StringBuffer();
        String line;
        while ((line = in.readLine()) != null) {
            sb.append(line);
            System.out.println(line);

        }
    }

}

