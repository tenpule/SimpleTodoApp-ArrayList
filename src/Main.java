import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner x = new Scanner(System.in);
		ArrayList<String> todos = new ArrayList<>();

		int menu = 0;

		while (menu != 5) {
			System.out.println("");
			System.out.println("1: 追加機能");
			System.out.println("2: 表示機能");
			System.out.println("3: 削除機能");
			System.out.println("4: 編集機能");
			System.out.println("5: 終了");

			if (!x.hasNextInt()) {
				System.out.println("数字を入力してください");
				x.next();
				continue;
			}

			menu = x.nextInt();

			if (menu == 1) {
				System.out.println("追加機能を選びました");
				System.out.println("やることを記入してね");
				x.nextLine();
				String todo = x.nextLine();
				todos.add(todo);
				System.out.println(todo + "を追加しました");
			} else if (menu == 2) {
				if (todos.size() == 0) {
					System.out.println("Todoはありません");
				} else {

					System.out.println("表示機能を選びました");

					for (int i = 0; i < todos.size(); i++) {
						System.out.println((i + 1) + ":" + todos.get(i));
					}
				}
			} else if (menu == 3) {

				if (todos.size() == 0) {
					System.out.println("削除するTodoはありません");
				} else {

					System.out.println("削除機能を選びました");
					System.out.println("削除する番号を選んでください");
					for (int i = 0; i < todos.size(); i++) {
						System.out.println((i + 1) + ":" + todos.get(i));
					}
					int index = x.nextInt();

					if (index < 1 || index > todos.size()) {
						System.out.println("その番号は存在しません");
					} else {
						todos.remove(index - 1);
						System.out.println("削除しました");
					}
				}
			} else if (menu == 4) {

				if (todos.size() == 0) {
					System.out.println("編集するTodoはありません");
				} else {

					System.out.println("編集機能を選びました");
					System.out.println("編集する番号を選んでください");
					for (int i = 0; i < todos.size(); i++) {
						System.out.println((i + 1) + ":" + todos.get(i));
					}
					int index = x.nextInt();
					x.nextLine();

					if (index < 1 || index > todos.size()) {
						System.out.println("その番号は存在しません");
					} else {
						System.out.println("新しい内容を入力してください");
						String newTodo = x.nextLine();

						todos.set(index - 1, newTodo);
						System.out.println("更新しました");
						for (int i = 0; i < todos.size(); i++) {
							System.out.println((i + 1) + ":" + todos.get(i));
						}
					}
				}
			}

			else if (menu == 5) {
				System.out.println("終了します");
			}
		}
	}
}