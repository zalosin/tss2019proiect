package pachet2;
import pachet1.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyClassTest {

    @Test(expected = IllegalArgumentException.class)
    public void testEquivalence_C2_C3() {
        Solution tester = new Solution();
        tester.solve(1000,new int[]{},0,0,0);
        tester.solve(-1000,new int[]{},0,0,0);
    }

    @Test
    public void testEquivalence_C11_C12() {
        Solution tester = new Solution();
        assertEquals("{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20} solution should be 3", 3, tester.solve(20,new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},5,3,2));
        assertEquals("{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20} solution should be 0", 0, tester.solve(20,new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},0,0,0));

//        assertEquals("{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20} solution should be 3", 3, tester.solve(20,new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},-5,3,2));
//        assertEquals("{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20} solution should be 3", 3, tester.solve(20,new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},5,-3,2));
//        assertEquals("{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20} solution should be 3", 3, tester.solve(20,new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},5,3,-2));
//        assertEquals("{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20} solution should be 3", 3, tester.solve(20,new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},-5,-3,2));
//        assertEquals("{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20} solution should be 3", 3, tester.solve(20,new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},-5,3,-2));


    }

    @Test(expected = IllegalArgumentException.class)
    public void testFrontier_N(){
        Solution tester = new Solution();
        tester.solve(101,new int[]{},0,0,0);
        tester.solve(0,new int[]{},0,0,0);
    }

    @Test
    public void testFrontier_O() {
        Solution tester = new Solution();
        assertEquals("{1} solution should be 1", 1, tester.solve(1,new int[]{1},1,1,1));
        assertEquals("{1} solution should be 0", 0, tester.solve(1,new int[]{1},0,0,0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCategory_N1_N2_N6_N7(){
        Solution tester = new Solution();
        tester.solve(-15,new int[]{},0,0,0);
        tester.solve(0,new int[]{},0,0,0);
        tester.solve(101,new int[]{},0,0,0);
        tester.solve(115,new int[]{},0,0,0);
    }

    @Test
    public void testCategory_N3(){
        Solution tester = new Solution();
        assertEquals("{1} solution should be 0", 0, tester.solve(1,new int[]{1},-2,-2,-2));
        assertEquals("{1} solution should be 0", 0, tester.solve(1,new int[]{1},0,-2,-2));
        assertEquals("{1} solution should be 0", 0, tester.solve(1,new int[]{1},2,-2,-2));
        assertEquals("{1} solution should be 0", 0, tester.solve(1,new int[]{1},-2,0,-2));
        assertEquals("{1} solution should be 0", 0, tester.solve(1,new int[]{1},-2,2,-2));
        assertEquals("{1} solution should be 0", 0, tester.solve(1,new int[]{1},-2,-2,0));
        assertEquals("{1} solution should be 0", 0, tester.solve(1,new int[]{1},-2,-2,2));
    }

    @Test
    public void testCategory_N4(){
        Solution tester = new Solution();
        assertEquals("{10,20,30,40,50} solution should be 0", 0, tester.solve(5,new int[]{10,20,30,40,50},-2,-2,-2));
        assertEquals("{10,20,30,40,50} solution should be 0", 0, tester.solve(5,new int[]{10,20,30,40,50},0,-2,-2));
        assertEquals("{10,20,30,40,50} solution should be 0", 0, tester.solve(5,new int[]{10,20,30,40,50},2,-2,-2));
        assertEquals("{10,20,30,40,50} solution should be 0", 0, tester.solve(5,new int[]{10,20,30,40,50},-2,0,-2));
        assertEquals("{10,20,30,40,50} solution should be 0", 0, tester.solve(5,new int[]{10,20,30,40,50},-2,2,-2));
        assertEquals("{10,20,30,40,50} solution should be 0", 0, tester.solve(5,new int[]{10,20,30,40,50},-2,-2,0));
        assertEquals("{10,20,30,40,50} solution should be 0", 0, tester.solve(5,new int[]{10,20,30,40,50},-2,-2,2));
    }

    @Test
    public void testCategory_N5(){
        Solution tester = new Solution();
        assertEquals("{} solution should be 0", 0, tester.solve(100,new int[]{10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200,210,220,230,240,250,260,270,280,290,300,310,320,330,340,350,360,370,380,390,400,410,420,430,440,450,460,470,480,490,500,510,520,530,540,550,560,570,580,590,600,610,620,630,640,650,660,670,680,690,700,710,720,730,740,750,760,770,780,790,800,810,820,830,840,850,860,870,880,890,900,910,920,930,940,950,960,970,980,990,1000},-2,-2,-2));
        assertEquals("{} solution should be 0", 0, tester.solve(100,new int[]{10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200,210,220,230,240,250,260,270,280,290,300,310,320,330,340,350,360,370,380,390,400,410,420,430,440,450,460,470,480,490,500,510,520,530,540,550,560,570,580,590,600,610,620,630,640,650,660,670,680,690,700,710,720,730,740,750,760,770,780,790,800,810,820,830,840,850,860,870,880,890,900,910,920,930,940,950,960,970,980,990,1000},0,-2,-2));
        assertEquals("{} solution should be 0", 0, tester.solve(100,new int[]{10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200,210,220,230,240,250,260,270,280,290,300,310,320,330,340,350,360,370,380,390,400,410,420,430,440,450,460,470,480,490,500,510,520,530,540,550,560,570,580,590,600,610,620,630,640,650,660,670,680,690,700,710,720,730,740,750,760,770,780,790,800,810,820,830,840,850,860,870,880,890,900,910,920,930,940,950,960,970,980,990,1000},2,-2,-2));
        assertEquals("{} solution should be 0", 0, tester.solve(100,new int[]{10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200,210,220,230,240,250,260,270,280,290,300,310,320,330,340,350,360,370,380,390,400,410,420,430,440,450,460,470,480,490,500,510,520,530,540,550,560,570,580,590,600,610,620,630,640,650,660,670,680,690,700,710,720,730,740,750,760,770,780,790,800,810,820,830,840,850,860,870,880,890,900,910,920,930,940,950,960,970,980,990,1000},-2,0,-2));
        assertEquals("{} solution should be 0", 0, tester.solve(100,new int[]{10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200,210,220,230,240,250,260,270,280,290,300,310,320,330,340,350,360,370,380,390,400,410,420,430,440,450,460,470,480,490,500,510,520,530,540,550,560,570,580,590,600,610,620,630,640,650,660,670,680,690,700,710,720,730,740,750,760,770,780,790,800,810,820,830,840,850,860,870,880,890,900,910,920,930,940,950,960,970,980,990,1000},-2,2,-2));
        assertEquals("{} solution should be 0", 0, tester.solve(100,new int[]{10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200,210,220,230,240,250,260,270,280,290,300,310,320,330,340,350,360,370,380,390,400,410,420,430,440,450,460,470,480,490,500,510,520,530,540,550,560,570,580,590,600,610,620,630,640,650,660,670,680,690,700,710,720,730,740,750,760,770,780,790,800,810,820,830,840,850,860,870,880,890,900,910,920,930,940,950,960,970,980,990,1000},-2,-2,0));
        assertEquals("{} solution should be 0", 0, tester.solve(100,new int[]{10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200,210,220,230,240,250,260,270,280,290,300,310,320,330,340,350,360,370,380,390,400,410,420,430,440,450,460,470,480,490,500,510,520,530,540,550,560,570,580,590,600,610,620,630,640,650,660,670,680,690,700,710,720,730,740,750,760,770,780,790,800,810,820,830,840,850,860,870,880,890,900,910,920,930,940,950,960,970,980,990,1000},-2,-2,2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNivelInstructiune1(){
        Solution tester = new Solution();
        tester.solve(0,new int[]{},0,0,0);
        tester.solve(1,new int[]{1,2},0,0,0);
    }

    @Test
    public void testNivelInstructiune2(){
        Solution tester = new Solution();
        assertEquals("{1} solution should be 1", 1, tester.solve(1,new int[]{1},1,1,1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCondition1(){
        Solution tester = new Solution();
        tester.solve(0,new int[]{},0,0,0);
        tester.solve(101,new int[]{},0,0,0);
        tester.solve(1,new int[]{1,2},0,0,0);
    }

    @Test
    public void testCondition2(){
        Solution tester = new Solution();
        assertEquals("{1} solution should be 1", 1, tester.solve(1,new int[]{1},1,1,1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDecizie1(){
        Solution tester = new Solution();
        tester.solve(100,new int[]{},0,0,0);
        tester.solve(1,new int[]{1,2},0,0,0);
    }

    @Test
    public void testDecizie2(){
        Solution tester = new Solution();
        assertEquals("{1} solution should be 1", 1, tester.solve(1,new int[]{1},1,1,1));
    }


}