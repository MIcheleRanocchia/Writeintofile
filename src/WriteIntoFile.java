import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WriteIntoFile {
    public String ScriviDentroUnFile(String testo){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("seleziona il file in cui salvare il testo");
        int selezioneUtente = fileChooser.showSaveDialog(null);
        if(selezioneUtente != JFileChooser.APPROVE_OPTION){
            System.out.println("operazione annulata dall'utente");
            return null;
        }
        File fileSelezionato = fileChooser.getSelectedFile();
        System.out.println("File selezionato: " + fileSelezionato.getAbsoluteFile());

        FileWriter scrittoreFIle = null;
        try {
            scrittoreFIle = new FileWriter(fileSelezionato);
            scrittoreFIle.write(testo + System.lineSeparator());
            scrittoreFIle.close();
        } catch (IOException e) {
            System.err.println(e);
        }


        return null;
    }
}
