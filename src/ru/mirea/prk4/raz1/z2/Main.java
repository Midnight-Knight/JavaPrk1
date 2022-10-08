package ru.mirea.prk4.raz1.z2;

public class Main {
    public static void main(String[] args)
    {
        Phone[] phone = new Phone[3];
        phone[0] = new Phone(8916_555_35_35L, (short) 1140, 77.3);
        phone[1] = new Phone(8940_111_55_22L, (short) 2001, 80.2);
        phone[2] = new Phone(8977_555_11_11L, (short) 443, 73.7);
        for (int i = 0; i < 3; ++i)
        {
            System.out.println(phone[i].toString());
        }
        System.out.printf("Номер: %s %s%n",phone[0].getNumber(),phone[0].receiveCall("Ваня"));
        System.out.printf("Номер: %s %s%n",phone[1].getNumber(),phone[1].receiveCall("Даша"));
        System.out.printf("Номер: %s %s%n",phone[2].getNumber(),phone[2].receiveCall("Лёня"));

        System.out.println(phone[0].receiveCall("Дима", 8901_444_43_21L));
        long[] number = new long[3];
        number[0] = 8916_444_43_21L;
        number[1] = 8961_111_12_34L;
        number[2] = 8918_268_23_41L;
        phone[0].sendMessage(3, number);
    }
}
