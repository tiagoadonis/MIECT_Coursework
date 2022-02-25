	.data 
str: 	.asciiz "2016 e 2020 sao anos bisesextos"
	.eqv print_int10, 1
	.align 2
	.text
	.globl main
main: subiu	$sp, $sp, 4  #stack space 
      sw	$ra,($sp)  #saves $ra
      
      la	$a0, str
      jal	atoi
      move	$a0,$v0
      
      li	$v0,print_int10
      syscall
      
      lw	$ra, ($sp) #restore $ra
      addiu	$sp, $sp, 4
      
      li $v0,0
      
      jr $ra
      
