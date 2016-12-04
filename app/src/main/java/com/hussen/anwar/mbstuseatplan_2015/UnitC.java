package com.hussen.anwar.mbstuseatplan_2015;

/**
 * Created by ANWAR on 11/20/2015.
 */
public class UnitC extends  CenterBuilding {
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
        if(roll>=70001 && roll<=70030)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: ESRM-102";
        }
        else if(roll>=70031 && roll<=70058)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: ESRM-103";
        }
        else if(roll>=70059 && roll<=70143)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: ESRM-104 (Seminar)";
        }
        else if(roll>=70144 && roll<=70183)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: CPS-113";
        }
        else if(roll>=70184 && roll<=70258)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: CPS-114";
        }
        else if(roll>=70259 && roll<=70286)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: CPS-116";
        }
        else if(roll>=70287 && roll<=70318)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: CSE-214";
        }
        else if(roll>=70319 && roll<=70346)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: CSE-215";
        }
        else if(roll>=70347 && roll<=70374)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: ICT-202(A)";
        }
        else if(roll>=70375 && roll<=70406)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding"+bcmbstu1;
            room = "\nRoom No: ICT-202(B)";
        }

        else if(roll>=70407 && roll<=70471)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: ICT-205";
        }
        else if(roll>=70472 && roll<=70507)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: FTNS-301";
        }
        else if(roll>=70508 && roll<=70547)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: FTNS-302";
        }
        else if(roll>=70548 && roll<=70577)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: FTNS-303";
        }
        else if(roll>=70578 && roll<=70651)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: BGE-310 (A)";
        }
        else if(roll>=70652 && roll<=70681)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: BGE-310 (B)";
        }
        else if(roll>=70682 && roll<=70705)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: BGE-311";
        }
        else if(roll>=70706 && roll<=70735)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: BBA- 401";
        }
        else if(roll>=70736 && roll<=70781)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: BBA- 402";
        }
        else if(roll>=70782 && roll<=70848)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: BBA (Conference Room)";
        }
        else if(roll>=70849 && roll<=70882)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: CHEM 401";
        }
        else if(roll>=70883 && roll<=70908)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: CHEM 402";
        }
        else if(roll>=70909 && roll<=70968)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: CHEM 407(Conference Room)";
        }

        else if(roll>=70969 && roll<=71088)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: 201 Reading Room ";
        }

        else if(roll>=71089 && roll<=71122)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: PHY-301 ";
        }
        else if(roll>=71123 && roll<=71156)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: PHY-302 ";
        }
        else if(roll>=71157 && roll<=71190)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: PHY-303 ";
        }
        else if(roll>=71191 && roll<=71222)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: Math- 301 ";
        }
        else if(roll>=71223 && roll<=71254)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: Math- 302 ";
        }
        else if(roll>=71255 && roll<=71284)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: Math- 303 ";
        }
        else if(roll>=71285 && roll<=71324)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No:  Reference Room (3rd floor) ";
        }
        else if(roll>=71325 && roll<=71356)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: CSE-401 ";
        }
        else if(roll>=71357 && roll<=71392)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: ECO-501 ";
        }
        else if(roll>=71393 && roll<=71428)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: ECO-502 ";
        }
        else if(roll>=71429 && roll<=71464)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: STAT-501";
        }
        else if(roll>=71465 && roll<=71508)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: STAT-502";
        }
        else if(roll>=71509 && roll<=71556)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: STAT-503";
        }
        else if(roll>=71557 && roll<=71598)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-01";
        }
        else if(roll>=71599 && roll<=71640)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-02";
        }
        else if(roll>=71641 && roll<=71682)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-03";
        }
        else if(roll>=71683 && roll<=71724)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-04";
        }
        else if(roll>=71725 && roll<=71766)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-05";
        }
        else if(roll>=71767 && roll<=71788)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-06";
        }
        else if(roll>=71789 && roll<=71830)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-07";
        }
        else if(roll>=71831 && roll<=71872)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-08";
        }
        else if(roll>=71873 && roll<=71914)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-09";
        }
        else if(roll>=71915 && roll<=71966)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-10";
        }
        else if(roll>=71967 && roll<=72006)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-11";
        }
        else if(roll>=72007 && roll<=72026)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu4;
            room = "\nRoom No: Tin Shed  101 ";
        }
        else if(roll>=72027 && roll<=72058)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu4;
            room = "\nRoom No: Tin Shed  102 ";
        }
        else if(roll>=72059 && roll<=72082)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu4;
            room = "\nRoom No: Tin Shed  103 ";
        }
        else if(roll>=72083 && roll<=72108)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu4;
            room = "\nRoom No: Tin Shed  104 ";
        }
        else if(roll>=72109 && roll<=72128)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu4;
            room = "\nRoom No: Tin Shed  105 ";
        }
        else if(roll>=72129 && roll<=72158)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu4;
            room = "\nRoom No:OB 106 ";
        }
        else if(roll>=72159 && roll<=72188)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu4;
            room = "\nRoom No:OB 108 ";
        }
        else if(roll>=72189 && roll<=72214)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu4;
            room = "\nRoom No:OB 111 ";
        }
        else if(roll>=72215 && roll<=72246)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu4;
            room = "\nRoom No:OB 202 ";
        }
        else if(roll>=72247 && roll<=72294)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu5;
            room = "\nRoom No:VOC-01";
        }
        else if(roll>=72295 && roll<=72326)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu5;
            room = "\nRoom No:VOC-02";
        }
        else if(roll>=72327 && roll<=72346)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu5;
            room = "\nRoom No:VOC-03";
        }

        else if(roll>=72347 && roll<=72376)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu6;
            room = "\nRoom No:BSC-01";
        }
        else if(roll>=72377 && roll<=72406)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu6;
            room = "\nRoom No:BSC-02";
        }
        else if(roll>=72407 && roll<=72426)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu7;
            room = "\nRoom No: 02";
        }
        else if(roll>=72427 && roll<=72446)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu7;
            room = "\nRoom No: 03";
        }
        else if(roll>=72447 && roll<=72466)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu7;
            room = "\nRoom No: 04";
        }
        else if(roll>=72467 && roll<=72516)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 01";
        }
        else if(roll>=72517 && roll<=72566)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 02";
        }
        else if(roll>=72567 && roll<=72616)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 03";
        }
        else if(roll>=72617 && roll<=72666)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 04";
        }
        else if(roll>=72667 && roll<=72716)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 05";
        }
        else if(roll>=72717 && roll<=72766)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 06";
        }
        else if(roll>=72767 && roll<=72806)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 07";
        }
        else if(roll>=72807 && roll<=72846)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 08";
        }
        else if(roll>=72847 && roll<=72882)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 09";
        }
        else if(roll>=72883 && roll<=72910)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 10";
        }
        else if(roll>=72911 && roll<=72934)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 11";
        }
        else if(roll>=72935 && roll<=72948)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu9;
            room = "\nRoom No: 01";
        }
        else if(roll>=72949 && roll<=72962)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu9;
            room = "\nRoom No: 02";
        }
        else if(roll>=72963 && roll<=72972)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu9;
            room = "\nRoom No: 03";
        }
        else if(roll>=72973 && roll<=72992)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu10;
            room = "\nRoom No: 01";
        }
        else if(roll>=72993 && roll<=73012)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu10;
            room = "\nRoom No: 02";
        }
        else if(roll>=73013 && roll<=73032)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu10;
            room = "\nRoom No: 03";
        }
        else if(roll>=73033 && roll<=73064)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu11;
            room = "\nRoom No: 101";
        }
        else if(roll>=73065 && roll<=73094)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu11;
            room = "\nRoom No: 102";
        }
        else if(roll>=73095 && roll<=73158)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu11;
            room = "\nRoom No: 103";
        }
        else if(roll>=73159 && roll<=73177)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu11;
            room = "\nRoom No: 104";
        }
        else if(roll>=73178 && roll<=73211)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu11;
            room = "\nRoom No: 105";
        }
        else if(roll>=73212 && roll<=73257)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu11;
            room = "\nRoom No: 201";
        }
        else if(roll>=73258 && roll<=73329)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu11;
            room = "\nRoom No: 203";
        }
        else if(roll>=73330 && roll<=73375)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu11;
            room = "\nRoom No: 301";
        }
        else if(roll>=73376 && roll<=73421)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu11;
            room = "\nRoom No: 302";
        }
        else if(roll>=73422 && roll<=73493)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu11;
            room = "\nRoom No: 303";
        }

        //Center : MBSTU (Close)


        //Center :Kumudini Govt. College (Start)

        else if(roll>=73494 && roll<=73523)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 04";
        }
        else if(roll>=73524 && roll<=73563)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 06";
        }
        else if(roll>=73564 && roll<=73601)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 07";
        }
        else if(roll>=73602 && roll<=73705)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 08";
        }
        else if(roll>=73706 && roll<=73801)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 09";
        }
        else if(roll>=73802 && roll<=73837)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 10";
        }
        else if(roll>=73838 && roll<=73971)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 16";
        }
        else if(roll>=73972 && roll<=73995)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 17";
        }
        else if(roll>=73996 && roll<=74049)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 19";
        }
        else if(roll>=74050 && roll<=74101)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 24";
        }
        else if(roll>=74102 && roll<=74151)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 25";
        }
        else if(roll>=74152 && roll<=74201)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 26";
        }
        else if(roll>=74202 && roll<=74241)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 27";
        }
        else if(roll>=74242 && roll<=74281)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 31";
        }
        else if(roll>=74282 && roll<=74331)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 32";
        }
        else if(roll>=74332 && roll<=74419)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 33(B)";
        }
        else if(roll>=74420 && roll<=74511)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 34";
        }
        else if(roll>=74512 && roll<=74565)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 35";
        }
        else if(roll>=74566 && roll<=74629)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 36";
        }
        else if(roll>=74630 && roll<=74703)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 37";
        }
        else if(roll>=74704 && roll<=74823)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 38";
        }
        else if(roll>=74824 && roll<=74851)
        {
            center = "Center: "+ckgc;
            room = "\nRoom : Economics Seminer";
        }
        else if(roll>=74852 && roll<=74871)
        {
            center = "Center: "+ckgc;
            room = "\nRoom : Physics Lab";
        }
        else if(roll>=74872 && roll<=74891)
        {
            center = "Center: "+ckgc;
            room = "\nRoom : Chemistry Lab";
        }
        // Center : Kumudini Govt. College (Close)

        // Center : Zahnavi High School (Start)
        else if(roll>=74892 && roll<=74943)
        {
            center = "Center: "+czhs;
            room = "\nRoom No : ZHS-01";
        }
        else if(roll>=74944 && roll<=74995)
        {
            center = "Center: "+czhs;
            room = "\nRoom No : ZHS-02";
        }
        else if(roll>=74996 && roll<=75047)
        {
            center = "Center: "+czhs;
            room = "\nRoom No : ZHS-03";
        }
        else if(roll>=75048 && roll<=75082)
        {
            center = "Center: "+czhs;
            room = "\nRoom No : ZHS-04";
        }
        else if(roll>=75083 && roll<=75123)
        {
            center = "Center: "+czhs;
            room = "\nRoom No : ZHS-05";
        }
        else if(roll>=75128 && roll<=75203)
        {
            center = "Center: "+czhs;
            room = "\nRoom No : ZHS-06";
        }

        // Center : Zahnavi High School (Close)


        result = center+building+room;
        if(result.equals(""))
            return " Sorry! \n Roll Number Not Found. \nPlease Enter Correct Roll Number \nor \n Select Correct Unit";
       else
            return center+"\n"+building+"\n"+room;
    }

}
