package internal


class RemplaceMoiError(message: String) : Error(message)

fun REMPLACE_MOI(reason: String): Nothing = throw RemplaceMoiError("""
⪀⪀⪀⪀⪀ Instruction ⩿⩿⩿⩿⩿
$reason
""")
