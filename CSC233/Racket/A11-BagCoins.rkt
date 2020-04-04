;Use R5RS language !!!

(define (bagCoins penny nickel dime quarter)
 (define cent (+ (* quarter 25) (* dime 10) (* nickel 5) penny ))
  (display (/ cent 100.0))
)