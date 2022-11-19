package ru.mirea.prk17.z2;
import java.util.ArrayList;

public class Employee {
    private ArrayList<Worker> workers;
    private EmployeeView employeeView;
    public Employee(){
        workers = new ArrayList<>();
        employeeView = new EmployeeView();
    };

    public void Start()
    {
        employeeView.Start();
    }

    public void Menu()
    {
        employeeView.Menu();
    }

    public void WayCRD(int index)
    {
        employeeView.CRD(index);
    }

    public void WorkersView()
    {
        for (int i = 0; i < workers.size(); ++i)
        {
            employeeView.Worker(workers.get(i), i+1);
        }
    }

    public void WorkersView(int n)
    {
        if (n >= 0 && workers.size() > n) {
            employeeView.Worker(workers.get(n), n + 1);
        }
    }

    public void QuEdit()
    {
        employeeView.QuEdit();
    }
    public void QuNumber()
    {
        employeeView.QuNumber();
    }

    public void QuRedactor()
    {
        employeeView.QuRedactor();
    }

    public void CreateWorker(int post, int specialization, boolean qualification, String Name1, String Name2)
    {
        Worker bufWorker = new Worker(post, specialization, qualification, Name1, Name2);
        workers.add(bufWorker);
        employeeView.CRD(6);
    }

    public void setSpecialization(int num, int i)
    {
        workers.get(num).setSpecialization(i);
    }

    public void setQualification(int num, boolean i)
    {
        workers.get(num).setQualification(i);
    }

    public void setName1(int num, String i)
    {
        workers.get(num).setName1(i);
    }

    public void setName2(int num, String i)
    {
        workers.get(num).setName2(i);
    }

    public void setPost(int num, int i)
    {
        workers.get(num).setPost(i);
    }

    public void Emp(int num)
    {
        double i = workers.get(num).getSpecializationMin() * workers.get(num).getPostIndex();
        if (workers.get(num).isQualification() == true)
        {
            i *= 1.5;
        }
        employeeView.Emp(i, workers.get(num).getNameAll());
    }
}
