/*
* story:我国古代数学家张丘建在《算经》一书中提出的数学问题：鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一，百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？
*
*analyse: 鸡翁：x 鸡母：y  鸡雏：100-x-y
*         5x + 3y + (100-x-y)/3 = 100
*
*
* */

public class Ragnor_03_HundredMoneyHundredChicken {
    public static void main(String[] args) {
        hundredMoneyHundredChicken();

    }

    public static void hundredMoneyHundredChicken(){
//            int x = 0;
//            int y = 0;
//            int z = 100 - (x + y);
//              0< = x < 20
//                0 < = y < 33

            for (int x=0; x < 20; x++){
                for (int y=0; y < 33; y++){
                    int z = 100 - (x+y);
                    if (5*x + 3*y + z/3 == 100 && z % 3 == 0){
                        System.out.print("x is :" + x );
                        System.out.print("y is :" + y);
                        System.out.print("z is :" + z);

                    }
                }
            }
    }
}


