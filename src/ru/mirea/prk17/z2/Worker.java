package ru.mirea.prk17.z2;

public class Worker {
    private Post post;
    private Specialization specialization;
    private boolean qualification;
    private String Name1;
    private String Name2;

    public Worker(int post, int specialization, boolean qualification, String Name1, String Name2)
    {
        setPost(post);
        setSpecialization(specialization);
        this.qualification = qualification;
        this.Name1 = Name1;
        this.Name2 = Name2;
    }

    public String getPost() {
        return post.getPost();
    }
    public double getPostIndex() {return post.getIndex();}
    public void setPost(int post) {
        switch (post)
        {
            case 1: default:
        {
            this.post = Post.Intern;
            break;
        }
            case 2:
            {
                this.post = Post.Junior;
                break;
            }
            case 3:
            {
                this.post = Post.Middle;
                break;
            }
            case 4:
            {
                this.post = Post.Senior;
                break;
            }
            case 5:
            {
                this.post = Post.TeamLeader;
                break;
            }
        }
    }

    public boolean isQualification() {
        return qualification;
    }
    public void setQualification(boolean qualification) {
        this.qualification = qualification;
    }
    public void setSpecialization(int specialization) {
        switch (specialization)
        {
            case 1: default:
        {
            this.specialization = Specialization.Imposer;
            break;
        }
            case 2:
            {
                this.specialization = Specialization.FrontendDeveloper;
                break;
            }
            case 3:
            {
                this.specialization = Specialization.BackendDeveloper;
                break;
            }
            case 4:
            {
                this.specialization = Specialization.WebDesigner;
                break;
            }
            case 5:
            {
                this.specialization = Specialization.FullstackDeveloper;
                break;
            }
        }
    }

    public String getSpecialization() {return specialization.getSpecialization();}
    public double getSpecializationMin() {return specialization.getMin();}

    public String getName1() {
        return Name1;
    }
    public String getName2() {
        return Name2;
    }
    public String getNameAll() {return Name1 + " " + Name2;}
    public void setName1(String name1) {
        Name1 = name1;
    }
    public void setName2(String name2) {
        Name2 = name2;
    }
    public void setNameAll(String name1, String name2)
    {
        setName1(name1);
        setName2(name2);
    }
}

enum Post
{
    Intern("Стажёр", 2),
    Junior("Junior", 8),
    Middle("Middle", 15),
    Senior("Senior", 20),
    TeamLeader("Тимлид", 30);
    private String post;
    private double index;
    Post(String post, double index)
    {
        this.post=post;
        this.index=index;
    }
    public String getPost(){return post;}
    public double getIndex(){return index;}
    public static String list()
    {
        return "Номер | Должность | Коэффициент\n1 | " + Intern.post + " | " + Intern.index + "\n2 | " + Junior.post + " | " + Junior.index + "\n3 | " + Middle.post + " | " + Middle.index + "\n4 | " + Senior.post + " | " + Senior.index + "\n5 | " + TeamLeader.post + " | " + TeamLeader.index;
    }
}

enum Specialization
{
    Imposer("Верстальщик",10),
    FrontendDeveloper("Фронтенд-разработчик",15),
    BackendDeveloper("Бэкенд-разработчик",15),
    WebDesigner("Веб-дизайнер",20),
    FullstackDeveloper("Фулстек-разработчик",25);

    private String specialization;
    private double min;

    Specialization(String specialization, double min)
    {
        this.specialization=specialization;
        this.min=min;
    }

    public String getSpecialization(){return specialization;}
    public double getMin(){return min;}
    public static String list()
    {
        return "Номер | Специальность | Мин.зар.плата в тыс.р.\n1 | " + Imposer.specialization + " | " + Imposer.min + "\n2 | " + FrontendDeveloper.specialization + " | " + FrontendDeveloper.min + "\n3 | " + BackendDeveloper.specialization + " | " + BackendDeveloper.min + "\n4 | " + WebDesigner.specialization + " | " + WebDesigner.min + "\n5 | " + FullstackDeveloper.specialization + " | " + FullstackDeveloper.min;
    }
}