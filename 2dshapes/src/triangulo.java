
public class triangulo {
    public void desenho(){
  
      int x = 15;
      int y = 15;
  
      int[][] plano = new int[x][y];
  
      int i, j;
      for(i=0;i<x;i++){
          for(j=0;j<y;j++){
              plano[i][j] = 1;
          }
      }
  
      //
      for(i = 0; i<15; i++){
        for(j = i; j<15-i; j++){
          plano[i][j] = 8;
        }
      }
  
      for(i=0;i<x;i++){
        for(j=0;j<y;j++){
            System.out.print(plano[i][j] +" ");
        }
        System.out.print("\n");
  
      }
    }
  }