package com.hussen.anwar.mbstuseatplan_2015;

/**
 * Created by ANWAR on 11/20/2015.
 */
public class UnitB1 extends CenterBuilding {
    String result;
    String center;
    String building;
    String room;


    public String student_info(int roll) {
        result = "";
        center = "";
        building = "";
        room = "";
//Range 34892 to 39827

        // Center : Zahnavi High School (Start)
        if(roll>=34892 && roll<=34943)
        {
            center = "Center: "+czhs;
            room = "\nRoom No : ZHS-01";
        }
        else if(roll>=34944 && roll<=34995)
        {
            center = "Center: "+czhs;
            room = "\nRoom No : ZHS-02";
        }
        else if(roll>=34996 && roll<=35047)
        {
            center = "Center: "+czhs;
            room = "\nRoom No : ZHS-03";
        }
        else if(roll>=35048 && roll<=35082)
        {
            center = "Center: "+czhs;
            room = "\nRoom No : ZHS-04";
        }
        else if(roll>=35083 && roll<=35117)
        {
            center = "Center: "+czhs;
            room = "\nRoom No : ZHS-05";
        }
        else if(roll>=35118 && roll<=35167)
        {
            center = "Center: "+czhs;
            room = "\nRoom No : ZHS-06";
        }
        else if(roll>=35168 && roll<=35219)
        {
            center = "Center: "+czhs;
            room = "\nRoom No : ZHS-07";
        }

        else if(roll>=35220 && roll<=35251)
        {
            center = "Center: "+czhs;
            room = "\nRoom No : ZHS-08";
        }

        else if(roll>=35252 && roll<=35291)
        {
            center = "Center: "+czhs;
            room = "\nRoom No : ZHS-09";
        }
        else if(roll>=35292 && roll<=35331)
        {
            center = "Center: "+czhs;
            room = "\nRoom No : ZHS-10";
        }

        else if(roll>=35332 && roll<=35369)
        {
            center = "Center: "+czhs;
            room = "\nRoom No : ZHS-11";
        }

        else if(roll>=35370 && roll<=35391)
        {
            center = "Center: "+czhs;
            room = "\nRoom No : ZHS-12";
        }

        // Center : Zahnavi High School (Close)



        else if(roll>=35392 && roll<=35461)
        {
            center = "Center: "+cgsfmmc;
            room = "\nRoom No: 101";
        }
        else if(roll>=35462 && roll<=35611)
        {
            center = "Center: "+cgsfmmc;
            room = "\nRoom No: 102";
        }
        else if(roll>=35612 && roll<=35653)
        {
            center = "Center: "+cgsfmmc;
            room = "\nRoom No: 103";
        }
        else if(roll>=35654 && roll<=35695)
        {
            center = "Center: "+cgsfmmc;
            room = "\nRoom No: 104";
        }
        else if(roll>=35696 && roll<=35847)
        {
            center = "Center: "+cgsfmmc;
            room = "\nRoom No: 105";
        }
        else if(roll>=35848 && roll<=35901)
        {
            center = "Center: "+cgsfmmc;
            room = "\nRoom No: 201";
        }
        else if(roll>=35902 && roll<=35943)
        {
            center = "Center: "+cgsfmmc;
            room = "\nRoom No: 203";
        }
        else if(roll>=35944 && roll<=36013)
        {
            center = "Center: "+cgsfmmc;
            room = "\nRoom No: 208";
        }
        else if(roll>=36014 && roll<=36062)
        {
            center = "Center: "+cgsfmmc;
            room = "\nRoom No: 301";
        }
        else if(roll>=36063 && roll<=36111)
        {
            center = "Center: "+cgsfmmc;
            room = "\nRoom No: 302";
        }
        else if(roll>=36112 && roll<=36191)
        {
            center = "Center: "+cgsfmmc;
            room = "\nRoom No: 303";
        }



        else if(roll>=36192 && roll<=36229)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac1;
            room = "\nRoom No: 103";
        }
        else if(roll>=36230 && roll<=36325)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac1;
            room = "\nRoom No: 104";
        }
        else if(roll>=36326 && roll<=36447)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac1;
            room = "\nRoom No: 107";
        }
        else if(roll>=36448 && roll<=36517)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac1;
            room = "\nRoom No: 111";
        }
        else if(roll>=36518 && roll<=36587)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac1;
            room = "\nRoom No: 209";
        }
        else if(roll>=36588 && roll<=36675)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac1;
            room = "\nRoom No: 301";
        }
        else if(roll>=36676 && roll<=36745)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac1;
            room = "\nRoom No: 303";
        }
        else if(roll>=36746 && roll<=36794)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac1;
            room = "\nRoom No: Central Library";
        }



        else if(roll>=36795 && roll<=36844)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac2;
            room = "\nRoom No: 1002";
        }
        else if(roll>=36845 && roll<=36894)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac2;
            room = "\nRoom No: 1003";
        }
        else if(roll>=36895 && roll<=36932)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac2;
            room = "\nRoom No: 2001";
        }
        else if(roll>=36933 && roll<=36982)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac2;
            room = "\nRoom No: 3001";
        }



        else if(roll>=36983 && roll<=37038)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac3;
            room = "\nRoom No: 11(Tin Shed)";
        }
        else if(roll>=37039 && roll<=37118)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac3;
            room = "\nRoom No: 12(Tin Shed)";
        }



        else if(roll>=37119 && roll<=37164)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac4;
            room = "\nRoom No: 13(Tin Shed)";
        }



        else if(roll>=37165 && roll<=37198)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac5;
            room = "\nRoom No: 18(Tin Shed)";
        }



        else if(roll>=37199 && roll<=37230)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac6;
            room = "\nRoom No: 12(Tin Shed)";
        }
        else if(roll>=37231 && roll<=37255)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac6;
            room = "\nRoom No: 12(Tin Shed)";
        }
        else if(roll>=37256 && roll<=37291)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac6;
            room = "\nRoom No: 12(Tin Shed)";
        }



        else if(roll>=37292 && roll<=37371)
        {
            center = "Center: "+cmgmh;
            room = "\nRoom No: 102";
        }
        else if(roll>=37372 && roll<=37471)
        {
            center = "Center: "+cmgmh;
            room = "\nRoom No: 103";
        }
        else if(roll>=37472 && roll<=37561)
        {
            center = "Center: "+cmgmh;
            room = "\nRoom No: 204";
        }
        else if(roll>=37562 && roll<=37631)
        {
            center = "Center: "+cmgmh;
            room = "\nRoom No: 205";
        }
        else if(roll>=37632 && roll<=37691)
        {
            center = "Center: "+cmgmh;
            room = "\nRoom No: 304";
        }
        else if(roll>=37692 && roll<=37751)
        {
            center = "Center: "+cmgmh;
            room = "\nRoom No: 305";
        }
        else if(roll>=37752 && roll<=37801)
        {
            center = "Center: "+cmgmh;
            room = "\nRoom No: 306";
        }
        else if(roll>=37802 && roll<=37882)
        {
            center = "Center: "+cmgmh;
            room = "\nRoom No: 307";
        }
        else if(roll>=37883 && roll<=37963)
        {
            center = "Center: "+cmgmh;
            room = "\nRoom No: 308";
        }
        else if(roll>=37964 && roll<=38058)
        {
            center = "Center: "+cmgmh;
            room = "\nRoom No: 313";
        }
        else if(roll>=38059 && roll<=38118)
        {
            center = "Center: "+cmgmh;
            room = "\nRoom No: 314";
        }
        else if(roll>=38119 && roll<=38174)
        {
            center = "Center: "+cmgmh;
            room = "\nRoom No: 401";
        }
        else if(roll>=38175 && roll<=38230)
        {
            center = "Center: "+cmgmh;
            room = "\nRoom No: 402";
        }
        else if(roll>=38231 && roll<=38285)
        {
            center = "Center: "+cmgmh;
            room = "\nRoom No: 403";
        }
        else if(roll>=38286 && roll<=38335)
        {
            center = "Center: "+cmgmh;
            room = "\nRoom No: 405";
        }
        else if(roll>=38336 && roll<=38391)
        {
            center = "Center: "+cmgmh;
            room = "\nRoom No: 406";
        }



        else if(roll>=38392 && roll<=38425)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 105";
        }
        else if(roll>=38426 && roll<=38459)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 106";
        }
        else if(roll>=38460 && roll<=38493)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 107";
        }
        else if(roll>=38494 && roll<=38527)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 205";
        }
        else if(roll>=38528 && roll<=38561)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 206";
        }
        else if(roll>=38562 && roll<=38595)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 207";
        }
        else if(roll>=38596 && roll<=38629)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 305";
        }
        else if(roll>=38630 && roll<=38663)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 306";
        }
        else if(roll>=38664 && roll<=38697)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 307";
        }
        else if(roll>=38698 && roll<=38731)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 110";
        }
        else if(roll>=38732 && roll<=38765)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 111";
        }
        else if(roll>=38766 && roll<=38799)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 112";
        }
        else if(roll>=38800 && roll<=38833)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 208";
        }
        else if(roll>=38834 && roll<=38867)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 209";
        }
        else if(roll>=38868 && roll<=38901)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 210";
        }
        else if(roll>=38902 && roll<=38935)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 211";
        }
        else if(roll>=38936 && roll<=38969)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 212";
        }



        else if(roll>=38970 && roll<=39003)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 01";
        }
        else if(roll>=39004 && roll<=39037)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 02";
        }
        else if(roll>=39038 && roll<=39071)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 03";
        }
        else if(roll>=39072 && roll<=39107)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 04";
        }
        else if(roll>=39108 && roll<=39141)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 05";
        }
        else if(roll>=39142 && roll<=39175)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 06";
        }
        else if(roll>=39176 && roll<=39209)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 07";
        }
        else if(roll>=39210 && roll<=39243)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 08";
        }
        else if(roll>=39244 && roll<=39279)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 09";
        }
        else if(roll>=39280 && roll<=39313)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 10";
        }
        else if(roll>=39314 && roll<=39351)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 11";
        }
        else if(roll>=39352 && roll<=39387)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 12";
        }
        else if(roll>=39388 && roll<=39423)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 13";
        }
        else if(roll>=39424 && roll<=39459)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 14";
        }
        else if(roll>=39460 && roll<=39497)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 15";
        }
        else if(roll>=39498 && roll<=39533)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 16";
        }
        else if(roll>=39534 && roll<=39561)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 17";
        }
        else if(roll>=39562 && roll<=39589)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 18";
        }
        else if(roll>=39590 && roll<=39617)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 19";
        }
        else if(roll>=39618 && roll<=39651)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 20";
        }
        else if(roll>=39652 && roll<=39685)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 21";
        }
        else if(roll>=39686 && roll<=39743)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: Hall Room-1";
        }
        else if(roll>=39744 && roll<=39787)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: Hall Room-2";
        }
        else if(roll>=39788 && roll<=39827)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: Digital Class Room";
        }

        result = center+building+room;
        if(result.equals(""))
            return " Sorry! \n Roll Number Not Found. \nPlease Enter Correct Roll Number \nor \n Select Correct Unit";
        else
            return center+"\n"+building+"\n"+room;

    }
}
