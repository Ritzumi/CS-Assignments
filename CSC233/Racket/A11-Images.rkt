;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname A11-Images) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f () #f)))
(require 2htdp/image)
(define petal (isosceles-triangle 150 330 "solid" "lightseagreen"))
(define petal2 (isosceles-triangle 150 330 "solid" "seagreen"))
(define petal3 (underlay (ellipse 52 12 "solid" "black") (ellipse 50 10 "solid" "white") ))
(clear-pinhole
     (overlay/pinhole
      (underlay (circle 30 "solid" "yellow")
      ;#######################
      (rotate (* 60 0) petal3)
      (rotate (* 60 1) petal3)
      (rotate (* 60 3) petal3)
      (rotate (* 60 2) petal3)
      (rotate (* 60 4) petal3)
      (rotate (* 60 5) petal3)
      ;######################
      (circle 10 "solid" "Medium Cyan")
      )
      ;#######################
      (rotate (* 60 0) petal2)
      (rotate (* 60 3) petal2)
      (rotate (* 60 1) petal)
      (rotate (* 60 2) petal)
      (rotate (* 60 4) petal)
      (rotate (* 60 5) petal)
      ;######################
      ))
