%Question 1 (pi = 22/7)
sphere(R, Area) :- R >= 0,Area is 4/3*22/7*R*R*R.

%Question 2
sum(0,0).
sum(Input, Result) :- N_Input is Input // 10, sum(N_Input, N_Output), Result is (Input mod 10)  + N_Output.

%Question 3
day(0, sunday).
day(1, monday).
day(2, tuesday).
day(3, wednesday).
day(4, thursday).
day(5, friday).
day(6, saturday).

may(Date, Day) :- Date > 0, Date < 32, Temp is (Date + 4) mod 7, day(Temp, Day).

%Question 4 (Recursion)
series(1, 1).
series(I, Result) :- I > 0, J is I-1, series(J, Result2), Result is I*I*I + Result2.

cls :- write('\e[H\e[2J').