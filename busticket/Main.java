import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InfoPrint infoObj = new InfoPrint();
        infoObj.printWelcome();
        int choise = 0;
        WHILE:
        while(true){
            infoObj.choose();
            try{
                choise = new Scanner(System.in).nextInt();
                if(choise >0 || choise <=3){
                    switch (choise){
                        case 1:

                    }
                }
            }
        }
    }
}
