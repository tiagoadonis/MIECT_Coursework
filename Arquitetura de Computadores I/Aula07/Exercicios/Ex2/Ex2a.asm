	.text
	.globl toascii, itoa

toascii:			# char toascii(char v) {
	addi $a0, $a0, '0'	# 	v += '0';
if:	ble  $a0, '9', endIf	# 	if( v > '9' )
	addi $a0, $a0, 7	# 		v += 7; // 'A' - '9' - 1
endIf:	move $v0, $a0		# 	return v;
	jr $ra			# }
							
# Map of registers:
# $s0 : p
# $s1 : n
# $s2 : b
# $s3 : digit
# $s4 : s


itoa:				# char *itoa(unsigned int n, unsigned int b, char *s) {
	subiu $sp, $sp, 24	# 	Save $ra, $s registers
	sw $ra, 0($sp)
	sw $s0, 4($sp)
	sw $s1, 8($sp)
	sw $s2, 12($sp)
	sw $s3, 16($sp)
	sw $s4, 20($sp)

	move $s0, $a2 		# 	char *p = s;
	move $s1, $a0		#	$s1 -> n		
	move $s2, $a1		# 	$s2 -> b
	move $s4, $a2 		# 	$s4 -> s (backup to give as arg to strrev)
	
				# 	char digit;
do:				# 	do {
	rem $s3, $s1, $s2	# 		digit = n % b;
	div $s1, $s1, $s2	# 		n = n / b;
		
	move $a0, $s3		#		toascii (digit)
	jal toascii
		
	sb $v0, 0($s0)		# 		*p++ = toascii( digit );
	addiu $s0, $s0, 1	#		p++

while:	bgt $s1, 0, do		# 	} while( n > 0 );
	
	sb $0, 0($s0)		#	*p = '\0';
	
	move $a0, $s4		# 	strrev( s );
	jal strrev
	
				# 	return s (already in $v0 since it's returned by strrev);
				
	lw $ra, 0($sp)		# 	Restore $ra, $s registers
	lw $s0, 4($sp)
	lw $s1, 8($sp)
	lw $s2, 12($sp)
	lw $s3, 16($sp)
	lw $s4, 20($sp)		
	addiu $sp, $sp, 24
	jr $ra			# }