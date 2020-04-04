;Use R5RS language !!!

(define (DaysInMonth sym)
  (cond
    ((equal? sym 'JANUARY) 31)
    ((equal? sym 'FEBRUARY) 28)
    ((equal? sym 'MARCH) 31)
    ((equal? sym 'APRIL) 30)
    ((equal? sym 'MAY) 31)
    ((equal? sym 'JUNE) 30)
    ((equal? sym 'JULY) 31)
    ((equal? sym 'AUGUST) 31)
    ((equal? sym 'SEPTEMBER) 30)
    ((equal? sym 'OCTOBER) 31)
    ((equal? sym 'NOVEMBER) 30)
    ((equal? sym 'DECEMBER) 31)
    (else "Not Found")
  )
)
