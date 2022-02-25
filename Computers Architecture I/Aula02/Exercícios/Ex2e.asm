	.data
	.text
	.globl main
main:	ori $t0,$0,4 	  # t0 = gray
	srl $t1,$t0,4     # t1 = t0 >> 4 bits
	xor $t0,$t0,$t1	  # t0 = t0 ^ t1
	srl $t3,$t0,2     # t3 = t0 >> 2 bits
	xor $t0,$t0,$t3   # t0 = t0 ^ t3
	srl $t4,$t0,1     # t4 = to >> 1 bit
	xor $t0,$t0,$t4   # t0 = t0 ^ t4
	or $t2,$0,$t0     # t2(binario) = 0 | t1(num)
	jr $ra 	   	  # fim do programa