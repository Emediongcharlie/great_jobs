public class ZeroesAndOnes{
public static int [] numbers(int [] array){

int[] add = new int[array.length];

for(int i = 0; i < array.length; i++){
if(array[i] % 2 == 0){
	add[i] = 1;
}
else{
	add[i] = 0;
}


}
return add;
}
}