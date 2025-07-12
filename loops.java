public class loops{
    public static void main(String[] args){


       //I want to print the statement for more than one time so we use
       //WHILE

//     int i = 1;
//     while(i<=4)
// {
//     System.out.println("Hi" + i);
//     i++;
// }
// System.out.println("Bye"+ i);


//NESTED LOOPS in the same program
int i = 1;
while(i<=4){

    System.out.println("Hello" + i);

    int j = 1;
    while (j<=3) {
        System.out.println("YO BRO"+ j);
        j++;
    }
    i++;
}

    }
    
} 