package FinalPackage;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

    public static void main(String[] args) {

        // create color class instances --- have to pass it through the add method as a
        // parameter to compile
        // Colors c1 = new Colors("FA8072", "salmon");
        // Colors c2 = new Colors("FF0000", "red");
        // Colors c3 = new Colors("FF7F50", "coral");
        // Colors c4 = new Colors("FFD700", "gold");
        // Colors c5 = new Colors("FF8C00", "dark orange");
        // Colors c6 = new Colors("FFE4B5", "moccasin");
        // Colors c7 = new Colors("FFFF00", "yellow");
        // Colors c8 = new Colors("7CFC00", "lawn green");
        // Colors c9 = new Colors("808000", "olive");
        // Colors c10 = new Colors("00FFFF", "cyan");
        // Colors c11 = new Colors("40E0D0", "turquoise");
        // Colors c12 = new Colors("008080", "teal");
        // Colors c13 = new Colors("00BFFF", "deep sky blue");
        // Colors c14 = new Colors("4682B4", "steel blue");
        // Colors c15 = new Colors("000080", "navy");
        // Colors c16 = new Colors("FF00FF", "fuchsia");
        // Colors c17 = new Colors("4B0082", "indigo");
        // Colors c18 = new Colors("FF69B4", "hot pink");
        // Colors c19 = new Colors("FFFFF0", "ivory");
        // Colors c20 = new Colors("708090", "slate gray");

        ArrayList<Colors> colors = new ArrayList<Colors>(); // instantiating ArrayList

        // Adding colors to ArrayList
        colors.add(new Colors("FA8072", "salmon"));
        colors.add(new Colors("FF0000", "red"));
        colors.add(new Colors("FF7F50", "coral"));
        colors.add(new Colors("FFD700", "gold"));
        colors.add(new Colors("FF8C00", "dark orange"));
        colors.add(new Colors("FFE4B5", "moccasin"));
        colors.add(new Colors("FFFF00", "yellow"));
        colors.add(new Colors("7CFC00", "lawn green"));
        colors.add(new Colors("808000", "olive"));
        colors.add(new Colors("00FFFF", "cyan"));
        colors.add(new Colors("40E0D0", "turquoise"));
        colors.add(new Colors("008080", "teal"));
        colors.add(new Colors("00BFFF", "deep sky blue"));
        colors.add(new Colors("4682B4", "steel blue"));
        colors.add(new Colors("000080", "navy"));
        colors.add(new Colors("FF00FF", "fuchsia"));
        colors.add(new Colors("4B0082", "indigo"));
        colors.add(new Colors("FF69B4", "hot pink"));
        colors.add(new Colors("FFFFF0", "ivory"));
        colors.add(new Colors("708090", "slate gray"));

    }
}