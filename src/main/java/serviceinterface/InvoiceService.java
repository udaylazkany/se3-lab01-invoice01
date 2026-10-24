/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviceinterface;

import com.mycompany.firsthomework.s1.lab2.Invoice;
import com.mycompany.firsthomework.s1.lab2.InvoiceFormatter;
import serviceinterface.Storage;
import serviceinterface.Notifier;

/**
 *
 * @author asus
 */
public class InvoiceService {
    private final InvoiceFormatter formatter;
    private final Storage databaseStorage;
    private final Storage fileStorage;
    private final Notifier emailNotifier;
    private final Notifier whatsappNotifier;

    public InvoiceService(InvoiceFormatter formatter, 
                          Storage databaseStorage, 
                          Storage fileStorage,
                          Notifier emailNotifier, 
                          Notifier whatsappNotifier) {
        this.formatter = formatter;
        this.databaseStorage = databaseStorage;
        this.fileStorage = fileStorage;
        this.emailNotifier = emailNotifier;
        this.whatsappNotifier = whatsappNotifier;
    }

    public String format(Invoice invoice) {
        return formatter.format(invoice);
    }

    public void saveToDatabase(Invoice invoice) {
        databaseStorage.save(formatter.format(invoice));
    }

    public void saveToFiles(Invoice invoice) {
        fileStorage.save(formatter.format(invoice));
    }

    public String sendEmail(Invoice invoice) {
        return emailNotifier.send(formatter.format(invoice), invoice.getNumber());
    }

    public String sendWhatsapp(Invoice invoice) {
        return whatsappNotifier.send(formatter.format(invoice), invoice.getNumber());
    }
}
