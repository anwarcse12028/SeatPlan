package com.hussen.anwar.mbstuseatplan_2015;

/**
 * Created by ANWAR on 11/20/2015.
 */
public class UnitA1 extends CenterBuilding  {
    String result;
    String center;
    String building;
    String room;


    public String student_info(int roll) {
        result = "";
        center = "";
        building = "";
        room = "";
//Range 4892 to  9827
        if(roll>=4892 && roll<=4943)
        {
            center = "Center: "+czhs;
            room = "\nRoom No: ZHS-01";
        }
        else if(roll>=4944 && roll<=4995)
        {
            center = "Center: "+czhs;
            room = "\nRoom No: ZHS-02";
        }
        else if(roll>=4996 && roll<=5047)
        {
            center = "Center: "+czhs;
            room = "\nRoom No: ZHS-03";
        }
        else if(roll>=5048 && roll<=5082)
        {
            center = "Center: "+czhs;
            room = "\nRoom No: ZHS-04";
        }
        else if(roll>=5083 && roll<=5117)
        {
            center = "Center: "+czhs;
            room = "\nRoom No: ZHS-05";
        }
        else if(roll>=5118 && roll<=5167)
        {
            center = "Center: "+czhs;
            room = "\nRoom No: ZHS-06";
        }
        else if(roll>=5168 && roll<=5219)
        {
            center = "Center: "+czhs;
            room = "\nRoom No: ZHS-07";
        }
        else if(roll>=5220 && roll<=5251)
        {
            center = "Center: "+czhs;
            room = "\nRoom No: ZHS-08";
        }
        else if(roll>=5252 && roll<=5291)
        {
            center = "Center: "+czhs;
            room = "\nRoom No: ZHS-09";
        }
        else if(roll>=5292 && roll<=5331)
        {
            center = "Center: "+czhs;
            room = "\nRoom No: ZHS-10";
        }
        else if(roll>=5332 && roll<=5369)
        {
            center = "Center: "+czhs;
            room = "\nRoom No: ZHS-11";
        }
        else if(roll>=5370 && roll<=5391)
        {
            center = "Center: "+czhs;
            room = "\nRoom No: ZHS-12";
        }



        else if(roll>=5392 && roll<=5461)
        {
            center = "Center: "+cgsfmmc;
            room = "\nRoom No: 101";
        }
        else if(roll>=5462 && roll<=5611)
        {
            center = "Center: "+cgsfmmc;
            room = "\nRoom No: 102";
        }
        else if(roll>=5612 && roll<=5653)
        {
            center = "Center: "+cgsfmmc;
            room = "\nRoom No: 103";
        }
        else if(roll>=5654 && roll<=5695)
        {
            center = "Center: "+cgsfmmc;
            room = "\nRoom No: 104";
        }
        else if(roll>=5696 && roll<=5847)
        {
            center = "Center: "+cgsfmmc;
            room = "\nRoom No: 105";
        }
        else if(roll>=5848 && roll<=5901)
        {
            center = "Center: "+cgsfmmc;
            room = "\nRoom No: 201";
        }
        else if(roll>=5902 && roll<=5943)
        {
            center = "Center: "+cgsfmmc;
            room = "\nRoom No: 203";
        }
        else if(roll>=5944 && roll<=6013)
        {
            center = "Center: "+cgsfmmc;
            room = "\nRoom No: 208";
        }
        else if(roll>=6014 && roll<=6062)
        {
            center = "Center: "+cgsfmmc;
            room = "\nRoom No: 301";
        }
        else if(roll>=6063 && roll<=6111)
        {
            center = "Center: "+cgsfmmc;
            room = "\nRoom No: 302";
        }
        else if(roll>=6112 && roll<=6191)
        {
            center = "Center: "+cgsfmmc;
            room = "\nRoom No: 303";
        }



        else if(roll>=6192 && roll<=6229)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac1;
            room = "\nRoom No: 103";
        }
        else if(roll>=6230 && roll<=6325)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac1;
            room = "\nRoom No: 104";
        }
        else if(roll>=6326 && roll<=6447)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac1;
            room = "\nRoom No: 107";
        }
        else if(roll>=6448 && roll<=6517)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac1;
            room = "\nRoom No: 111";
        }
        else if(roll>=6518 && roll<=6587)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac1;
            room = "\nRoom No: 209";
        }
        else if(roll>=6588 && roll<=6675)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac1;
            room = "\nRoom No: 301";
        }
        else if(roll>=6676 && roll<=6745)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac1;
            room = "\nRoom No: 303";
        }
        else if(roll>=6746 && roll<=6794)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac1;
            room = "\nRoom No: Central Library";
        }



        else if(roll>=6795 && roll<=6844)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac2;
            room = "\nRoom No: 1002";
        }
        else if(roll>=6845 && roll<=6894)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac2;
            room = "\nRoom No: 1003";
        }
        else if(roll>=6895 && roll<=6932)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac2;
            room = "\nRoom No: 2001";
        }
        else if(roll>=6933 && roll<=6982)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac2;
            room = "\nRoom No: 3001";
        }



        else if(roll>=6983 && roll<=7038)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac3;
            room = "\nRoom No: 11(Tin Shed)";
        }
        else if(roll>=7039 && roll<=7118)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac3;
            room = "\nRoom No: 12(Tin Shed)";
        }



        else if(roll>=7119 && roll<=7164)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac4;
            room = "\nRoom No: 13(Tin Shed)";
        }



        else if(roll>=7165 && roll<=7198)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac5;
            room = "\nRoom No: 18(Tin Shed)";
        }



        else if(roll>=7199 && roll<=7230)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac6;
            room = "\nRoom No: 12(Tin Shed)";
        }
        else if(roll>=7231 && roll<=7255)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac6;
            room = "\nRoom No: 12(Tin Shed)";
        }
        else if(roll>=7256 && roll<=7291)
        {
            center = "Center: "+cmmac;
            building = "\nBuilding: "+bcmmac6;
            room = "\nRoom No: 12(Tin Shed)";
        }



        else if(roll>=7292 && roll<=7371)
        {
            center = "Center: "+cmgmh;
            room = "\nRoom No: 102";
        }
        else if(roll>=7372 && roll<=7471)
        {
            center = "Center: "+cmgmh;
            room = "\nRoom No: 103";
        }
        else if(roll>=7472 && roll<=7561)
        {
            center = "Center: "+cmgmh;
            room = "\nRoom No: 204";
        }
        else if(roll>=7562 && roll<=7631)
        {
            center = "Center: "+cmgmh;
            room = "\nRoom No: 205";
        }
        else if(roll>=7632 && roll<=7691)
        {
            center = "Center: "+cmgmh;
            room = "\nRoom No: 304";
        }
        else if(roll>=7692 && roll<=7751)
        {
            center = "Center: "+cmgmh;
            room = "\nRoom No: 305";
        }
        else if(roll>=7752 && roll<=7801)
        {
            center = "Center: "+cmgmh;
            room = "\nRoom No: 306";
        }
        else if(roll>=7802 && roll<=7882)
        {
            center = "Center: "+cmgmh;
            room = "\nRoom No: 307";
        }
        else if(roll>=7883 && roll<=7963)
        {
            center = "Center: "+cmgmh;
            room = "\nRoom No: 308";
        }
        else if(roll>=7964 && roll<=8058)
        {
            center = "Center: "+cmgmh;
            room = "\nRoom No: 313";
        }
        else if(roll>=8059 && roll<=8118)
        {
            center = "Center: "+cmgmh;
            room = "\nRoom No: 314";
        }
        else if(roll>=8119 && roll<=8174)
        {
            center = "Center: "+cmgmh;
            room = "\nRoom No: 401";
        }
        else if(roll>=8175 && roll<=8230)
        {
            center = "Center: "+cmgmh;
            room = "\nRoom No: 402";
        }
        else if(roll>=8231 && roll<=8285)
        {
            center = "Center: "+cmgmh;
            room = "\nRoom No: 403";
        }
        else if(roll>=8286 && roll<=8335)
        {
            center = "Center: "+cmgmh;
            room = "\nRoom No: 405";
        }
        else if(roll>=8336 && roll<=8391)
        {
            center = "Center: "+cmgmh;
            room = "\nRoom No: 406";
        }



        else if(roll>=8392 && roll<=8425)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 105";
        }
        else if(roll>=8426 && roll<=8459)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 106";
        }
        else if(roll>=8460 && roll<=8493)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 107";
        }
        else if(roll>=8494 && roll<=8527)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 205";
        }
        else if(roll>=8528 && roll<=8561)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 206";
        }
        else if(roll>=8562 && roll<=8595)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 207";
        }
        else if(roll>=8596 && roll<=8629)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 305";
        }
        else if(roll>=8630 && roll<=8663)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 306";
        }
        else if(roll>=8664 && roll<=8697)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 307";
        }
        else if(roll>=8698 && roll<=8731)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 110";
        }
        else if(roll>=8732 && roll<=8765)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 111";
        }
        else if(roll>=8766 && roll<=8799)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 112";
        }
        else if(roll>=8800 && roll<=8833)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 208";
        }
        else if(roll>=8834 && roll<=8867)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 209";
        }
        else if(roll>=8868 && roll<=8901)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 210";
        }
        else if(roll>=8902 && roll<=8935)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 211";
        }
        else if(roll>=8936 && roll<=8969)
        {
            center = "Center: "+cbgbs;
            room = "\nRoom No: 212";
        }



        else if(roll>=8970 && roll<=9003)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 01";
        }
        else if(roll>=9004 && roll<=9037)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 02";
        }
        else if(roll>=9038 && roll<=9071)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 03";
        }
        else if(roll>=9072 && roll<=9107)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 04";
        }
        else if(roll>=9108 && roll<=9141)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 05";
        }
        else if(roll>=9142 && roll<=9175)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 06";
        }
        else if(roll>=9176 && roll<=9209)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 07";
        }
        else if(roll>=9210 && roll<=9243)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 08";
        }
        else if(roll>=9244 && roll<=9279)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 09";
        }
        else if(roll>=9280 && roll<=9313)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 10";
        }
        else if(roll>=9314 && roll<=9351)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 11";
        }
        else if(roll>=9352 && roll<=9387)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 12";
        }
        else if(roll>=9388 && roll<=9423)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 13";
        }
        else if(roll>=9424 && roll<=9459)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 14";
        }
        else if(roll>=9460 && roll<=9497)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 15";
        }
        else if(roll>=9498 && roll<=9533)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 16";
        }
        else if(roll>=9534 && roll<=9561)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 17";
        }
        else if(roll>=9562 && roll<=9589)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 18";
        }
        else if(roll>=9590 && roll<=9617)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 19";
        }
        else if(roll>=9618 && roll<=9651)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 20";
        }
        else if(roll>=9652 && roll<=9685)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: 21";
        }
        else if(roll>=9686 && roll<=9743)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: Hall Room-1";
        }
        else if(roll>=9744 && roll<=9787)
        {
            center = "Center: "+cbggs;
            room = "\nRoom No: Hall Room-2";
        }
        else if(roll>=9788 && roll<=9827)
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
