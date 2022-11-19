package ru.mirea.prk17.z2;
import java.util.Scanner;

public class EmployeeContoller {
    private Scanner scanner;
    private Employee employee;
    private int bufInt;

    public EmployeeContoller()
    {
        scanner = new Scanner(System.in);
        employee = new Employee();
    };

    public void Start()
    {
        int post, specialization, num;
        boolean qualification;
        String Name1, Name2;
        employee.Start();
        do
        {
            employee.Menu();
            bufInt = scanner.nextInt();
            switch (bufInt)
            {
                case 1:
                {
                    employee.WayCRD(1);
                    post = scanner.nextInt();
                    employee.WayCRD(2);
                    specialization = scanner.nextInt();
                    employee.WayCRD(3);
                    qualification = scanner.nextBoolean();
                    scanner.nextLine();
                    employee.WayCRD(4);
                    Name1 = scanner.nextLine();
                    employee.WayCRD(5);
                    Name2 = scanner.nextLine();
                    employee.CreateWorker(post, specialization, qualification, Name1, Name2);
                    break;
                }
                case 2:
                {
                    employee.WorkersView();
                    employee.QuEdit();
                    bufInt = scanner.nextInt();
                    switch (bufInt)
                    {
                        case 1:
                        {
                            employee.QuNumber();
                            num = scanner.nextInt();
                            num -= 1;
                            do {
                                employee.WorkersView(num);
                                employee.QuRedactor();
                                bufInt = scanner.nextInt();
                                switch (bufInt)
                                {
                                    case 1:
                                    {
                                        scanner.nextLine();
                                        employee.WayCRD(4);
                                        Name1 = scanner.nextLine();
                                        employee.setName1(num, Name1);
                                        break;
                                    }
                                    case 2:
                                    {
                                        scanner.nextLine();
                                        employee.WayCRD(5);
                                        Name2 = scanner.nextLine();
                                        employee.setName2(num, Name2);
                                        break;
                                    }
                                    case 3:
                                    {
                                        employee.WayCRD(1);
                                        post = scanner.nextInt();
                                        employee.setPost(num, post);
                                        break;
                                    }
                                    case 4:
                                    {
                                        employee.WayCRD(2);
                                        specialization = scanner.nextInt();
                                        employee.setSpecialization(num, specialization);
                                        break;
                                    }
                                    case 5:
                                    {
                                        employee.WayCRD(3);
                                        qualification = scanner.nextBoolean();
                                        employee.setQualification(num, qualification);
                                        break;
                                    }
                                    case 0:
                                    {
                                        employee.WayCRD(7);
                                    }
                                }
                            } while (bufInt != 0);
                        }
                    }
                    bufInt = 2;
                }
                case 3:
                {
                    employee.WorkersView();
                    employee.QuNumber();
                    num = scanner.nextInt();
                    num -= 1;
                    employee.Emp(num);
                }
            }
        }while (bufInt != 0);

    }
}
