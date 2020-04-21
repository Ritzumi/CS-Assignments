(define (fact n)
  (cond
    ((eq? n 0) 0 )
    ((eq? n 1) 1 )
    (else (* (fact (- n 1)) n ))
  )
)