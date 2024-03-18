public class single{
public static void main(String [] args){

int[] marks = new int[]{10,20,30,40,50};
// marks[0]=100;
// marks[1]=60;
// marks[2]=50;
// marks[3]=70;
// marks[4]=98;
for(int i=0; i<marks.length; i++){
    System.out.println(marks[i]);
}
System.out.println("**********");
for(int value: marks){
    System.out.println(value);
}
}
}