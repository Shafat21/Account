public class AutoPolicyTest 
{
    public static void main(String[] args)
    {
        AutoPolicy policy1 = new AutoPolicy(1111, "Toyota VXR", "NJ");
        AutoPolicy policy2 = new AutoPolicy(2222, "Nissan GTR", "ME");

        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    }

    public static void policyInNoFaultState(AutoPolicy policy)
    {
        System.out.println("The Auto Policy: ");
        System.out.printf("Account #:%d;%nCar: %s,%nState %s %s a no-fault state%n%n", policy.getAccountNumber(),policy.getMakeAndModel(),policy.getState(),(policy.isNoFaultState() ? "is": "is not"));
    }
}