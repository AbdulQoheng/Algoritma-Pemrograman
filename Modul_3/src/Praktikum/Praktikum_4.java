/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author qoheng
 */
public class Praktikum_4 {

    public static void main(String[] args) {

        int Max = 0;
        int Min = 0;
        int nilai = 70;
        System.out.print("NIlai Adi = " + nilai);

        if (nilai <= 100 && nilai >= 86) {
            System.out.println(" = A");
        } else if (nilai <= 85 && nilai >= 76) {
            System.out.println(" = B+");
        } else if (nilai <= 75 && nilai >= 66) {
            System.out.println(" = B");
        } else if (nilai <= 65 && nilai >= 56) {
            System.out.println(" = C+");
        } else if (nilai <= 55 && nilai >= 46) {
            System.out.println(" = C");
        } else if (nilai <= 45 && nilai >= 36) {
            System.out.println(" = D");
        } else {
            System.out.println(" = Nilai tidak ada");
        }

        int nilai1 = 65;
        System.out.print("NIlai Budi = " + nilai1);

        if (nilai1 <= 100 && nilai1 >= 86) {
            System.out.println(" = A");
        } else if (nilai1 <= 85 && nilai1 >= 76) {
            System.out.println(" = B+");
        } else if (nilai1 <= 75 && nilai1 >= 66) {
            System.out.println(" = B");
        } else if (nilai1 <= 65 && nilai1 >= 56) {
            System.out.println(" = C+");
        } else if (nilai1 <= 55 && nilai1 >= 46) {
            System.out.println(" = C");
        } else if (nilai1 <= 45 && nilai1 >= 36) {
            System.out.println(" = D");
        } else {
            System.out.println(" = Nilai tidak ada");
        }

        int nilai2 = 90;
        System.out.print("NIlai Caca = " + nilai2);

        if (nilai2 <= 100 && nilai2 >= 86) {
            System.out.println(" = A");
        } else if (nilai2 <= 85 && nilai2 >= 76) {
            System.out.println(" = B+");
        } else if (nilai2 <= 75 && nilai2 >= 66) {
            System.out.println(" = B");
        } else if (nilai2 <= 65 && nilai2 >= 56) {
            System.out.println(" = C+");
        } else if (nilai2 <= 55 && nilai2 >= 46) {
            System.out.println(" = C");
        } else if (nilai2 <= 45 && nilai2 >= 36) {
            System.out.println(" = D");
        } else {
            System.out.println(" = Nilai tidak ada");
        }

        int nilai3 = 75;
        System.out.print("NIlai Deny = " + nilai3);

        if (nilai3 <= 100 && nilai3 >= 86) {
            System.out.println(" = A");
        } else if (nilai3 <= 85 && nilai3 >= 76) {
            System.out.println(" = B+");
        } else if (nilai3 <= 75 && nilai3 >= 66) {
            System.out.println(" = B");
        } else if (nilai3 <= 65 && nilai3 >= 56) {
            System.out.println(" = C+");
        } else if (nilai3 <= 55 && nilai3 >= 46) {
            System.out.println(" = C");
        } else if (nilai3 <= 45 && nilai3 >= 36) {
            System.out.println(" = D");
        } else {
            System.out.println(" = Nilai tidak ada");
        }
        
        

//        Mencari nilai Max  
        if (nilai > nilai1) {
            if (nilai > nilai2) {
                if (nilai > nilai3) {
                    Max = nilai;
                } else {
                    Max = nilai3;
                }
            } else if (nilai < nilai2) {
                if (nilai2 < nilai3) {
                    Max = nilai3;
                } else {
                    Max = nilai2;
                }
            }

        } else if (nilai < nilai1) {
            if (nilai < nilai2) {
                if (nilai < nilai3) {
                    Max = nilai3;
                } else {
                    Max = nilai;
                }
            } else if (nilai > nilai2) {
                if (nilai2 < nilai3) {
                    Max = nilai3;
                } else {
                    Max = nilai2;
                }
            }
        }

//        Mencari nilai Min
        if (nilai < nilai1) {
            if (nilai < nilai2) {
                if (nilai < nilai3) {
                    Min = nilai;
                } else {
                    Min = nilai3;
                }
            } else if (nilai > nilai2) {
                if (nilai2 > nilai3) {
                    Min = nilai3;
                } else {
                    Min = nilai2;
                }
            }

        } else if (nilai > nilai1) {
            if (nilai1 < nilai2) {
                if (nilai1 < nilai3) {
                    Min = nilai1;
                } else {
                    Min = nilai3;
                }
            } else if (nilai > nilai2) {
                if (nilai > nilai3) {
                    Min = nilai3;
                } else {
                    Min = nilai2;
                }
            }
        }
        System.out.println("");
        System.out.println("Nilai Max adalah = " + Max);
        System.out.println("Nilai Min adalah = " + Min);

    }
}
