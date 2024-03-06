
public class quadrado {
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
  
      for(i=3;i<x;i++){
          for(j=3;j<y-3;j++){
              plano[i][j] = 8;
          }
      }
  
      for(i=12;i<x;i++){
          for(j=0;j<y;j++){
              plano[i][j] = 1;
          }
      }
  
      /*
      for(j=0; j<y-3; j++){
        plano[4][j] = 1;
      }*/
  
      for(i=0;i<x;i++){
        for(j=0;j<y;j++){
            System.out.print(plano[i][j] +" ");
        }
        System.out.print("\n");
  
      }
    }
  }