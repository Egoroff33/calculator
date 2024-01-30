public class DemoTreeDMatrix {
    public static void main(String[] args) {
        int [][][] TreeMatrix = new int [3][4][5];
        int i, j, k;
        String str = "ебаные многомерные массивы";

        for (i = 0; i < TreeMatrix.length; i++) {
            for (j = 0; j < TreeMatrix[i].length; j++) {
                for (k = 0; k < TreeMatrix[i][j].length; k++) {
                    TreeMatrix[i][j][k] = i * j * k; //в каждый элемент массива помещается произведение его индексов
                }
            }
        }
        for (i = 0; i < TreeMatrix.length; i++) {
            for (j = 0; j < TreeMatrix[i].length; j++) {
                for (k = 0; k < TreeMatrix[i][j].length; k++) {
                    System.out.print(TreeMatrix[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(str + " ");
    }
}
