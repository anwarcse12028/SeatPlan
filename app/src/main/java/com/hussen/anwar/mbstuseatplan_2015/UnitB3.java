package com.hussen.anwar.mbstuseatplan_2015;

/**
 * Created by ANWAR on 11/20/2015.
 */
public class UnitB3 extends CenterBuilding {
    String result;
    String center;
    String building;
    String room;


    public String student_info(int roll) {
        result = "";
        center = "";
        building = "";
        room = "";
        //Range 44400 to 47194
        if(roll>=44400 && roll<=44437)
        {
            center = "Center: "+ctghs;
            room = "\nRoom No:01";
        }
        else if(roll>=44438 && roll<=44475)
        {
            center = "Center: "+ctghs;
            room = "\nRoom No: 02";
        }
        else if(roll>=44476 && roll<=44505)
        {
            center = "Center: "+ctghs;
            room = "\nRoom No: 03";
        }
        else if(roll>=44506 && roll<=44543)
        {
            center = "Center: "+ctghs;
            room = "\nRoom No: 04";
        }
        else if(roll>=44544 && roll<=44581)
        {
            center = "Center: "+ctghs;
            room = "\nRoom No: 05";
        }
        else if(roll>=44582 && roll<=44639)
        {
            center = "Center: "+ctghs;
            room = "\nRoom No: 06";
        }
        else if(roll>=44640 && roll<=44681)
        {
            center = "Center: "+ctghs;
            room = "\nRoom No: 07";
        }
        else if(roll>=44682 && roll<=44723)
        {
            center = "Center: "+ctghs;
            room = "\nRoom No: 08";
        }
        else if(roll>=44724 && roll<=44787)
        {
            center = "Center: "+ctghs;
            room = "\nRoom No: 09";
        }
        else if(roll>=44788 && roll<=44849)
        {
            center = "Center: "+ctghs;
            room = "\nRoom No: 10";
        }



        else if(roll>=44850 && roll<=44887)
        {
            center = "Center: "+cshs;
            room = "\nRoom No: 201";
        }
        else if(roll>=44888 && roll<=44925)
        {
            center = "Center: "+cshs;
            room = "\nRoom No: 202";
        }
        else if(roll>=44926 && roll<=44963)
        {
            center = "Center: "+cshs;
            room = "\nRoom No: 203";
        }
        else if(roll>=44964 && roll<=45001)
        {
            center = "Center: "+cshs;
            room = "\nRoom No: 204";
        }
        else if(roll>=45002 && roll<=45031)
        {
            center = "Center: "+cshs;
            room = "\nRoom No: 205";
        }
        else if(roll>=45032 && roll<=45051)
        {
            center = "Center: "+cshs;
            room = "\nRoom No: 109";
        }
        else if(roll>=45052 && roll<=45089)
        {
            center = "Center: "+cshs;
            room = "\nRoom No: 107";
        }
        else if(roll>=45090 && roll<=45127)
        {
            center = "Center: "+cshs;
            room = "\nRoom No: 104";
        }
        else if(roll>=45128 && roll<=45187)
        {
            center = "Center: "+cshs;
            room = "\nRoom No: 111(1)";
        }
        else if(roll>=45188 && roll<=45247)
        {
            center = "Center: "+cshs;
            room = "\nRoom No: 111(2)";
        }
        else if(roll>=45248 && roll<=45307)
        {
            center = "Center: "+cshs;
            room = "\nRoom No: 111(3)";
        }



        else if(roll>=45308 && roll<=45341)
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 02";
        }
        else if(roll>=45342 && roll<=45375)
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 03 ";
        }
        else if(roll>= 15376 && roll<= 15409)
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 04";
        }
        else if(roll>= 15410  && roll<=44447 )
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 05 ";
        }
        else if(roll>=45448 && roll<= 15485)
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 06";
        }
        else if(roll>= 15486 && roll<=45515 )
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 09";
        }
        else if(roll>= 15516 && roll<=45545)
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 10 ";
        }
        else if(roll>= 15546&& roll<= 15575)
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 11";
        }
        else if(roll>= 15576&& roll<=45605)
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 12";
        }
        else if(roll>=45606 && roll<=45711)
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 13";
        }
        else if(roll>=45712 && roll<=45745)
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 14";
        }
        else if(roll>=45746 && roll<=45779)
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 15";
        }
        else if(roll>=45780 && roll<=45813)
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 16";
        }
        else if(roll>=45814  && roll<=45833)
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 17";
        }
        else if(roll>= 15834 && roll<= 15853)
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 18";
        }
        else if(roll>= 15854 && roll<=45873)
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 19";
        }
        else if(roll>=45874 && roll<=45893)
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 20";
        }
        else if(roll>=45894 && roll<=45973)
        {
            center = "Center: "+czsgs;
            room = "\nRoom No: 21";
        }



        else if(roll>=45974 && roll<=46023)
        {
            center = "Center: "+ctmc;
            room = "\nRoom No: Medical Building Gallary Hall";
        }
        else if(roll>=46024 && roll<=46189)
        {
            center = "Center: "+ctmc;
            room = "\nRoom No: MATS Gallary-1";
        }
        else if(roll>=46190 && roll<=46217)
        {
            center = "Center: "+ctmc;
            room = "\nRoom No: MATS Gallary-2";
        }
        else if(roll>=46218 && roll<=46271)
        {
            center = "Center: "+ctmc;
            room = "\nRoom No: MATS Gallary-3";
        }
        else if(roll>=46272 && roll<=46306)
        {
            center = "Center: "+ctmc;
            room = "\nRoom No: Dept. of Anatomy";
        }



        else if(roll>=46307 && roll<=46350)
        {
            center = "Center: "+chahahs;
            room = "\nRoom No: 01";
        }
        else if(roll>=46351 && roll<=46390)
        {
            center = "Center: "+chahahs;
            room = "\nRoom No: 02";
        }
        else if(roll>=46391 && roll<=46454)
        {
            center = "Center: "+chahahs;
            room = "\nRoom No: 03";
        }
        else if(roll>=46455 && roll<=46490)
        {
            center = "Center: "+chahahs;
            room = "\nRoom No: 05";
        }
        else if(roll>=46491 && roll<=46530)
        {
            center = "Center: "+chahahs;
            room = "\nRoom No: 06";
        }
        else if(roll>=46531 && roll<=46586)
        {
            center = "Center: "+chahahs;
            room = "\nRoom No: 09";
        }



        else if(roll>=46587 && roll<=46674)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc1;
            room = "\nRoom No: 207";
        }
        else if(roll>=46675 && roll<=46740)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc1;
            room = "\nRoom No: 208";
        }
        else if(roll>=46741 && roll<=46806)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc1;
            room = "\nRoom No: 209";
        }
        else if(roll>=46807 && roll<=46876)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc1;
            room = "\nRoom No: 210";
        }
        else if(roll>=46877 && roll<=46946)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc1;
            room = "\nRoom No: 212";
        }
        else if(roll>=46947 && roll<=47046)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc1;
            room = "\nRoom No: 2215";
        }
        else if(roll>=47047 && roll<=47076)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc1;
            room = "\nRoom No: 216";
        }
        else if(roll>=47077 && roll<=47098)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc1;
            room = "\nRoom No: 217";
        }
        else if(roll>=47099 && roll<=47140)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc1;
            room = "\nRoom No: 227";
        }
        else if(roll>=47141 && roll<=47164)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc1;
            room = "\nRoom No: 228";
        }
        else if(roll>=47165 && roll<=47194)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc1;
            room = "\nRoom No: 224";
        }

        result = center+building+room;
        if(result.equals(""))
            return " Sorry! \n Roll Number Not Found. \nPlease Enter Correct Roll Number \nor \n Select Correct Unit";
        else
            return center+"\n"+building+"\n"+room;

    }
}
