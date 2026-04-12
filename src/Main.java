import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        ArrayList<String> todos = new ArrayList<>();

        int menu = 0;

        while (menu != 4) {
            System.out.println("");
            System.out.println("1: 追加機能");
            System.out.println("2: 表示機能");
            System.out.println("3: 削除機能");
            System.out.println("4: 終了");

            menu = x.nextInt();

            if (menu == 1) {
                System.out.println("追加機能を選びました");
                System.out.println("やることを記入してね");
                x.nextLine();
                String todo = x.nextLine();
                todos.add(todo);
                System.out.println(todo + "を追加しました");
            } else if (menu == 2) {
                System.out.println("表示機能を選びました");
            } else if (menu == 3) {
                System.out.println("削除機能を選びました");
            } else if (menu == 4) {
                System.out.println("終了します");
            }
        }
    }
}