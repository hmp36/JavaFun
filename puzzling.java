import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Puzzles { 
    public String sumArray(int[] arr){
        int sum = 0; 
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return String.valueOf(sum);
    }
    public String greaterThan(int[] arr){
        ArrayList<Integer> greaterArr = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 10){
                greaterArr.add(arr[i]);
            }
        }
        return Arrays.toString(greaterArr.toArray());
    }


    


    public static ArrayList ArrayShuffle(){
        ArrayList<String> thisArr = new ArrayList<Character>(Arrays.asList("Nancy", "Jinichi", "Fujibayashi","Momochi", "Ishikawa")
        Collections.shuffle(thisArr); 
        int i = 0;
        ArrayList<String> newArr = new ArrayList<String>();
        While (i < thisArr.size()){
                if (thisArr.get(i).length() > 5) {
                    newArr.add(thisArr.get(i));
                }
                System.out.printIn(thisArr.get(i));
                i++;
            }
            return newArr;
        }



       


    public void Alphabet() {
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		Random rand = new Random();
		char temp;
		for (int i = 0; i < 25; i++){
			int index = rand.nextInt(25) + 1;
			temp = alphabet[i];
			alphabet[i] = alphabet[index];
			alphabet[index] = temp;
		}
		System.out.println("The last letter of the shuffled array is " + alphabet[25]);
		System.out.println("The first letter of the array is " + alphabet[0]);
		if(alphabet[0] == 'a' || alphabet[0] == 'e' || alphabet[0] == 'i' || alphabet[0] == 'o' || alphabet[0] == 'u'){
			System.out.println("it's a vowel");
		}
    }
    




    public int[] randomNumbers() {
		Random rand = new Random();
		int[] arr;
		arr = new int[10];
		for (int i = 0; i < 10; i++){
			arr[i] = rand.nextInt(46) + 55;
        }
        
        System.out.println(Arrays.toString(arr));

        return arr;
    }
    


    // Generate and return an array with 10 random numbers between 55-100
    // and have it be sorted (showing the smallest number in the beginning)
    // . Display all the numbers in the array. Next, display the minimum 
    // value in the array as well as the maximum value.

    public int[] randomSortedNumbers(){
        Random rand = new Random();
        int[] arr;
        arr = new int[10];
		for (int i = 0; i < 10; i++){
			arr[i] = rand.nextInt(46) + 55;
        }
        int temp; 
        arr = new int[10];

        for (int j = 1; j<10 - 1; j++){
            if (arr[j-1] > arr[j]){
                temp = arr[j-1]; 
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
        }
    for (int i = 0; i < 10; i++){
        System.out.println(arr[i]);
    }
    System.out.println("Min is: " + arr[0]);
    System.out.println("Max is: " + arr[9]);
    return arr;
    }






    String[] alpha = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
            "t", "u", "v", "w", "x", "y", "z" };
    String rando = ""; for(
    int i = 0 ; i < 5 ; i++)
    {
        int position = randomly.nextInt(25);
        String newChar = alpha[position];
        rando += newChar;
    }System.out.print(rando);

    }








    public static ArrayList createRandomStringArray(int stringLen, int arrayLen) {
        ArrayList<String> newRandomArray = new ArrayList<String>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz"; 
        Random rand = new Random(); 

        for(int j=0; j < arrayLen; j++) {
            String randomString = ""; 

            for(int i=0; i < stringLen; i++) {
                char letter = alphabet.charAt(rand.nextInt(26)); 
                randomString += letter;
            }

            newRandomArray.add(randomString); 
        }

        return newRandomArray;
    }
}