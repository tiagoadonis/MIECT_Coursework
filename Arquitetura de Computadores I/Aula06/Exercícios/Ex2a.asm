# Mapa de registos:
# str: $a0 -> $s0 (argumento é passado em $a0)
# p1: $s1 (registo callee-saved)
# p2: $s2 (registo callee-saved)

		.data
		.align 2
		.eqv print_int10, 1		
		.eqv print_str, 4
str:		.asciiz "String de Teste"
		.text
		.globl strrev
		
exchange:				# void exchange(char* c1, char* c2) {
		lb $t0, 0($a0)		# char aux = *c1;
		lb $t1, 0($a1)
	
		sb $t1, 0($a0)		# *c1 = *c2;
		sb $t0, 0($a1)		# *c2 = aux;
	
		jr $ra			# }

strrev: 	subu $sp,$sp,16 	# reserva espaço na stack
		sw $ra,0($sp) 		# guarda endereço de retorno
		sw $s0,4($sp) 		# guarda valor dos registos
		sw $s1,8($sp) 		# $s0, $s1 e $s2
		sw $s2,12($sp) 		#
		move $s0,$a0 		# registo "callee-saved"
		move $s1,$a0 		# p1 = str
		move $s2,$a0 		# p2 = str
		
		lb $t0, 0($s2)
		
while1: 	beq $t0,'\0',endW1	# while( *p2 != '\0' ) {
		addiu $s2,$s2,1		# p2++;
		lb  $t0, 0($s2)		# $t2 = *(p2++)
		j while1		# }
		
endW1:
		subiu $s2,$s2,1	 	# p2--;
		
while2: 	bge $s1, $s2, endW2	# while(p1 < p2) {

		move $a0,$s1 		#
		move $a1,$s2 		#
		jal exchange 		# exchange(p1,p2)
		
		addiu $s1, $s1, 1	# p1++;
		subiu $s2, $s2, 1	# p2--;
		
		j while2		# }

endW2:		
		move $v0,$s0 		# return str
		lw $ra,0($sp)		# repõe endereço de retorno
		lw $s0,4($sp)		# repõe o valor dos registos
		lw $s1,8($sp)		# $s0, $s1 e $s2
		lw $s2,12($sp)		#
		addu $sp,$sp, 16	# liberta espaço da stack
		jr $ra 			# termina a sub-rotina
		
		.globl main
main:  
		subiu $sp, $sp, 4	# store $ra at stack	
		sw $ra, 0($sp)
	
		jal strrev		
		
		jr $ra