package com.hussen.anwar.mbstuseatplan_2015;

/**
 * Created by ANWAR on 11/20/2015.
 */
public class UnitA extends  CenterBuilding {
    String result;
    String center;
    String building;
    String room;


    public String student_info(int roll) {
        result = "";
        center = "";
        building = "";
        room = "";
//Range 1 to 4891
        //Center : MBSTU Start
        if (roll >= 00001 && roll <= 00030) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu1;
            room = "\nRoom No: ESRM-102";
        } else if (roll >= 31 && roll <= 58) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu1;
            room = "\nRoom No: ESRM-103";
        } else if (roll >= 59 && roll <= 143) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu1;
            room = "\nRoom No: ESRM-104 (Seminar)";
        } else if (roll >= 144 && roll <= 183) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu1;
            room = "\nRoom No: CPS-113";
        } else if (roll >= 184 && roll <= 258) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu1;
            room = "\nRoom No: CPS-114";
        } else if (roll >= 259 && roll <= 286) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu1;
            room = "\nRoom No: CPS-116";
        } else if (roll >= 287 && roll <= 318) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu1;
            room = "\nRoom No: CSE-214";
        } else if (roll >= 319 && roll <= 346) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu1;
            room = "\nRoom No: CSE-215";
        } else if (roll >= 347 && roll <= 374) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu1;
            room = "\nRoom No: ICT-202(A)";
        } else if (roll >= 375 && roll <= 406) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu1;
            room = "\nRoom No: ICT-202(B)";
        } else if (roll >= 407 && roll <= 471) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu1;
            room = "\nRoom No: ICT-205";
        } else if (roll >= 472 && roll <= 507) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu1;
            room = "\nRoom No: FTNS-301";
        } else if (roll >= 508 && roll <= 547) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu1;
            room = "\nRoom No: FTNS-302";
        } else if (roll >= 548 && roll <= 577) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu1;
            room = "\nRoom No: FTNS-303";
        } else if (roll >= 578 && roll <= 651) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu1;
            room = "\nRoom No: BGE-310 (A)";
        } else if (roll >= 652 && roll <= 681) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu1;
            room = "\nRoom No: BGE-310 (B)";
        } else if (roll >= 682 && roll <= 705) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu1;
            room = "\nRoom No: BGE-311";
        } else if (roll >= 706 && roll <= 735) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu1;
            room = "\nRoom No: BBA- 401";
        } else if (roll >= 736 && roll <= 781) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu1;
            room = "\nRoom No: BBA- 402";
        } else if (roll >= 782 && roll <= 848) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu1;
            room = "\nRoom No: BBA (Conference Room)";
        } else if (roll >= 849 && roll <= 882) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu1;
            room = "\nRoom No: CHEM 401";
        } else if (roll >= 883 && roll <= 908) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu1;
            room = "\nRoom No: CHEM 402";
        } else if (roll >= 909 && roll <= 968) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu1;
            room = "\nRoom No: CHEM 407(Conference Room)";
        } else if (roll >= 969 && roll <= 1088) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu2;
            room = "\nRoom No: 201 Reading Room";
        } else if (roll >= 1089 && roll <= 1122) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu2;
            room = "\nRoom No: PHY-301";
        } else if (roll >= 1123 && roll <= 1156) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu2;
            room = "\nRoom No: PHY-302";
        } else if (roll >= 1157 && roll <= 1190) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu2;
            room = "\nRoom No: PHY-303";
        } else if (roll >= 1191 && roll <= 1222) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu2;
            room = "\nRoom No: Math- 301";
        } else if (roll >= 1223 && roll <= 1254) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu2;
            room = "\nRoom No: Math- 302";
        } else if (roll >= 1255 && roll <= 1284) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu2;
            room = "\nRoom No: Math- 303";
        } else if (roll >= 1285 && roll <= 1324) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu2;
            room = "\nRoom No:  Reference Room (3rd floor)";
        } else if (roll >= 1325 && roll <= 1356) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu2;
            room = "\nRoom No: CSE-401 ";
        } else if (roll >= 1357 && roll <= 1392) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu2;
            room = "\nRoom No: ECO-501";
        } else if (roll >= 1393 && roll <= 1428) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu2;
            room = "\nRoom No: ECO-502";
        } else if (roll >= 1429 && roll <= 1464) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu2;
            room = "\nRoom No: STAT-501";
        } else if (roll >= 1465 && roll <= 1508) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu2;
            room = "\nRoom No: STAT-502";
        } else if (roll >= 1509 && roll <= 1556) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu2;
            room = "\nRoom No: STAT-503";
        } else if (roll >= 1557 && roll <= 1598) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu3;
            room = "\nRoom No: BS 01";
        } else if (roll >= 1599 && roll <= 1640) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu3;
            room = "\nRoom No: BS 02";
        } else if (roll >= 1641 && roll <= 1682) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu3;
            room = "\nRoom No: BS 03";
        } else if (roll >= 1683 && roll <= 1724) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu3;
            room = "\nRoom No: BS 04";
        } else if (roll >= 1725 && roll <= 1766) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu3;
            room = "\nRoom No: BS 05";
        } else if (roll >= 1767 && roll <= 1788) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu3;
            room = "\nRoom No: BS 06";
        } else if (roll >= 1789 && roll <= 1830) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu3;
            room = "\nRoom No: BS 07";
        } else if (roll >= 1831 && roll <= 1872) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu3;
            room = "\nRoom No: BS 08";
        } else if (roll >= 1873 && roll <= 1914) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu3;
            room = "\nRoom No: BS 09";
        } else if (roll >= 1915 && roll <= 1966) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu3;
            room = "\nRoom No: BS 10";
        } else if (roll >= 1967 && roll <= 2006) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu3;
            room = "\nRoom No: BS 11";
        } else if (roll >= 2007 && roll <= 2026) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu4;
            room = "\nRoom No: Tin Shed  101 ";
        } else if (roll >= 2027 && roll <= 2058) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu4;
            room = "\nRoom No: Tin Shed  102 ";
        } else if (roll >= 2059 && roll <= 2082) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu4;
            room = "\nRoom No: Tin Shed  103";
        } else if (roll >= 2083 && roll <= 2108) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu4;
            room = "\nRoom No: Tin Shed  104";
        } else if (roll >= 2109 && roll <= 2128) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu4;
            room = "\nRoom No: Tin Shed  105 ";
        } else if (roll >= 2129 && roll <= 2158) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu4;
            room = "\nRoom No: OB 106";
        } else if (roll >= 2159 && roll <= 2188) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu4;
            room = "\nRoom No: OB 108";
        } else if (roll >= 2189 && roll <= 2214) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu4;
            room = "\nRoom No: OB 111";
        } else if (roll >= 2215 && roll <= 2246) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu4;
            room = "\nRoom No: OB 202";
        } else if (roll >= 2247 && roll <= 2294) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu5;
            room = "\nRoom No: VOC-01";
        } else if (roll >= 2295 && roll <= 2326) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu5;
            room = "\nRoom No: VOC-02";
        } else if (roll >= 2327 && roll <= 2346) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu5;
            room = "\nRoom No: VOC-03";
        } else if (roll >= 2347 && roll <= 2376) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu6;
            room = "\nRoom No: BSC-01";
        } else if (roll >= 2377 && roll <= 2406) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu6;
            room = "\nRoom No: BSC-02";
        } else if (roll >= 2407 && roll <= 2426) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu7;
            room = "\nRoom No: 2";
        } else if (roll >= 2427 && roll <= 2446) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu7;
            room = "\nRoom No: 3";
        } else if (roll >= 2447 && roll <= 2466) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu7;
            room = "\nRoom No: 4";
        } else if (roll >= 2467 && roll <= 2516) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu8;
            room = "\nRoom No: 01";
        } else if (roll >= 2517 && roll <= 2566) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu8;
            room = "\nRoom No: 02";
        } else if (roll >= 2567 && roll <= 2616) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu8;
            room = "\nRoom No: 03";
        } else if (roll >= 2617 && roll <= 2666) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu8;
            room = "\nRoom No: 04";
        } else if (roll >= 2667 && roll <= 2716) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu8;
            room = "\nRoom No: 05";
        } else if (roll >= 2717 && roll <= 2766) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu8;
            room = "\nRoom No: 06";
        } else if (roll >= 2767 && roll <= 2806) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu8;
            room = "\nRoom No: 07";
        } else if (roll >= 2807 && roll <= 2846) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu8;
            room = "\nRoom No: 08";
        } else if (roll >= 2847 && roll <= 2882) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu8;
            room = "\nRoom No: 09";
        } else if (roll >= 2883 && roll <= 2910) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu8;
            room = "\nRoom No: 10";
        } else if (roll >= 2911 && roll <= 2934) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu8;
            room = "\nRoom No: 11";
        } else if (roll >= 2935 && roll <= 2948) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu9;
            room = "\nRoom No: 01";
        } else if (roll >= 2949 && roll <= 2962) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu9;
            room = "\nRoom No: 02";
        } else if (roll >= 2963 && roll <= 2972) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu9;
            room = "\nRoom No: 03";
        } else if (roll >= 2973 && roll <= 2992) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu10;
            room = "\nRoom No: 01";
        } else if (roll >= 2993 && roll <= 3012) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu10;
            room = "\nRoom No: 02";
        } else if (roll >= 3013 && roll <= 3032) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu10;
            room = "\nRoom No: 03";
        } else if (roll >= 3033 && roll <= 3064) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu10;
            room = "\nRoom No: 101";
        } else if (roll >= 3065 && roll <= 3094) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu10;
            room = "\nRoom No: 102";
        } else if (roll >= 3095 && roll <= 3158) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu10;
            room = "\nRoom No: 103";
        } else if (roll >= 3159 && roll <= 3177) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu10;
            room = "\nRoom No: 104";
        } else if (roll >= 3178 && roll <= 3211) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu10;
            room = "\nRoom No: 105";
        } else if (roll >= 3212 && roll <= 3257) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu10;
            room = "\nRoom No: 201";
        } else if (roll >= 3258 && roll <= 3329) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu10;
            room = "\nRoom No: 203";
        } else if (roll >= 3330 && roll <= 3375) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu10;
            room = "\nRoom No: 301";
        } else if (roll >= 3376 && roll <= 3421) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu10;
            room = "\nRoom No: 302";
        } else if (roll >= 3422 && roll <= 3493) {
            center = "Center: " + cmbstu;
            building = "\nBuilding: " + bcmbstu10;
            room = "\nRoom No: 303";
        } else if (roll >= 3494 && roll <= 3523) {
            center = "Center: " + ckgc;
            room = "\nRoom No: 04";
        } else if (roll >= 3524 && roll <= 3563) {
            center = "Center: " + ckgc;
            room = "\nRoom No: 06";
        } else if (roll >= 3564 && roll <= 3601) {
            center = "Center: " + ckgc;
            room = "\nRoom No: 07";
        } else if (roll >= 3602 && roll <= 3705) {
            center = "Center: " + ckgc;
            room = "\nRoom No: 08";
        } else if (roll >= 3706 && roll <= 3801) {
            center = "Center: " + ckgc;
            room = "\nRoom No: 09";
        } else if (roll >= 3802 && roll <= 3837) {
            center = "Center: " + ckgc;
            room = "\nRoom No: 10";
        } else if (roll >= 3838 && roll <= 3971) {
            center = "Center: " + ckgc;
            room = "\nRoom No: 16";
        } else if (roll >= 3972 && roll <= 3995) {
            center = "Center: " + ckgc;
            room = "\nRoom No: 17";
        } else if (roll >= 3996 && roll <= 4049) {
            center = "Center: " + ckgc;
            room = "\nRoom No: 19";
        } else if (roll >= 4050 && roll <= 4101) {
            center = "Center: " + ckgc;
            room = "\nRoom No: 24";
        } else if (roll >= 4102 && roll <= 4151) {
            center = "Center: " + ckgc;
            room = "\nRoom No: 25";
        } else if (roll >= 4152 && roll <= 4201) {
            center = "Center: " + ckgc;
            room = "\nRoom No: 26";
        } else if (roll >= 4202 && roll <= 4241) {
            center = "Center: " + ckgc;
            room = "\nRoom No: 27";
        } else if (roll >= 4242 && roll <= 4281) {
            center = "Center: " + ckgc;
            room = "\nRoom No: 31";
        } else if (roll >= 4282 && roll <= 4331) {
            center = "Center: " + ckgc;
            room = "\nRoom No: 32";
        } else if (roll >= 4332 && roll <= 4419) {
            center = "Center: " + ckgc;
            room = "\nRoom No: 33(B)";
        } else if (roll >= 4420 && roll <= 4511) {
            center = "Center: " + ckgc;
            room = "\nRoom No: 34";
        } else if (roll >= 4512 && roll <= 4565) {
            center = "Center: " + ckgc;
            room = "\nRoom No: 35";
        } else if (roll >= 4566 && roll <= 4629) {
            center = "Center: " + ckgc;
            room = "\nRoom No: 36";
        } else if (roll >= 4630 && roll <= 4703) {
            center = "Center: " + ckgc;
            room = "\nRoom No: 37";
        } else if (roll >= 4704 && roll <= 4823) {
            center = "Center: " + ckgc;
            room = "\nRoom No: 38";
        } else if (roll >= 4824 && roll <= 4851) {
            center = "Center: " + ckgc;
            room = "\nRoom No: Economics Seminer";
        } else if (roll >= 4852 && roll <= 4871) {
            center = "Center: " + ckgc;
            room = "\nRoom No: Physics Lab";
        } else if (roll >= 4872 && roll <= 4891) {
            center = "Center: " + ckgc;
            room = "\nRoom No: Chemistry Lab";
        }
        result = center+building+room;
        if(result.equals(""))
            return " Sorry! \n Roll Number Not Found. \nPlease Enter Correct Roll Number \nor \n Select Correct Unit";
        else
            return center+"\n"+building+"\n"+room;
    }
}
