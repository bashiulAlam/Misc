/**
 * Created by Sabab on 9/8/2020.
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        int value = 0;

        char[] c = s.toCharArray();
        int[] romanVals = new int[s.length()];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (c[i] == 'I')
                romanVals[index] = 1;
            else if(c[i] == 'V')
                romanVals[index] = 5;
            else if (c[i] == 'X')
                romanVals[index] = 10;
            else if (c[i] == 'L')
                romanVals[index] = 50;
            else if (c[i] == 'C')
                romanVals[index] = 100;
            else if (c[i] == 'D')
                romanVals[index] = 500;
            else if (c[i] == 'M')
                romanVals[index] = 1000;

            index++;
        }

        value += romanVals[romanVals.length - 1];
        for (int i = romanVals.length - 2; i >= 0; i--) {
            if (romanVals[i] < romanVals[i + 1])
                value -= romanVals[i];
            else
                value += romanVals[i];
        }

        return value;
    }

    public String intToRomanObs(int num) {
        String div1k = "";
        String div500 = "";
        String div100 = "";
        String div50 = "";
        String div10 = "";
        String divRemaining = "";

        if (num / 1000 != 0) {
            for (int i = 0; i < num / 1000; i++) {
                div1k += "M";
            }
            num %= 1000;
        }

        if (num / 500 != 0) {
            for (int i = 0; i < num / 500; i++) {
                div500 += "D";
            }
            num %= 500;
        }

        if (num / 100 != 0) {
            for (int i = 0; i < num / 100; i++) {
                div100 += "C";
            }
            num %= 100;
        }

        if (num / 50 != 0) {
            for (int i = 0; i < num / 50; i++) {
                div50 += "L";
            }
            num %= 50;
        }

        if (num / 10 != 0) {
            for (int i = 0; i < num / 10; i++) {
                div10 += "X";
            }
            num %= 10;
        }

        if (num < 10) {
            if (num == 9)
                divRemaining = "IX";
            else if (num == 4)
                divRemaining = "IV";
            else {
                for (int i = 0; i < num / 5; i++) {
                    divRemaining += "V";
                }
                for (int i = 0; i < num % 5; i++) {
                    divRemaining += "I";
                }
            }
        }

        return div1k + div500 + div100 + div50 + div10 + divRemaining;
    }

    public String intToRoman(int num) {
        String divResult = "";;

        while (num > 0) {
            if (num / 1000 != 0) {
                for (int i = 0; i < num / 1000; i++) {
                    divResult += "M";
                }
                num -= 1000 * (num / 1000);
            } else if (num / 100 == 9) {
                divResult += "CM";
                num -= 900;
            } else if (num / 100 == 4) {
                divResult += "CD";
                num -= 400;
            } else if (num / 500 != 0) {
                for (int i = 0; i < num / 500; i++) {
                    divResult += "D";
                }
                num %= 500;
            } else if (num / 10 == 9) {
                divResult += "XC";
                num -= 90;
            } else if (num / 10 == 4) {
                divResult += "XL";
                num -= 40;
            } else if (num / 100 != 0) {
                for (int i = 0; i < num / 100; i++) {
                    divResult += "C";
                }
                num %= 100;
            } else if (num == 9) {
                divResult += "IX";
                num = 0;
            } else if (num == 4) {
                divResult += "IV";
                num = 0;
            } else if (num / 50 != 0) {
                for (int i = 0; i < num / 50; i++) {
                    divResult += "L";
                }
                num %= 50;
            } else if (num / 10 != 0) {
                for (int i = 0; i < num / 10; i++) {
                    divResult += "X";
                }
                num %= 10;
//                System.out.println("After mod with 10 : " + num);
            } else if (num < 10 && num != 4 && num != 9) {
                if (num / 5 != 0) {
//                    System.out.println("in 5 block : " + num);
                    for (int i = 0; i < num / 5; i++) {
                        divResult += "V";
                    }
                    num %= 5;
                }

                if (num < 4) {
                    for (int i = 0; i < num % 5; i++) {
                        divResult += "I";
                    }
                    num = 0;
                }
            }
        }

        return divResult;
    }
}
