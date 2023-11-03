class Pyramid {
    public static void main(String[] args) {
        int row = 6;
        int col = (row*2)-1;
        int temp = row;

        for (int i = row ; i >= 1 ; i--) {
            for (int j =1 ; j <= col ; j++) {
                if ( i <= j && j <= temp) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            temp++;
            System.out.println();
        }
    }
}