package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        if(monthNumber < 13 && monthNumber > 0){
            String season = "";
            if( monthNumber < 3 || monthNumber == 12){
                season = "Winter";
            }
            if(monthNumber >= 3 && monthNumber < 6){
                season = "Spring";
            }
            if (monthNumber >=6 && monthNumber < 9){
                season = "Summer";
            }
            if(monthNumber >= 9 && monthNumber < 12){
                season = "Autumn";
            }
            System.out.println(season);
        }else {
            System.out.println("Wrong month number");
        }
    }

}
