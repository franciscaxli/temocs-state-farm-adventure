/**
 * 
 */
package adventure;
import java.util.Scanner;

/**
 * @author franciscali
 *
 */
public class Adventure {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("In this choose your own adventure path, use the number choices and hit the enter key to move on. \n\nChoose your character: \n 1. Enarc \n 2. Tobor \n 3. Temoc");
		int character=input.nextInt();
		
		
		if (character > 0 && character < 4){ 
			switch (character) {
			case 1: System.out.println("You chose Enarc.");
			break;
			case 2: System.out.println("You chose Tobor.");
			break;
			default: System.out.println("You chose Temoc.");
			}
		}		
		else { 
			while (character <1 || character >3) {
			System.out.println("Invalid input. \nChoose your character: \n 1. Enarc \n 2. Tobor \n 3. Temoc");
			character=input.nextInt();
			}
		}
		
		
		System.out.println("\n Choose your adventure path: \n 1. Insurance \n 2. Financial Planning and Investments");
		int path=input.nextInt();
		
			switch (path) { 
			//Insurance path
			case 1: 
				System.out.println("You chose the Insurance path. What do you want to learn about? \n 1. Homeowners insurance \n 2. Auto insurance");
				int insurance=input.nextInt();
				switch (insurance) {
				
				//Homeowner's Insurance Path
				case 1:
					System.out.println("You chose to learn about Homeowners Insurance. What question did you have? \n 1. Do I need homeowners insurance? \n 2. What are the diff kinds of homeowners insurance? \n 3. What does homeowners insurance cover? \n 4. How are policy rates determined? \n 5. Where can I get a homeowners insurance policy?");
					int homeowner = input.nextInt();
					switch (homeowner) {
					case 1: //do i need homeowners insurance
						System.out.println("Question: Do I need homeowners insurance? \nAnswer: Homeowners insurance is needed to protect your home and possessions against damage or theft.");
					break;
					case 2: //what are diff kinds of homeowners insurance
						System.out.println("Question: What are the diff kinds of homeowners insurance? \nAnswer: There are 3 kinds of homeowners insurance: \n 1. Actual cash value \n 2. Replacement cost \n 3. Guaranteed (or extended) replacement cost/value");
						int homeownerKind=input.nextInt();
						switch (homeownerKind) {
						case 1: //actual cash value
							System.out.println("Actual cash value covers the cost of the house plus the value of your belongings after deducting depreciation.");
						break;
						case 2: //replacement cost
							System.out.println("Replacement value policies cover the actual cash value of your home and possessions without the deduction for depreciation, so you would be able to repair or rebuild your home up to the original value.");
						break;
						default: //Guaranteed (or extended) replacement cost/value
							System.out.println("The most comprehensive, this inflation-buffer policy pays for whatever it costs to repair or rebuild your home—even if it's more than your policy limit.");
							
						}
					break;
					case 3: //what does homeowners insurance cover
						System.out.println("Question: What does homeowners insurance cover? \nAnswer: Homeowners insurance covers (1) Damage to the Interior or Exterior of Your House, (2) Personal Liability for Damage or Injuries, (3) Hotel or House Rental While Your Home Is Being Rebuilt or Repaired.");
					break;
					case 4: //how are policy rates determined
						System.out.println("Question: How are policy rates determined? \nAnswer: Policy rates are largely determined by the insurer's risk that you'll file a claim. This risk is based on past claim history associated with the home, the neighborhood, and the home's condition.");
					break;
					default: //where can I get homeowners insurance
						System.out.println("Question: Where can I get a homeowners insurance policy? \nAnswer: Statefarm offers customizable options for homeowners. Learn more here: https://www.statefarm.com/insurance/home-and-property/homeowners");
					}
					
				break; //break for the insurance path
				//Auto Insurance Path
				default: 
					System.out.println("You chose to learn about Auto Insurance. What question did you have? \n 1. What is auto insurance? \n 2. What does auto insurance cover? \n 3. Which type of auto insurance plan is best for me? \n 4. Are there discounts to my policy? \n 5. Where can I get an auto insurance policy?");
					int auto = input.nextInt();
					switch (auto) {
					case 1: //What is auto insurance?
						System.out.println("Question: What is auto insurance? \nAnswer: Auto insurance is designed to protect you against financial losses if you're involved in an accident or the vehicle is damaged in some way.");
					break;
					case 2: //What does auto insurance cover?
						System.out.println("Question: What does auto insurance cover? \nAnswer: Auto insurance covers \n 1. collision \n 2. rental \n 3. comprehensive \n 4. rideshare");
						int autoCover=input.nextInt();
						//auto cover options
						switch (autoCover) {
						case 1: //collision
							System.out.println("When your vehicle hits another object, or overturns in an accident, you’re covered with collision insurance.");
						break;
						case 2: //rental
							System.out.println("When damage that's covered by your comprehensive or collision insurance has your car undrivable or in the repair shop, car rental reimbursement will help pay the cost to rent a car.");
						break;
						case 3: //comprehensive
							System.out.println("Choose comprehensive insurance when your vehicle's stolen or damaged by something other than collision or rolling over, like damage caused by fire, wind, hail, flood, theft, and more.");
						break;
						default: //rideshare
							System.out.println("When you use your personal car to drive for a ridesharing company like Uber or Lyft, make sure you’re protected with rideshare insurance.");
						}
						
					break;
					case 3: //Which type of auto insurance plan is best for me?
						System.out.println("Question: Which type of auto insurance plan is best for me? \nAnswer: There are insurance policies for Teen drivers, Rental cars, Sports cars, Antique cars, and Commercial fleets.");
					break;
					case 4: //Are there discounts to my policy?
						System.out.println("Question: Are there discounts to my policy? \nAnswer: There are discount policies for safe drivers, teens that get good grades, and if you combine multiple insurance policies into a bundle.");
					break;
					default: //Where can I get an auto insurance policy?
						System.out.println("Question: Where can I get an auto insurance policy? \nAnswer: Statefarm offers auto insurance plans for all situations. Find out more about plans here: https://www.statefarm.com/insurance/auto");
					}
				}
			
			
			break;
			//Financial Planning and Investments path
			default: System.out.println("You chose the Financial Planning and Investments path. What do you want to learn about? \n 1. Retirement planning \n 2. Education saving \n 3. Estate planning");
				int finance=input.nextInt();
				switch (finance) {
				
				//retirement planning path
				case 1:
					System.out.println("You chose to learn about Retirement Planning. What topic would you like to explore further? \n 1. Different types of retirement planning \n 2. When should I start investing? \n 3. Try out the planning calculator");
					int retirement=input.nextInt();
					switch (retirement) {
					case 1: //diff types of retirement
						System.out.println("The different types of retirement planning are: \n 1. Roth IRA \n 2. Traditional IRA \n 3. 401k");
						int retirementType=input.nextInt();
						//retirement types
						switch (retirementType) {
						case 1: //Roth IRA
							System.out.println("A Roth IRA is a special retirement account where you pay taxes on money going into your account, and then all future withdrawals are tax-free. This is commonly used by college students as starter investment accounts.");
						break;
						case 2: //traditional IRA
							System.out.println("A type of individual retirement account where individuals can make pre-tax contributions and the investments in the account grow tax-deferred, until withdrawal in retirement.");
						break;
						default: //401k
							System.out.println("A traditional 401K plans allows employees to contribute a portion of their salary toward retirement. With Statefarm, salary deferrals can be pre-tax or designated roth contributions (after-tax).");
						}
					break;
					case 2: //when to start investing
						System.out.println("Question: When should I start investing? \nAnswer: ASAP! The sooner the better");
					break;
					default: //planning calculator
						double futureInvestmentValue, investmentAmount, annualInterestRate, numberOfMonths, monthlyInterestRate, result;
						//Enter investment amount;
						System.out.println("Please enter initial investment amount:");
						investmentAmount = input.nextDouble();
	
						//Enter annual interest rate (in percentage points);
						System.out.println("Please enter annual interest rate (in percentage - no percentage sign):");
						annualInterestRate = input.nextDouble() / 100;
	
						//Enter number of years
						System.out.println("Please enter number of years:");
						numberOfMonths = input.nextDouble() * 12;
	
						//Compute monthlyInterestRate with following formula: monthlyInterestRate = annualInterestRate/12;
						monthlyInterestRate = annualInterestRate/12;
	
						//Enter exponential value for (1+monthlyInterestRate)^numberOfMonths;
						result = Math.pow(1 + monthlyInterestRate, numberOfMonths);
	
						//Compute the Accumulated value using the following formula: futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^numberOfMonths;
						futureInvestmentValue = investmentAmount * result;
						System.out.println("Accumulated Value is: \n" + futureInvestmentValue);
					
					}
					
				
				break;
				//education planning path
				case 2:
					System.out.println("You chose to learn about Education Planning. What topic would you like to explore further? \n 1. 529 \n 2. Coverdell Education Savings Account \n 3. Uniform Gift/Transfer to Minors");
					int education=input.nextInt();
					//education paths
					switch (education) {
					case 1: //529
						System.out.println("529 Savings Plan provides investors a way to save tax-free for higher education. The funds can be used at eligible community colleges, trade and vocational schools, universities and graduate schools all across the U.S., and even some abroad.");
					break;
					case 2: //coverdell
						System.out.println("Coverdell custodial account that allows you to set aside up to $2,000 per year for educational expenses.");
					break;
					default: //uniform gift/transfer to minors;
						System.out.println("The Uniform Gift/Transfer to Minors account holds and protect assets for the benefit of a minor. These assets can be used for educational expenses.");
					}
				break;
				//estate planning path
				default:
					System.out.println("You chose to learn about Estate Planning. What topic would you like to explore further? \n 1. Trusts \n 2. Life Insurance \n 3. Joint Accounts");
					int estate=input.nextInt();
					switch (estate) {
					case 1: //trusts
						System.out.println("What question did you have about trusts? \n 1. What is a trust? \n 2. Why would I need a trust? \n 3. What are the types of trusts?");
						int trusts=input.nextInt();
						//trusts path
						switch (trusts) {
						case 1: //what is a trust
							System.out.println("Question: What is a trust? \nAnswer: A trust is when one party (known as the trustor) gives a second party (the trustee) the job of holding property or assets for a third party (the beneficiary).");
						break;
						case 2: //why need a trust
							System.out.println("Question: What would I need a trust? \nAnswer: Establishing a trust account or policy may help prevent funds from being tied up in court after your death.");
						break;
						default: //types of trusts
							System.out.println("There are 4 different types of trusts. They are: \n 1. Irrevocable trust \n 2. Revocable Living Trust \n 3. Testamentary Trust \n 4. Special Needs Trust");
							int typeTrust=input.nextInt();
							//type of trusts path
							switch (typeTrust) {
							case 1: //irrevocable
								System.out.println("Irrevocable trusts generally can't be modified or terminated without the permission of the beneficiary and/or judicial authorities. It may be useful for federal estate tax planning.");
							break;
							case 2: //revocable
								System.out.println("Revocable Living trusts generally lets you transfer ownership of your property into a trust throughout the course of your lifetime. It gives you more control over your estate, both before and after death.");
							break;
							case 3: //testamentary
								System.out.println("Testamentary trusts are generally created by the terms of your will and goes into effect upon your death. It can't be amended or revoked.");
							break;
							default: //special needs
								System.out.println("Special Needs trusts are created to provide supplemental income for the welfare of an individual with a disability. The trust can supply funds for travel, education, out-of-pocket medical expenses, and personal care expenses not covered by government programs.");
							}
						}
					break;
					case 2: //life insurance
						System.out.println("What question did you have about life insurance? \n 1. What is life insurance? \n 2. What are the different types of life insurance? \n 3. Who benefits from life insurance?");
						int life=input.nextInt();
						//life insurance path
						switch (life) {
						case 1: //what is life insurance
							System.out.println("Question: What is life insurance? \nAnswer: Life Insurance is a legally binding contract that pays a death benefit to the policy owner when the insured die.");
						break;
						case 2: //diff types of life insurance
							System.out.println("There are 2 types of life insurance: \n 1. Term Life Insurance \n 2. Permanent life insurance");
							int typeLife=input.nextInt();
							//types of life insurance
							switch (typeLife) {
							case 1: //term
								System.out.println("Term life insurance lasts a certain number of years, then ends. You choose the term when you take out the policy.");
							break;
							default: //whole
								System.out.println("Permanent life insurance stays in force for the insured’s entire life unless the policyholder stops paying the premiums or surrenders the policy.");
							}
						default: //benefits from life insurance
							System.out.println("Question: Who benefits from life insurance? \nAnswer: Life insurance provides financial support to surviving dependents or other beneficiaries after the death of an insured policyholder.");
						}
					break;
					default: //joint accounts
						System.out.println("A joint account is one owned by two or more people, in which the owners act together in making decisions for the account. In the event one owner dies, the account passes to the surviving owner.");
					}
								
				}
			
			}
		
		input.close();

	}

}
