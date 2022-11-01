package homework_week_9;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Programme_10 {
    public static void main(String[] args) {
        stations();
    }
    public static void stations() {
        char c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter station name between A and G: ");
        String sname = sc.nextLine().toLowerCase(Locale.ROOT);

        if (sname.equals("aldgate")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Metropolitian");
            list.add("Circle");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }

        } else if (sname.equals("aldgate east")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("District");
            list.add("Hammersmith & City");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));

            }
        } else if (sname.equals("angel")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Northen");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("baker street")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Bakerloo");
            list.add("Circle");
            list.add("Hammersmith & city");
            list.add("Jubilee");
            list.add("Metropolitan");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("bank")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Central");
            list.add("DLR");
            list.add("Northern");
            list.add("Waterloo & City");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("barbian")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Metropolitan");
            list.add("Circle");
            list.add("Hammersmith & city");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("battersea power station")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Northen");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("bayswater")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("District");
            list.add("Circle");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("blackfriars")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("District");
            list.add("Circle");


            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("bond street")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Central");
            list.add("jubilee");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("borough")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Northern");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("canno street")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("District");
            list.add("Circle");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("chancery lane")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Central");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("charing cross")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Bakerloo");
            list.add("Northen");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("covent garden")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Piccadily");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("edgware road")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Bakerloo");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("elephant castle")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Bakerloo");
            list.add("Northen");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("embankment")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Bakerloo");
            list.add("Circle");
            list.add("Northen");
            list.add("District");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("euston")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Victoria");
            list.add("Northen");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("euston square")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Metropolitam");
            list.add("Circle");
            list.add("Hammersmith & City");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("farringdon")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Circle");
            list.add("Hammersmith & City");
            list.add("Metropolitan");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("gloucester street")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Northen");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("green park")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Jubilee");
            list.add("Piccadilly");
            list.add("Victoria");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else
            System.out.println("Please enter valdid station name");
    }

}

