# Mapa de registos
# num: $t0
# p: $t1
# *p: $t2

	.data
	.eqv print_int10, 1
	.eqv read_string, 8
	.eqv SIZE, 20
str: 	.space SIZE
	.text
	.globl main
main: 	
	li $t0, 0		# num=0
	la $a0, str
	li $a1, SIZE		# $a1=SIZE
	li $v0, read_string	# read_string(str,SIZE)
	syscall			 			
	la $t1, str 		# p = str;
while: 				# while(*p != '\0')
	lb $t2,($t1)		#
	beq $t2,0,endw 		# {
	blt $t2,'0',endif 	# if(str[i] >='0' &&
	bgt $t2,'9',endif 	# str[i] <= '9')
	addi $t0, $t0, 1 	# num++;
endif:
	addiu $t1, $t1, 1 	# p++;
	j while 		# }
endw: 
	li $v0, 1
	move $a0, $t0		# print_int10(num);
	syscall 			
	jr $ra 			# termina o programa
