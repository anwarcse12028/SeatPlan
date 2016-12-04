package com.hussen.anwar.mbstuseatplan_2015;

/**
 * Created by ANWAR on 11/20/2015.
 */
public class UnitB extends CenterBuilding  {
    String result;
    String center;
    String building;
    String room;


    public String student_info(int roll) {
        result = "";
        center = "";
        building = "";
        room = "";
//Range 30001 to 34891


        //Center : MBSTU Start
        if(roll>=30001 && roll<=30030)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: ESRM-102";
        }
        else if(roll>=30031 && roll<=30058)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: ESRM-103";
        }
        else if(roll>=30059 && roll<=30143)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: ESRM-104 (Seminar)";
        }
        else if(roll>=30144 && roll<=30183)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: CPS-113";
        }
        else if(roll>=30184 && roll<=30258)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: CPS-114";
        }
        else if(roll>=30259 && roll<=30286)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: CPS-116";
        }
        else if(roll>=30287 && roll<=30318)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: CSE-214";
        }
        else if(roll>=30319 && roll<=30346)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: CSE-215";
        }
        else if(roll>=30347 && roll<=30374)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: ICT-202(A)";
        }
        else if(roll>=30375 && roll<=30406)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding"+bcmbstu1;
            room = "\nRoom No: ICT-202(B)";
        }

        else if(roll>=30407 && roll<=30471)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: ICT-205";
        }
        else if(roll>=30472 && roll<=30507)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: FTNS-301";
        }
        else if(roll>=30508 && roll<=30547)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: FTNS-302";
        }
        else if(roll>=30548 && roll<=30577)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: FTNS-303";
        }
        else if(roll>=30578 && roll<=30651)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: BGE-310 (A)";
        }
        else if(roll>=30652 && roll<=30681)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: BGE-310 (B)";
        }
        else if(roll>=30682 && roll<=30705)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: BGE-311";
        }
        else if(roll>=30706 && roll<=30735)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: BBA- 401";
        }
        else if(roll>=30736 && roll<=30781)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: BBA- 402";
        }
        else if(roll>=30782 && roll<=30848)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: BBA (Conference Room)";
        }
        else if(roll>=30849 && roll<=30882)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: CHEM 401";
        }
        else if(roll>=30883 && roll<=30908)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: CHEM 402";
        }
        else if(roll>=30909 && roll<=30968)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu1;
            room = "\nRoom No: CHEM 407(Conference Room)";
        }

        else if(roll>=30969 && roll<=31088)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: 201 Reading Room ";
        }

        else if(roll>=31089 && roll<=31122)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: PHY-301 ";
        }
        else if(roll>=31123 && roll<=31156)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: PHY-302 ";
        }
        else if(roll>=31157 && roll<=31190)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: PHY-303 ";
        }
        else if(roll>=31191 && roll<=31222)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: Math- 301 ";
        }
        else if(roll>=31223 && roll<=31254)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: Math- 302 ";
        }
        else if(roll>=31255 && roll<=31284)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: Math- 303 ";
        }
        else if(roll>=31285 && roll<=31324)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No:  Reference Room (3rd floor) ";
        }
        else if(roll>=31325 && roll<=31356)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: CSE-401 ";
        }
        else if(roll>=31357 && roll<=31392)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: ECO-501 ";
        }
        else if(roll>=31393 && roll<=31428)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: ECO-502 ";
        }
        else if(roll>=31429 && roll<=31464)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: STAT-501";
        }
        else if(roll>=31465 && roll<=31508)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: STAT-502";
        }
        else if(roll>=31509 && roll<=31556)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu2;
            room = "\nRoom No: STAT-503";
        }
        else if(roll>=31557 && roll<=31598)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-01";
        }
        else if(roll>=31599 && roll<=31640)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-02";
        }
        else if(roll>=31641 && roll<=31682)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-03";
        }
        else if(roll>=31683 && roll<=31724)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-04";
        }
        else if(roll>=31725 && roll<=31766)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-05";
        }
        else if(roll>=31767 && roll<=31788)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-06";
        }
        else if(roll>=31789 && roll<=31830)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-07";
        }
        else if(roll>=31831 && roll<=31872)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-08";
        }
        else if(roll>=31873 && roll<=31914)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-09";
        }
        else if(roll>=31915 && roll<=31966)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-10";
        }
        else if(roll>=31967 && roll<=32006)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu3;
            room = "\nRoom No: BS-11";
        }
        else if(roll>=32007 && roll<=32026)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu4;
            room = "\nRoom No: Tin Shed  101 ";
        }
        else if(roll>=32027 && roll<=32058)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu4;
            room = "\nRoom No: Tin Shed  102 ";
        }
        else if(roll>=32059 && roll<=32082)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu4;
            room = "\nRoom No: Tin Shed  103 ";
        }
        else if(roll>=32083 && roll<=32108)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu4;
            room = "\nRoom No: Tin Shed  104 ";
        }
        else if(roll>=32109 && roll<=32128)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu4;
            room = "\nRoom No: Tin Shed  105 ";
        }
        else if(roll>=32129 && roll<=32158)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu4;
            room = "\nRoom No:OB 106 ";
        }
        else if(roll>=32159 && roll<=32188)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu4;
            room = "\nRoom No:OB 108 ";
        }
        else if(roll>=32189 && roll<=32214)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu4;
            room = "\nRoom No:OB 111 ";
        }
        else if(roll>=32215 && roll<=32246)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu4;
            room = "\nRoom No:OB 202 ";
        }
        else if(roll>=32247 && roll<=32294)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu5;
            room = "\nRoom No:VOC-01";
        }
        else if(roll>=32295 && roll<=32326)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu5;
            room = "\nRoom No:VOC-02";
        }
        else if(roll>=32327 && roll<=32346)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu5;
            room = "\nRoom No:VOC-03";
        }

        else if(roll>=32347 && roll<=32376)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu6;
            room = "\nRoom No:BSC-01";
        }
        else if(roll>=32377 && roll<=32406)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu6;
            room = "\nRoom No:BSC-02";
        }
        else if(roll>=32407 && roll<=32426)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu7;
            room = "\nRoom No: 02";
        }
        else if(roll>=32427 && roll<=32446)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu7;
            room = "\nRoom No: 03";
        }
        else if(roll>=32447 && roll<=32466)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu7;
            room = "\nRoom No: 04";
        }
        else if(roll>=32467 && roll<=32516)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 01";
        }
        else if(roll>=32517 && roll<=32566)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 02";
        }
        else if(roll>=32567 && roll<=32616)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 03";
        }
        else if(roll>=32617 && roll<=32666)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 04";
        }
        else if(roll>=32667 && roll<=32716)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 05";
        }
        else if(roll>=32717 && roll<=32766)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 06";
        }
        else if(roll>=32767 && roll<=32806)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 07";
        }
        else if(roll>=32807 && roll<=32846)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 08";
        }
        else if(roll>=32847 && roll<=32882)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 09";
        }
        else if(roll>=32883 && roll<=32910)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 10";
        }
        else if(roll>=32911 && roll<=32934)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu8;
            room = "\nRoom No: 11";
        }
        else if(roll>=32935 && roll<=32948)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu9;
            room = "\nRoom No: 01";
        }
        else if(roll>=32949 && roll<=32962)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu9;
            room = "\nRoom No: 02";
        }
        else if(roll>=32963 && roll<=32972)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu9;
            room = "\nRoom No: 03";
        }
        else if(roll>=32973 && roll<=32992)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu10;
            room = "\nRoom No: 01";
        }
        else if(roll>=32993 && roll<=33012)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu10;
            room = "\nRoom No: 02";
        }
        else if(roll>=33013 && roll<=33032)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu10;
            room = "\nRoom No: 03";
        }
        else if(roll>=33033 && roll<=33064)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu11;
            room = "\nRoom No: 101";
        }
        else if(roll>=33065 && roll<=33094)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu11;
            room = "\nRoom No: 102";
        }
        else if(roll>=33095 && roll<=33158)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu11;
            room = "\nRoom No: 103";
        }
        else if(roll>=33159 && roll<=33177)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu11;
            room = "\nRoom No: 104";
        }
        else if(roll>=33178 && roll<=33211)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu11;
            room = "\nRoom No: 105";
        }
        else if(roll>=33212 && roll<=33257)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu11;
            room = "\nRoom No: 201";
        }
        else if(roll>=33258 && roll<=33329)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu11;
            room = "\nRoom No: 203";
        }
        else if(roll>=33330 && roll<=33375)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu11;
            room = "\nRoom No: 301";
        }
        else if(roll>=33376 && roll<=33421)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu11;
            room = "\nRoom No: 302";
        }
        else if(roll>=33422 && roll<=33493)
        {
            center = "Center: "+cmbstu;
            building = "\nBuilding: "+bcmbstu11;
            room = "\nRoom No: 303";
        }

        //Center : MBSTU (Close)


        //Center :Kumudini Govt. College (Start)

        else if(roll>=33494 && roll<=33523)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 04";
        }
        else if(roll>=33524 && roll<=33563)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 06";
        }
        else if(roll>=33564 && roll<=33601)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 07";
        }
        else if(roll>=33602 && roll<=33705)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 08";
        }
        else if(roll>=33706 && roll<=33801)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 09";
        }
        else if(roll>=33802 && roll<=33837)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 10";
        }
        else if(roll>=33838 && roll<=33971)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 16";
        }
        else if(roll>=33972 && roll<=33995)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 17";
        }
        else if(roll>=33996 && roll<=34049)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 19";
        }
        else if(roll>=34050 && roll<=34101)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 24";
        }
        else if(roll>=34102 && roll<=34151)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 25";
        }
        else if(roll>=34152 && roll<=34201)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 26";
        }
        else if(roll>=34202 && roll<=34241)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 27";
        }
        else if(roll>=34242 && roll<=34281)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 31";
        }
        else if(roll>=34282 && roll<=34331)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 32";
        }
        else if(roll>=34332 && roll<=34419)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 33(B)";
        }
        else if(roll>=34420 && roll<=34511)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 34";
        }
        else if(roll>=34512 && roll<=34565)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 35";
        }
        else if(roll>=34566 && roll<=34629)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 36";
        }
        else if(roll>=34630 && roll<=34703)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 37";
        }
        else if(roll>=34704 && roll<=34823)
        {
            center = "Center: "+ckgc;
            room = "\nRoom No: 38";
        }
        else if(roll>=34824 && roll<=34851)
        {
            center = "Center: "+ckgc;
            room = "\nRoom : Economics Seminer";
        }
        else if(roll>=34852 && roll<=34871)
        {
            center = "Center: "+ckgc;
            room = "\nRoom : Physics Lab";
        }
        else if(roll>=34872 && roll<=34891)
        {
            center = "Center: "+ckgc;
            room = "\nRoom : Chemistry Lab";
        }
        // Center : Kumudini Govt. College (Close)

        result = center+building+room;
        if(result.equals(""))
            return " Sorry! \n Roll Number Not Found. \nPlease Enter Correct Roll Number \nor \n Select Correct Unit";
        else
            return center+"\n"+building+"\n"+room;

    }
}
