/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labquiz4;

/**
 *
 * @author Duran_PC
 */
public class LabQuiz4 {

public static double findMax(double[][] matris)
{
    double enbuyuk=matris[0][0];//karşılaştırma için dizinin ilk elemanı değişkene atanır.
    for (int i=0;i<matris.length;i++)
        for(int j=0;j<matris[i].length;j++)
            if (enbuyuk<matris[i][j]) enbuyuk=matris[i][j];//dizideki en büyük değeri bulur
    return enbuyuk;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 double[][] dizi={{2,55,17},{101,66,7},{6,4,8}};
 System.out.println(findMax(dizi));
    }
    
}
