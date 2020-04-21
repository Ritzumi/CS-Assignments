(DEFINE (append1 lis1 lis2)
  (COND
    ((NULL? lis1) lis2)
    (ELSE (CONS (CAR lis1) (append1 (CDR lis1) lis2)))
  )
)

(define (LastElement lis)
  (cond
    ( (null? lis) '( ) )
    ( (null? (cdr lis) ) (car lis) )
    ( else  (LastElement (cdr lis) ))
  )
)

(define (LessLastElement lis)
  (cond
    ( (null? lis) '( ) )
    ( (null? (cdr lis) ) '() )
    ( else (append (cons (car lis) '( ) ) (LessLastElement (cdr lis) ) ))
  )
)

(define (mySimpleReverse lis)
  (cond
    ( (null? lis) '( ) )
    ( else( append ( mySimpleReverse (cdr lis) ) (cons (car lis) '( ) )))
  )
)



































