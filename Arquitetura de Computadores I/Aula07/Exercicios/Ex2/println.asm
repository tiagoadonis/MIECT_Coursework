	.data
	.eqv print_string, 4

str:	.asciiz "\n"		
	.text
	.globl println

println:
	la $a0, str		
	li $v0, print_string
	syscall	
	jr $ra