public class Climb {
    public static void main (String[] args) {
        String USAGE="climb <file> <filename> [vault]";

        // Check arguments and set vault.
        if (args.length==0) {
          System.out.println(USAGE);
          throw new RuntimeException("Which file?");
        } else if (args.length==1) {
          // String vaultName = 
          throw new RuntimeException("Default vault is not yet supported.");
        } else if (args.length==2) {
          String archiveName = args[1];
          // String vaultName = 
          throw new RuntimeException("Default vault is not yet supported.");
        } else if (args.length==3) {
          String archiveName = args[1];
          String vaultName = args[2];
        } else {
          System.out.println(USAGE);
          throw new RuntimeException("Too many command-line arguments.");
        }

        // Set archive
        String archive = args[0];

        ArchiveTransferManager atm = new ArchiveTransferManager(client);
        String archiveId = atm.upload(vaultName, "Tax 2012 documents", new File(archiveToUpload)).getArchiveId();
    }
}
