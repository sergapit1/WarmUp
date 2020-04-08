package by.academy.warmup;

public class WarmUp {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }


    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
            return true;
        }
        return false;
    }


    public int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b) * 2;
        }
        return a + b;
    }


    public int diff21(int n) {
        if (n > 21) {
            return (n - 21) * 2;
        }
        return 21 - n;
    }


    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour < 7 || hour > 20)) {
            return true;
        }
        return false;
    }


    public boolean makes10(int a, int b) {
        if ((a == 10 || b == 10) || (a + b == 10)) {
            return true;
        }
        return false;
    }


    public boolean nearHundred(int n) {
        int a = n - 100;
        int b = n - 200;
        if (Math.abs(a) <= 10 || Math.abs(b) <= 10) {
            return true;
        }
        return false;
    }


    public boolean posNeg(int a, int b, boolean negative) {
        if (((a < 0 && b > 0) || (a > 0 && b < 0)) && !negative) {
            return true;
        } else if (negative && a < 0 && b < 0) {
            return true;
        }
        return false;

    }


    public String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        }
        return "not " + str;
    }


    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }


    public String frontBack(String str) {
        String thirst;
        String middle;
        String second;
        if (str.length() == 0) {
            return str;
        } else if (str.length() == 1) {
            return str;

        } else if (str.length() == 2) {
            thirst = str.substring(0, 1);
            second = str.substring(1);

            return second + thirst;
        }

        thirst = str.substring(0, 1);
        middle = str.substring(1, str.length() - 1);
        second = str.substring(str.length() - 1);
        return second + middle + thirst;
    }


    public String front3(String str) {
        String bin;
        if (str.length() <= 3) {
            bin = str;
        } else {

            bin = str.substring(0, 3);
        }
        return bin + bin + bin;

    }


    public String backAround(String str) {

        char words = str.charAt(str.length() - 1);
        return words + str + words;

    }


    public boolean or35(int n) {
        if (n % 3 == 0 || n % 5 == 0) {
            return true;
        }
        return false;
    }


    public String front22(String str) {
        String words;
        if (str.length() == 0) {
            return words = str;
        } else if (str.length() == 1) {
            return str + str + str;
        }
        words = str.substring(0, 2);
        return words + str + words;
    }


    public boolean startHi(String str) {
        if (str.startsWith("hi")) {
            return true;
        }
        return false;
    }


    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
            return true;
        }
        return false;
    }


    public boolean in1020(int a, int b) {
        if ((a >= 10 && a <= 20) || (b >= 10 && b <= 20)) {
            return true;
        }
        return false;
    }


    public boolean hasTeen(int a, int b, int c) {
        if ((a <= 19 && a >= 13) || (b <= 19 && b >= 13) || (c <= 19 && c >= 13)) {
            return true;
        }
        return false;

    }


    public boolean loneTeen(int a, int b) {
        if (((a <= 19 && a >= 13) && !(b <= 19 && b >= 13)) || (!(a <= 19 && a >= 13) && (b <= 19 && b >= 13))) {
            return true;
        }
        return false;
    }


    public String delDel(String str) {
        if (str.length() <= 3) {
            return str;
        } else if (str.substring(1, 4).equals("del")) {
            StringBuilder sb = new StringBuilder(str);
            sb.replace(1, 4, "");
            return sb.toString();
        }
        return str;

    }


    public boolean mixStart(String str) {
        if (str.length() < 3)
            return false;
        return str.substring(1, 3).equals("ix");
    }


    public String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result = result + str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result = result + str.charAt(1);
        }
        return result;
    }


    public int intMax(int a, int b, int c) {
        int max = 0;

        if (a > b)
            max = a;
        else
            max = b;
        if (c > max)
            max = c;

        return max;
    }


    public int close10(int a, int b) {
        if (Math.abs(10 - a) < Math.abs(10 - b)) {
            return a;
        } else if (Math.abs(10 - b) < Math.abs(10 - a)) {
            return b;
        }
        return 0;
    }


    public boolean in3050(int a, int b) {
        if (((a <= 40 && a >= 30) && (b <= 40 && b >= 30)) || ((a <= 50 && a >= 40) && (b <= 50 && b >= 40))) {
            return true;
        }
        return false;
    }


    public int max1020(int a, int b) {
        if (b > a) {
            int bin = a;
            a = b;
            b = bin;
        }

        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }


    public boolean stringE(String str) {
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("e"))
                j++;
        }
        return (j >= 1 && j <= 3);
    }


    public boolean lastDigit(int a, int b) {
        if (a % 10 == b % 10) {
            return true;
        }
        return false;
    }


    public String endUp(String str) {
        int first = str.length() - 3;
        int length = str.length();
        if (length < 3)
            return str.toUpperCase();

        String result = str.substring(first, length).toUpperCase();

        return str.substring(0, first) + result;

    }


    public String everyNth(String str, int n) {
        String x = "";
        for (int i = 0; i < str.length(); i = i + n) {
            x = x + str.charAt(i);
        }
        return x;
    }


    public String stringTimes(String str, int n) {
        String s = "";
        int i;
        for (i = 0; i < n; i++) {
            s = s + str;
        }
        return s;
    }


}
