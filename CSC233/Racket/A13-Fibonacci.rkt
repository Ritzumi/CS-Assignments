(define (fibo n)
  (cond
    ((eq? n 0) 0 )
    ((eq? n 1) 1 )
    (else (+ (fibo (- n 1)) (fibo (- n 2)) ))
    )
  )