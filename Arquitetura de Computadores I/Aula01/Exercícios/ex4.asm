.text
.globl main
main: li $v0,5
syscall
move $t0,$v0
li $t2,8
add $t1,$t0,$t0
sub $t1,$t1,$t2
move $a0,$t1
li $v0,1
syscall
jr $ra
