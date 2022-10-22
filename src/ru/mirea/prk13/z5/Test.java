package ru.mirea.prk13.z5;

public class Test {
    private String country;
    private String[] number3;
    private String number4;

    public Test(String A)
    {
        country = "";
        number3 = new String[2];
        number3[0] = "";
        number3[1] = "";
        number4 = "";
        if (A.length() == 10)
        {
            country = "8";
            number3[0] += A.charAt(0);
            number3[0] += A.charAt(1);
            number3[0] += A.charAt(2);
            number3[1] += A.charAt(3);
            number3[1] += A.charAt(4);
            number3[1] += A.charAt(5);
            number4 += A.charAt(6);
            number4 += A.charAt(8);
            number4 += A.charAt(7);
            number4 += A.charAt(9);
        }
        else if (A.length() > 10)
        {
            for(int i = 0; i < A.length(); ++i)
            {
                if (A.length() - country.length() <= 10)
                {
                    if ((i - country.length()) < 3)
                    {
                        number3[0] += A.charAt(i);
                    }
                    else if ((i - country.length()) < 6)
                    {
                        number3[1] += A.charAt(i);
                    }
                    else
                    {
                        number4 += A.charAt(i);
                    }
                }
                else
                {
                    country += A.charAt(i);
                }
            }
        }
        else
        {
            country = "N";
            number3[0] = "N";
            number3[1] = "N";
            number4 = "N";
        }
    }

    public String toString()
    {
        return country+" "+number3[0]+" "+number3[1]+" "+number4;
    }
}
