import java.io.File;

public class Main {
    public static void main(String[] args) {
        // Remplacez ce chemin par le chemin de votre dossier
        String baseDirectoryPath = "C:/Users/p.bhanineh/Desktop";
        String fileType = ".txt"; // Type de fichier à rechercher

        File baseDirectory = new File(baseDirectoryPath);
        if (baseDirectory.exists() && baseDirectory.isDirectory()) {
            System.out.println(baseDirectory.getAbsolutePath());
            listFiles(baseDirectory, fileType, " |- ");
        } else {
            System.out.println("Le dossier spécifié n'existe pas.");
        }
    }

    public static void listFiles(File dir, String fileType, String prefix) {
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                // Affiche le nom du répertoire
                if (file.isDirectory()) {
                    System.out.println(prefix + "[D] " + file.getName());
                    // Appel récursif pour les sous-répertoires
                    listFiles(file, fileType, prefix + " |   ");
                } else if (file.getName().endsWith(fileType)) {
                    // Affiche le nom du fichier de type spécifique
                    System.out.println(prefix + "[F] " + file.getName());
                }
            }
        }
    }
    public static void listFilesTest(File dir,String fileType, String prefix){
        File[] files = dir.listFiles();
        if(files !=null){
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println(prefix + "[D] " + file.getName());
                    listFilesTest(file, fileType, prefix + " |   ");
                }else{
                    System.out.println(prefix + "[F] " + file.getName());
                }
            }
        }
    }
}