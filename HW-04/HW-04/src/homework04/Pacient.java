package homework04;

/*
Класс, описывающий пациентов больницы

 */
public class Pacient {

    static String hospitalName;
    String name;
    String surname;
    int age;
    String diagnosis;

    boolean willSurvive;
//метод для вывода всего списка пациентов
    public static void showList(Pacient[] arrayOfPacients) {
        System.out.println("Список пациентов больницы \"" + hospitalName + "\":");
        for (int i = 0; i < arrayOfPacients.length; i++) {
            System.out.println();
            System.out.print("No "+(i+1) + " Пациент " + arrayOfPacients[i].name + " ");
            System.out.print(arrayOfPacients[i].surname + " - ");
            System.out.print("Возраст = " + arrayOfPacients[i].age + "  ");
            System.out.print("Диагноз = " + arrayOfPacients[i].diagnosis + "  ");
            System.out.print("Выживет ли? " + arrayOfPacients[i].willSurvive + "  ");

        }

    }

    //метод выводящий результат поиска
    public static void showResult(Pacient[] arrayOfPacients, int i){
                System.out.println();
            System.out.print("Пациент " + arrayOfPacients[i].name + " ");
            System.out.print(arrayOfPacients[i].surname + " - ");
            System.out.print("Возраст = " + arrayOfPacients[i].age + "  ");
            System.out.print("Диагноз = " + arrayOfPacients[i].diagnosis + "  ");
            System.out.print("Выживет ли? " + arrayOfPacients[i].willSurvive + "  ");  
    
    }
    
    
}
