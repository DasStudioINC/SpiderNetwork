package com.spidernetwork.visuals;

import java.awt.*;

public class colors {

    private static String[] HEX = {
            "#000000", "#FFFFFF", "#FF0000", "#00FF00", "#0000FF",
            "#FFFF00", "#00FFFF", "#FF00FF", "#C0C0C0", "#808080",
            "#800000", "#808000", "#008000", "#800080", "#008080",
            "#000080", "#FFA500", "#A52A2A", "#8A2BE2", "#DEB887",
            "#5F9EA0", "#7FFF00", "#D2691E", "#FF7F50", "#6495ED",
            "#DC143C", "#00CED1", "#9400D3", "#FF1493", "#00BFFF",
            "#696969", "#1E90FF", "#B22222", "#FFFAF0", "#228B22",
            "#FF00FF", "#DCDCDC", "#F8F8FF", "#FFD700", "#DAA520",
            "#808080", "#008000", "#ADFF2F", "#F0FFF0", "#FF69B4",
            "#CD5C5C", "#4B0082", "#FFFFF0", "#F0E68C", "#E6E6FA",
            "#FFF0F5", "#7CFC00", "#FFFACD", "#ADD8E6", "#F08080",
            "#E0FFFF", "#FAFAD2", "#D3D3D3", "#90EE90", "#FFB6C1",
            "#FFA07A", "#20B2AA", "#87CEFA", "#778899", "#B0C4DE",
            "#FFFFE0", "#00FF00", "#32CD32", "#FAF0E6", "#FF00FF",
            "#800000", "#66CDAA", "#000000", "#8B0000", "#006400",
            "#483D8B", "#2F4F4F", "#8B008B", "#556B2F", "#FF8C00",
            "#9932CC", "#8B0000", "#E9967A", "#8FBC8F", "#483D8B",
            "#2F4F4F", "#00CED1", "#9400D3", "#FF1493", "#696969",
            "#1E90FF", "#B22222", "#228B22", "#FFD700", "#ADFF2F"
    };

    public static Color hexToColor(String hex){

        for(int i = 0; i < HEX.length; i++){
            if(hex.toUpperCase().equals(HEX[i])){
                return Color.decode(HEX[i]);
            }
        }

        return Color.white;
    }


    // ANSI COlORS

    private static String[] ANSI = {
            "Black, \u001B[30m", "Red, \u001B[31m",
            "Green, \u001B[32m", "Yellow, \u001B[33m",
            "Blue, \u001B[34m", "Magenta, \u001B[35m",
            "Cyan, \u001B[36m", "White, \u001B[37m",
            "Bright Black (Dark Gray), \u001B[90m", "Bright Red, \u001B[91m",
            "Bright Green, \u001B[92m", "Bright Yellow, \u001B[93m",
            "Bright Blue, \u001B[94m", "Bright Magenta, \u001B[95m",
            "Bright Cyan, \u001B[96m", "Bright White, \u001B[97m",
            "Very Dark Blue, \u001B[38;5;17m", "Dark Blue, \u001B[38;5;18m",
            "Navy Blue, \u001B[38;5;19m", "Deep Blue, \u001B[38;5;20m",
            "Vivid Blue, \u001B[38;5;21m", "Dark Green, \u001B[38;5;22m",
            "Forest Green, \u001B[38;5;23m", "Deep Green, \u001B[38;5;24m",
            "Teal Green, \u001B[38;5;25m", "Bright Green, \u001B[38;5;46m",
            "Dark Cyan, \u001B[38;5;30m", "Teal, \u001B[38;5;31m",
            "Cyan Blue, \u001B[38;5;32m", "Sky Blue, \u001B[38;5;39m",
            "Dark Red, \u001B[38;5;52m", "Crimson, \u001B[38;5;160m",
            "Bright Red, \u001B[38;5;196m", "Dark Orange, \u001B[38;5;130m",
            "Orange, \u001B[38;5;208m", "Gold, \u001B[38;5;220m",
            "Dark Yellow, \u001B[38;5;136m", "Olive, \u001B[38;5;142m",
            "Light Yellow, \u001B[38;5;229m", "Purple, \u001B[38;5;93m",
            "Violet, \u001B[38;5;135m", "Lavender, \u001B[38;5;183m",
            "Pink, \u001B[38;5;205m", "Hot Pink, \u001B[38;5;198m",
            "Light Gray, \u001B[38;5;250m", "Gray, \u001B[38;5;244m",
            "Dark Gray, \u001B[38;5;238m", "Near Black, \u001B[38;5;232m"
    };

    private static String RESET = "\u001B[0m";


    public static String nameToAnsi(String colorName){

        for(int i = 0; i < ANSI.length; i++){
            // Split the row into its specific content
            String[] comps = ANSI[i].split(",");
            if(colorName.equalsIgnoreCase(comps[0])){
                return comps[1].strip();
            }
        }

        // If none was found than just use the normal color white
        return  "\u001B[37m";
    }

    public static String getRESET(){
        return RESET;
    }
}
