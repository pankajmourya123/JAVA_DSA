 class ThreeGreater {
    public static void main(String []args) {
        int a=50,b=70,c=700;
//         if(a>b && a>c){
//             System.out.println(a);
//         }
//         else if(b>c && b>a){
// System.out.println(b);
//         }
//         else{
//             System.out.println(c);
//         }

if(a>b){
    if(a>c){
        System.out.println(a);
    }
    else{
        System.out.println(c);
    }
}
else if(b>c){
System.out.println(b);
}
else{
    System.out.println(c);
}
    }
}
