package com.hussen.anwar.mbstuseatplan_2015;

/**
 * Created by ANWAR on 11/20/2015.
 */
public class UnitD extends CenterBuilding  {
    String result;
    String center;
    String building;
    String room;

    public  String student_info(int roll){
        result= "";
        center = "";
        building ="";
        room = "";

        //Center : MBSTU Start
        if(roll>=90001 && roll<=90030)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: ESRM-102";
        }
        else if(roll>=90031 && roll<=90058)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: ESRM-103";
        }
        else if(roll>=90059 && roll<=90143)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: ESRM-104 (Seminar)";
        }
        else if(roll>=90144 && roll<=90183)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: CPS-113";
        }
        else if(roll>=90184 && roll<=90258)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: CPS-114";
        }
        else if(roll>=90259 && roll<=90286)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: CPS-116";
        }
        else if(roll>=90287 && roll<=90318)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: CSE-214";
        }
        else if(roll>=90319 && roll<=90346)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: CSE-215";
        }
        else if(roll>=90347 && roll<=90374)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: ICT-202(A)";
        }
        else if(roll>=90375 && roll<=90406)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding"+bcmbstu1;
            room = "\nRoom No: ICT-202(B)";
        }

        else if(roll>=90407 && roll<=90471)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: ICT-205";
        }
        else if(roll>=90472 && roll<=90507)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: FTNS-301";
        }
        else if(roll>=90508 && roll<=90547)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: FTNS-302";
        }
        else if(roll>=90548 && roll<=90577)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: FTNS-303";
        }
        else if(roll>=90578 && roll<=90651)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: BGE-310 (A)";
        }
        else if(roll>=90652 && roll<=90681)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: BGE-310 (B)";
        }
        else if(roll>=90682 && roll<=90705)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: BGE-311";
        }
        else if(roll>=90706 && roll<=90735)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: BBA-401";
        }
        else if(roll>=90736 && roll<=90781)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: BBA-402";
        }
        else if(roll>=90782 && roll<=90848)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: BBA (Conference Room)";
        }
        else if(roll>=90849 && roll<=90882)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: CHEM 401";
        }
        else if(roll>=90883 && roll<=90908)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: CHEM 402";
        }
        else if(roll>=90909 && roll<=90968)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: CHEM 407(Conference Room)";
        }

        else if(roll>=90969 && roll<=91088)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: 201 Reading Room ";
        }

        else if(roll>=91089 && roll<=91122)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: PHY-301 ";
        }
        else if(roll>=91123 && roll<=91156)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: PHY-302 ";
        }
        else if(roll>=91157 && roll<=91190)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: PHY-303 ";
        }
        else if(roll>=91191 && roll<=91222)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: Math- 301 ";
        }
        else if(roll>=91223 && roll<=91254)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: Math- 302 ";
        }
        else if(roll>=91255 && roll<=91284)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: Math- 303 ";
        }
        else if(roll>=91285 && roll<=91324)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No:  Reference Room (3rd floor) ";
        }
        else if(roll>=91325 && roll<=91356)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: CSE-401 ";
        }
        else if(roll>=91357 && roll<=91392)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: ECO-501 ";
        }
        else if(roll>=91393 && roll<=91428)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: ECO-502 ";
        }
        else if(roll>=91429 && roll<=91464)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: STAT-501";
        }
        else if(roll>=91465 && roll<=91508)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: STAT-502";
        }
        else if(roll>=91509 && roll<=91556)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: STAT-503";
        }
        else if(roll>=91557 && roll<=91598)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-01";
        }
        else if(roll>=91599 && roll<=91640)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-02";
        }
        else if(roll>=91641 && roll<=91682)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-03";
        }
        else if(roll>=91683 && roll<=91724)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-04";
        }
        else if(roll>=91725 && roll<=91766)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-05";
        }
        else if(roll>=91767 && roll<=91788)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-06";
        }
        else if(roll>=91789 && roll<=91830)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-07";
        }
        else if(roll>=91831 && roll<=91872)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-08";
        }
        else if(roll>=91873 && roll<=91914)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-09";
        }
        else if(roll>=91915 && roll<=91966)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-10";
        }
        else if(roll>=91967 && roll<=92006)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-11";
        }
        else if(roll>=92007 && roll<=92026)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu4;
            room = "\nRoom No: Tin Shed  101 ";
        }
        else if(roll>=92027 && roll<=92058)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu4;
            room = "\nRoom No: Tin Shed  102 ";
        }
        else if(roll>=92059 && roll<=92082)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu4;
            room = "\nRoom No: Tin Shed  103 ";
        }
        else if(roll>=92083 && roll<=92108)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu4;
            room = "\nRoom No: Tin Shed  104 ";
        }
        else if(roll>=92109 && roll<=92128)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu4;
            room = "\nRoom No: Tin Shed  105 ";
        }
        else if(roll>=92129 && roll<=92158)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu4;
            room = "\nRoom No:OB 106 ";
        }
        else if(roll>=92159 && roll<=92188)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu4;
            room = "\nRoom No:OB 108 ";
        }
        else if(roll>=92189 && roll<=92214)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu4;
            room = "\nRoom No:OB 111 ";
        }
        else if(roll>=92215 && roll<=92246)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu4;
            room = "\nRoom No:OB 202 ";
        }
        else if(roll>=92247 && roll<=92294)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu5;
            room = "\nRoom No:VOC-01";
        }
        else if(roll>=92295 && roll<=92326)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu5;
            room = "\nRoom No:VOC-02";
        }
        else if(roll>=92327 && roll<=92346)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu5;
            room = "\nRoom No:VOC-03";
        }

        else if(roll>=92347 && roll<=92376)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu6;
            room = "\nRoom No:BSC-01";
        }
        else if(roll>=92377 && roll<=92406)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu6;
            room = "\nRoom No:BSC-02";
        }
        else if(roll>=92407 && roll<=92426)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu7;
            room = "\nRoom No: 02";
        }
        else if(roll>=92427 && roll<=92446)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu7;
            room = "\nRoom No: 03";
        }
        else if(roll>=92447 && roll<=92466)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu7;
            room = "\nRoom No: 04";
        }
        else if(roll>=92467 && roll<=92516)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 01";
        }
        else if(roll>=92517 && roll<=92566)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 02";
        }
        else if(roll>=92567 && roll<=92616)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 03";
        }
        else if(roll>=92617 && roll<=92666)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 04";
        }
        else if(roll>=92667 && roll<=92716)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 05";
        }
        else if(roll>=92717 && roll<=92766)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 06";
        }
        else if(roll>=92767 && roll<=92806)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 07";
        }
        else if(roll>=92807 && roll<=92846)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 08";
        }
        else if(roll>=92847 && roll<=92882)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 09";
        }
        else if(roll>=92883 && roll<=92910)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 10";
        }
        else if(roll>=92911 && roll<=92934)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 11";
        }
        else if(roll>=92935 && roll<=92948)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu9;
            room = "\nRoom No: 01";
        }
        else if(roll>=92949 && roll<=92962)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu9;
            room = "\nRoom No: 02";
        }
        else if(roll>=92963 && roll<=92972)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu9;
            room = "\nRoom No: 03";
        }
        else if(roll>=92973 && roll<=92992)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu10;
            room = "\nRoom No: 01";
        }
        else if(roll>=92993 && roll<=93012)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu10;
            room = "\nRoom No: 02";
        }
        else if(roll>=93013 && roll<=93032)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu10;
            room = "\nRoom No: 03";
        }
        else if(roll>=93033 && roll<=93064)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu11;
            room = "\nRoom No: 101";
        }
        else if(roll>=93065 && roll<=93094)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu11;
            room = "\nRoom No: 102";
        }
        else if(roll>=93095 && roll<=93158)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu11;
            room = "\nRoom No: 103";
        }
        else if(roll>=93159 && roll<=93177)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu11;
            room = "\nRoom No: 104";
        }
        else if(roll>=93178 && roll<=93211)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu11;
            room = "\nRoom No: 105";
        }
        else if(roll>=93212 && roll<=93257)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu11;
            room = "\nRoom No: 201";
        }
        else if(roll>=93258 && roll<=93329)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu11;
            room = "\nRoom No: 203";
        }
        else if(roll>=93330 && roll<=93375)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu11;
            room = "\nRoom No: 301";
        }
        else if(roll>=93376 && roll<=93421)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu11;
            room = "\nRoom No: 302";
        }
        else if(roll>=93422 && roll<=93493)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu11;
            room = "\nRoom No: 303";
        }

        //Center : MBSTU (Close)


        //Center :Kumudini Govt. College (Start)

        else if(roll>=93494 && roll<=93523)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 04";
        }
        else if(roll>=93524 && roll<=93563)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 06";
        }
        else if(roll>=93564 && roll<=93601)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 07";
        }
        else if(roll>=93602 && roll<=93705)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 08";
        }
        else if(roll>=93706 && roll<=93801)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 09";
        }
        else if(roll>=93802 && roll<=93837)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 10";
        }
        else if(roll>=93838 && roll<=93971)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 16";
        }
        else if(roll>=93972 && roll<=93995)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 17";
        }
        else if(roll>=93996 && roll<=94049)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 19";
        }
        else if(roll>=94050 && roll<=94101)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 24";
        }
        else if(roll>=94102 && roll<=94151)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 25";
        }
        else if(roll>=94152 && roll<=94201)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 26";
        }
        else if(roll>=94202 && roll<=94241)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 27";
        }
        else if(roll>=94242 && roll<=94281)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 31";
        }
        else if(roll>=94282 && roll<=94331)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 32";
        }
        else if(roll>=94332 && roll<=94419)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 33(B)";
        }
        else if(roll>=94420 && roll<=94511)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 34";
        }
        else if(roll>=94512 && roll<=94567)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 35";
        }
        else if(roll>=94568 && roll<=94602)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 36";
        }

        // Center : Kumudini Govt. College (Close)


        result = center+building+room;
        if(result.equals(""))
            return " Sorry! \n Roll Number Not Found. \nPlease Enter Correct Roll Number \nor \n Select Correct Unit";
        else
            return center+"\n"+building+"\n"+room;
    }

}
