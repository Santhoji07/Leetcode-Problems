/*Count the Total Number of Sundays in a Month

You are given three values:

A year

A month (1 to 12)

The date of the first Sunday in that month (an integer between 1 and 7)


Using this information, write a program to calculate how many Sundays occur in that particular month.

Your program should determine how many times a Sunday falls within the month, starting from the first given Sunday date and counting every 7 days until the end of the month.


---

Input Format:
Three space-separated integers:
year month first_sunday_date

Output Format:
Print a single integer — the total number of Sundays in that month.


---

Sample Test Cases:

1. Input: 2024 4 7
Output: 4


2. Input: 2025 3 2
Output: 5


3. Input: 2012 2 1
Output: 5


4. Input: 2011 2 1
Output: 4


5. Input: 1800 2 1
Output: 4*/

#include <stdio.h>

int main() {
    int year, month, first_sunday, days, sundays = 0;
    printf("Enter year, month (1-12), and first Sunday date: ");
    scanf("%d %d %d", &year, &month, &first_sunday);

    if (month == 2)
        days = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28;
    else if (month == 4 || month == 6 || month == 9 || month == 11)
        days = 30;
    else
        days = 31;

    for (int d = first_sunday; d <= days; d += 7)
        sundays++;

    printf("Total Sundays in %d/%d: %d\n", month, year, sundays);
    return 0;
}