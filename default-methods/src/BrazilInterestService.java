import java.security.InvalidParameterException;

public class BrazilInterestService implements InterestService{
    private double interestRate;
    @Override
    public double getInterestRate() {
        // o get não pode ser default porque depende do armazenamento do dado que está na classe,
        // e interfaces não podem armazenar dados
        return interestRate;
    }

    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }
}
