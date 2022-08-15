package day02;

import java.util.Arrays;

    public class Test {


        static int[] arr = new int[400];

        //获取随机数组
        public void a() {
            // TODO Auto-generated method stub

            for (int i = 0; i < arr.length; i++) {

                arr[i] = (int) (Math.random() * 500);
            }
            System.out.println(Arrays.toString(arr));
            //冒泡排序
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));

        }

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            System.out.println("ABC");
            Test t = new Test();
            t.a();
        }




    }