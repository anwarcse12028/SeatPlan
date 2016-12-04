package com.hussen.anwar.mbstuseatplan_2015;

/**
 * Created by ANWAR on 11/20/2015.
 */
public class UnitA3 extends CenterBuilding  {
    String result;
    String center;
    String building;
    String room;


    public String student_info(int roll) {
        result = "";
        center = "";
        building = "";
        room = "";

//Range 14400 to 18102
        if(roll>=14400 && roll<=14437)
        {
            center = "Center: "+ctghs;
            room = "\nRoom No:01";
        }
        else if(roll>=14438 && roll<=14475)
        {
            center = "Center: "+ctghs;
            room = "\nRoom No: 02";
        }
        else if(roll>=14476 && roll<=14505)
        {
            center = "Center: "+ctghs;
            room = "\nRoom No: 03";
        }
        else if(roll>=14506 && roll<=14543)
        {
            center = "Center: "+ctghs;
            room = "\nRoom No: 04";
        }
        else if(roll>=14544 && roll<=14581)
        {
            center = "Center: "+ctghs;
            room = "\nRoom No: 05";
        }
        else if(roll>=14582 && roll<=14639)
        {
            center = "Center: "+ctghs;
            room = "\nRoom No: 06";
        }
        else if(roll>=14640 && roll<=14681)
        {
            center = "Center: "+ctghs;
            room = "\nRoom No: 07";
        }
        else if(roll>=14682 && roll<=14723)
        {
            center = "Center: "+ctghs;
            room = "\nRoom No: 08";
        }
        else if(roll>=14724 && roll<=14787)
        {
            center = "Center: "+ctghs;
            room = "\nRoom No: 09";
        }
        else if(roll>=14788 && roll<=14849)
        {
            center = "Center: "+ctghs;
            room = "\nRoom No: 10";
        }



        else if(roll>=14850 && roll<=14887)
        {
            center = "Center: "+cshs;
            room = "\nRoom No: 201";
        }
        else if(roll>=14888 && roll<=14925)
        {
            center = "Center: "+cshs;
            room = "\nRoom No: 202";
        }
        else if(roll>=14926 && roll<=14963)
        {
            center = "Center: "+cshs;
            room = "\nRoom No: 203";
        }
        else if(roll>=14964 && roll<=15001)
        {
            center = "Center: "+cshs;
            room = "\nRoom No: 204";
        }
        else if(roll>=15002 && roll<=15031)
        {
            center = "Center: "+cshs;
            room = "\nRoom No: 205";
        }
        else if(roll>=15032 && roll<=15051)
        {
            center = "Center: "+cshs;
            room = "\nRoom No: 109";
        }
        else if(roll>=15052 && roll<=15089)
        {
            center = "Center: "+cshs;
            room = "\nRoom No: 107";
        }
        else if(roll>=15090 && roll<=15127)
        {
            center = "Center: "+cshs;
            room = "\nRoom No: 104";
        }
        else if(roll>=15128 && roll<=15187)
        {
            center = "Center: "+cshs;
            room = "\nRoom No: 111(1)";
        }
        else if(roll>=15188 && roll<=15247)
        {
            center = "Center: "+cshs;
            room = "\nRoom No: 111(2)";
        }
        else if(roll>=15248 && roll<=15307)
        {
            center = "Center: "+cshs;
            room = "\nRoom No: 111(3)";
        }



        else if(roll>=15308 && roll<=15341)
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 02";
        }
        else if(roll>=15342 && roll<=15375)
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 03 ";
        }
        else if(roll>= 15376 && roll<= 15409)
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 04";
        }
        else if(roll>= 15410  && roll<=14447 )
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 05 ";
        }
        else if(roll>=15448 && roll<= 15485)
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 06";
        }
        else if(roll>= 15486 && roll<=15515 )
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 09";
        }
        else if(roll>= 15516 && roll<=15545)
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 10 ";
        }
        else if(roll>= 15546&& roll<= 15575)
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 11";
        }
        else if(roll>= 15576&& roll<=15605)
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 12";
        }
        else if(roll>=15606 && roll<=15711)
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 13";
        }
        else if(roll>=15712 && roll<=15745)
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 14";
        }
        else if(roll>=15746 && roll<=15779)
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 15";
        }
        else if(roll>=15780 && roll<=15813)
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 16";
        }
        else if(roll>=15814  && roll<=15833)
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 17";
        }
        else if(roll>= 15834 && roll<= 15853)
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 18";
        }
        else if(roll>= 15854 && roll<=15873)
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 19";
        }
        else if(roll>=15874 && roll<=15893)
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 20";
        }
        else if(roll>=15894 && roll<=15973)
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 21";
        }



        else if(roll>=15974 && roll<=16023)
        {
            center = "Center: "+ctmc;
            room = "\nRoom No: Medical Building Gallary Hall";
        }
        else if(roll>=16024 && roll<=16189)
        {
            center = "Center: "+ctmc;
            room = "\nRoom No: MATS Gallary-1";
        }
        else if(roll>=16190 && roll<=16217)
        {
            center = "Center: "+ctmc;
            room = "\nRoom No: MATS Gallary-2";
        }
        else if(roll>=16218 && roll<=16271)
        {
            center = "Center: "+ctmc;
            room = "\nRoom No: MATS Gallary-3";
        }
        else if(roll>=16272 && roll<=16306)
        {
            center = "Center: "+ctmc;
            room = "\nRoom No: Dept. of Anatomy";
        }



        else if(roll>=16307 && roll<=16350)
        {
            center = "Center: "+chahahs;
            room = "\nRoom No: 01";
        }
        else if(roll>=16351 && roll<=16390)
        {
            center = "Center: "+chahahs;
            room = "\nRoom No: 02";
        }
        else if(roll>=16391 && roll<=16454)
        {
            center = "Center: "+chahahs;
            room = "\nRoom No: 03";
        }
        else if(roll>=16455 && roll<=16490)
        {
            center = "Center: "+chahahs;
            room = "\nRoom No: 05";
        }
        else if(roll>=16491 && roll<=16530)
        {
            center = "Center: "+chahahs;
            room = "\nRoom No: 06";
        }
        else if(roll>=16531 && roll<=16586)
        {
            center = "Center: "+chahahs;
            room = "\nRoom No: 09";
        }



        else if(roll>=16587 && roll<=16674)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc1;
            room = "\nRoom No: 207";
        }
        else if(roll>=16675 && roll<=16740)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc1;
            room = "\nRoom No: 208";
        }
        else if(roll>=16741 && roll<=16806)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc1;
            room = "\nRoom No: 209";
        }
        else if(roll>=16807 && roll<=16876)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc1;
            room = "\nRoom No: 210";
        }
        else if(roll>=16877 && roll<=16946)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc1;
            room = "\nRoom No: 212";
        }
        else if(roll>=16947 && roll<=17046)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc1;
            room = "\nRoom No: 2215";
        }
        else if(roll>=17047 && roll<=17076)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc1;
            room = "\nRoom No: 216";
        }
        else if(roll>=17077 && roll<=17098)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc1;
            room = "\nRoom No: 217";
        }
        else if(roll>=17099 && roll<=17140)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc1;
            room = "\nRoom No: 227";
        }
        else if(roll>=17141 && roll<=17164)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc1;
            room = "\nRoom No: 228";
        }
        else if(roll>=17165 && roll<=17194)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc1;
            room = "\nRoom No: 224";
        }



        else if(roll>=17195 && roll<=17264)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc2;
            room = "\nRoom No: 111";
        }
        else if(roll>=17265 && roll<=17302)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc2;
            room = "\nRoom No: 112";
        }
        else if(roll>=17303 && roll<=17366)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc2;
            room = "\nRoom No: 113";
        }
        else if(roll>=17367 && roll<=17406)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc2;
            room = "\nRoom No: 118";
        }
        else if(roll>=17407 && roll<=17446)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc2;
            room = "\nRoom No: 125";
        }

        else if(roll>=17447 && roll<=17498)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc2;
            room = "\nRoom No: 127";
        }
        else if(roll>=17499 && roll<=17576)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc2;
            room = "\nRoom No: 129";
        }
        else if(roll>=17577 && roll<=17624)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc2;
            room = "\nRoom No: 130";
        }



        else if(roll>=17625 && roll<=17658)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc3;
            room = "\nRoom No: 101";
        }
        else if(roll>=17659 && roll<=17712)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc3;
            room = "\nRoom No: 102";
        }
        else if(roll>=17713 && roll<=17764)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc4;
            room = "\nRoom No: 203";
        }
        else if(roll>=17765 && roll<=17814)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc4;
            room = "\nRoom No: 204";
        }
        else if(roll>=17815 && roll<=17880)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc5;
            room = "\nRoom No: 205";
        }
        else if(roll>=17881 && roll<=17942)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc5;
            room = "\nRoom No: 206";
        }
        else if(roll>=17943 && roll<=17996)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc6;
            room = "\nRoom No: 403";
        }
        else if(roll>=17997 && roll<=18032)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc7;
            room = "\nRoom No: 1001";
        }
        else if(roll>=18033 && roll<=18086)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc7;
            room = "\nRoom No: 1003";
        }
        else if(roll>=18087 && roll<=18102)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc7;
            room = "\nRoom No: 1004";
        }


        result = center+building+room;
        if(result.equals(""))
            return " Sorry! \n Roll Number Not Found. \nPlease Enter Correct Roll Number \nor \n Select Correct Unit";
        else
            return center+"\n"+building+"\n"+room;

    }
}
