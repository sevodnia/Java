import static java.lang.Math.*;
public class HomeWork01 {
    public static void main(String[] args){
// начало задания №1
    System.out.println("====== Задание №1 ======");
String textLine ="тринитроглицерин";    
System.out.println("Исходное слово: "+textLine);
    System.out.println("Количество символов в строке: "+textLine.length());
            //разделяем строку пополам
                    int halfOfLetters=textLine.length()/2;
                        //выводим первую половину строки
                            String getFirstHalf=textLine.substring(0,halfOfLetters);
                            System.out.println("Первая половина строки: "+getFirstHalf);
                        //выводим вторую половину строки
                            String getSeconfHalf=textLine.substring(halfOfLetters,textLine.length());
                            System.out.println("Вторая половина строки: "+getSeconfHalf);                
// конец задания №1  
// начало задания №2    
System.out.println("====== Задание №2 ======");    
    int someNumber=2256987;
  //переводим число int в строку   
    String inString=Integer.toString(someNumber);
  //определяем номер последней цифры числа
    int last=inString.length()-1;
  //получаем последнюю цифру числа
    char lastNumber = inString.charAt(last);
  //переводим из строки в int
    int converted = Character.digit(lastNumber,10);
  //сравниваем последнюю цифру
    if (converted==7){
        System.out.println("Исходное число "+someNumber+" оканчивается на 7");
    }
    else{
            System.out.println("Исходное число "+someNumber+" НЕ оканчивается на 7");
    }
 // конец задания №2   
 // начало задания №3   
 System.out.println("====== Задание №3 ======"); 
    double a;
    a=10;
    double b;
    b=20;
    double r;
    r=3;
    double diagonal;
    diagonal=sqrt(pow(a,2)+pow(b,2));
    double diametr;
    diametr=r*2;
    
    //если диаметр равен либо больше диагонали, то круг полностью закрыт 
        if(diametr>=diagonal){
            System.out.println("Стороная прямоугольника: "+a);
            System.out.println("Стороная прямоугольника: "+b);
            System.out.println("Радиус круга: "+r);
            System.out.println("Круг полностью закроет картонку");
        }
        else {
                        System.out.println("Стороная прямоугольника: "+a);
                         System.out.println("Стороная прямоугольника: "+b);
                             System.out.println("Радиус круга: "+r);
                                  System.out.println("Картонке нужно подрасти");
        }
// конец задания №3   
 // начало задания №4   
 System.out.println("====== Задание №4 ======");  
 int w;
 w=114;
//рассматриваем частные начальные случаи 
 if (w==1){
     System.out.println("Сумма: "+w+" рубль");
 }
        if (w>=2 && w<=4){
     System.out.println("Сумма: "+w+" рубля");
 }  
         if (w>=5 && w<=20){
     System.out.println("Сумма: "+w+" рублей");
 }  
 //рассматриваем системные случаи
         else { String strOfw=Integer.toString(w);
 int lastOfw=strOfw.length()-1;
    char lastNumberOfw = strOfw.charAt(lastOfw);
        int c = Character.digit(lastNumberOfw,10);
            switch (c){
                case 0 : System.out.println("Сумма: "+w+" рублей"); break;
                case 1 : System.out.println("Сумма: "+w+" рубль"); break;
                case 2 : System.out.println("Сумма: "+w+" рубля"); break;
                case 3 : System.out.println("Сумма: "+w+" рубля"); break;
                case 4 : System.out.println("Сумма: "+w+" рубля"); break;
                case 5 : System.out.println("Сумма: "+w+" рублей"); break;
                case 6 : System.out.println("Сумма: "+w+" рублей"); break;
                case 7 : System.out.println("Сумма: "+w+" рублей"); break;
                case 8 : System.out.println("Сумма: "+w+" рублей"); break;
                case 9 : System.out.println("Сумма: "+w+" рублей"); break;
            }
         }    
    
    // конец задания №4  
 // начало задания №5 
 System.out.println("====== Задание №5======");  
         
         String myStr="gfhs#djn?dhs##fh??";
         String newMyStr=myStr.replace("?", "HELLO");
         System.out.println(newMyStr);
         String newNewMyStr=newMyStr.replace("#","");
         System.out.println(newNewMyStr);
         // конец задания №5 

//исправленное задание 
System.out.println("====== Задание №4 (идея найдена на просторах интернета======");
String word;
String words[]={"рубль", "рубля", "рублей"};
int num=12569;
int getNum=num;
num=num%100;
if(num>19){num=num%10;}
switch(num){
    case 1: { word=words[0];
            System.out.println("Сумма "+getNum+" "+word);
            break;
                }
    case 2: case 3: case 4: {word=words[1];
            System.out.println("Сумма "+getNum+" "+word);    
            break;
                }
    default: {word=words[2];
            System.out.println("Сумма "+getNum+" "+word);    
            break;
                }
    
}


    }
}
