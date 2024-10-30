package com.mycompany.mavenproject1;

public class exer1_3 {
    public static void main(String[] args){
        
        boolean[] result = {
            false,false,false,
            false,false,true,
            false,true,true,
            true,true,true,
            true,true,false,
            true,false,false,
            true,false,true,
            false,true,false
        }; 
        
        /*
        int tam = result.length;
        System.out.println(result.length);
        for(int i = 0; i <= tam-2 ; i+=3){
            System.out.println(i+" "+(tam-2));
        }
    }
}*/
        int j =0 , tam = result.length;
        boolean[] tabela = {false,false,false,false,false,false,false,false};
                
        for(int i = 0; i <= tam-2 ; i+=3){
            if( ( result[i] && result [i+1] ) || result[i+2] ){
                tabela[j] = true;
            }else{
                tabela[j] = false;
            }
            j++;

        }
        
        for(boolean item : tabela){
            System.out.print(item);
        }
        
        
    }
    
}

/*
i  
0   3    6  9   12  15  18  21

j
0   1   2   3   4   5   6   7
*/