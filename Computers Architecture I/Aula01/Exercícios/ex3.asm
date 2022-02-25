.data
.text
.globl main
main: ori $v0,$0,5 # syscall read_int
syscall
ori $t0,$v0,0 # getval_x into $t0
ori $t2,$0,8 # $t2 = b = 8
add $t1,$t0,$t0 # $t1 = x + x = 2 * x
sub $t1,$t1,$t2 # $t1 =  y = 2 * x - 8
ori $a0,$t1,0
ori $v0,$0,1
syscall
#jr $ra # fim do programa
li $v0,10
syscall