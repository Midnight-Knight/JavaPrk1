package ru.mirea.prk30;

public enum DrinkTypeEnum {
    BEER,
    WINE,
    VODKA,
    BRANDY,
    CHAMPACNE,
    WHISKEY,
    TEQUILA,
    VERMUTH,
    LIQUOR,
    JAGERMEISTER,
    JUICE,
    COFEE,
    GREEN_TEA,
    BLACK_TEA,
    MILK,
    WATER,
    SODA;

    private DrinkTypeEnum() {
    }

    public static String list()
    {
        String str = "";
        str += "1 | BEER\n";
        str += "2 | WINE\n";
        str += "3 | VODKA\n";
        str += "4 | BRANDY\n";
        str += "5 | CHAMPACNE\n";
        str += "6 | WHISKEY\n";
        str += "7 | TEQUILA\n";
        str += "8 | VERMUTH\n";
        str += "9 | LIQUOR\n";
        str += "10 | JAGERMEISTER\n";
        str += "11 | JUICE\n";
        str += "12 | COFEE\n";
        str += "13 | GREEN_TEA\n";
        str += "14 | BLACK_TEA\n";
        str += "15 | MILK\n";
        str += "16 | WATER\n";
        str += "17 | SODA";
        return str;
    }

    public static DrinkTypeEnum get(int i)
    {
        switch (i)
        {
            case 1:
            {
                return BEER;
            }
            case 2:
            {
                return WINE;
            }
            case 3:
            {
                return VODKA;
            }
            case 4:
            {
                return BRANDY;
            }
            case 5:
            {
                return CHAMPACNE;
            }
            case 6:
            {
                return WHISKEY;
            }
            case 7:
            {
                return TEQUILA;
            }
            case 8:
            {
                return VERMUTH;
            }
            case 9:
            {
                return LIQUOR;
            }
            case 10:
            {
                return JAGERMEISTER;
            }
            case 11:
            {
                return JUICE;
            }
            case 12:
            {
                return COFEE;
            }
            case 13:
            {
                return GREEN_TEA;
            }
            case 14:
            {
                return BLACK_TEA;
            }
            case 15:
            {
                return MILK;
            }
            case 16:
            {
                return WATER;
            }
            case 17:
            {
                return SODA;
            }
        }
        return null;
    }
}
