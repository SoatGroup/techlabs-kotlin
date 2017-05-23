package internal


public class RemplaceMoiError(message: String) : Error(message)

public inline fun REMPLACE_MOI(reason: String): Nothing = throw RemplaceMoiError("""
⪀⪀⪀⪀⪀ Instruction ⩿⩿⩿⩿⩿
$reason
""")
