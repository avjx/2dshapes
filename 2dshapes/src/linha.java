

public class linha {
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
  
      //linha
      for(j=0; j<y; j++){
        plano[7][j] = 8;
      }
  
  
  
      for(i=0;i<x;i++){
        for(j=0;j<y;j++){
            System.out.print(plano[i][j] +" ");
        }
        System.out.print("\n");
  
      }
    }
  }