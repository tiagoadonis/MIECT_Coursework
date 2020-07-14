# O argumento da função é passado em $a0
# O resultado é devolvido em $v0
# Sub-rotina terminal: não devem ser usados registos $sx
		
		.data
		.eqv print_string,4
		.eqv print_int10,1
s_hdr:		.asciiz "O comprimento da string é: "
str:		.asciiz "String de Teste"						
		.text	
		
strlen:		li $v0, 0		
sln:  		lb $t0, 0($a0)		
		beqz $t0, sln_ex	
        	addi $v0, $v0, 1	
   		addiu $a0, $a0, 1	
		j sln			
sln_ex:		jr $ra				
				
		.globl main
main: 		addiu $sp,$sp,-4
	 	sw $ra,($sp)
	 	
	 	li $v0,print_string
	 	la $a0,s_hdr
	 	syscall
	 	
	 	la $a0,str 		
		jal strlen
		move $a0,$v0	
		li $v0,print_int10
		syscall
		
		lw $ra,($sp)
		addiu $sp,$sp,4
		li $v0,0
		jr $ra 			