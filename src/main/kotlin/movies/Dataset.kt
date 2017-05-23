package movies

import internal.REMPLACE_MOI
import java.io.File

object Dataset {

    fun loadMovies(file: File, repository: MoviesRepository) {
        REMPLACE_MOI("Cette méthode doit lire le fichier, créé un object Movie pour chaque film, et l'ajouter dans le repository. Attention ! la première ligne du fichier n'est pas un film...")
    }


    fun parseLineToMovie(line: String): Movie {
        REMPLACE_MOI("Cette méthode doit retourner la représentation d'une ligne en objet Movie. Attention ! Certaines lignes contiennent des virgules qui ne sont pas des séparateurs...")
    }

}