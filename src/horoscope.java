import java.util.Locale;
import java.util.Scanner;

public class horoscope {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int day;
        String month, horoscope;
        boolean isError = false;

        System.out.print("Enter your birth month with its name: ");
        month = input.nextLine().toLowerCase();
        System.out.print("Enter your birthday as number: ");
        day = input.nextInt();

        if (month.equals("january")) {
            if (day >= 1 && day <= 30) {
                if (day <= 21) {
                    horoscope = "Capricorn";
                    System.out.println("You are a/an " + horoscope);
                } else {
                    horoscope = "Aquarius";
                    System.out.println("You are a/an " + horoscope);
                }
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (month.equals("february")) {
            if (day >= 1 && day <= 28) {
                if (day <= 19) {
                    horoscope = "Aquarius";
                    System.out.println("You are a/an " + horoscope);
                } else {
                    horoscope = "Pisces";
                    System.out.println("You are a/an " + horoscope);
                }
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (month.equals("march")) {
            if (day >= 1 && day <= 31) {
                if (day <= 20) {
                    horoscope = "Pisces";
                    System.out.println("You are a/an " + horoscope);
                } else {
                    horoscope = "Aries";
                    System.out.println("You are a/an " + horoscope);
                }
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (month.equals("april")) {
            if (day >= 1 && day <= 30) {
                if (day <= 20) {
                    horoscope = "Aries";
                    System.out.println("You are a/an " + horoscope);
                } else {
                    horoscope = "Taurus";
                    System.out.println("You are a/an " + horoscope);
                }
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (month.equals("may")) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    horoscope = "Taurus";
                    System.out.println("You are a/an " + horoscope);
                } else {
                    horoscope = "Gemini";
                    System.out.println("You are a/an " + horoscope);
                }
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (month.equals("june")) {
            if (day >= 1 && day <= 30) {
                if (day <= 22) {
                    horoscope = "Gemini";
                    System.out.println("You are a/an " + horoscope);
                } else {
                    horoscope = "Cancer";
                    System.out.println("You are a/an " + horoscope);
                }
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (month.equals("july")) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    horoscope = "Cancer";
                    System.out.println("You are a/an " + horoscope);
                } else {
                    horoscope = "Leo";
                    System.out.println("You are a/an " + horoscope);
                }
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (month.equals("august")) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    horoscope = "Leo";
                    System.out.println("You are a/an " + horoscope);
                } else {
                    horoscope = "Virgo";
                    System.out.println("You are a/an " + horoscope);
                }
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (month.equals("september")) {
            if (day >= 1 && day <= 30) {
                if (day <= 22) {
                    horoscope = "Virgo";
                    System.out.println("You are a/an " + horoscope);
                } else {
                    horoscope = "Libra";
                    System.out.println("You are a/an " + horoscope);
                }
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (month.equals("october")) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    horoscope = "Libra";
                    System.out.println("You are a/an " + horoscope);
                } else {
                    horoscope = "Scorpio";
                    System.out.println("You are a/an " + horoscope);
                }
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (month.equals("november")) {
            if (day >= 1 && day <= 30) {
                if (day <= 21) {
                    horoscope = "Scorpio";
                    System.out.println("You are a/an " + horoscope);
                } else {
                    horoscope = "Sagittarius";
                    System.out.println("You are a/an " + horoscope);
                }
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (month.equals("december")) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    horoscope = "Sagittarius";
                    System.out.println("You are a/an " + horoscope);
                } else {
                    horoscope = "Aquarius";
                    System.out.println("You are a/an " + horoscope);
                }
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }


        if (isError) {
            System.out.println("Wrong value. Please try again.");
        }
    }
}
