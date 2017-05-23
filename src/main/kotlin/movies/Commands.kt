package movies


data class Command(val name: String, val args: String, val option: String)

object Commands {
    fun fromInput(input: String): Command {
        val (name, args, option) = input.split(" ").take(3) + " " + " "
        return Command(name.trim(), args.trim(), option.trim())

    }

}