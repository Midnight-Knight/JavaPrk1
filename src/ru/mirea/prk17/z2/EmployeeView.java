package ru.mirea.prk17.z2;

public class EmployeeView {
    public EmployeeView()
    {

    };

    public void Start()
    {
        System.out.printf("Добро пожаловать!\n");
    }

    public void Menu()
    {
        System.out.printf("1. Создать профиль нового Работника\n2. Редактировать/посмотреть профиль Работника\n3. Расчитать заработную плату\n0. Выйти\nВвод: ");
    }

    public void CRD(int index)
    {
        switch (index)
        {
            case 1:
            {
                System.out.printf("Должности%n%s%nВвод: ", Post.list());
                break;
            }
            case 2:
            {
                System.out.printf("Должности%n%s%nВвод: ", Specialization.list());
                break;
            }
            case 3:
            {
                System.out.printf("Диплом высш.обр.%nВвод(true или false): ");
                break;
            }
            case 4:
            {
                System.out.printf("Фамилия%nВвод: ");
                break;
            }
            case 5:
            {
                System.out.printf("Имя%nВвод: ");
                break;
            }
            case 6:
            {
                System.out.printf("Работник создан!\n");
                break;
            }
            case 7:
            {
                System.out.printf("Работник изменён!\n");
                break;
            }
        }
    }

    public void Worker(Worker worker, int n)
    {
        System.out.println("========================================================================================");
        System.out.println("Работник номер " + n);
        System.out.println("ФИ:" + worker.getNameAll());
        System.out.println("Диплом: " + worker.isQualification());
        System.out.println("Должность: " + worker.getPost());
        System.out.println("Коэффициент: " + worker.getPostIndex());
        System.out.println("Специальность: " + worker.getSpecialization());
        System.out.println("Мин.зараб.плата: " + worker.getSpecializationMin());
        System.out.println("========================================================================================");
    }

    public void QuEdit()
    {
        System.out.println("1. Изменить");
        System.out.println("0. Назад");
        System.out.print("Ввод: ");
    }

    public void QuNumber()
    {
        System.out.print("Введите номер: ");
    }

    public void QuRedactor()
    {
        System.out.println("Что изменить?");
        System.out.println("1. Фамилию");
        System.out.println("2. Имя");
        System.out.println("3. Должность");
        System.out.println("4. Специальность");
        System.out.println("5. Диплом");
        System.out.println("0. Назад");
        System.out.print("Ввод: ");
    }

    public void Emp(double n, String Name)
    {
        System.out.println("Ежемесячная плата с текущими данными у " + Name + " составляет " + n + "тыс.р.");
    }
}
