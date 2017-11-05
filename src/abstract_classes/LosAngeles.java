package abstract_classes;

public class LosAngeles extends City
{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		// TODO Auto-generated method stub
		System.out.println((getPopulation()*getGrowthRate())*(getGrowthRate()/2));
		return (getPopulation()*getGrowthRate())*(getGrowthRate()/2);
	}

}
