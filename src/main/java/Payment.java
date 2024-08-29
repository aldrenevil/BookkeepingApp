import com.aguilar.Bookkeeping.Subscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class Payment {
    private double amount;
    private Date date;
    private boolean isSuccessful;
    private Subscription subscription;
    private boolean processPayment;

    public Payment(Subscription subscription){
        this.subscription =  subscription;
    }
}
