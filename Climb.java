import java.io.File;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.PropertiesCredentials;
import com.amazonaws.services.glacier.AmazonGlacierClient;

public class Climb {
  public static void main (String[] args) {
    String USAGE="climb <file> [vault]";

    // Check arguments and set vault.
    if (args.length==0) {
      System.out.println(USAGE);
      throw new RuntimeException("Which file?");
    } else if (args.length==1) {
      throw new RuntimeException("Default vault is not yet supported.");
    } else if (args.length==2) {
      String vaultName = args[1];
    } else {
      System.out.println(USAGE);
      throw new RuntimeException("Too many command-line arguments.");
    }

    // Set archive
    String archiveFileName = args[0];

    // Set archive name
    File archiveFile = new File(archiveFileName);
    String archiveName = archiveFile.getName();
    System.out.println(archiveName);

    AWSCredentials credentials = new PropertiesCredentials(
      Climb.class.getResourceAsStream("/home/tlevine/.aws.properties")
    //Climb.class.getResourceAsStream("aws.properties")
    );

    // Upload
    AmazonGlacierClient client = new AmazonGlacierClient(credentials);
//  ArchiveTransferManager atm = new ArchiveTransferManager(client);
//  String archiveId = atm.upload(vaultName, archiveName, archiveFile).getArchiveId();
    }
}
