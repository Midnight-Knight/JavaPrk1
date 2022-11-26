package ru.mirea.prk24.z3;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static String in;
    public static ArrayList<IDocument> list = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void create(String type)
    {
        String bufName, bufData;
        System.out.print("Введите название файла: ");
        bufName = scanner.nextLine();
        for (int i = 0; i < list.size(); ++i)
        {
            if (list.get(i).getType().equals(bufName))
            {
                System.out.println("Ошибка, IDocument с таким именем уже существует, IDocument не создан.");
                return;
            }
        }
        System.out.print("Введите данные: ");
        bufData = scanner.nextLine();
        list.add(ICreateDocument.getComputer(type,bufName,bufData));
        System.out.println(type + " создан!");
    }

    public static void main(String[] args)
    {
        boolean end = false;
        boolean file = false;
        System.out.println("Добро пожаловать в IRedactor");
        do
        {
            System.out.println("Меню: 1.Создать 2.Открыть 0.Выход");
            in = scanner.nextLine();
            switch (in.charAt(0))
            {
                case '1':
                    System.out.println("Выберете тип файла: 1 - TextDocument, 2 - ImageDocument, 3 - MusicDocument");
                    in = scanner.nextLine();
                    switch (in.charAt(0))
                    {
                        case '1':
                            create("textdocument");
                            break;
                        case '2':
                            create("imagedocument");
                            break;
                        case '3':
                            create("musicdocument");
                            break;
                        default:
                            System.out.println("Ошибка создания IDocument'а, IDocument не создан.");
                    }
                    break;
                case '2':
                    System.out.print("Введите название файла: ");
                    in = scanner.nextLine();
                    file = false;
                    for (int i = 0; i < list.size(); ++i)
                    {
                        if (in.equals(list.get(i).getName()))
                        {
                            file = true;
                            System.out.println(list.get(i).toString());
                            break;
                        }
                    }
                    if (file == false)
                    {
                        System.out.println("IDocument " + in + " не найден.");
                    }
                    break;
                case '0':
                    end = true;
                    break;
            }
        }while(end == false);
    }
}
