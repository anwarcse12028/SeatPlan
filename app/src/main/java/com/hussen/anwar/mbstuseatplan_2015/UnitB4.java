package com.hussen.anwar.mbstuseatplan_2015;

/**
 * Created by ANWAR on 11/20/2015.
 */
public class UnitB4 extends CenterBuilding {
    String result;
    String center;
    String building;
    String room;


    public String student_info(int roll) {
        result = "";
        center = "";
        building = "";
        room = "";
        //Range 47195 to 49007
        if(roll>=47195 && roll<=47264)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc2;
            room = "\nRoom No: 111";
        }
        else if(roll>=47265 && roll<=47302)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc2;
            room = "\nRoom No: 112";
        }
        else if(roll>=47303 && roll<=47366)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc2;
            room = "\nRoom No: 113";
        }
        else if(roll>=47367 && roll<=47406)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc2;
            room = "\nRoom No: 118";
        }
        else if(roll>=47407 && roll<=47446)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc2;
            room = "\nRoom No: 125";
        }

        else if(roll>=47447 && roll<=47498)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc2;
            room = "\nRoom No: 127";
        }
        else if(roll>=47499 && roll<=47576)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc2;
            room = "\nRoom No: 129";
        }
        else if(roll>=47577 && roll<=47624)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc2;
            room = "\nRoom No: 130";
        }



        else if(roll>=47625 && roll<=47658)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc3;
            room = "\nRoom No: 101";
        }
        else if(roll>=47659 && roll<=47712)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc3;
            room = "\nRoom No: 102";
        }
        else if(roll>=47713 && roll<=47764)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc4;
            room = "\nRoom No: 203";
        }
        else if(roll>=47765 && roll<=47814)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc4;
            room = "\nRoom No: 204";
        }
        else if(roll>=47815 && roll<=47880)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc5;
            room = "\nRoom No: 205";
        }
        else if(roll>=47881 && roll<=47942)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc5;
            room = "\nRoom No: 206";
        }
        else if(roll>=47943 && roll<=47996)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc6;
            room = "\nRoom No: 403";
        }
        else if(roll>=47997 && roll<=48032)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc7;
            room = "\nRoom No: 1001";
        }
        else if(roll>=48033 && roll<=48084)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc7;
            room = "\nRoom No: 1003";
        }
        else if(roll>=48085 && roll<=48114)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc7;
            room = "\nRoom No: 1004";
        }

        else if(roll>=48115 && roll<=48138)
        {
            center = "Center: "+cgsc;
            building = "\nBuilding: "+bcgsc7;
            room = "\nRoom No: 2005";
        }

        //   27	H. M. Institute Korotia, Tangail. 	Main	01	48139	48190	52

        else if(roll>=48139 && roll<=48190)
        {
            center = "Center: "+chmik;
            building = "\nBuilding: "+bchmik1;
            room = "\nRoom No: 01";
        }
        //02	48191	48242	52

        else if(roll>=48191 && roll<=48242)
        {
            center = "Center: "+chmik;
            building = "\nBuilding: "+bchmik1;
            room = "\nRoom No: 02";
        }
        //03	48243	48294	52

        else if(roll>=48243 && roll<=48294)
        {
            center = "Center: "+chmik;
            building = "\nBuilding: "+bchmik1;
            room = "\nRoom No: 03";
        }
        //	06	48295	48344	50

        else if(roll>=48295 && roll<=48344)
        {
            center = "Center: "+chmik;
            building = "\nBuilding: "+bchmik1;
            room = "\nRoom No: 06";
        }
        //07	48345	48394	50

        else if(roll>=48345 && roll<=48394)
        {
            center = "Center: "+chmik;
            building = "\nBuilding: "+bchmik1;
            room = "\nRoom No: 07";
        }
        //08	48395	48426	32

        else if(roll>=48395 && roll<=48426)
        {
            center = "Center: "+chmik;
            building = "\nBuilding: "+bchmik1;
            room = "\nRoom No: 08";
        }
        //201	48427	48506	80

        else if(roll>=48427 && roll<=48506)
        {
            center = "Center: "+chmik;
            building = "\nBuilding: "+bchmik1;
            room = "\nRoom No: 201";
        }
        //202	48507	48540	34

        else if(roll>=48507 && roll<=48540)
        {
            center = "Center: "+chmik;
            building = "\nBuilding: "+bchmik1;
            room = "\nRoom No: 202";
        }
        //14	48541	48570	30

        else if(roll>=48541 && roll<=48570)
        {
            center = "Center: "+chmik;
            building = "\nBuilding: "+bchmik1;
            room = "\nRoom No: 14";
        }
        //15	48571	48630	60	492

        else if(roll>=48571 && roll<=48630)
        {
            center = "Center: "+chmik;
            building = "\nBuilding: "+bchmik1;
            room = "\nRoom No: 15";
        }


        //Rokeya Madrasha, Korotia, Tangail.	111	48631	48660	30

        else if(roll>=48631 && roll<=48660)
        {
            center = "Center: "+chmik;
            building = "\nBuilding: "+bchmik2;
            room = "\nRoom No: 111";
        }
        //112	48661	48690	30

        else if(roll>=48661 && roll<=48690)
        {
            center = "Center: "+chmik;
            building = "\nBuilding: "+bchmik2;
            room = "\nRoom No: 112";
        }
        //113	48691	48720	30

        else if(roll>=48691 && roll<=48720)
        {
            center = "Center: "+chmik;
            building = "\nBuilding: "+bchmik2;
            room = "\nRoom No: 113";
        }
        //114	48721	48750	30

        else if(roll>=48721 && roll<=48750)
        {
            center = "Center: "+chmik;
            building = "\nBuilding: "+bchmik2;
            room = "\nRoom No: 114";
        }
        //115	48751	48780	30

        else if(roll>=48751 && roll<=48780)
        {
            center = "Center: "+chmik;
            building = "\nBuilding: "+bchmik2;
            room = "\nRoom No: 115";
        }
        //201	48781	48810	30

        else if(roll>=48781 && roll<=48810)
        {
            center = "Center: "+chmik;
            building = "\nBuilding: "+bchmik2;
            room = "\nRoom No: 201";
        }
        //202	48811	48840	30	210

        else if(roll>=48811 && roll<=48840)
        {
            center = "Center: "+chmik;
            building = "\nBuilding: "+bchmik2;
            room = "\nRoom No: 202";
        }


        //Shisu Bag,Korotia, Tangail. 	06	48841	48860	20

        else if(roll>=48841 && roll<=48860)
        {
            center = "Center: "+chmik;
            building = "\nBuilding: "+bchmik3;
            room = "\nRoom No: 06";
        }
        //07	48861	48884	24

        else if(roll>=48861 && roll<=48884)
        {
            center = "Center: "+chmik;
            building = "\nBuilding: "+bchmik3;
            room = "\nRoom No: 07";
        }
        //08	48885	48902	18

        else if(roll>=48885 && roll<=48902)
        {
            center = "Center: "+chmik;
            building = "\nBuilding: "+bchmik3;
            room = "\nRoom No: 08";
        }
        //10	48903	48932	24

        else if(roll>=48903 && roll<=48932)
        {
            center = "Center: "+chmik;
            building = "\nBuilding: "+bchmik3;
            room = "\nRoom No: 10";
        }
        //11	48934	48960	20

        else if(roll>=48934 && roll<=48960)
        {
            center = "Center: "+chmik;
            building = "\nBuilding: "+bchmik3;
            room = "\nRoom No: 11";
        }
        //12	48962	48985	20

        else if(roll>=48962 && roll<=48985)
        {
            center = "Center: "+chmik;
            building = "\nBuilding: "+bchmik3;
            room = "\nRoom No: 12";
        }
        //15	48986	49007	21	147
        else if(roll>=48986 && roll<=49007)
        {
            center = "Center: "+chmik;
            building = "\nBuilding: "+bchmik3;
            room = "\nRoom No: 15";
        }


        result = center+building+room;
        if(result.equals(""))
            return " Sorry! \n Roll Number Not Found. \nPlease Enter Correct Roll Number \nor \n Select Correct Unit";
        else
            return center+"\n"+building+"\n"+room;

    }
}
