	.data
	.text
	.globl main
main:	ori $t0,$0,5      # t0 = c�digo bin�rio
	srl $t2,$t0,1    # t2 = t0 (codigo binario) >> 1 bit 
	xor $t1,$t0,$t2  # t1 (codigo gray) = t0 ^ t2 
	jr $ra 	   	 # fim do programa