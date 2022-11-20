package ru.mirea.prk22.z1;
import java.util.*;

public class RPNCalculator {
    private static Stack<Integer> stack = new Stack<Integer>();
    private static Scanner input = new Scanner(System.in);


    public static void calculator() throws Exception
    {
        System.out.println("RPN калькулятор!");
        takeInput();
    }

    private static void takeInput()
    {
        String numOrOperand = " ";
        while (!numOrOperand.equals("x"))
        {
            System.out.print("Введите значение(число|*|/|+|-|=|w(=, но с сохранением значения)|c): ");
            numOrOperand = input.next();
            try
            {
                int intNumOrOperand = Integer.valueOf(numOrOperand);
                stack.push(intNumOrOperand);
            }
            catch (Exception e)
            {
                if (numOrOperand.equals("*"))
                {
                    stack.push(stack.pop() * stack.pop());

                }
                else if (numOrOperand.equals("/"))
                {
                    stack.push((int) stack.pop() / stack.pop());

                }
                else if (numOrOperand.equals("+"))
                {
                    stack.push(stack.pop() + stack.pop());

                }
                else if (numOrOperand.equals("-"))
                {
                    stack.push(stack.pop() - stack.pop());

                }
                else if (numOrOperand.equals("="))
                {
                    System.out.println(stack.pop());

                }
                else if (numOrOperand.equals("c"))
                {
                    if (!stack.empty())
                    {
                        for (int i = 0; i < stack.size(); i++)
                        {
                            stack.pop();
                        }
                    }
                }
                else if (numOrOperand.equals("w"))
                {
                    for (int i = 0; i < stack.size(); i++)
                    {
                        System.out.println(stack.get(i));
                    }
                }
            }
        }
    }
}
