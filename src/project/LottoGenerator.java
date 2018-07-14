package project;

public class LottoGenerator {
    private Random randorm = new Random(System.nanoTime());
    
    public int[] generate(){
        int[] result new int[6];
        
        for(int i = 0; i < 6; i++){
            result[i] = random.nextInt(45) + 1;
        }
        
        return result;
    }
    
    public static void main (String[] args){
        int[] result = new LottoGenerator().generate();
        System.out.print(Arrays.toString(result));
        
    }
}
